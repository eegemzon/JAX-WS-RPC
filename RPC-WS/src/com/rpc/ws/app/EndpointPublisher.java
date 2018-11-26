package com.rpc.ws.app;

import javax.xml.ws.Endpoint;

import com.rpc.ws.service.impl.MessengerServiceImpl;

/***
 * Publishes the sample web service
 * Run as java application via eclipse, and access http://localhost:8080/ws/message?wsdl on the browser
 * To manually create a wsdl document file, 
 * use "wsgen -verbose -keep -cp . <package.name.className> -wsdl" inside the bin folder, or where the compiled class files were created  
 * @author eineil.eric.c.gemzon
 *
 */
public class EndpointPublisher {
	public static void main(String[] args) {
		System.out.println("Publishing messenger service...");
		Endpoint.publish("http://localhost:8080/ws/message", new MessengerServiceImpl());
	}
}
