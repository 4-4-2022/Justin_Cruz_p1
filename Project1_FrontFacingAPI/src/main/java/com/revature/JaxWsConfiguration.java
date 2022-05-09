package com.revature;

import javax.xml.ws.Endpoint;

import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//import com.revature.service.OrderServiceImpl;

@Configuration
public class JaxWsConfiguration {

	@Bean
	public ServletRegistrationBean<CXFServlet> cxfServlet(){
		//All services are going to be located under "/soap-service". Note that "*" is just a wildcard.
		return new ServletRegistrationBean<CXFServlet>(new CXFServlet(), "/soap-service/*");
	}
	
	@Bean(name = "cxf")
	public SpringBus springBus() {
		return new SpringBus();
	}
	
//	@Bean
//	public OrderServiceImpl orderServiceImpl() {
//		return new OrderServiceImpl();
//	}
//	
//	@Bean
//	public Endpoint endpoint() {
//		EndpointImpl endpoint = new EndpointImpl(springBus(), orderServiceImpl());
//		/*
//		 * We need to expose this endpoint under an address. We have to pulic endpoints ourself; it's not immediately
//		 * consumable.
//		 */
//		endpoint.publish("/order-service");
//		return endpoint;
//	}
}
