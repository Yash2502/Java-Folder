import java.util.Scanner;
public class StringRev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.nextLine();

        // to upper or Lower Case
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());    

        //to get the length
        System.out.println(str.length());

        // to reverse words in a sentence

        StringBuffer stbr = new StringBuffer(str);
        System.out.println(stbr.reverse()); 
        
    
    
    }

}
