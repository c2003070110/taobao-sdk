package com.antgroup.zmxy.openplatform.api.response;

import com.antgroup.zmxy.openplatform.api.ZhimaResponse;
import com.antgroup.zmxy.openplatform.api.internal.mapping.ApiField;

/**
 * ALIPAY API: zhima.merchant.expand.apply response.
 * 
 * @author auto create
 * @since 1.0, 2017-05-16 11:44:21
 */
public class ZhimaMerchantExpandApplyResponse extends ZhimaResponse {

	private static final long serialVersionUID = 5296699915911854562L;

	/** 
	 * 二级商户标识
	 */
	@ApiField("linked_merchant_id")
	private String linkedMerchantId;

	public void setLinkedMerchantId(String linkedMerchantId) {
		this.linkedMerchantId = linkedMerchantId;
	}
	public String getLinkedMerchantId( ) {
		return this.linkedMerchantId;
	}

}
