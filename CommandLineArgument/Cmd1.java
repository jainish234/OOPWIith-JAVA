class Cmd1{
    public static void main(String[] args)
    {
        if(args.length != 0)
        {
            int no=Integer.parseInt(args[0]);
            System.out.println("Square:"+(no*no));
            System.out.println("Qube:"+(no*no*no));
        }
        else
        {
            System.out.println("Plz provide argument.");
        }
    }
}