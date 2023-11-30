
package Nomor3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class BacaFile {
    public static void main(String[] args) throws IOException {
        //Menulis File
        Files.writeString(Path.of("src/Nomor3/penampungFile.txt"), "apa aja");
        //Membaca File
        String hasil = Files.readString(Path.of("src/Nomor3/penampungFile.txt"));
        System.out.println(hasil);
    }
}
