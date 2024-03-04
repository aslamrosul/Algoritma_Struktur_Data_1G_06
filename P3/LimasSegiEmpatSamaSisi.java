public class LimasSegiEmpatSamaSisi {
    public static int sisiAlas;
    public static int tinggiLimas ;
    // 1/3 x alas x tinggi
    // alas + 4 Luas selimut
    public static double hitungVolume() {
        return  sisiAlas*sisiAlas * tinggiLimas /3;
    }public static double hitungLuasPermukaan() {
         return (sisiAlas*sisiAlas) + (4 * (1/2 *tinggiLimas *sisiAlas));
    }
}
