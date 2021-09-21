package top.xp18;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.xp18.Dao.StudentDao;
import top.xp18.test.Student;
import top.xp18.service.StudentService;
import top.xp18.service.StudentServiceImpl;
import top.xp18.test.School;

import java.util.List;

public class MyTest {
    @Test
    public void testSpringObject() {
        Student student1=new Student(),student2=new Student();
        School school=new School("九江","九江大学");
        student1.setSchool(school);
        student2.setSchool(school);
        System.out.println(student1.equals(student2));

    }

    @Test
    public void testFindAll() {
        String config = "spring-con.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        StudentService service = (StudentService) ac.getBean("mystudentservice");
        List list = service.findAllStudent();
        System.out.println(list);
    }

    @Test
    public void testDaoFindAll() {
        String config = "spring-con.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        /*获取自动生成studentDao代理对象，注意接口名第一个小写
         * */
        StudentDao service = (StudentDao) ac.getBean("studentDao");
        List list = service.selectAll();
        System.out.println(list);

    }


}
