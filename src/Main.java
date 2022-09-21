import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int n,sum=0;
        do {
            System.out.println("sayı giriniz");

            n=scanner.nextInt();
            if (n%2==0 && n%4==0){
                sum=sum+n;
            }

        }while (n%2==0);
        System.out.println(sum);
    }
}
