class Switchposnegzero{
    public static void main(String[] args)
    {
        int no = 0;
        int num = -10;
        if(0 < num)
        {
            no = 1;
        }
        else if(0 > num)
        {
            no = 2;
        }

        switch(no)
        {
            case 1:
                System.out.println("The number is Positive.");
                break;
            case 2:
                System.out.println("The number is Negative.");
                break;
            default:
                System.out.println("The number  Not Zero.");
                
        }
    }
}