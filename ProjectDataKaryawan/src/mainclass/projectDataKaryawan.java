/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mainclass;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import project.karyawan;

/**
 *
 * @author ryanbrilianfatsena
 */
public class projectDataKaryawan {
    public static void main(String[] args) throws IOException {
        karyawan masukKerja = new karyawan();
        Scanner dyv = new Scanner(System.in);
        String opsi,jawab = "y";   
        while(jawab.equalsIgnoreCase("y") ) {        	
        	   System.out.println("\n\n========================================================================================"
                           + "\n                              SISTEM DATA KARYAWAN PERUSAHAAN"
                           + "\n========================================================================================"
                           + "\nMenu Utama : ");
        
	        System.out.println("1. Tambah Data Karyawan");
	        System.out.println("2. Hapus Data Karyawan");	
	        System.out.println("3. Cari Data Karyawan");
	        System.out.println("4. Lihat Data Karyawan ");
	        System.out.println("5. Exit");	        
	    
	        System.out.println("\nPilih Menu Pilihan Anda : ");
	        opsi = dyv.nextLine();
	        
	        if( opsi.equals("1") ) {
                    System.out.println("\n========================================================================================");
                    masukKerja.Add();
                } else if( opsi.equals("2") ) {
                    System.out.println("\n========================================================================================");
                    masukKerja.Delete();
                } else if( opsi.equals("3") ) {
                    System.out.println("\n========================================================================================");
                    masukKerja.Cari();
                } else if( opsi.equals("4") ) {
                    System.out.println("\n========================================================================================");
                    masukKerja.View();
                } else if( opsi.equals("5") ) {
                    System.exit(0);
	        }	
		        	
	        System.out.println("\n========================================================================================"
                        + "\nApakah Anda ingin tetap melanjutkan sistem ini ?"
                        + "\nY = Ya\nT = Tidak");
	        jawab = dyv.nextLine();
	       	System.out.println("========================================================================================");
        }
    }
}
