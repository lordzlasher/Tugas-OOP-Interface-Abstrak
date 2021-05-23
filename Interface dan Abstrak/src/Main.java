import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        //objek input keyboad
        Scanner keyboard = new Scanner(System.in);
        int menu;
        int aksi;


            // membuat objek Kendaraan
            Kendaraan nmax = new Motor();

            // membuat objek Bermotor
            Bermotor yoga = new Bermotor(nmax);

            while(true) {
                System.out.println("--------- Motor ----------");
                System.out.println("[1] Nyalakan Motor");
                System.out.println("[2] Matikan Motor");
                System.out.println("[3] Gas Motor");
                System.out.println("[4] Rem Motor");
                System.out.println("[0] Keluar");
                System.out.println("---------------------------");
                System.out.println("Masukan pilihan anda : ");
                aksi = keyboard.nextInt();

                if (aksi == 1) {
                    yoga.motorHidup();
                } else if (aksi == 2) {
                    yoga.motorMati();
                } else if (aksi == 3) {
                    yoga.tancapGas();
                } else if (aksi == 4) {
                    yoga.remBreak();
                } else if (aksi == 0) {
                    System.exit(0);
                } else {
                    System.out.println("Pilihan yang anda pilih tidak ada!");
                }
            }
        }
    }


