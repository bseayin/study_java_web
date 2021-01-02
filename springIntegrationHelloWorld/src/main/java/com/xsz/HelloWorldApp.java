package com.xsz;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.PollableChannel;
import org.springframework.messaging.support.GenericMessage;

/**
 * Demonstrates a basic Message Endpoint that simply prepends a greeting
 * ("Hello ") to an inbound String payload from a Message. This is a very
 * low-level example, using Message Channels directly for both input and
 * output. Notice that the output channel has a queue sub-element. It is
 * therefore a PollableChannel and its consumers must invoke receive() as
 * demonstrated below.
 * <p>
 * View the configuration of the channels and the endpoint (a &lt;service-activator/&gt;
 * element) in 'helloWorldDemo.xml' within this same package.
 *
 * @author Mark Fisher
 * @author Oleg Zhurakousky
 * @author Gary Russell
 */
public class HelloWorldApp {

    private static Log logger = LogFactory.getLog(HelloWorldApp.class);

    public static void main(String[] args) {
        /**
         * ClassPathXmlApplicationContext Spring IOC 容器
         * 第一个参数 xml文件路径
         * 第二个参数JVM 创建对应对象
         */
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("/META-INF/spring/integration/helloWorldDemo.xml",
                HelloWorldApp.class);
        /**
         * Channel： 消息发送者发送消息到通道(Channel)，消息接受者从通道(Channel)接收消息
         *
         */
        MessageChannel inputChannel = context.getBean("inputChannel", MessageChannel.class);
        PollableChannel outputChannel = context.getBean("outputChannel", PollableChannel.class);
        inputChannel.send(new GenericMessage<String>("World"));
        /**
         *  PollableChannel.receive(long timeout)
         *  Receive the first available message from this channel.
         *  If the specified timeout is 0, the method will return immediately
         */

        logger.info("==> HelloWorldDemo: " + outputChannel.receive(0).getPayload());
        context.close();
    }

}
