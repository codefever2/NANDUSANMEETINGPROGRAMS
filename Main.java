//getting count while reading input
import java.util.*;
public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int numberofelements=0;

        System.out.println("Enter the array  size:");
        numberofelements = sc.nextInt();

        System.out.println("Enter the number to be deleted :");
        int numbtobedeleted = sc.nextInt();

        int[] A = new int[100];
        int jindex = 0;int Ncount =0;int Acount =0;

        for(int i=0;i<numberofelements;i++)
        {
            System.out.println("Enter the array elements :");
            int dummygetter = sc.nextInt();
            if(dummygetter != numbtobedeleted)
            {
                A[jindex] = dummygetter;
                jindex++;
                Acount++;
            }
            else
            {
                Ncount++;
            }
        }
        System.out.println("number of times number to be deleted occurs in the array :"+Ncount);
        System.out.println("Array size :"+Acount);
        for(int i=0;i<Ncount;i++)
        {
            Acount += 1;
            for(int j=Acount-1;j>0;j--)
            {
                A[j]=A[j-1];
            }
            A[0]= 1;
        }
        System.out.println("final array is :");
        //final array
        for(int i=0;i<Acount;i++)
        {
            System.out.println("A["+i+"]"+A[i]);
        }
    }
}