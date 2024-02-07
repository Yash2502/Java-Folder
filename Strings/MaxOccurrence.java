import java.util.Scanner;

public class MaxOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you string");
        String str = sc.nextLine();
        char ans = 'a';
        int maxfreq = 0;
        int[] count = new int[256];

        for (char ch : str.toCharArray()) {
            if (++count[ch] > maxfreq) {
                maxfreq = count[ch];
                ans = ch;
            }
        }
        System.out.println("Maximum occurring character is " + ans);
    }
}