package TugasPraktikum;

public class Identitas extends Penghasilan {
    String nama ="Diah";
    String jenis = "Perempuan";
    String ID  = "333333";
    String Div = "Admin";
    public void nama(){
        System.out.println("Berikut Identitas Pegawai :");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Nama : "+nama);
    }
    public void jenis(){
        System.out.println("Jenis Kelamin : "+jenis);
        
    }
    public void ID(){
        System.out.println("Nomor Pegawai :"+ID);
        
    }
    public void Div(){
        System.out.println("Bekerja Di Bagian : "+Div);
    }
    public void Cetak(){
      
         super.gaji();
         super.gaji1();
    }
    
}
