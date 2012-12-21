package com.mkyong.quartz;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

public class SchedulerJob extends QuartzJobBean {
    protected final Log log = LogFactory.getLog(this.getClass());

    protected void executeInternal(JobExecutionContext context)
            throws JobExecutionException {
        log.info("Struts 2.3.4 + Quartz 1.8.6 + Spring 3.1.2");

        log.info("context fireTime:==" + context.getFireTime());

        // System.out.println("Struts 2.3.4 + Quartz 1.8.6 + Spring 3.1.2");

    }
}
