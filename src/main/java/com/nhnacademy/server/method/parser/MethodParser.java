package com.nhnacademy.server.method.parser;

import org.apache.commons.lang3.StringUtils;

import java.util.Objects;

public class MethodParser {

    public static MethodAndValue parse(String message){

        /*TODO#1-1 client로 부터 전송되는 message를 method / value로 분리 합니다.
            - ex)echo hello  -> method : echo , value : hello
            - ex)echo -> method : echo , value:""
            - message "" or null 이면 null을 반환 합니다.
            - 파싱한 결과는 MethodAndValue로 반환 합니다.
         */

        return null;
    }

    public static class MethodAndValue{
        private final String method;
        private final String value;

        public MethodAndValue(String method, String value) {
            //TODO#1-2 초기화 합니다.
            this.method = null;
            this.value = null;
        }

        public String getMethod() {
            //TODO#1-3 method 반환 하빈다.
            return null;
        }

        public String getValue() {
            //TODO#1-4 value 반환 하빈다.
            return null;
        }
    }
}