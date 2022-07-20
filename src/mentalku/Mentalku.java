/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mentalku;

import java.util.Scanner;

/**
 *
 * @author RISA, ANAN, SYAUQI
 */
public class Mentalku {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
                InputData id = new InputData();
                id.setVisible(true);
                
                Scanner masukan = new Scanner(System.in);
                CekOrang anan = new CekOrang();
                System.out.print("Masukkan Nama Anda: ");
                anan.setNama(masukan.nextLine());
                System.out.print("Masukkan Umur Anda: ");
                anan.setUmur(masukan.nextInt());
                System.out.print("Suhu Badan Anda dalam Derajat Farenheit (82-102 *F): ");
                anan.setSuhu(masukan.nextDouble());
                System.out.print("Rasio Limb Movement Anda (0-20): ");
                anan.setLimb(masukan.nextDouble());
                System.out.print("Kadar Oksigen dalam Darah Anda (%): ");
                anan.setOksigen(masukan.nextDouble());
                System.out.print("Berapa Detak Jantung Anda per Menit? (40-120): ");
                anan.setDetak(masukan.nextDouble());
                masukan.close();
                System.out.println("\n");
                
                anan.setFrekuensiPrediksi();
                System.out.println("Nama Anda: " + anan.getNama());
                System.out.println("Umur Anda: " + anan.getUmur());
                System.out.println("Suhu Badan Anda dalam Derajat Farenheit (*F): " + anan.getSuhu());
                System.out.println("Rasio Limb Movement per Periodik: " + anan.getLimb());
                System.out.println("Kadar Oksigen dalam Darah (%): " + anan.getOksigen());
                System.out.println("Detak Jantung per Menit: " + anan.getDetak());
                System.out.println("\n");

                anan.setJenisSuhu();
                anan.setJenisLimb();
                anan.setJenisOksigen();
                anan.setJenisDetak();
                anan.setFYaTidak(anan.getJenisLimb(), anan.getJenisSuhu(), anan.getJenisOksigen(),
                                anan.getJenisDetak());

                anan.ProbYa(anan.getFYa(), anan.getFTidak());
                anan.ProbTidak(anan.getFYa(), anan.getFTidak());
                anan.ProbNBayesYa(anan.getProbYa(), anan.getProbTidak());
                anan.ProbNBayesTidak(anan.getProbYa(), anan.getProbTidak());
                System.out.println("Prediksi Kondisi Kecemasan Anda Beserta Persentase: " + "\"" + anan.prediksi() + "\"");
                System.out.println("Probabilitas Cemas: " + anan.getProbNBayesYa());
                System.out.println("Probabilitas Tidak Cemas: " + anan.getProbNBayesTidak());
        }
    
}
