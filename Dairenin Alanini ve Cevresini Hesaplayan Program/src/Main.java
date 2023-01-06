import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double r,aci, pi = 3.14;
        System.out.print("Yarıçapı Giriniz : ");
        r = input.nextDouble();
        System.out.print("Merkez Açının Ölçüsünü Giriniz : ");
        aci = input.nextDouble();
        double alan = pi*r*r;
        double cevre = 2*pi*r;
        double alan2 = (pi*(r*r)*aci)/360;
        System.out.println("Dairenin alanı : " + alan);
        System.out.println("Dairenin Çevresi : " + cevre);
        System.out.println("Daire Diliminin Alanı : " + alan2);






    }
}