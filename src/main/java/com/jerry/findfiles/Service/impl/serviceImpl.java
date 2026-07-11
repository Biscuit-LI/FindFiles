package com.jerry.findfiles.Service.impl;


import com.jerry.findfiles.Service.service;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@Primary
@Service
public class serviceImpl implements service {

    @Override
    public HashMap<String, Integer> findFile(File f) {
        HashMap<String,Integer> Map=new HashMap<>();
        File[] files=f.listFiles();
        if(files!=null){
            for(File f1:files){
                if(f1.isFile()){
                    String fName=f1.getName();
                    String[] strings=fName.split("\\.");
                    if(strings.length>1){
                        String name=strings[strings.length-1];
                        if(Map.containsKey(name)){
                            Map.put(name,Map.get(name)+1);
                        }else{
                            Map.put(name,1);
                        }
                    }
                }else{
                    HashMap<String,Integer> MapSon=findFile(f1);
                    Set<Map.Entry<String,Integer>> entries=MapSon.entrySet();
                    for (Map.Entry<String, Integer> entry : entries) {
                        String name=entry.getKey();
                        int value=entry.getValue();
                        if(Map.containsKey(name)){
                            Map.put(name,Map.get(name)+value);
                        }else{
                            Map.put(name,value);
                        }
                    }


                }
            }
        }
        return Map;
    }
}
