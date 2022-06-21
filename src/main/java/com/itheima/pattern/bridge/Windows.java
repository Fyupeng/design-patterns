package com.itheima.pattern.bridge;

/**
 * @version v1.0
 * @ClassName: Windows
 * @Description: TODO
 * @Author: fyp
 * @data: 2021年 09月 14日 10:08
 */
public class Windows extends OperatingSystem{

    public Windows(VideoFile videoFile){
        super(videoFile);
    }

    @Override
    public void play(String fileName) {
        videoFile.decode(fileName);
    }
}
