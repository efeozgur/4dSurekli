public class Kesintiler extends Kisi {
    VergiKesintiler vergi;
    SGK_Kesintiler sgk;

    public Kesintiler(VergiKesintiler vergi, SGK_Kesintiler sgk) {
        this.vergi = vergi;
        this.sgk = sgk;
    }

    public double kesintiToplam(){
        return vergi.damgaVergisi()+sgk.SGK_1()+sgk.SGK_14()+sgk.SGK_2()+sgk.SGK_20();
    }
}
