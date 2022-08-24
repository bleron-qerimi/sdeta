package com.sqa.academy.utils;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigurationReader {
    private static Properties properties;
    static{
        try {
            String path="configure.properties";
            FileInputStream inputStream=new FileInputStream(path);
            properties=new Properties();

            properties.load(inputStream);
            inputStream.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static String get(String key){
        return properties.getProperty(key);
    }
}
