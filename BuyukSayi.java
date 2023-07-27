import java.util.Scanner;

public class BuyukSayi {
    public static void main(String[] args) {

        int numCount,number, max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        Scanner input= new Scanner(System.in);

        System.out.print("Kaç Tane Sayı Gireceksiniz: ");
        numCount = input.nextInt();

        for (int i = 0; i < numCount; i++)
        {
            System.out.print("Lütfen "+(i+1)+". sayıyı giriniz: ");
            number = input.nextInt();

            if(number > max){
                max = number;
            }
            if(number < min){
                min = number;
            }


        }

        System.out.print("Girdiğiniz Sayıların En Büyüğü: " + max+"\n");
        System.out.print("Girdiğiniz Sayıların En Küçüğü: " + min);

    }
}
