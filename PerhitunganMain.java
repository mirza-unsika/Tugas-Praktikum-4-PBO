package prak_oop4;

public class PerhitunganMain {
    public static void main(String[] args) {
        // TODO code application logic here
        Perhitungan volumeKubus = new Perhitungan(12);
        Perhitungan luasKubus = new Perhitungan(8);
        Perhitungan volumeBalok = new Perhitungan(9,10,16);
        Perhitungan luasBalok = new Perhitungan(8,4,12);
        
        System.out.println("Volume kubus dengan panjang sisi 12 cm adalah " +  volumeKubus.VolumeKubus()+" cm^3");
        System.out.println("Luas kubus dengan panjang sisi 8 cm adalah " +  luasKubus.LuasKubus()+" cm^2");
        System.out.println("Volume balok dengan panjang 9 cm, lebar 10 cm, dan tinggi 16 cm adalah " +  volumeBalok.VolumeBalok()+" cm^3");
        System.out.println("Luas balok dengan panjang 8 cm, lebar 4 cm, dan tinggi 12 cm adalah " +  luasBalok.LuasBalok()+" cm^2");
    }
    
}	
