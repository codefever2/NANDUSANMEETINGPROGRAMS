//direct method
 import java.util.*;
public class anothermain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberofelements = 0;
        System.out.println("Enter the array  size:");
        numberofelements = sc.nextInt();
        System.out.println("Enter the number to be deleted :");
        int numbtobedeleted = sc.nextInt();

        int[] A = new int[100];

        for (int i = 0; i < numberofelements; i++)
        {
            System.out.println("Enter the array elements :");
            A[i]=sc.nextInt();
        }
        int i=0;
        while(i<numberofelements)
        {
            if(A[i] == numbtobedeleted)
            {
                for(int j=i;j>0;j--)
                {
                    A[j]=A[j-1];
                }
                A[0]= 1;
            }
            //final array
//            for(int z=0;z<numberofelements;z++)
//            {
//                System.out.println("A["+z+"]"+A[z]);
//            }
            i++;
        }
        System.out.println("final array is :");
        //final array
        for(i=0;i<numberofelements;i++)
        {
            System.out.println("A["+i+"]"+A[i]);
        }
    }
}