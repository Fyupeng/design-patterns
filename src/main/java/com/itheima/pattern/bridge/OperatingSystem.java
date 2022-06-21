package com.itheima.pattern.bridge;

/**
 * @version v1.0
 * @ClassName: OperatingSystem
 * @Description: TODO
 * @Author: fyp
 * @data: 2021年 09月 12日 21:50
 */
public abstract class OperatingSystem {

    protected VideoFile videoFile;

    public OperatingSystem(VideoFile videoFile){
         this.videoFile = videoFile;
    }

    public abstract void play(String fileName);

}
