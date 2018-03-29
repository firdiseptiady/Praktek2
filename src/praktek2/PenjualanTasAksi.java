package praktek2;

public class PenjualanTasAksi {
    public static void main(String[] args) {
        PenjualanTas rl = new PenjualanTas();
        
        
        rl.harga_tas = 500000;
        rl.jumlah_barang = 7;
        
        rl.cetakInfo();
        System.out.println("total = "+rl.hitungtotal());
        rl.cetaktotal();
        }
       
    
}
