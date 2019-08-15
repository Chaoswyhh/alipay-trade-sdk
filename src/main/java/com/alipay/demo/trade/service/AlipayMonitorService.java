package com.alipay.demo.trade.service;

import com.alipay.api.response.MonitorHeartbeatSynResponse;
import com.alipay.demo.trade.model.builder.AlipayHeartbeatSynRequestBuilder;

public abstract interface AlipayMonitorService {
	
	public abstract MonitorHeartbeatSynResponse heartbeatSyn(
			AlipayHeartbeatSynRequestBuilder paramAlipayHeartbeatSynContentBuilder);

	public abstract MonitorHeartbeatSynResponse heartbeatSyn(
			AlipayHeartbeatSynRequestBuilder paramAlipayHeartbeatSynContentBuilder, String paramString);
}