package com.itheima.pattern.bridge;

import java.nio.file.FileAlreadyExistsException;

/**
 * @version v1.0
 * @ClassName: Mac
 * @Description: TODO
 * @Author: fyp
 * @data: 2021年 09月 14日 10:11
 */
public class Mac extends OperatingSystem{

    public Mac(VideoFile videoFile){
        super(videoFile);
    }

    @Override
    public void play(String fileName) {
        videoFile.decode(fileName);
    }
}
