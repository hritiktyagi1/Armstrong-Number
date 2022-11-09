


import java.lang.Math;
public class ArmstrongNumber {
    public static void main(String[] args) {
        int  num=153;
        int dup=num;
        int count =0;
        int sum =0;
        while(num!=0)
        {
            num=num/10;
            count++;

        }
        while(num!=0)
        {
            num=num%10;
            sum += Math.pow(num,count);
        }
        if(dup==sum)
        {
            System.out.println("Palidrome number..");
        }
        else
        {
            System.out.println("Not a palidrome number..");
        }
    }

}
