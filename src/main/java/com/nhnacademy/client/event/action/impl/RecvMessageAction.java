/*
 * +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 * + Copyright 2024. NHN Academy Corp. All rights reserved.
 * + * While every precaution has been taken in the preparation of this resource,  assumes no
 * + responsibility for errors or omissions, or for damages resulting from the use of the information
 * + contained herein
 * + No part of this resource may be reproduced, stored in a retrieval system, or transmitted, in any
 * + form or by any means, electronic, mechanical, photocopying, recording, or otherwise, without the
 * + prior written permission.
 * +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 */

package com.nhnacademy.client.event.action.impl;

import com.nhnacademy.client.event.action.MessageAction;
import com.nhnacademy.client.ui.form.MessageClientForm;

public class RecvMessageAction implements MessageAction {
    private final MessageClientForm messageClientForm;

    public RecvMessageAction(MessageClientForm messageClientForm) {
        //TODO#2-10 messageClientForm을 초기화 합니다. messageClientForm은 메시지 전송/수신 UI를 담당 합니다.
        this.messageClientForm = messageClientForm;
    }

    @Override
    public void execute(String message) {
        /* TODO#2-11 message를 수신하면 MessageRecvObserver에 의해서 호출 됩니다.
            - messageClientForm.getMessageArea()에 message를 추가 합니다.
            - message 추가 후 개행 문자를 추가로 삽입 합니다.
         */
        messageClientForm.getMessageArea().append(message);
        messageClientForm.getMessageArea().append(System.lineSeparator());
    }
}
