package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.AfterSale;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

import java.util.List;

/**
 * TOP API: taobao.aftersale.get response.
 * 
 * @author top auto create
 * @since 1.0, null
 */
public class AftersaleGetResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5777895633185745154L;

	/** 
	 * 售后服务返回对象
	 */
	@ApiListField("after_sales")
	@ApiField("after_sale")
	private List<AfterSale> afterSales;


	public void setAfterSales(List<AfterSale> afterSales) {
		this.afterSales = afterSales;
	}
	public List<AfterSale> getAfterSales( ) {
		return this.afterSales;
	}
	


}
