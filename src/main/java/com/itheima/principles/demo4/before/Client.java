package com.itheima.principles.demo4.before;

import sun.plugin2.main.server.JVMHealthData;

public class Client {

    public static void main(String[] args) {
        HeimaSafetyDoor heimaSafetyDoor = new HeimaSafetyDoor();
        heimaSafetyDoor.antiTheft();
        heimaSafetyDoor.fireProof();
        heimaSafetyDoor.waterProof();

    }


}
