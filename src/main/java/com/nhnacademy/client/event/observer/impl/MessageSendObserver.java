package com.nhnacademy.client.event.observer.impl;

import com.nhnacademy.client.event.action.MessageAction;
import com.nhnacademy.client.event.observer.Observer;
import com.nhnacademy.client.event.subject.EventType;

public class MessageSendObserver implements Observer {
    private final MessageAction messageAction;

    public MessageSendObserver(MessageAction messageAction) {
        //TODO#1-5 MessageSendObserver 초기화 합니다.
        this.messageAction = messageAction;
    }

    @Override
    public EventType getEventType() {
        //TODO#1-6 EventType.SEND 를 반환 합니다.
        return EventType.SEND;
    }

    @Override
    public void updateMessage(String message) {
        //TODO#1-7 실질적인 send event에ㅔ 대한 처리를 담당하는 messageAction.execute() method를 호출 합니다.
        messageAction.execute(message);
    }

}
