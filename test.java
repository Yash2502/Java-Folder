import java.util.Scanner;
class test{
    public static void main(String[] args){
      Scanner sc =new Scanner(System.in);
      System.out.println("Enter the digit to reverse - ");
      String str = sc.nextLine(); 
      StringBuilder strb = new StringBuilder(str);
      strb = strb.reverse();
      System.out.println(strb);    

    }
  }