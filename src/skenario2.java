import java.util.Scanner;

public class skenario2 {

    public static void main(String[] args){
        Scanner inputUser2 = new Scanner(System.in);

        String GOLD, SILVER, BRONZE, REGULAR, kelas;

        System.out.println("Masukkan kelas anda:");
        kelas = inputUser2.nextLine();

        GOLD = "20%";
        SILVER = "15%";
        BRONZE = "10%";
        REGULAR = "0%";

        if(kelas.equals("GOLD")){
            System.out.println("Diskon anda " + GOLD);
        }
        else if(kelas.equals("SILVER")){
            System.out.println("Diskon anda " + SILVER);
        }
        else if(kelas.equals("BRONZE")){
            System.out.println("Diskon anda " + BRONZE);
        }
        else if(kelas.equals("REGULAR")){
            System.out.println("Diskon anda " + REGULAR);
        }
        else{
            System.out.println("Class tidak ditemukan");
        }

       
        
        

    }
    
}
