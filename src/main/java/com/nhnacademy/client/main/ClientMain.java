package com.nhnacademy.client.main;

import com.nhnacademy.client.event.subject.MessageSubject;
import com.nhnacademy.client.event.subject.Subject;
import com.nhnacademy.client.runable.MessageClient;
import lombok.extern.slf4j.Slf4j;

import java.io.*;

@Slf4j
public class ClientMain {
    public static void main(String[] args) throws IOException {

        MessageClient messageClient = new MessageClient();
        Thread thread = new Thread(messageClient);
        thread.start();

        try {
            thread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
