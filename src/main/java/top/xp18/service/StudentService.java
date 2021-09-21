package top.xp18.service;

import top.xp18.domain.Student;

import java.util.List;

public interface StudentService {
    int addStudent(Student student);
    int deleteStudent(Integer num);
    List<Student> findAllStudent();
    int updateStudent(Student student,Integer num);
}
