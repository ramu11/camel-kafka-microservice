package com.marriott.poc.crm;

import org.apache.camel.CamelContext;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class CrmPocIIDRMsgRouter {

	public static void main(String[] args) {
		// SpringApplication.run(CrmPocOdsDynamicOperationApplication.class,
		// args);

		try {
			ApplicationContext springCtx = new ClassPathXmlApplicationContext(
					"application_context.xml");

			CamelContext context = springCtx.getBean("s_DocQuoteContext",
					CamelContext.class);

			context.start();

			//Thread.sleep(5 * 60 * 1000);
			Thread.sleep(1440 * 60 * 1000);//running for 24 hours

			context.stop();

		} catch (Exception e) {

			e.printStackTrace();

		}

	}

}
