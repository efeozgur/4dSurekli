public class VergiKesintiler extends Kisi implements Agi {
    SGK_Kesintiler sgk;
    Hesap hesap;
    int GV_Oran;

    public VergiKesintiler(SGK_Kesintiler sgk, Hesap hesap, int GV_Oran) {
        this.sgk = sgk;
        this.hesap=hesap;
        this.GV_Oran=GV_Oran;
    }

    public double GV_Matrahi() {
        return ASGARI_UCRET-(sgk.SGK_14()+sgk.SGK_1());
    }

    public double damgaVergisi() {
        return hesap.HakedisToplami()*DV_ORANI;
    }

    public double gelirVergisi() {
        return GV_Matrahi()*GV_Oran/100;
    }

}
