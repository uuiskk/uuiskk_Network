package com.nhnacademy.client.ui.listener;

import com.nhnacademy.client.ui.form.MessageClientForm;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class InputFieldKeyListener implements KeyListener {
    private final MessageClientForm messageClientForm;

    public InputFieldKeyListener(MessageClientForm messageClientForm) {
        this.messageClientForm = messageClientForm;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        //keyboard의 enter를 눌렀을 때  아래 TODO가 실행 됨니다.
        if(e.getKeyCode() == KeyEvent.VK_ENTER){
        /*TODO#3-5-1 enterkey를 누를 때 발생하는 이벤트를 처리 합니다.
            - inputBox에서 enter를 입력하면 SendButtonEventListener에 구현 했던것 처럼 messageClientForm.getSubject().sendMessage()를 이용해서 메시지를 전송 합니다.
            - 즉 전송 이벤트를 발생 시킴니다.
        */
            messageClientForm.getSubject().sendMessage(messageClientForm.getInputField().getText());
            messageClientForm.getInputField().setText("");
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

}
