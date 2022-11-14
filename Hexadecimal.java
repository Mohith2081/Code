import java.util.*;
public class Hexadecimal{
  static void decTohex(int n)
    {
        int[] hexNum = new int[100];

        int i = 0;

        while (n != 0) {
 
            hexNum[i] = n % 16;

            n = n / 16;

            i++;

        }
        for (int j = i - 1; j >= 0; j--) {

            if (hexNum[j] > 9)
                System.out.print((char)(55 + hexNum[j]));
            else

                System.out.print(hexNum[j]);
        }

    }
 
    public static void main(String[] args)

    {
    	Scanner sc = new Scanner(System.in);
        System.out.println("Enter the decimal no:");
        int n = sc.nextInt();
        decTohex(n);

    }
}