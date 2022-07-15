import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sayi, tplm = 0;
        System.out.print("Sayı Giriniz :");
        sayi = input.nextInt();


        for (int i = sayi - 1; i >= 1; i--) {
            if (sayi % i == 0){
                tplm +=i;

            }
        }

        if (tplm==sayi){
            System.out.println("Sayı Mükemmel");
        }else{
            System.out.println("Sayı Mükemmel değil");
        }
    }
}
