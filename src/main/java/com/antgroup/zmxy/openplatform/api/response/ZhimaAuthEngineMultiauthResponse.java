package com.antgroup.zmxy.openplatform.api.response;

import com.antgroup.zmxy.openplatform.api.ZhimaResponse;
import com.antgroup.zmxy.openplatform.api.internal.mapping.ApiField;

/**
 * ALIPAY API: zhima.auth.engine.multiauth response.
 * 
 * @author auto create
 * @since 1.0, 2016-06-24 14:37:49
 */
public class ZhimaAuthEngineMultiauthResponse extends ZhimaResponse {

	private static final long serialVersionUID = 7571649498459664655L;

	/** 
	 * 用户在商端的身份标识
	 */
	@ApiField("open_id")
	private String openId;

	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public String getOpenId( ) {
		return this.openId;
	}

}
