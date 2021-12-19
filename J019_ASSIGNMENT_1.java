import java.util.Scanner;
import java.io.*;
import java.lang.Math;

/*public class question1{
    public static void main(String[] args) {
    // neon number code
        int sum = 0
        int a;
        Scanner hm = new Scanner(System.in);
        System.out.print("Enter the number:");
        // takes input from user

        a = hm.nextInt();

        int sq=a*a; // here we square that number
        while(sq != 0)
        {
            int digit = sq% 10; // check for the digits
            sum = sum + digit;
            sq= sq / 10;
            if(a == sum)
            System.out.println("It is a Neon Number");
        else
            System.out.println("It is not a Neon Number");

        }
}*/
/*public class question2 {

    public static void main(String[] args) throws IOException {
        // ISBN number code
        long isbnNumber;
        int s = 0, i, t, d, dNumber;
        String st;
        // Input a 10-digit ISBN number
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);
        System.out.print("Enter 10-digit ISBN number: ");
        isbnNumber = Long.parseLong(br.readLine());

        st = "" + isbnNumber; // checks for length
        if (st.length() != 10) {
            System.out.println("Illegal ISBN");
            return;
        }

        s = 0;
        for (i = 0; i < st.length(); i++) {
            d = Integer.parseInt(st.substring(i, i + 1));
            dNumber = i + 1;
            t = dNumber * d;
            s += t;
        }

        // check for divisbility by 11

        if ((s % 11) != 0) {
            System.out.println("Illegal ISBN");
        } else {
            System.out.println("Legal ISBN");
        }
    }
}*/

/*public class question3 {
        //function to check if the number is Armstrong or not
        int n;
        {
            int temp;
            int d = 0;
            int end = 0;
            int sum = 0;
            Scanner hm = new Scanner(System.in);
            System.out.print("Enter the number:");
            n = hm.nextInt();
            temp = n;
            while (temp > 0) {
                temp = temp / 10;
                d++;
            }
            temp = n;
            while (temp > 0) {
                end = temp % 10;
                sum += (Math.pow(end, d));
                temp = temp / 10;
            }
            if (n == sum){
                System.out.println("It is an armstrong number");
            }
            else {
                System.out.println("It is not an armstrong number");
            }
        }
}*/