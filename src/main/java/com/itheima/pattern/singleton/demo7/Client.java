package com.itheima.pattern.singleton.demo7;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @version v1.0
 * @ClassName: Client
 * @Description: 测试使用序列化和反序列化破坏单例模式
 * @Author: fyp
 * @data: 2021年 09月 05日 16:45
 */
public class Client {
    public static void main(String[] args) throws Exception {
        readObjectFromFile();
        readObjectFromFile();
        //writeObject2File();
    }


    public static void readObjectFromFile() throws Exception{
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\b.txt"));

         Singleton instance = (Singleton) ois.readObject();

         System.out.println(instance);

         ois.close();
    }

    public static void writeObject2File() throws Exception{
        Singleton instance = Singleton.getInstance();

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\b.txt"));

        oos.writeObject(instance);

        oos.close();

    }

}
