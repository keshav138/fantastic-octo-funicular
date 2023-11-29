import java.util.*;
    class Fasinating
    {
        public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the 3 or more digit number to see if its a fasinting number or not:");
            int n = sc.nextInt();
            int n2 = n*2;
            int n3 = n*3;
            String s  = Integer.toString(n);
            String s2  = Integer.toString(n2);
            String s3  = Integer.toString(n3);
            String main = s+s2+s3;
            int length = main.length();
            int h = 0; int sum = 0;
            while(h<length)
            {
                char ch = main.charAt(h);
                int tem =Character.getNumericValue(ch);
                // System.out.println("tem"+tem+"Char"+ch);
                sum  = sum+tem;
                h++;
            }
            if(sum==45)
            {
                System.out.println("This numbeer is a Fasinating NUmber!");
            }
            else{
                System.out.println("This number is not a Fasinating Number!");
            }
        }
    }