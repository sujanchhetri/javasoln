import java.util.*;

public class StudentCount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Your Name:");
        String your_name = in.next();
        System.out.print("Enter the Number of Student to enroll:");
        int enrolled_student = in.nextInt();
        int no_of_classroom = enrolled_student / 20;
        int remaining_student = enrolled_student - (no_of_classroom * 20);
        System.out.println(
                your_name + "\nThe no. of Enrolled Students:" + enrolled_student + "\nThe no. of full class rooms:"
                        + no_of_classroom + "\nThe no. of Remaining students:" + remaining_student);
    }
}
