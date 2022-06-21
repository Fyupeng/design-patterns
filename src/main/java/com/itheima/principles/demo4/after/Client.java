package com.itheima.principles.demo4.after;

import com.itheima.principles.demo4.before.HeimaSafetyDoor;

public class Client {
    public static void main(String[] args) {
        HeimaSafetyDoor door = new HeimaSafetyDoor();
        door.antiTheft();
        door.fireProof();
        door.waterProof();

        System.out.println("================");
        ItcastSafetyDoor door1 = new ItcastSafetyDoor();
        door1.antiTheft();
        door1.fireProof();

    }
}
