public class SGK_Kesintiler extends Kisi {
    SosyalYardimlar sosyal;

    public SGK_Kesintiler(SosyalYardimlar sosyal) {
        this.sosyal=sosyal;
    }

    public double SGK_Matrah() {
        return ASGARI_UCRET+sosyal.getYemekYardimi()+sosyal.getYakacakYardimi()+sosyal.getBayramYardimi();
    }


    public double SGK_20() {
        return SGK_Matrah()*20.5/100;
    }

    public double SGK_14() {
        return SGK_Matrah()*14/100;
    }

    public double SGK_2() {
        return SGK_Matrah()*2/100;
    }

    public double SGK_1() {
        return SGK_Matrah()*1/100;
    }



}
