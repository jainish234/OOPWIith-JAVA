class Msg{
    void std(int a,int b)
    {
        System.out.println("Addition is:"+(a+b));
    }
    void std(int a,String snm)
    {
        System.out.println("Name:"+snm);
        System.out.println("Roll no:"+a);
    }
}
class Method2{
    public static void main(String[] args)
    {
        Msg m=new Msg();
        String nm="Atmiya";
        int no1 = 30;
        int no2 = 6;
        m.std(no1,no2);
        m.std(no1,nm);
    }
}

//output:-

//Addition is:36
//Name:Atmiya
//Roll no:30