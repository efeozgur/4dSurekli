public class Hesap extends Kisi {
    SosyalYardimlar sosyal;
    SGK_Kesintiler sgk;

    public Hesap(SosyalYardimlar sosyal, SGK_Kesintiler sgk) {
        this.sosyal = sosyal;
        this.sgk=sgk;
    }

    public double HakedisToplami() {
        return ASGARI_UCRET+sosyal.getBayramYardimi()+sosyal.getYakacakYardimi()+sosyal.getYemekYardimi()+sosyal.getCocukYardimi();
    }

    public double toplamTahakkuk(){
        return HakedisToplami()+(sgk.SGK_20()+sgk.SGK_2());
    }
}
