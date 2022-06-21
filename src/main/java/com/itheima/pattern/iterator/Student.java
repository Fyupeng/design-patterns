package com.itheima.pattern.iterator;

/**
 * @version v1.0
 * @ClassName: Student
 * @Description: TODO
 * @Author: fyp
 * @data: 2021年 09月 22日 10:35
 */
public class Student {

    private String name;
    private String number;

    public Student() {
    }

    public Student(String name, String number) {
        this.name = name;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", number='" + number + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
