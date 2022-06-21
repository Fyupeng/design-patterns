package com.itheima.pattern.factory.config_factory;

import javax.print.attribute.standard.PrinterMessageFromOperator;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Properties;
import java.util.Set;

/**
 * @version v1.0
 * @ClassName: CoffeeFactory
 * @Description: TODO
 * @Author: fyp
 * @data: 2021年 09月 07日 20:20
 */
public class CoffeeFactory {
    //1. 定义容器对象存储咖啡对象
    private static HashMap<String,Coffee> map = new HashMap<>();

    //2. 加载配置文件，只需加载一次
    static{
        //2.1 创建Properties对象
        Properties p = new Properties();
        //2.2 调用p对象中的load方法进行配置文件的加载
        InputStream is = CoffeeFactory.class.getClassLoader().getResourceAsStream("bean.properties");
        try {
            p.load(is);
            //从p集合中获取全类名并创建对象
            Set<Object> keys = p.keySet();
            for(Object key : keys){
                String className = p.getProperty((String) key);
                //调用反射技术创建对象
                Class clazz = Class.forName(className);
                 Coffee coffee = (Coffee) clazz.newInstance();
                 //将名称和对象存储到容器中
                map.put((String) key, coffee);
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }

    public static Coffee createCoffee(String name){
        return map.get(name);
    }
}
