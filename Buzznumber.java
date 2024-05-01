class Buzznumber{
    public static void main(String[] args){
        int number = 21;
        if(isBuzznumber(number))
        {
            System.out.println(number+"is a Buzz Number.");
        }
        else
        {
            System.out.println(number+"is a not Buzz Number.");
        }
    }
    static boolean isBuzznumber(int num)
    {
        return num % 10 == 7 ||num % 7 == 0;
    }
}