package Projects.studentRecordManagamentSystem.src;

import java.util.ArrayList;

/**
 * studentService
 */
public class studentService {

    ArrayList<student> studentsList = new ArrayList<>();
    

    public void addStudent(student s){
        studentsList.add(s);
    } 

    public void displayDetails(){
        for(student s : studentsList){
            System.out.println("student ID : "+s.getId());
            System.out.println("Student Name : "+s.getName());
            System.out.print("marks : ");
            int m[] = s.getMarks();
            for (int i = 0; i<m.length; i++) {
                System.out.print(m[i]+" ");
            }
            System.out.println();

            int total = (int) s.calculateMarks();
            System.out.println("Total marks : "+total);
            int avg = (int) s.calculateAvg();
            System.out.println("Average : "+avg);
        }
    }
        
}