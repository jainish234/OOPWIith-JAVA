import java.util.*;
class Res{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s_nm[]=new String[5];
        int k=1;
        for(int i=0;i<s_nm.length; i++)
        {
            System.out.print("Enter Subject Name->"+k+":");
            s_nm[i]=sc.nextLine();
            k++;
        }
        System.out.println("Enter Subject Marks");
        k=1;
        int[] marks=new int[5];
        for(int i=0;i<s_nm.length;i++)
        {
            System.out.print("Enter "+s_nm[i]+" Marks->"+k+":");
            marks[i]=sc.nextInt();
            k++;
        }
        System.out.println("\n \t\t MCA-2 Result\n");
        System.out.println("\t\t-------------------\n");
        System.out.println("No.\t Subject Name \t O_Marks");
        k=1;
        int total=0;
        for(int i=0;i<s_nm.length;i++)
        {
            System.out.println(k+"\t\t"+s_nm[i]+"\t\t"+marks[i]+"\n");
            total=total+marks[i];
            k++;
        }
        System.out.println("\t-----------------------");
        System.out.println("\t\t Total ->"+total+"\n");
        System.out.println("\t\t Percentage ->"+(total/marks.length)+" % \n");
    }
}