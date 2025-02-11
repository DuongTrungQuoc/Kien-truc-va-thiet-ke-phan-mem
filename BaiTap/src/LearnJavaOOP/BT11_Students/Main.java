package LearnJavaOOP.BT11_Students;

public class Main {
  public static void main(String[] args) {
    Student[] students = new Student[3];

    students[0] = new Student("Tuan",24);
    students[1] = new Student("Cuong",25);
    students[2] = new Student("Duc",24);


    for(int i = 0; i< 3;i++){
      students[i].display();
    }

  }
}
