package com.itheima.pattern.builder.demo2;

import com.sun.media.jfxmedia.events.BufferListener;

/**
 * @version v1.0
 * @ClassName: Phone
 * @Description: 手机类
 * @Author: fyp
 * @data: 2021年 09月 09日 16:45
 */
public class Phone {

    private String cpu;
    private String screen;
    private String memory;
    private String mainboard;

    private Phone(Builder builder){
        this.cpu = builder.cpu;
        this.screen = builder.screen;
        this.memory = builder.memory;
        this.mainboard = builder.mainboard;
    }

    public static final class Builder{
        private String cpu;
        private String screen;
        private String memory;
        private String mainboard;

        public Builder cpu(String cpu){
            this.cpu = cpu;
            return this;
        }

        public Builder screen(String screen){
            this.screen = screen;
            return this;
        }

        public Builder memory(String memory){
            this.memory = memory;
            return this;
        }

        public Builder mainborard(String mainborard){
            this.mainboard = mainborard;
            return this;
        }

        public Phone build(){
            return new Phone(this);
        }
    }

    @Override
    public String toString() {
        return "Phone{" +
                "cpu='" + cpu + '\'' +
                ", screen='" + screen + '\'' +
                ", memory='" + memory + '\'' +
                ", mainboard='" + mainboard + '\'' +
                '}';
    }
}
