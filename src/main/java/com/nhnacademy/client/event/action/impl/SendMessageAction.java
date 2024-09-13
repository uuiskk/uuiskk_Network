package com.nhnacademy.client.event.action.impl;

import com.nhnacademy.client.event.action.MessageAction;

import java.io.PrintWriter;

public class SendMessageAction implements MessageAction {
    public SendMessageAction(PrintWriter printWriter) {
        this.printWriter = printWriter;
    }

    private final PrintWriter printWriter;

    @Override
    public void execute(String message) {
        printWriter.println(message);
    }
}
