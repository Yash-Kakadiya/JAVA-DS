import java.util.Scanner;

public class TernaryOperator{
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);

        int num=5;

        String type=(num%2==0)?"Even":"Odd";
        System.out.println(type);

        sc.close();
    }
}