package LearnJavaOOP.BT9;

public class Student {
  private String name;
  private int age;
  private String gender;
  private double gpa;

  public Student(String name, int age, String gender, double gpa) {
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.gpa = gpa;
  }

  public void display() {
    System.out.println("Name: "+name);
    System.out.println("Age: "+age);
    System.out.println("Gender: "+gender);
    System.out.println("GPA: "+gpa);
  }
}
