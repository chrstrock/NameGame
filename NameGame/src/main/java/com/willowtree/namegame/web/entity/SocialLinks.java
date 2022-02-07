package com.willowtree.namegame.web.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)
public class SocialLinks {

	private String callToAction;
	private String type;
	private String url;  //not sure if this should just be a string.
	
	public SocialLinks()
	{
		
		
	}

	public String getCallToAction() {
		return callToAction;
	}

	public void setCallToAction(String callToAction) {
		this.callToAction = callToAction;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "SocialLinks {callToAction=" + callToAction + " + '\'', type=" + type + " + '\'', url=" + url + '\'' + "}";
	}
	
	
}
