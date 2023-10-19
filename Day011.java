import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Day011 {
    public static void main(String[] args) {
        try {
            String fileName = "file.txt"; // Gantilah "file.txt" dengan nama file yang ingin Anda buat.
            
            // Membaca input dari konsol
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Masukkan isi file: ");
            String content = reader.readLine();

            // Membuat dan menulis ke file
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
            writer.write(content);

            writer.close();
            System.out.println("File berhasil dibuat dan ditulis.");
        } catch (IOException e) {
            System.err.println("Terjadi kesalahan: " + e.getMessage());
        }
    }
}
