
package pbo_3;

public class Cucu extends Ayah {
     double nilaimax=99.9;
    String nama="Dini";
    int age = 12;
    
    public void Cetak(){
        System.out.println("Cucu ini memiliki sifat "+super.Sifat);
        System.out.println("yang bernama "+nama);
        System.out.println("berumur "+age+" tahun");
        System.out.println("dengan tinggi Badan "+super.TB);
        super.hobbi();
    }
}
