package com.nhnacademy.client.event.observer.impl;

import com.nhnacademy.client.event.action.MessageAction;
import com.nhnacademy.client.event.observer.Observer;
import com.nhnacademy.client.event.subject.EventType;

public class MessageRecvObserver implements Observer {
    private final MessageAction messageAction;

    public MessageRecvObserver(MessageAction messageAction) {
        //TODO#1-8 MessageRecvObserver초기화 합니다.
        this.messageAction = messageAction;
    }

    @Override
    public EventType getEventType() {
        //TODO#1-9 EventType.RECV 반환 합니다.
        return EventType.RECV;
    }

    @Override
    public void updateMessage(String message) {
        //TODO#1-10 실질적인 recv event에ㅔ 대한 처리를 담당하는 messageAction.execute() method를 호출 합니다.
        messageAction.execute(message);
    }

}
