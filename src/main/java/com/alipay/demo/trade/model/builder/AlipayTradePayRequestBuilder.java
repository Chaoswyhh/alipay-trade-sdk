package com.alipay.demo.trade.model.builder;

import com.alipay.demo.trade.model.ExtendParams;
import com.alipay.demo.trade.model.GoodsDetail;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.regex.Pattern;
import org.apache.commons.lang.StringUtils;

public class AlipayTradePayRequestBuilder extends AlipayTradePrecreateRequestBuilder {
	
	private String scene;

	@SerializedName("auth_code")
	private String authCode;

	public boolean validate() {
		if (StringUtils.isEmpty(this.scene)) {
			throw new NullPointerException("scene should not be NULL!");
		}
		if (StringUtils.isEmpty(this.authCode)) {
			throw new NullPointerException("auth_code should not be NULL!");
		}
		if (!Pattern.matches("^\\d{10,}$", this.authCode)) {
			throw new IllegalStateException("invalid auth_code!");
		}
		return super.validate();
	}

	public AlipayTradePayRequestBuilder() {
		this.scene = "bar_code";
	}

	public String toString() {
		StringBuilder sb = new StringBuilder("AlipayTradePayContentBuilder{");
		sb.append("scene='").append(this.scene).append('\'');
		sb.append(", authCode='").append(this.authCode).append('\'');
		sb.append(", outTradeNo='").append(getOutTradeNo()).append('\'');
		sb.append(", sellerId='").append(getSellerId()).append('\'');
		sb.append(", totalAmount='").append(getTotalAmount()).append('\'');
		sb.append(", discountableAmount='").append(getDiscountableAmount()).append('\'');
		sb.append(", undiscountableAmount='").append(getUndiscountableAmount()).append('\'');
		sb.append(", subject='").append(getSubject()).append('\'');
		sb.append(", body='").append(getBody()).append('\'');
		sb.append(", goodsDetailList=").append(getGoodsDetailList());
		sb.append(", operatorId='").append(getOperatorId()).append('\'');
		sb.append(", storeId='").append(getStoreId()).append('\'');
		sb.append(", alipayStoreId='").append(getAlipayStoreId()).append('\'');
		sb.append(", terminalId='").append(getTerminalId()).append('\'');
		sb.append(", extendParams=").append(getExtendParams());
		if (StringUtils.isNotEmpty(getTimeExpress())) {
			sb.append(", timeExpire='").append(getTimeExpire()).append('\'');
		}
		sb.append(", timeExpress='").append(getTimeExpire()).append('\'');
		sb.append('}');
		return sb.toString();
	}

	public String getScene() {
		return this.scene;
	}

	public AlipayTradePayRequestBuilder setScene(String scene) {
		this.scene = scene;
		return this;
	}

	public String getAuthCode() {
		return this.authCode;
	}

	public AlipayTradePayRequestBuilder setAuthCode(String authCode) {
		this.authCode = authCode;
		return this;
	}

	public AlipayTradePayRequestBuilder setAlipayStoreId(String alipayStoreId) {
		return (AlipayTradePayRequestBuilder) super.setAlipayStoreId(alipayStoreId);
	}

	public AlipayTradePayRequestBuilder setBody(String body) {
		return (AlipayTradePayRequestBuilder) super.setBody(body);
	}

	public AlipayTradePayRequestBuilder setDiscountableAmount(String discountableAmount) {
		return (AlipayTradePayRequestBuilder) super.setDiscountableAmount(discountableAmount);
	}

	public AlipayTradePayRequestBuilder setExtendParams(ExtendParams extendParams) {
		return (AlipayTradePayRequestBuilder) super.setExtendParams(extendParams);
	}

	public AlipayTradePayRequestBuilder setGoodsDetailList(List<GoodsDetail> goodsDetailList) {
		return (AlipayTradePayRequestBuilder) super.setGoodsDetailList(goodsDetailList);
	}

	public AlipayTradePayRequestBuilder setOperatorId(String operatorId) {
		return (AlipayTradePayRequestBuilder) super.setOperatorId(operatorId);
	}

	public AlipayTradePayRequestBuilder setOutTradeNo(String outTradeNo) {
		return (AlipayTradePayRequestBuilder) super.setOutTradeNo(outTradeNo);
	}

	public AlipayTradePayRequestBuilder setSellerId(String sellerId) {
		return (AlipayTradePayRequestBuilder) super.setSellerId(sellerId);
	}

	public AlipayTradePayRequestBuilder setStoreId(String storeId) {
		return (AlipayTradePayRequestBuilder) super.setStoreId(storeId);
	}

	public AlipayTradePayRequestBuilder setSubject(String subject) {
		return (AlipayTradePayRequestBuilder) super.setSubject(subject);
	}

	public AlipayTradePayRequestBuilder setTerminalId(String terminalId) {
		return (AlipayTradePayRequestBuilder) super.setTerminalId(terminalId);
	}

	public AlipayTradePayRequestBuilder setTimeExpire(String timeExpire) {
		return (AlipayTradePayRequestBuilder) super.setTimeExpire(timeExpire);
	}

	public AlipayTradePayRequestBuilder setTotalAmount(String totalAmount) {
		return (AlipayTradePayRequestBuilder) super.setTotalAmount(totalAmount);
	}

	public AlipayTradePayRequestBuilder setUndiscountableAmount(String undiscountableAmount) {
		return (AlipayTradePayRequestBuilder) super.setUndiscountableAmount(undiscountableAmount);
	}

	public AlipayTradePayRequestBuilder setTimeExpress(String timeExpress) {
		return (AlipayTradePayRequestBuilder) super.setTimeExpress(timeExpress);
	}
}
