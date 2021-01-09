package com.xsz;

import java.io.File;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * @author Oleg Zhurakousky
 * @author Gunnar Hillert
 * @author Gary Russell
 *
 */
public class ActiveMqTestUtils {

    private static final Log LOGGER = LogFactory.getLog(ActiveMqTestUtils.class);

    public static void prepare() {
        LOGGER.info("Refreshing ActiveMQ data directory.");
        File activeMqTempDir = new File("activemq-data");
        deleteDir(activeMqTempDir);
    }

    private static void deleteDir(File directory){
        if (directory.exists()){
            String[] children = directory.list();
            if (children != null){
                for (int i=0; i < children.length; i++) {
                    deleteDir(new File(directory, children[i]));
                }
            }
        }
        directory.delete();
    }

}