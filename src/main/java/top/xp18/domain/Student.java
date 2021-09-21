package top.xp18.domain;

public class Student {
    private String name;
    private Integer num;
    private String sex;

    public Student() {
    }

    public Student(String name, Integer num, String sex) {
        this.name = name;
        this.num = num;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", num=" + num +
                ", sex='" + sex + '\'' +
                '}';
    }
}
