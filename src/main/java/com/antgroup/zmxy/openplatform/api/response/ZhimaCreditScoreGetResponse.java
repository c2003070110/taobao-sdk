package com.antgroup.zmxy.openplatform.api.response;

import com.antgroup.zmxy.openplatform.api.ZhimaResponse;
import com.antgroup.zmxy.openplatform.api.internal.mapping.ApiField;

import java.util.UUID;

/**
 * ALIPAY API: zhima.credit.score.get response.
 * 
 * @author auto create
 * @since 1.0, 2016-10-13 11:47:09
 */
public class ZhimaCreditScoreGetResponse extends ZhimaResponse {

	private static final long serialVersionUID = 5257629886143813979L;

	private String id=UUID.randomUUID().toString();
	
	/** 
	 * 芝麻信用对于每一次请求返回的业务号。后续可以通过此业务号进行对账
	 */
	@ApiField("biz_no")
	private String bizNo;

	/** 
	 * 用户的芝麻信用评分。分值范围[350,950]。如果用户数据不足，无法评分时，返回字符串"N/A"。
	 */
	@ApiField("zm_score")
	private String zmScore;

	/**
	 * 请求ID
	 */
	private String reqId;
	
	/**
	 * 请求对象中的业务流水凭证
	 */
	private String transactionId;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}
	public String getBizNo( ) {
		return this.bizNo;
	}

	public void setZmScore(String zmScore) {
		this.zmScore = zmScore;
	}
	public String getZmScore( ) {
		return this.zmScore;
	}

	public String getReqId() {
		return reqId;
	}

	public void setReqId(String reqId) {
		this.reqId = reqId;
	}
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
}
