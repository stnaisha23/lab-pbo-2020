import java.util.ArrayList;
public class Bus
{
    // instance variables - replace the example below with your own
    private ArrayList<Penumpang> penumpangBiasa;
    private ArrayList<Penumpang> penumpangPrioritas;
    
    public Bus()
    {
        penumpangBiasa = new ArrayList<Penumpang>();
        penumpangPrioritas = new ArrayList<Penumpang>();
    }
    
    public ArrayList<Penumpang> getPenumpangBiasa()
    {
        return this.penumpangBiasa;
    }
    
    public ArrayList<Penumpang> getPenumpangPrioritas()
    {
        return this.penumpangPrioritas;
    }
    
    public int getJumlahPenumpangBiasa()
    {
        return this.penumpangBiasa.size();
    }
    
    public int getJumlahPenumpangPrioritas()
    {
        return this.penumpangBiasa.size();
    }
    
    public int getTotalPenumpang(){
        return penumpangBiasa.size() + penumpangPrioritas.size();
    }
    
    public boolean naikPenumpang(Penumpang p1)
    {
        if(penumpangPrioritas.size() < 8 && (p1.getHamil() || p1.getUmur() < 10  || p1.getUmur() > 60 )) { 
            System.out.println("Penumpang Berhasil ditambahkan!"); 
            return penumpangPrioritas.add(p1);
        }else if(penumpangBiasa.size() < 6 ) {
            System.out.println("Penumpang Berhasil ditambahkan!");
            return penumpangBiasa.add(p1);
        } else {
            System.out.println("Penumpang Gagal ditambahkan");
            System.out.println("Tidak ada kursi yang kosong");
        } 
        return false;
    }
    
    public boolean turunPenumpang(String nama)
    {
        for(int i = 0; i < penumpangBiasa.size(); i++) {
            if (penumpangBiasa.get(i).getNama().equals(nama)) {
                penumpangBiasa.remove(i);
                System.out.println("==Penumpang Telah Turun==");
            }
        } 
        
        for(int j = 0; j < penumpangPrioritas.size(); j++) {
            if(penumpangPrioritas.get(j).getNama().equals(nama)) {
                penumpangPrioritas.remove(j);
                System.out.println("==Penumpang Telah Turun==");
            }
        }
        return true;
    }
    
    public String toString()
    {
        String p1 = " ";
        String p2 = " ";
           
        System.out.println("");
           
        for(Penumpang penumpang : penumpangBiasa) {
               p1 += penumpang.getNama().toString(); 
        }
            
        for(Penumpang penumpang : penumpangPrioritas) {
               p2 += penumpang.getNama().toString();
        }
        
        System.out.println("Nama Penumpang Biasa : "+p1);
        System.out.println("Nama Penumpang Prioritas : "+p2);
        System.out.println("jumlah semua penumpang = " +getTotalPenumpang());
           
        return "Nama penumpang Biasa = "+p1+"Nama penumpang Prioritas = "+p2+"Jumlah semua penumpang = "+getTotalPenumpang()+"\n";
    }
}