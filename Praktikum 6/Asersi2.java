/**
 * Risang Tri Baskoro
 * 24060119130119
 * 2023
 */

class Lingkaran{
    private double jariJari;

    public Lingkaran (double jariJari){
        this.jariJari = jariJari;
    }

    public double hitungKeliling(){
        return 2 * Math.PI * jariJari;
    }
}

public class Asersi2 {
    public static void main(String[] args) {
        double jariJari = 0;
        assert(jariJari > 0):"jari-jari tidak boleh nol!";
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("Keliling lingkaran = " + kelilingLingkaran);
    }
}
