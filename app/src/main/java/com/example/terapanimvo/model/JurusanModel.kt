package com.example.terapanimvo.model

class JurusanModel(
    val jurusan_id: Int,
    val jurusan_nama: String,
    val perusahaan: ArrayList<Perusahaan>
)

class Perusahaan(
    val perusahaan_id: Int,
    val perusahaan_nama: String,
    val perusahaan_alamat: String,
    val perusahaan_email: String,
    val perusahaan_telepon: String,
    val perusahaan_logo: String,
    val perusahaan_gambar1: String,
    val perusahaan_gambar2: String,
    val perusahaan_gambar3: String
)