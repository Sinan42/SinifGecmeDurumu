import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int mat,fiz,tur,kim,muz,ortalama;
        int ders=5;

        Scanner input =new Scanner(System.in);
        System.out.print("Matematik notu=");
        mat=input.nextInt();
        if (0>mat||mat>100){
            mat=0;
            ders--;
       }
        System.out.print("Fizik Notu=");
        fiz=input.nextInt();
        if(fiz<0||fiz>100){
            fiz=0;
            ders--;
        }
        System.out.print("Turkce Notu=");
        tur=input.nextInt();
        if(tur<0||tur>100){
            tur=0;
            ders--;
        }
        System.out.print("Kimya Notu=");
        kim=input.nextInt();
        if(kim<0||kim>100){
            kim=0;
            ders--;
        }
        System.out.print("Muzik Notu=");
        muz=input.nextInt();
        if(muz<0||muz>100){
            muz=0;
            ders--;
        }
        System.out.println(ders);
        if(ders!=0) {
            ortalama = (mat + fiz + tur + kim + muz) / ders;
            System.out.println("Ortalama" + ortalama);
        }else{
            System.out.println("Ortalamaya dahil ders yok");
        }





    }
}
