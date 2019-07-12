/*
 * -*- coding: utf-8 -*-
 * Copyright 2019 Kaleyra. All Rights Reserved.
 * Author : Viram Jain
 */

package com.kaleyra.messaging.example;

import com.kaleyra.messaging.api.Konstants;
import com.kaleyra.messaging.api.SMSMessageRequest;
import com.kaleyra.messaging.api.SMSMessageResponse;

public class CheckSMSStatusExample {
    public static void main(String[] args) {
        new Konstants();
        SMSMessageRequest smsMessageRequest = new SMSMessageRequest("groupID");
        SMSMessageResponse smsMessageResponse=smsMessageRequest.checkSMSStatus();
        smsMessageResponse.toJson();
    }
}