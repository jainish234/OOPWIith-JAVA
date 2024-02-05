import java.util.*;
class Sort
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int no[] = new int[5];
        int k=1;
        for(int i=0;i<no.length;i++)
        {
            System.out.print("Enter Number:"+k+":");
            no[i]=sc.nextInt();
            k++;
        }
        System.out.println("Display Array \n");
        k=1;
        for(int i=0;i<no.length;i++)
        {
            System.out.println("Number:"+k+":"+no[i]);
            k++;
        }
        System.out.println("Sorting Array \n");
        int temp=0;
        k=1;
        for(int i=0;i<5;i++)
        {
            for(int j=i+1;j<5;j++)
            {
                if(no[i] > no[j])
                {
                    temp = no[i];
                    no[i] = no[j];
                    no[j] = temp;
                }
            }
            System.out.println("Sorting Number:->"+k+":"+no[i]);
            k++;
        }
    }
}

output:=
Enter Number:1:10
Enter Number:2:50
Enter Number:3:60
Enter Number:4:30
Enter Number:5:20
Display Array

Number:1:10
Number:2:50
Number:3:60
Number:4:30
Number:5:20
Sorting Array 

Sorting Number:->1:10
Sorting Number:->2:20
Sorting Number:->3:30
Sorting Number:->4:50
Sorting Number:->5:60