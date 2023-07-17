package pbo;

import java.util.Scanner;

//class
public class BukuBeraksi {
    public static void main(String[] args) {
        //Error Handling
        try{   
            //IO Sederhana
            Scanner scanner = new Scanner(System.in);

            //Array
            BukuDetail[] buku = new BukuDetail[2];

            //Perulangan
            for(int i=0; i<buku.length; i++){
                System.out.print("Masukkan Judul "+(i+1)+" : ");
                String judul = scanner.nextLine();
                System.out.print("Masukkan Nama Penulis "+(i+1)+" : ");
                String penulis = scanner.nextLine();
                System.out.print("Masukkan No Kode "+(i+1)+" : ");
                String kode = scanner.nextLine();
                System.out.println("");


                //Object
                buku[i] = new BukuDetail(judul, penulis, kode);
            }

            //Perulangan
            for(BukuDetail  data: buku){
                System.out.println("===================");
                System.out.println("Data Buku:         ");
                System.out.println(data.displayInfo());
            }
        } catch (NumberFormatException e){
            System.out.println("Kesalahan Format nomor: "+e.getMessage());
        } catch (StringIndexOutOfBoundsException e){
            System.out.println("Kesalahan Format kode: "+e.getMessage());
        } catch (Exception e){
            System.out.println("Kesalahan Umum: "+e.getMessage());
        }
    }
    
}
