package com.udaylearning.Spring.Boot.CRUD.Dao;

import com.udaylearning.Spring.Boot.CRUD.pojo.Student;


public interface StudentDao {

    void saveStudent(Student student);

    Student getStudent(Integer Id);

}
