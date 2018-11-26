package com.rpc.ws.service.impl;

import javax.jws.WebService;

import com.rpc.ws.service.MessengerService;

@WebService(endpointInterface="com.rpc.ws.service.MessengerService")
public class MessengerServiceImpl implements MessengerService {

	@Override
	public String getMessage(String name) {
		return "Message from RPC-WS as requested by " + name;
	}

	
}
