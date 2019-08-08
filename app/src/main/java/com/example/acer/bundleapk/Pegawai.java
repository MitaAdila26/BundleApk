package com.example.acer.bundleapk;

import java.io.Serializable;

public class Pegawai implements Serializable {
    private String nama;
    private String alamat;
    private String noHp;
    private String pekerjaan;
    private String lamaKerja;
    private String asalSekolah;
    private String kompetensi;

    public Pegawai(String nama, String alamat, String noHp, String pekerjaan, String lamaKerja, String asalSekolah, String kompetensi) {
        this.nama = nama;
        this.alamat = alamat;
        this.noHp = noHp;
        this.pekerjaan = pekerjaan;
        this.lamaKerja = lamaKerja;
        this.asalSekolah = asalSekolah;
        this.kompetensi = kompetensi;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getNoHp() {
        return noHp;
    }

    public String getPekerjaan() {
        return pekerjaan;
    }

    public String getLamaKerja() {
        return lamaKerja;
    }

    public String getAsalSekolah() {
        return asalSekolah;
    }

    public String getKompetensi() {
        return kompetensi;
    }
}
