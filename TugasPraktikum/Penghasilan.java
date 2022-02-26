package TugasPraktikum;

public class Penghasilan {

    int gaji;

    void gaji() {
        this.gaji = gaji;
        gaji = 1200000;
        System.out.println("Gaji utama yang didapat :" + gaji);
    }

    void gaji1() {
        int bonus;
        this.gaji = gaji;
        bonus = 1200000;
        gaji = gaji + bonus;
        System.out.println("Gaji yang didapat jika bekerja secara baik :" +gaji);
    }
}
