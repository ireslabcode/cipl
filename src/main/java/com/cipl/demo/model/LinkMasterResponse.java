package com.cipl.demo.model;

import java.util.List;

import com.cipl.demo.entity.LinkMaster;
/**
 * @author Santosh Mahto
 *
 */
public class LinkMasterResponse {
	
	private List<LinkMaster> linkMasterList;

	public List<LinkMaster> getLinkMasterList() {
		return linkMasterList;
	}

	public void setLinkMasterList(List<LinkMaster> linkMasterList) {
		this.linkMasterList = linkMasterList;
	}
	
	
	
}
