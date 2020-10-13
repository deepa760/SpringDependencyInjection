package org.example.springDI.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import org.example.springDI.data.StudentDao;
import org.example.springDI.models.Student;
import org.example.springDI.util.UserInputService;

@Component
public class StudentManagementImpl implements StudentManagement {

    UserInputService scannerService;
    StudentDao studentDao;


    @Autowired
    public StudentManagementImpl(UserInputService scannerService, StudentDao studentDao) {
        super();
        this.scannerService = scannerService;
        this.studentDao = studentDao;
    }

    @Override
    public Student create() {

        System.out.println("Enter name");
        String name = scannerService.getString();
        int id = scannerService.getInt();

        return studentDao.save(new Student(id, name));
    }

    @Override
    public Student save(Student student) {

        return studentDao.save(student);
    }

    @Override
    public Student find(int id) {

        return studentDao.find(id);
    }

    @Override
    public Student remove(int id) {

        return studentDao.delete(id);
    }

    @Override
    public List<Student> findAll() {

        return studentDao.findAll();
    }

    @Override
    public Student edit(Student student) {


        return student;
    }

}