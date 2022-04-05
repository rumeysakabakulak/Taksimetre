import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {

        double km , tutar ;
        Scanner inp = new Scanner(System.in);

        System.out.print("Gidilen Mesafe : ");
        km = inp.nextDouble();

        tutar = (10 + (km * 2.20));

        String sonuc = (tutar < 20 ) ? "Ödenecek Tutar: 20 TL" : "Ödenecek Tutar: " + tutar;

         System.out.println(sonuc);








    }
}
