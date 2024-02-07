import java.util.Scanner;
public class countVowels{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string here : ");
        String str = sc.nextLine();
        String cap = str.toUpperCase();
        int count =0;
        int countn =0;
        System.out.print("Vowels are : ");
        for(int i=0;i<cap.length();i++){
            char current = cap.charAt(i);

            if(current == 'A'|| current=='E'||current=='I'||current=='O'|| current=='U'){
                count ++;
                System.out.print(current +" ");
            }
            else if(cap.charAt(i)>='A' && cap.charAt(i)<='Z')
            {
                countn++;
               // System.out.println("Conso are "+current +" ");

            }
        }
        
        System.out.println("\nVowels count is "+ count);        
        System.out.println("Conso Count is "+ countn);

    }
}