import java.sql.*;
import java.util.*;
class Delete
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        try 
        {
                //load Driver
                Class.forName("com.mysql.cj.jdbc.Driver");
                //Create Connection
                String url="jdbc:mysql://localhost:3306/std";
                String unm="root";
                String pwd="";
                Connection con=DriverManager.getConnection(url,unm,pwd);                
                Statement stmt=con.createStatement(); 

                System.out.println("Enter Delete Record");
                int s_r=sc.nextInt(); 
                String q="Select * from c_b";
                ResultSet rs=stmt.executeQuery(q);  
                System.out.println("\t Student-ID \t Student-Name \t Student Stream");
                System.out.println("\t=================================================\n");  
                while(rs.next())
                {
                        System.out.println("\t\t"+rs.getInt(1)+"\t\t"+rs.getString(2)+"\t\t"+rs.getString(3));         
                }
                String d_query="Delete from c_b where sid='"+s_r+"'";
                int r_affect=stmt.executeUpdate(d_query);
                System.out.println("Row Affected..."+r_affect);
                con.close();           
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }   
}

/*
Enter Update Record
11
         Student-ID      Student-Name    Student Stream
        =================================================

                1               Harsh           MCA
                2               Ajay            Mcom
                3               Deep            Mphil
                4               Keyur           MBA
                5               DEV             MSCIT
                6               Neel            BCA
                7               Rushi           Bcom
                8               Dhruv           Mpharm
                9               Jay             Computer Engineer
                10              Monij           BSCIT
                11              Ravi            computer
Row Affected...1
*/