package org.example.springDI.data;

import java.util.List;



import org.example.springDI.models.Student;


public interface StudentDao {

    Student save (Student student);
    Student find (int id);
    List <Student> findAll();
    Student delete (int id);

}