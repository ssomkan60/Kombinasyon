import java.util.Scanner;
public class DongulerFaktoriyelHesaplamaOdev {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int i,n,r;
        int fak1=1,fak2=1,fak3=1;
        int kombinasyon;

        System.out.print("Kümenin Eleman Sayısını Giriniz:");
        n = input.nextInt();
        System.out.print("Kaç Elemanlı Olacağını Giriniz:");
        r = input.nextInt();

        for(i=1; i<=n; i++){
            fak1 = fak1*i;
        }
        for (i=1; i<=r; i++){
            fak2 = fak2*i;
        }
        for(i=1; i<=(n-r); i++){
            fak3 = fak3*i;
        }
        kombinasyon = fak1 / (fak2 * fak3);
        System.out.println("Kombinasyon:" +kombinasyon);
    }
}
