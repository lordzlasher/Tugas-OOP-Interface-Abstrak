public interface Kendaraan {

    //int kecepatan;
    int KECEPATAN_MAX = 150;
    int KECEPATAN_MIN = 0;

    public void nyalakanMotor();
    public void matikanMotor();
    public void gasMotor();
    public void remMotor();

}


