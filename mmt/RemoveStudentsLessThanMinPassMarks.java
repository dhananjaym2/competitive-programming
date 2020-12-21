import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class RemoveStudentsLessThanMinPassMarks {

  public static void main(String[] args) {
    final int minPassMarks = 36;
    List<Student> studentsList = new ArrayList<>();
    // adding sample data to list with a roll number and random marks for each student
    for (int i = 0; i < 10/*number of students*/; i++) {
      studentsList.add(new Student(i, new Random().nextInt(100/*Max marks*/)));
    }

    Iterator<Student> studentIterator = studentsList.iterator();

    while (studentIterator.hasNext()) {
      Student stud = studentIterator.next();
      if (stud.marks < minPassMarks) {
        System.out.print("Removing ");
        // remove Students Less Than Min Pass Marks
        studentIterator.remove();
      } else {
        System.out.print("NOT removed ");
      }
      System.out.println(stud);
    }
  }
}

class Student {
  int rollNum;
  int marks;

  Student(int rollNum, int marks) {
    this.rollNum = rollNum;
    this.marks = marks;
  }

  /**
   * @return a string representation of the object.
   */
  @Override public String toString() {
    return "Student(rollNum:" + this.rollNum + ", marks:" + this.marks + ")";
  }
}