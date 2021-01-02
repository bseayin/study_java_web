package com.xsz;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * @author Oleg Zhurakousky
 * @author Gary Russell
 *
 */
public class HttpClientDemo {

    private static Log logger = LogFactory.getLog(HttpClientDemo.class);

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(
                "/META-INF/spring/integration/http-outbound-config.xml");
        RequestGateway requestGateway = context.getBean("requestGateway", RequestGateway.class);
        String reply = requestGateway.echo("Hello");
        logger.info("\n\n++++++++++++ Replied with: " + reply + " ++++++++++++\n");
        context.close();
    }

}
