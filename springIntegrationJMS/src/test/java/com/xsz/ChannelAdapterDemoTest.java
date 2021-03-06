package com.xsz;

import org.junit.Assert;
import org.junit.Test;

import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.integration.channel.QueueChannel;
import org.springframework.integration.support.MessageBuilder;

/**
 * @author Gunnar Hillert
 */
public class ChannelAdapterDemoTest {

    private final static String[] configFilesChannelAdapterDemo = {
            "/META-INF/spring/integration/common.xml",
            "/META-INF/spring/integration/inboundChannelAdapter.xml",
            "/META-INF/spring/integration/outboundChannelAdapter.xml"
    };

    @Test
    public void testChannelAdapterDemo() throws InterruptedException {

        System.setProperty("spring.profiles.active", "testCase");

        final GenericXmlApplicationContext applicationContext = new GenericXmlApplicationContext(configFilesChannelAdapterDemo);

        final MessageChannel stdinToJmsOutChannel = applicationContext.getBean("stdinToJmsOutChannel", MessageChannel.class);

        stdinToJmsOutChannel.send(MessageBuilder.withPayload("jms test").build());

        final QueueChannel queueChannel = applicationContext.getBean("queueChannel", QueueChannel.class);

        @SuppressWarnings("unchecked")
        Message<String> reply = (Message<String>) queueChannel.receive(20000);
        Assert.assertNotNull(reply);
        String out = reply.getPayload();
        Assert.assertEquals("jms test", out);

        applicationContext.close();
    }

}
