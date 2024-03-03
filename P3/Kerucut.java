public class Kerucut {
    
    public static double jari2; 
    public static double sisiMiring; 
    public static double tinggiKerucut; 
    //1/3 phi x r kuadrat  x t
    // phi x r x s + phi x r x t
    public static double hitungVolume() {
        return  22/7 * jari2*jari2 * tinggiKerucut*1/3 ;
    }
    public static double hitungLuasPermukaan() {
        return (22/7 * jari2 * sisiMiring ) + (227 *jari2 * tinggiKerucut );
    }
}
