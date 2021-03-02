package Java.com.casting_and_generics;

public class Student implements Person{
    String id;
    String name;
    int age;

    public Student(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    protected int studyHours(){
        return age / 2;
    }

    @Override
    public boolean equals(Person other) {
        if(!(other instanceof Student)){
            return false;
        }
        Student student = (Student) other;
        return id.equals(student.id);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return super.toString();
    }


    public static void main(String[] args) {
        Student student = new Student("1", "NAme", 23);
        Student student1 = new Student("1", "NAme", 23);

        System.out.println(student.equals(student1));
    }
}
