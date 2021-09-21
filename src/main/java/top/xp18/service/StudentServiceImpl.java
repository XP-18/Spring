package top.xp18.service;

import top.xp18.Dao.StudentDao;
import top.xp18.domain.Student;

import java.util.List;
import java.util.Objects;

public class StudentServiceImpl implements StudentService {
    StudentDao studentDao;

    public StudentServiceImpl() {
    }

    public StudentServiceImpl(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public int addStudent(Student student) {
        return studentDao.addStu(student);
    }

    @Override
    public int deleteStudent(Integer num) {
        return studentDao.deleteStu(num);
    }


    @Override
    public List<Student> findAllStudent() {
        return studentDao.selectAll();
    }

    @Override
    public int updateStudent(Student student, Integer num) {
        return studentDao.updateStu(student,num);
    }
}
