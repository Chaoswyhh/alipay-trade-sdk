package com.alipay.demo.trade.service;

import com.alipay.demo.trade.model.builder.AlipayTradePayRequestBuilder;
import com.alipay.demo.trade.model.builder.AlipayTradePrecreateRequestBuilder;
import com.alipay.demo.trade.model.builder.AlipayTradeRefundRequestBuilder;
import com.alipay.demo.trade.model.result.AlipayF2FPayResult;
import com.alipay.demo.trade.model.result.AlipayF2FPrecreateResult;
import com.alipay.demo.trade.model.result.AlipayF2FQueryResult;
import com.alipay.demo.trade.model.result.AlipayF2FRefundResult;

public abstract interface AlipayTradeService {
	
	public abstract AlipayF2FPayResult tradePay(AlipayTradePayRequestBuilder paramAlipayTradePayContentBuilder);

	public abstract AlipayF2FQueryResult queryTradeResult(String paramString);

	public abstract AlipayF2FRefundResult tradeRefund(AlipayTradeRefundRequestBuilder paramAlipayTradeRefundContentBuilder);

	public abstract AlipayF2FPrecreateResult tradePrecreate(AlipayTradePrecreateRequestBuilder paramAlipayTradePrecreateContentBuilder);
}