/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mentalku;

import java.util.Scanner;

/**
 *
 * @author RISA
 */
public class Mentalku {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
                Scanner masukan = new Scanner(System.in);
                CekOrang anan = new CekOrang();
                System.out.print("Masukkan Nama Anda: ");
                anan.setNama(masukan.nextLine());
                System.out.print("Masukkan Umur Anda: ");
                anan.setUmur(masukan.nextInt());
                System.out.print("Masukkan Jenis Kelamin Anda (L/P): ");
                anan.setGender(masukan.next().toLowerCase().charAt(0));
                // System.out.print("Apakah Anda Pekerja Lepas? (Iya/Tidak): ");
                // anan.setKerja(masukan.next());
                System.out.print("Apakah Anda Memiliki Riwayat Penyakit Mental? (Iya/Tidak): ");
                anan.setRiwayat(masukan.next());
                // System.out.print(
                // "Apakah Kondisi Mental Anda Mempengaruhi Pekerjaan Anda?
                // (Sering/Kadang-Kadang/Jarang/Tidak Pernah/-): ");
                // anan.setPengaruh(masukan.next());
                System.out.print("Apakah Anda Bekerja Remote? (Iya/Tidak): ");
                anan.setRemote(masukan.next());
                masukan.close();
                System.out.println("\n");

                System.out.println("Nama Anda: " + anan.getNama());
                System.out.println("Umur Anda: " + anan.getUmur());
                System.out.println("Jenis Kelamin Anda: " + anan.getGender());
                // System.out.println("Status Pekerja Lepas: " + anan.getKerja());
                System.out.println("Status Riwayat Penyakit Mental: " + anan.getRiwayat());
                // System.out.println("Status Kondisi Mental Anda Mempengaruhi Pekerjaan Anda: "
                // + anan.getPengaruh());
                System.out.println("Status Bekerja Remote: " + anan.getRemote());
                System.out.println("\n");

                anan.setJenisGender();
                anan.setJenisUmur();
                anan.setJenisRiwayat();
                anan.setJenisRemote();
                anan.setPYaTidak(anan.getJenisGender(), anan.getJenisUmur(), anan.getJenisRiwayat(),
                                anan.getJenisRemote());

                // System.out.println(anan.getPYa());
                // System.out.println(anan.getPTidak());
                anan.ProbYa(anan.getPYa(), anan.getPTidak());
                // System.out.println(anan.ProbYa(anan.getPYa(), anan.getPTidak()));
                anan.ProbTidak(anan.getPYa(), anan.getPTidak());
                // System.out.println(anan.ProbTidak(anan.getPYa(), anan.getPTidak()));
                anan.ProbBayesYa(anan.getProbYa(), anan.getProbTidak());
                anan.ProbBayesTidak(anan.getProbYa(), anan.getProbTidak());
                System.out.println("Probabilitas Iya: " + anan.getProbBayesYa());
                System.out.println("Probabilitas Tidak: " + anan.getProbBayesTidak());
                // anan.setJenisGender();
                // anan.setJenisKerja();
                // anan.setJenisRiwayat();
                // anan.setJenisPengaruh();
                // anan.setJenisRemote();

                // anan.setHitungP(613, anan.getJenisUmurTidak(), anan.getJenisGenderTidak(),
                // anan.getJenisKerjaTidak(),
                // anan.getJenisRiwayatTidak(),
                // anan.getJenisPengaruhTidak(), anan.getJenisRemoteTidak(),
                // 613, 613, 613, 613,
                // 613, 613);

                // anan.setPrediksiTidak();
                // System.out.println("Probabilitas Tidak: " + anan.getPrediksiTidak());

                // anan.setHitungPY(612, anan.getJenisUmurYa(), anan.getJenisGenderYa(),
                // anan.getJenisKerjaYa(),
                // anan.getJenisRiwayatYa(),
                // anan.getJenisPengaruhYa(), anan.getJenisRemoteYa(),
                // 612, 612, 612, 612,
                // 612, 612);

                // anan.setPrediksiYa();
                // System.out.println("Probabilitas Iya: " + anan.getPrediksiYa());

                System.out.println("\n");
                System.out.println("Prediksi Kondisi Mental Anda Beserta Presentase: " + anan.prediksi());
                System.out.println("\n");
        }
    
}
