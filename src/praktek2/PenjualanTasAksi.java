package praktek2;

public class PenjualanTasAksi {
    public static void main(String[] args) {
        PenjualanTas rl = new PenjualanTas();
        
        
        rl.harga_tas = 500000;
        rl.jumlah_barang = 7;
        
        rl.cetakInfo();
        System.out.println("total = "+rl.hitungtotal());
        rl.cetaktotal();
        
        PenjualanTas r2 = new PenjualanTas();
        r2.cetakInfo();
        
        PenjualanTas r3 = new PenjualanTas(7000000,6);
        r3.cetakInfo();
        }
       
    
}
