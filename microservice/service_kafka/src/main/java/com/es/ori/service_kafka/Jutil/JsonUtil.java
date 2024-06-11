package com.es.ori.service_kafka.Jutil;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonUtil {//clase de utilidad para convertir de java-json y viseversa
    private static final ObjectMapper objectMapper = new ObjectMapper();

    public static String toJson(Object object){
        try {
            return objectMapper.writeValueAsString(object);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    public static <T> T fromJson(String json,Class<T> tClass){
        try {
            return objectMapper.readValue(json,tClass);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}
