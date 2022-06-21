package com.itheima.pattern.iterator;

import java.util.List;

/**
 * @version v1.0
 * @ClassName: StudentIteratorImpl
 * @Description: TODO
 * @Author: fyp
 * @data: 2021年 09月 22日 10:38
 */
public class StudentIteratorImpl implements StudentIterator {

    private List<Student> list;
    private int position = 0;

    public StudentIteratorImpl(List<Student> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return position < list.size();
    }

    @Override
    public Student next() {
        Student currentStudent = list.get(position);
        position++;
        return currentStudent;
    }
}
