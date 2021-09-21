package top.xp18.test;

public class School {
    private  String location;
    private String name;

    public School(String location, String name) {
        this.location = location;
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "School{" +
                "location='" + location + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
