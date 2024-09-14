package com.nhnacademy.server.method.response;

import com.nhnacademy.server.method.response.exception.ResponseNotFoundException;
import com.nhnacademy.server.method.response.impl.EchoResponse;

import java.util.ArrayList;
import java.util.Objects;

public class ResponseFactory {
    private static final ArrayList<Response> responseList = new ArrayList<>(){{
        //TODO#1-8 EchoResponse 객체를 성성해서 추가 합니다.

    }};

    public static Response getResponse(String method){
        /*TODO#1-9 responseList에서 parameter로 전달된 method에 해당된 구현체를 반환 합니다.
            response가 존재하지 않다면 ResponseNotFoundException을 발생합니다.
         */

        return null;
    }
}
