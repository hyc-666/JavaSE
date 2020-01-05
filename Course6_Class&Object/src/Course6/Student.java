package Course6;

public class Student {
    private String id;
    private String name;
    private String grade;
    private String tel;
    private int age;

    public Student(String id, String name, String grade, String tel, int age) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.tel = tel;
        this.age = age;
    }

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Student(String id, String name, String grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    public Student(String name, String tel, int age) {
        this.name = name;
        this.tel = tel;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public int getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", grade='" + grade + '\'' +
                ", tel='" + tel + '\'' +
                ", age=" + age +
                '}';
    }
}
