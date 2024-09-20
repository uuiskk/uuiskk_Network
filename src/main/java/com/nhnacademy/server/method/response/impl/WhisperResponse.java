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

package com.nhnacademy.server.method.response.impl;

import com.nhnacademy.server.method.response.Response;
import com.nhnacademy.server.runable.MessageServer;
import com.nhnacademy.server.thread.channel.Session;
import org.apache.commons.lang3.StringUtils;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class WhisperResponse implements Response {
    @Override
    public String getMethod() {
        return "whisper";
    }

    @Override
    public String execute(String value) {

        if(!Session.isLogin()){
            return "login required!";
        }
        if(StringUtils.isEmpty(value)){
            return "empty message!";
        }

        String[] values = value.split(" ");
        if(values.length<2){
            return "empty message!";
        }

        String id = values[0];
        String message = value.substring(id.length());

        Socket client = MessageServer.getClientSocket(id);
        try {
            PrintWriter out = new PrintWriter(client.getOutputStream(),true);
            out.println(String.format("[%s] %s",Session.getCurrentId(),message));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return String.format("[%s][%s] %s", getMethod(), id, message );
    }
}
