package com.itheima.principles.demo3.before;

public class ComputerDemo {
    public static void main(String[] args) {

        XiJieHardDisk hardDisk = new XiJieHardDisk();
        IntelCpu cpu = new IntelCpu();
        KingstonMemory memory = new KingstonMemory();

        Computer computer = new Computer();
        computer.setHardDisk(hardDisk);
        computer.setCpu(cpu);
        computer.setMemory(memory);

        computer.run();

    }
}
