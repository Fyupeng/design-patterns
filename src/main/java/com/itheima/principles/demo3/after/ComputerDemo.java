package com.itheima.principles.demo3.after;

public class ComputerDemo {
    public static void main(String[] args) {
        HardDisk hardDisk = new XiJieHardDisk();
        Cpu cpu = new IntelCpu();
        Memory memory = new KingstonMemory();

        Computer computer = new Computer();
        computer.setHardDisk(hardDisk);
        computer.setCpu(cpu);
        computer.setMemory(memory);

        computer.run();
    }
}
