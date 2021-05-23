public class Motor extends User implements Kendaraan {

    private boolean status;

    @Override
    public void nyalakanMotor() {
        status = true;
        System.out.println("Breem...");
        System.out.println("Motor Menyala");
    }

    @Override
    public void matikanMotor() {
        status = false;
        System.out.println("Motor dimatikan");
    }

    @Override
    public void gasMotor() {
        if (status) {
            if (this.kecepatan == KECEPATAN_MAX) {
                System.out.println("Kecepatan MAXIMAL !!!");
                System.out.println("Sudah 100");
            } else {
                this.kecepatan += 10;
                System.out.println("Kecepatan Sekarang: " + this.getKecepatan());
            }
        } else {
            System.out.println("Nyalakan Motor dulu...");
        }

    }

    @Override
    public void remMotor() {
        if (status) {
            if (this.kecepatan == KECEPATAN_MIN) {
                System.out.println("Kecepatan= 0");
            } else {
                this.kecepatan -= 10;
                System.out.println("Kecepatan Sekarang= " + this.getKecepatan());
            }
        } else {
            System.out.println("Nyalakan Motor dulu... ");
        }
    }
}

