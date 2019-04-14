package week5OOP.students;

import java.util.ArrayList;
import java.util.List;

public class Class {

    private List<String> students = new ArrayList<>();
    private List<Student> academiaStudents = new ArrayList<>();

    private String name;

    public Class() {
    }

   void addStudent(String name){
        students.add(name);
   }

   public void addSrudent(Student student){
        academiaStudents.add(student);
   }

   public void loadFirstStudent(List<Student> students){
        academiaStudents.addAll(students);
   }

   public void displayStudents(){
        if (students.size() == 0){
            System.out.println("Error!");
        } else {
            System.out.print("Students: ");
            for (int i = 0; i < students.size(); i++) {
                System.out.print(students.get(i));
                if (i < students.size() - 1){
                    System.out.print(", ");
                }
            }
            System.out.println(".");
        }
   }

   public int getGirlsCount(){

        int gilsCount = 0;

       for (int i = 0; i < students.size(); i++) {
           if (students.get(i).endsWith("a")){
               gilsCount++;
           }
       }

        return gilsCount;
   }

    public float getAverange(){

        int ageSum = 0;
        for (Student s: academiaStudents){
            ageSum += s.getAge();
        }
        return (float)ageSum / academiaStudents.size();
    }


}
