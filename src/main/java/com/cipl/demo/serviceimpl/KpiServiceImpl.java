package com.cipl.demo.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cipl.demo.dto.KpiValueDto;
import com.cipl.demo.entity.KpiMst;
import com.cipl.demo.entity.KpiValue;
import com.cipl.demo.model.LinkPlanAssociatedParameterAndKpiRequest;
import com.cipl.demo.model.LinkPlanAssociatedParameterAndKpiResponse;
import com.cipl.demo.repository.KpiMstRepository;
import com.cipl.demo.repository.KpiValueRepository;
/**
 * @author Santosh Mahto
 *
 */
@Service
public class KpiServiceImpl implements com.cipl.demo.service.KpiService{

	@Autowired
	private KpiValueRepository kpiValueRepository;
	
	@Autowired
	private KpiMstRepository kpiMstRepository;
	
	
	@Override
	public LinkPlanAssociatedParameterAndKpiResponse getAllKpiList(
			LinkPlanAssociatedParameterAndKpiRequest linkPlanAssociatedParameterAndKpiRequest) {
		
		List<KpiValue> kpiValueList = kpiValueRepository.findByLinkId(linkPlanAssociatedParameterAndKpiRequest.getLinkId());
		List<KpiValueDto> linkkpiList = new ArrayList<KpiValueDto>();
		
		for (KpiValue kpiValue : kpiValueList) {
			
			KpiMst kpiMst = kpiMstRepository.findByKpiId(kpiValue.getKpiId());
			
			KpiValueDto kpiValueDto = new KpiValueDto();
			
			kpiValueDto.setId(kpiValue.getId());
			kpiValueDto.setKpiId(kpiValue.getKpiId());
			kpiValueDto.setKpiValue(kpiValue.getKpiValue());
			kpiValueDto.setLinkId(kpiValue.getLinkId());
			kpiValueDto.setKpiDesc(kpiMst.getKpiValue());
			linkkpiList.add(kpiValueDto);
			
		}
		LinkPlanAssociatedParameterAndKpiResponse response = new LinkPlanAssociatedParameterAndKpiResponse();
		response.setLinkkpiList(linkkpiList);
		// TODO Auto-generated method stub
		return response;
	}

}
