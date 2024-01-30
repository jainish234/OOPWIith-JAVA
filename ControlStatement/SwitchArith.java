class SwitchArith{
    public static void main(String[] args)
    {
        int con,a=80,b=3,n=1;
        switch(n)
        {
            case 1:
                con=a+b;
                System.out.println("add is"+con);
                break;
            case 2:
                con=a+b;
                System.out.println("sub is"+con);
                break;
            case 3:
                con=a*b;
                System.out.println("mul is"+con);
                break;
            case 4:
                con=a/b;
                System.out.println("div is"+con);
                break;
            default:
                System.out.println("Not any");
        }
    }
}