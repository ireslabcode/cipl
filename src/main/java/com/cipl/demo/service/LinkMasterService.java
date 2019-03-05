package com.cipl.demo.service;

import com.cipl.demo.model.LinkMasterRequest;
import com.cipl.demo.model.LinkMasterResponse;
/**
 * @author Santosh Mahto
 *
 */
public interface LinkMasterService {

	public LinkMasterResponse searchLink(LinkMasterRequest linkMasterRequest);
}
