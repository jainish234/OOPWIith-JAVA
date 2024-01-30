class Prime
{
    public static void main(String[] args)
    {
        int no=27;
        boolean prime=true;
        for(int i=2;i<=no;i++)
        {
            for(int j=2;j<=no/2;j++)
            {
                if(no%j==0)
                    prime=false;
            }
        }
        if(prime)
        {
            System.out.println("Prime");
        }
        else
        {
             System.out.println("Not Prime");
        }
    }
}