public class SosyalYardimlar extends Kisi {
    private double yemekYardimi;
    private double cocukYardimi;
    private double yakacakYardimi;
    private double bayramYardimi;

    public SosyalYardimlar(int cocukSayisi, int yemekVerilecekGun, boolean bayram) {
        if (cocukSayisi>3) {
            cocukYardimi=75;
        } else if(cocukSayisi>0&& cocukSayisi<=3) {
            cocukYardimi=cocukSayisi*25;
        } else cocukYardimi=0;

        yemekYardimi=yemekVerilecekGun*5;

        if (bayram) {
            bayramYardimi=75;
        } else bayramYardimi=0;
    }

    public double getYemekYardimi() {
        return yemekYardimi;
    }

    public double getCocukYardimi() {
        return cocukYardimi;
    }

    public double getYakacakYardimi() {
        return 30;
    }

    public double getBayramYardimi() {
        return bayramYardimi;
    }
}
