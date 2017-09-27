package com.antgroup.zmxy.openplatform.api.request;

import com.antgroup.zmxy.openplatform.api.ZhimaRequest;
import com.antgroup.zmxy.openplatform.api.internal.util.ZhimaHashMap;
import com.antgroup.zmxy.openplatform.api.response.ZhimaCreditSkynetriskGetResponse;

import java.util.Map;

/**
 * ALIPAY API: zhima.credit.skynetrisk.get request
 * 
 * @author auto create
 * @since 1.0, 2016-10-13 18:51:23
 */
public class ZhimaCreditSkynetriskGetRequest implements ZhimaRequest<ZhimaCreditSkynetriskGetResponse> {

	private ZhimaHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 支付宝登陆号
	 */
	private String alipayLogonId;

	/** 
	* 身份证号码
	 */
	private String certNo;

	/** 
	* 合约外标，服务标识。签约过后将会收到含有该服务标识的邮件，或者向协同您签约的芝麻合作人员索取。
	 */
	private String contractFlag;

	/** 
	* 手机号码
	 */
	private String mobile;

	/** 
	* 姓名
	 */
	private String name;

	/** 
	* 主体类型和对应参数
使用身份证信息查询填cert，对应cert_no和name参数必填；
使用支付宝登陆账号查询填alipayLogonId，对应alipay_logon_id参数必填；
使用支付宝用户ID查询填userId，对应user_id参数必填；
使用手机号查询填mobile，对应mobile参数必填
	 */
	private String principalType;

	/** 
	* 产品码，固定为w1010100000000001000
	 */
	private String productCode;

	/** 
	* transaction_id是代表一笔请求的唯一标志，该标识作为对账的关键信息，对于用户使用相同transaction_id的查询，芝麻在一天（86400秒）内返回首次查询数据，超过有效期的查询即为无效并返回异常（错误码xxxx），有效期内的重复查询不重新计费。 transaction_id 推荐生成方式是：30位，（其中17位时间值（精确到毫秒）：yyyyMMddHHmmssSSS）加上（13位自增数字：1234567890123）
	 */
	private String transactionId;

	/** 
	* 支付宝账号ID
	 */
	private String userId;

	public void setAlipayLogonId(String alipayLogonId) {
		this.alipayLogonId = alipayLogonId;
	}
	public String getAlipayLogonId() {
		return this.alipayLogonId;
	}

	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}
	public String getCertNo() {
		return this.certNo;
	}

	public void setContractFlag(String contractFlag) {
		this.contractFlag = contractFlag;
	}
	public String getContractFlag() {
		return this.contractFlag;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getMobile() {
		return this.mobile;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}

	public void setPrincipalType(String principalType) {
		this.principalType = principalType;
	}
	public String getPrincipalType() {
		return this.principalType;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getProductCode() {
		return this.productCode;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	public String getTransactionId() {
		return this.transactionId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId() {
		return this.userId;
	}
	private String channel;
	private String platform;	
	private String scene;
	private String extParams;

	public String getApiVersion() {
		return this.apiVersion;
	}

	public void setApiVersion(String apiVersion) {
		this.apiVersion = apiVersion;
	}

	public void setChannel(String channel){
		this.channel=channel;
	}

    public String getChannel(){
    	return this.channel;
    }

	public void setPlatform(String platform){
		this.platform=platform;
	}

    public String getPlatform(){
    	return this.platform;
    }
    
    public void setScene(String scene){
		this.scene=scene;
	}

    public String getScene(){
    	return this.scene;
    }
    
    public void setExtParams(String extParams){
		this.extParams=extParams;
	}

    public String getExtParams(){
    	return this.extParams;
    }
    
	public String getApiMethodName() {
		return "zhima.credit.skynetrisk.get";
	}

	public Map<String, String> getTextParams() {		
		ZhimaHashMap txtParams = new ZhimaHashMap();
		txtParams.put("alipay_logon_id", this.alipayLogonId);
		txtParams.put("cert_no", this.certNo);
		txtParams.put("contract_flag", this.contractFlag);
		txtParams.put("mobile", this.mobile);
		txtParams.put("name", this.name);
		txtParams.put("principal_type", this.principalType);
		txtParams.put("product_code", this.productCode);
		txtParams.put("transaction_id", this.transactionId);
		txtParams.put("user_id", this.userId);
		if(udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public void putOtherTextParam(String key, String value) {
		if(this.udfParams == null) {
			this.udfParams = new ZhimaHashMap();
		}
		this.udfParams.put(key, value);
	}

	public Class<ZhimaCreditSkynetriskGetResponse> getResponseClass() {
		return ZhimaCreditSkynetriskGetResponse.class;
	}
}
