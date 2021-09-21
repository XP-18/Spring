package top.xp18.Dao;

import org.apache.ibatis.annotations.Param;
import top.xp18.domain.Student;

import java.util.List;

public interface StudentDao {
   List<Student> selectAll();
   int addStu(Student student);
   int deleteStu(Integer num);
   int updateStu(@Param("student") Student student, @Param("num") Integer num);
}
