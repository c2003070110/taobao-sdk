package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.ScItem;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.scitem.add response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class ScitemAddResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5335177923875197526L;

	/** 
	 * 后台商品信息
	 */
	@ApiField("sc_item")
	private ScItem scItem;


	public void setScItem(ScItem scItem) {
		this.scItem = scItem;
	}
	public ScItem getScItem( ) {
		return this.scItem;
	}
	


}
