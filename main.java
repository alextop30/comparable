/**
 * Created by alex on 6/20/16.
 */
public class main {

    public static void main(String [] args)
    {
        //display the result to the console

        System.out.println("Comparing 2 date objects!\n");

        Date d1 = new Date(12,1,2015);

        System.out.println("First Date Object: " + d1);

        Date d2 = new Date(12,1,2016);

        System.out.println("Second Date Object: " + d2);

        int res = d1.compareTo(d2);

        System.out.println("Compare Date 1 to Date 2 : " + res);

        res = d2.compareTo(d1);

        System.out.println("Compare Date 2 to Date 1 : " + res);


    }

}
