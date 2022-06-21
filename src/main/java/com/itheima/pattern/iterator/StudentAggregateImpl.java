package com.itheima.pattern.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @version v1.0
 * @ClassName: StudentAggregateImpl
 * @Description: TODO
 * @Author: fyp
 * @data: 2021年 09月 22日 10:46
 */
public class StudentAggregateImpl implements StudentAggregate{

    private List<Student> list = new ArrayList<>();

    @Override
    public void addStudent(Student stu) {
        list.add(stu);
    }

    @Override
    public void removeStudent(Student stu) {
        list.remove(stu);
    }

    @Override
    public StudentIterator getStudentIterator() {
        return new StudentIteratorImpl(list);
    }
}
