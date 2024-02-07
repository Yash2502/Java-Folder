/*Write a program to add 8 to the number 2345 and then divide it by 3.
 Now, the modulus of the quotient is taken with 5 and then multiply the resultant value by 5. 
 Display the final result.*/

public class MultipleOperation{
    public static void main(String[] args) {
        int num = 2345;
        int s1= num+8;
        int s2= s1/3;
        int s3 = s2%5;
        int s4= s3*5;
        System.out.println(s4);

        //or
        
        System.out.println((((8+2345)/3)%5)*5);

    }
}