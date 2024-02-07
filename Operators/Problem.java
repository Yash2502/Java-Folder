
/*The total number of students in a class are 90 out of which 45 are boys. 
If 50% of the total students secured grade 'A' out of which 20 are boys,
 then write a program to calculate the total number of girls getting grade 'A'. */

public class Problem {
    public static void main(String[] args) {
        int total_stu = 90;
        int boys = 45;
        int girls = total_stu-boys;
        int A_grader = (50*total_stu)/100;
        int A_boys= 20;
        int A_girls=A_grader-A_boys;
        System.out.println(A_girls);
   
   
    }

}
