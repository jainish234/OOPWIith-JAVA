class Mo{
    void add(int a,int b)
    {
        System.out.println("Addition is:"+(a+b));
    }
    void add(int a,int b,int c)
    {
        System.out.println("Addition is:"+(a+b+c));
    }
}
class Method1{
    public static void main(String[] args)
    {
        Mo m=new Mo();
        m.add(10,5);
        m.add(10,8,20);
    }
}

//output:=
//Addition is:15
//Addition is:38