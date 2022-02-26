
package pbo_3;

public class Cicit extends Ayah {
    double nilaimax=90.9;
    String nama="Dinou";
    int age = 6;
    
    public void Cetak(){
        System.out.println("Cucu ini memiliki sifat "+super.Sifat);
        System.out.println("yang bernama "+nama);
        System.out.println("berumur "+age+" tahun");
        System.out.println("dengan tinggi Badan "+super.TB);
        super.hobbi();
    }
    
}
