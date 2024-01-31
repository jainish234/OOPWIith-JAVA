import java.util.*;
class Access{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int sub[][]=new int[3][2];
        for(int i=0;i<3;i++)
        {
            //k=1;
            System.out.println("Enter Roll Number:"+i);
            for(int j=0;j<2;j++)
            {
                System.out.print("Enter Marks:"+j);
                sub[i][j]=sc.nextInt();
            }
            System.out.println("\n");
        }
        for(int i=0;i<3;i++)
        {
            System.out.println("\t Roll Number:"+i);
            for(int j=0;j<2;j++)
            {
                System.out.println("\t\tMarks->"+j+":"+sub[i][j]+"\n");
            }
        }
    }
}