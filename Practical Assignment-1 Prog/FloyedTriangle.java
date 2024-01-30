class FloyedTriangle{
    public static void main(String[] args){
        int rows = 5;
        int number =1;
        printFloyedTriangle(rows,number);
    }

    static void printFloyedTriangle(int rows,int number){
        for(int i=1;i <= rows;i++)
        {
            for(int j=1;j<=i;j++){
                System.out.print(number+"");
                number++;
            }
            System.out.println();
        }
    }
}