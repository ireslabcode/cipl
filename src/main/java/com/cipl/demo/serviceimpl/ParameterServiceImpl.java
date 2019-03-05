package com.cipl.demo.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cipl.demo.dto.ParameterDto;
import com.cipl.demo.entity.Parameter;
import com.cipl.demo.entity.ParameterValue;
import com.cipl.demo.model.LinkPlanAssociatedParameterAndKpiRequest;
import com.cipl.demo.model.LinkPlanAssociatedParameterAndKpiResponse;
import com.cipl.demo.repository.ParameterRepository;
import com.cipl.demo.repository.ParameterValueRepository;
import com.cipl.demo.service.ParameterService;
/**
 * @author Santosh Mahto
 *
 */
@Service
public class ParameterServiceImpl implements ParameterService{

	@Autowired
	private ParameterValueRepository parameterValueRepository;
	
	@Autowired
	private ParameterRepository parameterRepository;
	
	
	@Override
	public LinkPlanAssociatedParameterAndKpiResponse getAllParameterList(
			LinkPlanAssociatedParameterAndKpiRequest linkPlanAssociatedParameterAndKpiRequest) {
		
		List<ParameterValue> parameterValueList = parameterValueRepository.findByLinkId(linkPlanAssociatedParameterAndKpiRequest.getLinkId());
		List<ParameterDto> parameterList = new ArrayList<ParameterDto>();
		
		for (ParameterValue parameterValue : parameterValueList) {
			
			Parameter parameter = parameterRepository.findById(parameterValue.getParameterId());
			
			ParameterDto parameterDto = new ParameterDto();
			parameterDto.setId(parameter.getId());
			parameterDto.setParameterDesc(parameter.getParameterDesc());
			parameterDto.setDefaultValue(parameter.getDefaultValue());
			parameterDto.setUom(parameter.getUom());
			parameterDto.setActualValue(parameterValue.getParameterValueId());
			parameterList.add(parameterDto);
		}
		
		LinkPlanAssociatedParameterAndKpiResponse response =	new LinkPlanAssociatedParameterAndKpiResponse();
		response.setLinkParameterList(parameterList);
		return response;
	}

}
