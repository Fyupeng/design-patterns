package com.itheima.pattern.iterator;

/**
 * @version v1.0
 * @ClassName: StudentAggregate
 * @Description: 抽象聚合接口
 * @Author: fyp
 * @data: 2021年 09月 22日 10:44
 */
public interface StudentAggregate {

    void addStudent(Student stu);

    void removeStudent(Student stu);

    StudentIterator getStudentIterator();
}
