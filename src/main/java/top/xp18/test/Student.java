package top.xp18.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Objects;

/*
* 有三种方式
* @Component(value="mystudent")
* @Component
* 默认值是类名首字母小写
 * */
//常用这种方式
public class Student {
    //@Value既可以写在属性上也可以写在set方法上
    private String name;
    private Integer num;
    private School school;
    public void setName(String name) {
        this.name = name;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return school.equals(student.school);
    }

    @Override
    public int hashCode() {
        return Objects.hash(school);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", num=" + num +
                ", school=" + school +
                '}';
    }
}
