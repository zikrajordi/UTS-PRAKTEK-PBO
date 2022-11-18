/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts_181122_A;

/**
 *
 * @author LENOVO
 */
public class WarnetRecord {
     private int kode;
    private String NamaPelanggan;
    private int JenisPelanggan;
    private int TglMasuk;
    private int JamMasuk;
    private int JamKeluar;
    private double Tarif;
    private double Total;
    private int lama;
    private int harga;
    private double potongan;


    public void PembayaranPengobatan (double potongan, double Total, int lama, int harga, int kode,String NamaPelanggan, int JenisPelanggan, int TglMasuk, int JamMasuk,int JamKeluar, double Tarif ){
       this.kode = kode; 
       this.JenisPelanggan = JenisPelanggan;
       this.TglMasuk = TglMasuk;
       this.JamMasuk = JamMasuk;
       this.JamKeluar = JamKeluar;
       this.Tarif = Tarif;
       this.Total = Total;
       this.lama = lama;
       this.harga = harga;
       this.potongan = potongan;
    }

    ////////////////////////////
     public int getKode() {
        return kode;
    }
    public int getJenisPelanggan() {
        return JenisPelanggan;
    }
    public int getTglMasuk() {
        return TglMasuk;
    }

    public int getJamMasuk() {
        return JamMasuk;
    }

    public double getTotal() {
        return Total;
    }

    public int getLama() {
        return lama;
    }



    public int getJamKeluar() {
        return JamKeluar;
    }
    public double getTarif() {
        return Tarif;
    }

    public double getHarga() {
        return harga;
    }

    public double getPotongan() {
        return potongan;
    }
    ///////////////////////////////
    public void setKode(int kode) {
        this.kode = kode;
    }

    public void setNamaPelanggan(String namaPelanggan) {
        this.NamaPelanggan = namaPelanggan;
    }

    public void setJenisPelanggan(int jenisPelanggan) {
        this.JenisPelanggan = jenisPelanggan;
    }

    public void setTglMasuk(int tglMasuk) {
        this.TglMasuk = tglMasuk;
    }

    public void setJamMasuk(int jamMasuk) {
        this.JamMasuk = jamMasuk;
    }

    public void setJamKeluar(int jamKeluar) {
        this.JamKeluar = jamKeluar;
    }

    public void setTarif(int tarif) {
        this.Tarif = tarif;
    }

    public void setTotal(double total) {
        this.Total = total;
    }

    public void setLama(int lama) {
        this.lama = lama;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
    public void setPotongan(int potongan) {
        this.potongan = potongan;
    }

    ////////////////////////////
    public int Pembayaran(){
        switch (JenisPelanggan) {
            case 1 :
                harga = 4000;
                lama = JamKeluar - JamMasuk;
                if(lama>2){
                 potongan =  (harga * 0.02);
                 Tarif = Tarif * potongan;
                 Total = lama * Tarif - potongan;
                }else{
                 potongan = (harga * 0);
                 Tarif = Tarif * potongan;
                 Total = lama * Tarif - potongan;
                } 
                break;
             case 2 :
                harga = 6000;
                lama = JamKeluar - JamMasuk;
                if(lama>2){
                 potongan = (int) (harga * 0.05);
                 Tarif = Tarif * potongan;
                 Total = lama * Tarif - potongan;
                }else{
                 potongan = (int) (harga * 0);
                 Tarif = Tarif * potongan;
                 Total = lama * Tarif - potongan;
                } 
                break;
                default:
            break;
        }
        System.out.println("Harga    = " + harga);
        System.out.println("Potongan = " + potongan);
        System.out.println("Total Pembayaran = " + Total);
        return (int) Total;
    }
    public void Print(){
        System.out.println("============== Warnet ==============");
        System.out.println("Jenis Pelanggan");
        System.out.println("1. VIP     = 4000");
        System.out.println("2. GOLD    = 6000");
        System.out.println("---------------------------------------------------");
        System.out.println("Diskon");
        System.out.println("1. VIP = potongan 2% jika leboh dari 2 jam");
        System.out.println("2. Gold = potongan 5% jika lebih dari 2 jam");
        System.out.println("---------------------------------------------------");
        System.out.println("Kode = " + kode);
        System.out.println("Nama Pelanggan = " + NamaPelanggan);
        System.out.println("Lama  = " + lama);
        System.out.println("---------------------------------------------------");

    } 
}