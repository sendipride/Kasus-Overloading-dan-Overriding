package kendaraan;
class Kendaraan {
    void jalan() {
        System.out.println("Kendaraan sedang berjalan");
    }
}
class Mobil extends Kendaraan {
    @Override
    void jalan() {
        System.out.println("Mobil berjalan di jalan raya");
    }
}
class Sepeda extends Kendaraan {
    @Override
    void jalan() {
        System.out.println("Sepeda dikayuh di jalan kecil");
    }
}
public class kendaraan {
    public static void main(String[] args) {
        Kendaraan k = new Kendaraan();
        k.jalan();

        Mobil m = new Mobil();
        m.jalan();

        Sepeda s = new Sepeda();
        s.jalan();
    }
}