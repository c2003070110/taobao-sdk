package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.tmc.group.delete response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class TmcGroupDeleteResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5386697835536589671L;

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
