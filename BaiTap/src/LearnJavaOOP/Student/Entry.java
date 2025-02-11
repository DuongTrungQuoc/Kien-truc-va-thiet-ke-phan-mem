package LearnJavaOOP.Student;

class Student{
  String name;
  int age;

  public Student(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public void display(){
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
  }
}

public class Entry {
  public static void main(String[] args) {
    Student s1 = new Student("Long",24);
    Student s2 = new Student("Kien",29);

    s1.display();
    s2.display();
  }
}
