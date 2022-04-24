package com.spacex.www.base.json;


import org.json.JSONObject;
import org.junit.Test;

public class JSONTest {

    @Test
    public void json() {
        JSONObject json = new JSONObject();
        json.put("username", "张三");
        json.put("password", "123");
        String jsonStr=json.toString();
        System.out.println(JsonUtils.getJson(jsonStr));
    }


}
