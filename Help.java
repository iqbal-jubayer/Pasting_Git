import java.util.Scanner;

public class Help{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int N = sc.nextInt();

        int count = 0;
        int number = 2;

        while (count < N) {
            int sum = 0;
            int divisors = 1;
            while (divisors < number) {
                if(number%divisors == 0){
                    sum += divisors;
                }
                divisors++;
            }
            if(sum == number){
                System.out.println(number);
                count++;
            }
            if(number > 8128){
                System.out.println(number);
            }
            number++;
        }

        sc.close();
    }
}