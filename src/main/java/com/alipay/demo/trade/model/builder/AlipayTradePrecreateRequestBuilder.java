package com.alipay.demo.trade.model.builder;

import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.alipay.demo.trade.model.ExtendParams;
import com.alipay.demo.trade.model.GoodsDetail;
import com.google.gson.annotations.SerializedName;

public class AlipayTradePrecreateRequestBuilder extends RequestBuilder {

	@SerializedName("out_trade_no")
	private String outTradeNo;

	@SerializedName("seller_id")
	private String sellerId;

	@SerializedName("total_amount")
	private String totalAmount;

	@SerializedName("discountable_amount")
	private String discountableAmount;

	@SerializedName("undiscountable_amount")
	private String undiscountableAmount;
	private String subject;
	private String body;

	@SerializedName("goods_detail")
	private List<GoodsDetail> goodsDetailList;

	@SerializedName("operator_id")
	private String operatorId;

	@SerializedName("store_id")
	private String storeId;

	@SerializedName("alipay_store_id")
	private String alipayStoreId;

	@SerializedName("terminal_id")
	private String terminalId;

	@SerializedName("extend_params")
	private ExtendParams extendParams;

	@SerializedName("time_expire")
	private String timeExpire;

	@SerializedName("time_express")
	private String timeExpress;

	public boolean validate() {
		if (StringUtils.isEmpty(this.outTradeNo)) {
			throw new NullPointerException("out_trade_no should not be NULL!");
		}
		if (StringUtils.isEmpty(this.totalAmount)) {
			throw new NullPointerException("total_amount should not be NULL!");
		}
		if (StringUtils.isEmpty(this.subject)) {
			throw new NullPointerException("subject should not be NULL!");
		}
		if (StringUtils.isEmpty(this.storeId)) {
			throw new NullPointerException("store_id should not be NULL!");
		}
		return true;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder("AlipayTradePrecreateRequestBuilder{");
		sb.append("outTradeNo='").append(this.outTradeNo).append('\'');
		sb.append(", sellerId='").append(this.sellerId).append('\'');
		sb.append(", totalAmount='").append(this.totalAmount).append('\'');
		sb.append(", discountableAmount='").append(this.discountableAmount).append('\'');
		sb.append(", undiscountableAmount='").append(this.undiscountableAmount).append('\'');
		sb.append(", subject='").append(this.subject).append('\'');
		sb.append(", body='").append(this.body).append('\'');
		sb.append(", goodsDetailList=").append(this.goodsDetailList);
		sb.append(", operatorId='").append(this.operatorId).append('\'');
		sb.append(", storeId='").append(this.storeId).append('\'');
		sb.append(", alipayStoreId='").append(this.alipayStoreId).append('\'');
		sb.append(", terminalId='").append(this.terminalId).append('\'');
		sb.append(", extendParams=").append(this.extendParams);
		if (StringUtils.isNotEmpty(this.timeExpire)) {
			sb.append(", timeExpire='").append(this.timeExpire).append('\'');
		}
		sb.append(", timeExpress='").append(this.timeExpress).append('\'');
		sb.append('}');
		return sb.toString();
	}

	public String getOutTradeNo() {
		return this.outTradeNo;
	}

	public AlipayTradePrecreateRequestBuilder setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
		return this;
	}

	public String getSellerId() {
		return this.sellerId;
	}

	public AlipayTradePrecreateRequestBuilder setSellerId(String sellerId) {
		this.sellerId = sellerId;
		return this;
	}

	public String getTotalAmount() {
		return this.totalAmount;
	}

	public AlipayTradePrecreateRequestBuilder setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
		return this;
	}

	public String getDiscountableAmount() {
		return this.discountableAmount;
	}

	public AlipayTradePrecreateRequestBuilder setDiscountableAmount(String discountableAmount) {
		this.discountableAmount = discountableAmount;
		return this;
	}

	public String getUndiscountableAmount() {
		return this.undiscountableAmount;
	}

	public AlipayTradePrecreateRequestBuilder setUndiscountableAmount(String undiscountableAmount) {
		this.undiscountableAmount = undiscountableAmount;
		return this;
	}

	public String getSubject() {
		return this.subject;
	}

	public AlipayTradePrecreateRequestBuilder setSubject(String subject) {
		this.subject = subject;
		return this;
	}

	public String getBody() {
		return this.body;
	}

	public AlipayTradePrecreateRequestBuilder setBody(String body) {
		this.body = body;
		return this;
	}

	public List<GoodsDetail> getGoodsDetailList() {
		return this.goodsDetailList;
	}

	public AlipayTradePrecreateRequestBuilder setGoodsDetailList(List<GoodsDetail> goodsDetailList) {
		this.goodsDetailList = goodsDetailList;
		return this;
	}

	public String getOperatorId() {
		return this.operatorId;
	}

	public AlipayTradePrecreateRequestBuilder setOperatorId(String operatorId) {
		this.operatorId = operatorId;
		return this;
	}

	public String getStoreId() {
		return this.storeId;
	}

	public AlipayTradePrecreateRequestBuilder setStoreId(String storeId) {
		this.storeId = storeId;
		return this;
	}

	public String getAlipayStoreId() {
		return this.alipayStoreId;
	}

	public AlipayTradePrecreateRequestBuilder setAlipayStoreId(String alipayStoreId) {
		this.alipayStoreId = alipayStoreId;
		return this;
	}

	public String getTerminalId() {
		return this.terminalId;
	}

	public AlipayTradePrecreateRequestBuilder setTerminalId(String terminalId) {
		this.terminalId = terminalId;
		return this;
	}

	public ExtendParams getExtendParams() {
		return this.extendParams;
	}

	public AlipayTradePrecreateRequestBuilder setExtendParams(ExtendParams extendParams) {
		this.extendParams = extendParams;
		return this;
	}

	public String getTimeExpire() {
		return this.timeExpire;
	}

	public AlipayTradePrecreateRequestBuilder setTimeExpire(String timeExpire) {
		this.timeExpire = timeExpire;
		return this;
	}

	public String getTimeExpress() {
		return this.timeExpress;
	}

	public AlipayTradePrecreateRequestBuilder setTimeExpress(String timeExpress) {
		this.timeExpress = timeExpress;
		return this;
	}
}
