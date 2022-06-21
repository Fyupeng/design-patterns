package com.itheima.principles.demo1;

public class Client {
    public static void main(String[] args) {
        SougouInput sougouInput = new SougouInput();
        //DefaultSkin defaultSkin = new DefaultSkin();
        //sougouInput.setSkin(defaultSkin);

        HeimaSkin heimaSkin = new HeimaSkin();
        sougouInput.setSkin(heimaSkin);

        sougouInput.display();
    }
}
