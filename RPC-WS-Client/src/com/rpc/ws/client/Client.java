package com.rpc.ws.client;

import com.rpc.ws.service.impl.MessengerService;
import com.rpc.ws.service.impl.MessengerServiceImplService;

/**
 * Sample client
 * Inside RPC-WS-Client, while the endpoint is running, run wsimport -keep http://<domain>:<port>/ws/message?wsdl to create the com.rpc.ws.service.impl files
 * @author eineil.eric.c.gemzon
 *
 */
public class Client {
	public static void main(String[] args) {
		//generated file from wsdl
		MessengerServiceImplService generatedFileService = new MessengerServiceImplService(); 
		//API interface = get port or connect to server, to access API (RPC) intance
		MessengerService service = generatedFileService.getMessengerServiceImplPort(); 
		//Access the API
		System.out.println(service.getMessage("CLIENT APPLICATION"));
		
	}
}
