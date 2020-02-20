package com.unity3d.player;

import com.google.gson.annotations.SerializedName;

public class PlugXRKeys {

	@SerializedName("msg")
	private String msg;

	@SerializedName("client_access")
	private String clientAccess;

	@SerializedName("client_secret")
	private String clientSecret;

	@SerializedName("license_key")
	private String licenseKey;

	@SerializedName("status")
	private boolean status;

	public void setMsg(String msg){
		this.msg = msg;
	}

	public String getMsg(){
		return msg;
	}

	public void setClientAccess(String clientAccess){
		this.clientAccess = clientAccess;
	}

	public String getClientAccess(){
		return clientAccess;
	}

	public void setClientSecret(String clientSecret){
		this.clientSecret = clientSecret;
	}

	public String getClientSecret(){
		return clientSecret;
	}

	public void setLicenseKey(String licenseKey){
		this.licenseKey = licenseKey;
	}

	public String getLicenseKey(){
		return licenseKey;
	}

	public void setStatus(boolean status){
		this.status = status;
	}

	public boolean isStatus(){
		return status;
	}

	@Override
 	public String toString(){
		return 
			"PlugXRKeys{" + 
			"msg = '" + msg + '\'' + 
			",client_access = '" + clientAccess + '\'' + 
			",client_secret = '" + clientSecret + '\'' + 
			",license_key = '" + licenseKey + '\'' + 
			",status = '" + status + '\'' + 
			"}";
		}
}