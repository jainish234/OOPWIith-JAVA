import java.util.Scanner;

class Denominations
{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the amount: ");
        int amt = in.nextInt();

        if (amt > 99999) {
            System.out.println("Invalid Amount");
            return;
        }

        String amtInWords = getAmtInWords(amt);
        System.out.println(amtInWords);
        System.out.println("Denomination:");
        
        int notes[] = {2000, 500, 200, 100, 50, 20, 10, 1};
        int t = amt;
        for (int i = 0; i < notes.length; i++) {
            int c = t / notes[i];
            if (c != 0)
                System.out.println(notes[i] + "\t*\t" 
                            + c + "\t=\t" + (c * notes[i]));
            t = t % notes[i];
        }
    }
    
    public static String getAmtInWords(int amt) {
        StringBuffer sb = new StringBuffer();
        
        while (amt != 0) {
            int d =  amt % 10;
            amt /= 10;
            switch (d) {
                case 0:
                sb.insert(0, "Zero ");
                break;

                case 1:
                sb.insert(0, "One ");
                break;

                case 2:
                sb.insert(0, "Two ");
                break;

                case 3:
                sb.insert(0, "Three ");
                break;

                case 4:
                sb.insert(0, "Four ");
                break;

                case 5:
                sb.insert(0, "Five ");
                break;

                case 6:
                sb.insert(0, "Six ");
                break;

                case 7:
                sb.insert(0, "Seven ");
                break;

                case 8:
                sb.insert(0, "Eight ");
                break;

                case 9:
                sb.insert(0, "Nine ");
                break;

                default:
                System.out.println("Invalid digit");
            }
        }

        return sb.toString();
    }
}

/*output:=
Enter the amount: 14596
One Four Five Nine Six
Denomination:
2000    *       7       =       14000
500     *       1       =       500
50      *       1       =       50
20      *       2       =       40
1       *       6       =       6*/
