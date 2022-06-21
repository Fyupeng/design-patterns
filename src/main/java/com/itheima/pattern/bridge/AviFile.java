package com.itheima.pattern.bridge;

/**
 * @version v1.0
 * @ClassName: AiFile
 * @Description: TODO
 * @Author: fyp
 * @data: 2021年 09月 12日 21:47
 */
public class AviFile implements VideoFile {
    @Override
    public void decode(String fileName) {
        System.out.println("avi 视频文件 " + fileName);
    }
}
