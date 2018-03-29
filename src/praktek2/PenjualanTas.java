
package praktek2;

public class PenjualanTas {
    Integer harga_tas;
    Integer jumlah_barang;

    
    void cetakInfo(){
        System.out.println("===========================");
        System.out.println("harga_tas :"+harga_tas);
        System.out.println("jumlah_barang :"+jumlah_barang);
        System.out.println("===========================");
    }
    Integer hitungtotal(){
        Integer total;
        total=harga_tas*jumlah_barang;
        return total;
        
    }

    String total() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
