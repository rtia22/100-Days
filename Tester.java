package Nomor4;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;

public class Tester {

    public static void main(String[] args) {
        String directori = "src/nomor4/";
        String fileUji = "testUji.java";
        String inputan = "input.txt";
        String hasil = "output.txt";
        try {
            String penampungHasilOutput = Files.readString(Path.of(directori + hasil ));

            ProcessBuilder processBuilder = new ProcessBuilder();
            processBuilder.directory(new File(directori));
            processBuilder.command("cmd.exe", "/c", "java " + fileUji);
            processBuilder.redirectInput(new File(directori + inputan));
            Process process = processBuilder.start();
            process.waitFor();  

            String outputTesting = ExtractOutput(process);
            String errorTesting = ExtractEror(process);

             if (errorTesting.length() > 0) {
                System.out.println("RESULT:");
                System.out.println("--------------------------------------------");
                System.err.println("Ditemukan Error Program");
                System.out.println(errorTesting);
                System.out.println("--------------------------------------------");
            } else {
                System.out.println("RESULT:");
                System.out.println("--------------------------------------------");
                System.out.println("Program Berhasil");
                System.out.println(outputTesting);
                System.out.println("--------------------------------------------");
                 if (penampungHasilOutput.trim().equals(outputTesting.trim())) {
                    System.out.println("VALID : Output Program sudah sesuai dengan yang seharusnya");
                }else{
                    System.out.println("TIDAK VALID : Output Program tidak sama dengan yang seharusnya");
                 }
              }

        } catch (Exception namaVariabel) {
            namaVariabel.printStackTrace();
        }

    }

    private static String ExtractOutput(Process process) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(process.getInputStream()));
        StringBuffer sb = new StringBuffer();
        String line;
        while ((line=br.readLine())!=null){
            sb.append(line+"\n");
            
        }
        return sb.toString();
    }

    private static String ExtractEror(Process process) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(process.getErrorStream()));
        StringBuffer sb = new StringBuffer();
        String line;
        while ((line=br.readLine())!=null){
            sb.append(line+"\n");
            
        }
        return sb.toString();
    }
}
