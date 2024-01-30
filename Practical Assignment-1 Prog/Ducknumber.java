class Ducknumber{
    public static void main(String[] args)
    {
        int number = 1023;
        if(isDuckNumber)
        {
            System.out.println(number+"is a Duck Number.");
        }
        else
        {
            System.out.println(number+"is not a Duck Number.");
        }
    }
    static boolean isDuckNumber(int num)
    {
        static numStr = Integer.toString(num);
        return numStr.contains('0') && numStr.charAt(0) != '0';
    }
}