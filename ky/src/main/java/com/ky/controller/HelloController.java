package com.ky.controller;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName HelloController
 * @Author beyond
 * @Company KY
 * @Date 2018/12/4 11:04
 * @Descr
 */
@Controller
public class HelloController {
    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        return "hello ky!";
    }

    @RequestMapping("/home")
    public String home(Model model){
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("tow");
        list.add("three");
        model.addAttribute("list" , list);
        return "index";
    }

    @RequestMapping("/save")
    public String save() throws  Exception{
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("tow");
        list.add("three");
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File("D:/test.txt"))));
        JSONObject.writeJSONStringTo(list , writer , new SerializerFeature[]{});
        return "index";
    }

    @RequestMapping("/read")
    public String read() throws  Exception{

        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(new File("D:/test.txt"))));
        List<String> list = JSONObject.parseArray(reader.readLine() , String.class);
        for(String item : list){
            System.out.println(item);
        }
        return "index";
    }
}
