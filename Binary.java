import java.util.*;
public class Binary {
		    public static void decimal2Binary(int n)
		    {
		        int[] binaryNum=new int[1000];
		        int i=0;
		        while(n>0)
		        {
		            binaryNum[i]=n%2;
		            n=n/2;
		            i++;
		        }
		        for(int j=i-1;j>=0;j--)
		        System.out.print(binaryNum[j]);
		    }

		    public static void main(String args[]){
		        Scanner sc=new Scanner(System.in);
		        System.out.println("Enter the decimal no:");
		        int n=sc.nextInt();
		        
		        System.out.print("Binary No:");
		        decimal2Binary(n);
		        
		    }
}


