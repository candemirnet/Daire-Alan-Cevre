import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        int r,a;
        double pi=3.14, sonuc;

        Scanner imp = new Scanner(System.in);

        System.out.print("Yarıçap Değerini Giriniz : ");
        r = imp.nextInt();

        System.out.print("Merkez Açısının Ölçüsünü Giriniz :");
        a = imp.nextInt();

        sonuc = ((pi * (r*r) *a) /360);
        System.out.print("Sonuç : " + sonuc);
    }
}