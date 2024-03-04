public class Mahasiswa {
    public  String nama, jenisKelamin;
    public  double nim, ipk;

    public static double cariTerbesar(Mahasiswa[] mhsArray) {
        double max = mhsArray[0].ipk;
        for (int i = 1; i < mhsArray.length; i++) {
            if (mhsArray[i].ipk > max) {
                max = mhsArray[i].ipk;
            }
        }

        return max;
    }

    public static double cariRataRata(Mahasiswa[] mhsArray) {
        double total = 0;
        for (int i = 0; i < mhsArray.length; i++) {
            total += mhsArray[i].ipk;
        }
        return total / mhsArray.length;
    }
}
