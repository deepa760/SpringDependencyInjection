package org.example.springDI.data;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import org.example.springDI.data.StudentDao;
import org.example.springDI.models.Student;

@Component
public class StudentDaoImpl implements StudentDao {

    List<Student> students = new ArrayList<>();


    @Override
    public Student save(Student student) {
        students.add(student);

        return student;
    }

    @Override
    public Student find(int id) {
        for(Student student : students) {
            if(student.getId() == id) {
                return student;
            }
        }
        return null;
    }

    @Override
    public List<Student> findAll() {

        return students;
    }

    @Override
    public Student delete(int id) {
        Student student = find(id);

        students.remove(student);

        return student;
    }

}