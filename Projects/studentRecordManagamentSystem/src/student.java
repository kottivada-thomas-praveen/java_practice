package Projects.studentRecordManagamentSystem.src;

/**
 * student
 */
public class student {

    private int ID;
    private String name;
    private int Marks[];
    private float totalmarks = 0;

    public student(int id, String Name, int[] marks) throws InvalidMarksException {
        this.ID = id;
        this.name = Name;
         this.Marks = new int[marks.length];
        for (int c : marks) {
            if (marks[c] < 0 && marks[c] > 100) {
               throw new InvalidMarksException("marks should be between 0 and 100..");
            }
        }
                for (int i = 0; i < Marks.length; i++) {
                    this.Marks[i] = marks[i];
                }

    }

    // ID
    public void setId(int id) {
        this.ID = id;
    }

    public int getId() {
        return this.ID;
    }

    // Name
    public void setName(String Name) {
        this.name = Name;
    }

    public String getName() {
        return this.name;
    }

    // Marks
    public void setMarks(int marks[]) {
        Marks = new int[marks.length];
        for (int i = 0; i < marks.length; i++) {
            Marks[i] = marks[i];
        }
    }

    public int[] getMarks() {
        return Marks;
    }

    // calculate Marks - Total
    public float calculateMarks() {
        totalmarks = 0;
        for (int i = 0; i < Marks.length; i++) {
            totalmarks += Marks[i];
        }
        return totalmarks;
    }

    // calculate Avg
    public float calculateAvg() {
        if (Marks.length == 0) {
            return 0;
        }
        float avg = 0;
        avg = totalmarks / Marks.length;
        return avg;
    }

}