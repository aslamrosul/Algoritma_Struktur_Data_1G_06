public class Fungsi {
   static double aglonema[] = {10,6,2,5};
    static double keladi[] = {5,11,10,7};
    static double alocasia[] = {15,9,10,12};
    static double mawar[] = {7,12,5,9};

    static double hargaAglonema = 75000;
    static double hargaKeladi = 50000;
    static double hargaAlocasia = 60000;
    static double hargaMawar = 10000;

    static double PendapatanRG[] = new double[4];
    public static void main(String[] args) {

        System.out.println("===========================");
        System.out.println("Pendapatan Setiap Cabang: ");
        System.out.println("===========================");
menampilkanSetiapPendapatanCabang();
System.out.println("===========================");
System.out.println();

System.out.println("===========================");
System.out.println("Rincian Stock RoyalGarden4: ");
System.out.println("===========================");
ketahuiJumlahStockBungaRG4danRincian();
System.out.println("===========================");

    }
   public static void menampilkanSetiapPendapatanCabang(){

for (int i = 0; i < aglonema.length; i++) {
PendapatanRG[i]=(aglonema[i]*hargaAglonema)+(keladi[i]*hargaKeladi)+(alocasia[i]*hargaAlocasia)+(mawar[i]*hargaMawar);

    System.out.println("Pendapatan cabang RoyalGarden"+(i+1)+": "+ PendapatanRG[i]);
}
}

    public static void ketahuiJumlahStockBungaRG4danRincian(){

        System.out.println("Aglonema :"+ aglonema[3]+", Jumlah Stock Setelah Pengurangan: "+ (aglonema[3]-1));
        System.out.println("Keladi :"+ keladi[3]+", Jumlah Stock Setelah Pengurangan: "+(keladi[3]-2));
        System.out.println("Alocasia :"+ alocasia[3]+ ", Jumlah Stock Setelah Pengurangan: "+(alocasia[3]-0));
        System.out.println("Mawar: "+ mawar[3]+", Jumlah Stock Setelah Pengurangan: "+ (mawar[3]-5));
    } 
}
