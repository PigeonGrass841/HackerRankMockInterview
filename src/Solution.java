import java.util.Scanner;
import java.util.Arrays;

public class Solution {
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);
        String[] array = new String[s.length() - k + 1];

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        for (int i = 0; i <= s.length() - k; i++)
        {
            array[i] = s.substring(i, i + k);
            if (s.substring(i, i + k).compareTo(smallest) < 0)
            {
                smallest = s.substring(i, i + k);
            }
            if (s.substring(i, i + k).compareTo(largest) > 0)
            {
                largest = s.substring(i, i + k);
            }
        }

        System.out.println("---------------");

        System.out.print("Substrings: ");
        System.out.println(Arrays.toString(array));

        return "Smallest: " + smallest + "\n" + "Largest: " + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("What string would you like to enter?: ");
        String s = scan.next();
        System.out.print("What substring size would you like to enter?: ");
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}