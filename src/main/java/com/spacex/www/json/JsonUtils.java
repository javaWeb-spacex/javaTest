package com.spacex.www.json;

import org.json.JSONArray;
import org.json.JSONException;
import  org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class JsonUtils {


//    {"paramz":{
//        "feeds":[{
//            "id":299076,
//                    "oid":288340,
//                    "category":"article",
//                    "data":{
//                "subject":"荔枝新闻3.0：不止是阅读",
//                        "summary":"江苏广电旗下资讯类手机应用“荔枝新闻”于近期推出全新升级换代的3.0版。",
//                        "cover":"/Attachs/Article/288340/3e8e2c397c70469f8845fad73aa38165_padmini.JPG",
//                        "pic":"",
//                        "format":"txt",
//                        "changed":"2015-09-22 16:01:41"
//            }
//        }
//                    ],
//        "PageIndex":1,
//                "PageSize":20,
//                "TotalCount":53521,
//                "TotalPage":2677
//    }
    public static List<HashMap<String,Object>> getJsonList(String json){
        List<HashMap<String,Object>> dataList;
        dataList=new ArrayList<>();
        try{
            //创建json对象
            JSONObject rootObject=new JSONObject(json);
            //获取对象
            JSONObject paramzObject =rootObject.getJSONObject("paramz");
            //获取数组
            JSONArray feedsArray =paramzObject.getJSONArray("feeds");
            for (int i=0;i<feedsArray.length();i++){
                JSONObject sonObject =feedsArray.getJSONObject(i);
                JSONObject dataObject=sonObject.getJSONObject("data");
                //获取字符串
                String subjectStr =dataObject.getString("subject");
                String summaryStr=dataObject.getString("summary");
                String coverStr=dataObject.getString("cover");
                HashMap<String,Object> map=new HashMap<>();
                map.put("subject",subjectStr);
                map.put("summary",summaryStr);
                map.put("cover",coverStr);
                dataList.add(map);
            }
            return dataList;
        }catch (JSONException e){
            e.printStackTrace();
        }

        return null;
    }
    public static HashMap<String,Object> getJson(String json){
        HashMap<String,Object> dataList=new HashMap<>();
        try{
            JSONObject rootObject=new JSONObject(json);
            String username =rootObject.getString("username");
            String password =rootObject.getString("password");
            dataList.put("username",username);
            dataList.put("password",password);
            return dataList;
        }catch (JSONException e){
            e.printStackTrace();
        }

        return null;
    }
}
