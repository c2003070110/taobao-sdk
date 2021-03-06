package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.tmc.messages.confirm response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class TmcMessagesConfirmResponse extends TaobaoResponse {

	private static final long serialVersionUID = 7155364266172972895L;

	/** 
	 * 是否成功
	 */
	@ApiField("is_success")
	private Boolean isSuccess;


	public void setIsSuccess(Boolean isSuccess) {
		this.isSuccess = isSuccess;
	}
	public Boolean getIsSuccess( ) {
		return this.isSuccess;
	}
	


}
