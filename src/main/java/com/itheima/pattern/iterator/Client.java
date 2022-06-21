package com.itheima.pattern.iterator;

import com.sun.deploy.panel.ITreeNode;

/**
 * @version v1.0
 * @ClassName: Client
 * @Description: TODO
 * @Author: fyp
 * @data: 2021年 09月 22日 10:49
 */
public class Client {
    public static void main(String[] args) {
        StudentAggregateImpl aggregate = new StudentAggregateImpl();

        aggregate.addStudent(new Student("张三","001" ));
        aggregate.addStudent(new Student("李四","002" ));
        aggregate.addStudent(new Student("王五","003" ));
        aggregate.addStudent(new Student("赵六","004" ));

        StudentIterator iterator = aggregate.getStudentIterator();

        while (iterator.hasNext()) {
            Student student = iterator.next();
            System.out.println(student.toString());
        }

    }
}
