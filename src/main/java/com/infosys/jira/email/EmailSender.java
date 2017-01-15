package com.infosys.jira.email;

import com.atlassian.jira.component.ComponentAccessor;
import com.atlassian.jira.mail.Email;
import com.atlassian.mail.queue.SingleMailQueueItem;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.util.Map;
import java.util.Properties;

/**
 * Created by Raj on 16/01/2017.
 */
public class EmailSender {

    Logger logger = Logger.getLogger(this.getClass());

    private final Properties properties;

    public EmailSender() {
        properties = EmailUtil.getProperties("access-log-analyzer.properties");
    }

    public void send(Map<String, EmailReport> userMap) throws IOException {
        Email email = new Email(properties.getProperty("email.send.to"));
        email.setSubject(EmailUtil.getSubject());
        email.setMimeType("text/html");
        email.setCc(properties.getProperty("emai.send.cc"));
        email.setBody(EmailUtil.getBody(userMap));
        SingleMailQueueItem singleMailQueueItem = new SingleMailQueueItem(email);
        ComponentAccessor.getMailQueue().addItem(singleMailQueueItem);
    }
}
