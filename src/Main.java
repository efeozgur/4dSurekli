public class Main {
    public static void main (String[]args){
        SosyalYardimlar sosyal = new SosyalYardimlar(2,21,false);
        SGK_Kesintiler sgkKesintiler = new SGK_Kesintiler(sosyal);
        Hesap hesap = new Hesap(sosyal,sgkKesintiler);
        VergiKesintiler vergi = new VergiKesintiler(sgkKesintiler,hesap,15);
        System.out.println(sgkKesintiler.SGK_20());
        System.out.println(hesap.HakedisToplami());
        System.out.println(sgkKesintiler.SGK_Matrah());
        System.out.println(hesap.toplamTahakkuk());
        System.out.println(vergi.GV_Matrahi());
        System.out.println(vergi.damgaVergisi());
        System.out.println(vergi.gelirVergisi());
    }
}
