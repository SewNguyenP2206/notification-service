package org.example;

import org.example.MailDetail;

public interface InterfaceOfMailService {
    String sendMail(MailDetail mailDetail);

    String sendMailWithAttachment(MailDetail mailDetail);
}
