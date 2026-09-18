import java.util.Scanner;

public class skenario1 {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);

        int nilai;

        System.out.println("masukkan nilai anda");
        nilai = inputUser.nextInt();

        if(nilai<=100&nilai>=85){
            System.out.println("Nilai anda A");
        }
        else if (nilai<=84&nilai>=70) {
            System.out.println("Nilai anda B");
            
        }
        else if (nilai<=69&nilai>=55){
            System.out.println("Nilai anda C");
        }
        else if (nilai<=54&nilai>=40){
            System.out.println("Nilai anda D");
        }
        else if (nilai<40){
            System.out.println("Nilai anda E");
        }
        
    }
}
