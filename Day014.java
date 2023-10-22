public class Day014 {
    public static void main(String[] args) {
        // 1. Menyambung 2 buah string
        String string1 = "Rahma";
        String string2 = "Tiaa";
        System.out.println("string1 : " + string1);
        System.out.println("string2 : " + string2);

        String stringLengkap = string1 + string2;
        System.out.println("String Gabungan = " + stringLengkap);

        // 2. Menampilkan Panjang String
        String nama = "Rahmatia"; // <- Spasi Dihitung sebagai string
        int panjangString = nama.length();
        System.out.println(nama + "\nMemiliki Panjang : " + panjangString);

        // 3. Mengecek kata dalam string
        String cek1 = "tia";
        boolean status1 = nama.contains(cek1); // <- Dalam Pengecekan Huruf kapital sangat berpengaruh
        System.out.println("kata " + cek1 + " Ada di : " + nama + " = " + status1);
        
        // 4. Mengulang String
        System.out.println("ha".repeat(5));
        System.out.println("wk".repeat(5));

        // 5. Index String
        String nama2 = "Rahmatia";
        System.out.println(nama2);
        System.out.println("Index String ke 0 : " + nama2.charAt(0));
        System.out.println("Index String ke 7 : " + nama2.charAt(5));
        System.out.println("Index String ke -1 : " + nama2.charAt(nama2.length() - 1)); // <- Mengambil String Dari Belakang
        System.out.println("Index String 0 sampai 5 : " + nama2.substring(0, 5)); // <- Yang di ambil 0 sampai sebelum 4
       
        // 6. Mengecek Jumlah Huruf
        String nama3 = "Rahmatia";
        int jumlahHuruf = nama3.length() - nama3.replace("R", "").length();
        System.out.println("Jumlah 'R' dalam : " + nama3 + " = " + jumlahHuruf); // <- Huruf Kapital berpengaruh dalam pengecekan
    }
}
