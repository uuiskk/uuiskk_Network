package com.nhnacademy.client.event.action.impl;

import com.nhnacademy.client.event.action.MessageAction;

import java.io.PrintWriter;

public class SendMessageAction implements MessageAction {
    public SendMessageAction(PrintWriter printWriter) {
        //TODO#1-11 message 전송하기 위해서 printWriter를 사용 합니다. 초기화 해주세요
        this.printWriter = printWriter;
    }

    private final PrintWriter printWriter;

    @Override
    public void execute(String message) {
        //TODO#1-12 printWriter를 이용해서 client ->  server로 message를 전송 합니다.
        printWriter.println(message);
    }
}
