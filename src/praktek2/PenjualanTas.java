
package praktek2;

import static java.time.Clock.system;

public class PenjualanTas {
    Integer harga_tas;
    Integer jumlah_barang;

    public PenjualanTas() {
        harga_tas=800000;
        jumlah_barang=7;
    }

    public PenjualanTas(Integer harga_tas, Integer jumlah_barang) {
        this.harga_tas = harga_tas;
        this.jumlah_barang = jumlah_barang;
    }

    
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
    void cetaktotal(){
        System.out.println("totalnya adalah: "+hitungtotal());
    }
}
