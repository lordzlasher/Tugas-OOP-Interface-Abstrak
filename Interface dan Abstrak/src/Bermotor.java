public class Bermotor {

    //membuat objek dari interface
    private Kendaraan kendaraan;

    public Bermotor(Kendaraan kendaraan) {
        this.kendaraan = kendaraan;
    }

    void motorHidup(){
        this.kendaraan.nyalakanMotor();
    }

    void motorMati(){
        this.kendaraan.matikanMotor();
    }

    void tancapGas(){
        this.kendaraan.gasMotor();
    }

    void remBreak(){
        this.kendaraan.remMotor();
    }
}


