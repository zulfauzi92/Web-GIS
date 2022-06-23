<?php

use Illuminate\Database\Migrations\Migration;
use Illuminate\Database\Schema\Blueprint;
use Illuminate\Support\Facades\Schema;

class Relasi5 extends Migration
{
    /**
     * Run the migrations.
     *
     * @return void
     */
    public function up()
    {
        DB::table('kos')->insert(
            array(
                'name' => 'Kost Deles Sukolilo Surabaya 796534DS',
                'address' => 'Jln Deles 3 gang mawar',
                'description' => 'lokasi kos: masuk gang sebelah santana seafood. lanjut cari gang mawar dan masuk ke timur. kemudian tanya kos milik H. Rouf almarhum. atau tanya tempas kos Pak Turi/darmini. Listrik: biaya perbulan sudah termasuk listrik standard. yaitu: untuk cas hp/laptop, kipas angin, lampu. alat masak listrik dikenakan biaya tambahan 40rb/bln Fasilitas: kamar mandi luar parkiran motor kasur lemari pakaian meja belajar',
                'latitude' => -7.290544,
                'longitude' => 112.782115,
                'kos_type' => 'Kos Putra'
            )
        );

        DB::table('facilities')->insert(
            array(
                'kos_id' => 1,
                'name' => '3 x 4 meter'
            )
        );

        DB::table('facilities')->insert(
            array(
                'kos_id' => 1,
                'name' => 'Kamar mandi luar'
            )
        );

        DB::table('facilities')->insert(
            array(
                'kos_id' => 1,
                'name' => 'Parkir'
            )
        );

        DB::table('facilities')->insert(
            array(
                'kos_id' => 1,
                'name' => 'Lemari dan Meja'
            )
        );

        DB::table('category_price')->insert(
            array(
                'kos_id' => 1,
                'name' => 'Per bulan',
                'price' => 400000
            )
        );

        DB::table('my_office')->insert(
            array(
                'kos_id' => 1,
                'owner_name' => 'Pak Turi/darmini'
            )
        );

        DB::table('galleries')->insert(
            array(
                'kos_id' => 1,
                'filename' => 'https://raw.githubusercontent.com/zulfauzi92/Web-GIS/main/kos%20image/kos1/kos1-001.jpg'
            )
        );

        DB::table('galleries')->insert(
            array(
                'kos_id' => 1,
                'filename' => 'https://raw.githubusercontent.com/zulfauzi92/Web-GIS/main/kos%20image/kos1/kos1-002.jpg'
            )
        );

        DB::table('galleries')->insert(
            array(
                'kos_id' => 1,
                'filename' => 'https://raw.githubusercontent.com/zulfauzi92/Web-GIS/main/kos%20image/kos1/kos1-003.jpg'
            )
        );

        DB::table('galleries')->insert(
            array(
                'kos_id' => 1,
                'filename' => 'https://raw.githubusercontent.com/zulfauzi92/Web-GIS/main/kos%20image/kos1/kos1-004.jpg'
            )
        );

        DB::table('kos')->insert(
            array(
                'name' => 'Kost Cak Husin Tipe B Keputih Sukolilo Surabaya RMZ 159CK',
                'address' => 'Jl. Arif Rahman Hakim Keputih No.59 Sukolilo Surabaya (Dekat Depo Air Isi Ulang Biru Keputih)',
                'description' => 'Tamu dilarang menginap',
                'latitude' => -7.2899042,
                'longitude' => 112.7966067,
                'kos_type' => 'Kos Putri'
            )
        );

        DB::table('facilities')->insert(
            array(
                'kos_id' => 2,
                'name' => '3 x 2.5 meter, Termasuk Listrik'
            )
        );

        DB::table('facilities')->insert(
            array(
                'kos_id' => 2,
                'name' => 'Kasur, Meja, Lemari Baju, Kursi'
            )
        );

        DB::table('facilities')->insert(
            array(
                'kos_id' => 2,
                'name' => 'Wifi, Kulkas, Dapur, Kamar Mandi Luar'
            )
        );

        DB::table('facilities')->insert(
            array(
                'kos_id' => 2,
                'name' => 'Parkir, R.Cuci, R.Jemur, R.Santai'
            )
        );

        DB::table('category_price')->insert(
            array(
                'kos_id' => 2,
                'name' => 'Per bulan',
                'price' => 540000
            )
        );

        DB::table('my_office')->insert(
            array(
                'kos_id' => 2,
                'owner_name' => 'Achmada Fiqri A Rasyad'
            )
        );

        DB::table('galleries')->insert(
            array(
                'kos_id' => 2,
                'filename' => 'https://raw.githubusercontent.com/zulfauzi92/Web-GIS/main/kos%20image/kos2/kos2-001.jpg'
            )
        );

        DB::table('galleries')->insert(
            array(
                'kos_id' => 2,
                'filename' => 'https://raw.githubusercontent.com/zulfauzi92/Web-GIS/main/kos%20image/kos2/kos2-002.jpg'
            )
        );

        DB::table('galleries')->insert(
            array(
                'kos_id' => 2,
                'filename' => 'https://raw.githubusercontent.com/zulfauzi92/Web-GIS/main/kos%20image/kos2/kos2-003.jpg'
            )
        );

        DB::table('galleries')->insert(
            array(
                'kos_id' => 2,
                'filename' => 'https://raw.githubusercontent.com/zulfauzi92/Web-GIS/main/kos%20image/kos2/kos2-004.jpg'
            )
        );

        DB::table('kos')->insert(
            array(
                'name' => 'Kost Apik Tegal Mulyorejo 91 Tipe A Surabaya HTJ2393G',
                'address' => 'Jl. tegal mulyorejo baru no 91 & 98',
                'description' => 'Kost Apik Tegal Mulyorejo 91 • Listrik + 100 Ribu / Bulan • Ada Deposit • Kos yang sangat strategis dekat dengan Universitas Widya Kartika (2.1 km) • Universitas W.R. Supratman (2.5 km) • Universitas Muhammadiyah Surabaya (2.9 km) • Universitas Narotama (3.7 km) • Universitas Tritunggal Surabaya (5.1 km) • RSU Surabaya Hajj (2.4 km) • RS Kapaljudi (2.6 km) • RS Universitas Airlangga (3.4 km) • RS Mitra Keluarga Kenjeran (4 km) • RSIA Kendangsari MERR Surabaya (4.6 km) • Galaxy Mall 3 (2.6 km) • Stasiun Surabaya Gubeng (8.7 km) • Terminal Keputih (4.2 km) • Terminal Kenjeran (4.9 km) • Terminal Bratang (6.2 km) • KUA Mulyorejo (550 m) • Kantor Kelurahan dan Kecamatan Mulyorejo (3.5 km) • Bank BTN KCP Mulyosari (3.6 km) • Kantor baru Oppo surabaya (4.0 km) • BPJS Kesehatan KCU Surabaya (4.1 km) • Bank Jatim Kantor Kas Unair (5.4 km) • Kotalama Gerobak Kuliner (3.7 km) • Sentra Wisata Kuliner Dharmahusada (5.6 km) • Taman PENS (2.2 km)',
                'latitude' => -7.275091,
                'longitude' => 112.7894296,
                'kos_type' => 'Kos Putra'
            )
        );

        DB::table('facilities')->insert(
            array(
                'kos_id' => 3,
                'name' => '3 x 3 meter, Tidak Termasuk Listrik'
            )
        );

        DB::table('facilities')->insert(
            array(
                'kos_id' => 3,
                'name' => 'Kasur, Meja, Lemari Baju, Kursi, Bantal, Guling'
            )
        );

        DB::table('facilities')->insert(
            array(
                'kos_id' => 3,
                'name' => 'Wifi, Dapur, Kamar Mandi Luar'
            )
        );

        DB::table('facilities')->insert(
            array(
                'kos_id' => 3,
                'name' => 'Parkir, R.Cuci, R.Jemur, R.Tamu'
            )
        );

        DB::table('category_price')->insert(
            array(
                'kos_id' => 3,
                'name' => 'Per bulan',
                'price' => 749250
            )
        );

        DB::table('my_office')->insert(
            array(
                'kos_id' => 3,
                'owner_name' => 'Sintia'
            )
        );

        DB::table('galleries')->insert(
            array(
                'kos_id' => 3,
                'filename' => 'https://raw.githubusercontent.com/zulfauzi92/Web-GIS/main/kos%20image/kos3/kos3-001.jpg'
            )
        );

        DB::table('galleries')->insert(
            array(
                'kos_id' => 3,
                'filename' => 'https://raw.githubusercontent.com/zulfauzi92/Web-GIS/main/kos%20image/kos3/kos3-002.jpg'
            )
        );

        DB::table('galleries')->insert(
            array(
                'kos_id' => 3,
                'filename' => 'https://raw.githubusercontent.com/zulfauzi92/Web-GIS/main/kos%20image/kos3/kos3-003.jpg'
            )
        );

        DB::table('galleries')->insert(
            array(
                'kos_id' => 3,
                'filename' => 'https://raw.githubusercontent.com/zulfauzi92/Web-GIS/main/kos%20image/kos3/kos3-004.jpg'
            )
        );

        DB::table('kos')->insert(
            array(
                'name' => 'Kost Apik TMB Kayu 114 Tipe C Mulyorejo Surabaya Q1676RFG',
                'address' => 'Jalan Tegal Mulyorejo Baru No 114',
                'description' => 'Kost Apik TMB Kayu 114 • Listrik + 100 Ribu • Up Size Kamar + 100 Ribu • Ada Deposit • Kos yang sangat strategis dekat dengan Universitas Airlangga Kampus C (1.6 km) • Institut Teknologi Sepuluh Nopember (1.7 km) • Universitas Widya Kartika (1.9 km) • Universitas W.R. Supratman (2.6 km) • Universitas Muhammadiyah Surabaya (2.7 km) • Universitas Katolik Widya Mandala Surabaya (3.9 km) • RSUD Haji Provinsi Jawa Timur (2.5 km) • RS UNAIR (2.9 km) • RS Onkologi Surabaya (3.5 km) • Medical Center Institut Teknologi Sepuluh Nopember (3.9 km) • RSGM Nala Husada (4.2 km) • Pakuwon City Mall (2.4 km) • Galaxy Mall 3 (2.7 km) • Galaxy Mall 1 (2.8 km) • Stasiun Ngagel (7.3 km) • Terminal Keputih (4 km) • Terminal Kenjeran (4.7 km) • Kantor KONI Provinsi Jawa Timur (2.4 km) • Asrama Haji Sukolilo Surabaya (3 km) • Sentra Wisata Kuliner Convention Hall (2.7 km)',
                'latitude' => -7.274873,
                'longitude' => 112.7930483,
                'kos_type' => 'Kos Putri'
            )
        );

        DB::table('facilities')->insert(
            array(
                'kos_id' => 4,
                'name' => '2 x 2.5 meter, Tidak Termasuk Listrik'
            )
        );

        DB::table('facilities')->insert(
            array(
                'kos_id' => 4,
                'name' => 'Kasur, Meja, Lemari Baju, Kursi'
            )
        );

        DB::table('facilities')->insert(
            array(
                'kos_id' => 4,
                'name' => 'Wifi, Dapur, Shower'
            )
        );

        DB::table('facilities')->insert(
            array(
                'kos_id' => 4,
                'name' => 'Parkir, R.Jemur, R.Tamu'
            )
        );

        DB::table('category_price')->insert(
            array(
                'kos_id' => 4,
                'name' => 'Per bulan',
                'price' => 812000
            )
        );

        DB::table('my_office')->insert(
            array(
                'kos_id' => 4,
                'owner_name' => 'Sintia'
            )
        );

        DB::table('galleries')->insert(
            array(
                'kos_id' => 4,
                'filename' => 'https://raw.githubusercontent.com/zulfauzi92/Web-GIS/main/kos%20image/kos4/kos4-001.jpg'
            )
        );

        DB::table('galleries')->insert(
            array(
                'kos_id' => 4,
                'filename' => 'https://raw.githubusercontent.com/zulfauzi92/Web-GIS/main/kos%20image/kos4/kos4-002.jpg'
            )
        );

        DB::table('galleries')->insert(
            array(
                'kos_id' => 4,
                'filename' => 'https://raw.githubusercontent.com/zulfauzi92/Web-GIS/main/kos%20image/kos4/kos4-003.jpg'
            )
        );

        DB::table('galleries')->insert(
            array(
                'kos_id' => 4,
                'filename' => 'https://raw.githubusercontent.com/zulfauzi92/Web-GIS/main/kos%20image/kos4/kos4-004.jpg'
            )
        );

        DB::table('kos')->insert(
            array(
                'name' => 'Kost Cak Husin Tipe A Keputih Sukolilo Surabaya RMZ 159C',
                'address' => 'Jl. Arif Rahman Hakim Keputih No.59 Sukolilo Surabaya (Dekat Depo Air Isi Ulang Biru Keputih)',
                'description' => 'Tamu dilarang menginap',
                'latitude' => -7.2899042,
                'longitude' => 112.7966067,
                'kos_type' => 'Kos Putri'
            )
        );

        DB::table('facilities')->insert(
            array(
                'kos_id' => 5,
                'name' => '3 x 3 meter, Termasuk Listrik'
            )
        );

        DB::table('facilities')->insert(
            array(
                'kos_id' => 5,
                'name' => 'Kasur, Meja, Lemari Baju, Kursi'
            )
        );

        DB::table('facilities')->insert(
            array(
                'kos_id' => 5,
                'name' => 'Wifi, Kulkas, Dapur, Kamar Mandi Luar'
            )
        );

        DB::table('facilities')->insert(
            array(
                'kos_id' => 5,
                'name' => 'Parkir, R.Cuci, R.Jemur, R.Santai'
            )
        );

        DB::table('category_price')->insert(
            array(
                'kos_id' => 5,
                'name' => 'Per bulan',
                'price' => 630000
            )
        );

        DB::table('my_office')->insert(
            array(
                'kos_id' => 5,
                'owner_name' => 'Achmada Fiqri A Rasyad'
            )
        );

        DB::table('galleries')->insert(
            array(
                'kos_id' => 5,
                'filename' => 'https://raw.githubusercontent.com/zulfauzi92/Web-GIS/main/kos%20image/kos5/kos5-001.jpg'
            )
        );

        DB::table('galleries')->insert(
            array(
                'kos_id' => 5,
                'filename' => 'https://raw.githubusercontent.com/zulfauzi92/Web-GIS/main/kos%20image/kos5/kos5-002.jpg'
            )
        );

        DB::table('galleries')->insert(
            array(
                'kos_id' => 5,
                'filename' => 'https://raw.githubusercontent.com/zulfauzi92/Web-GIS/main/kos%20image/kos5/kos5-003.jpg'
            )
        );

        DB::table('galleries')->insert(
            array(
                'kos_id' => 5,
                'filename' => 'https://raw.githubusercontent.com/zulfauzi92/Web-GIS/main/kos%20image/kos5/kos5-004.jpg'
            )
        );

        DB::table('kos')->insert(
            array(
                'name' => 'Kost Apik Mahasiswa Keputih Tipe A Sukolilo Surabaya 918734AM',
                'address' => 'Jl. Keputih Tegal Tim. II No.75, Keputih, Kec. Sukolilo, Kota SBY, Jawa Timur 60111, Indonesia',
                'description' => 'Kost Apik Mahasiswa Keputih • Bisa BERDUA + 300 Ribu • Ada Deposit • Kos yang sangat strategis dekat dengan Universitas Hang Tuah (1.4 km) ITS (3.2 km) • Universitas Narotama (4.2 km) • Unair Kampus C (4.3 km) • Universitas Katolik Widya Mandala Surabaya (4.4 km) • STIESIA (4.5 km) • RS Onkologi (2.1 km) • RS UNAIR (5.7 km) • Pakuwon City Mall (2.8 km) • Galaxy Mall (4.5 km) • Superindo Arief Rahman (2.2 km) • Stasiun Stasiun Wonokromo (10.3 km) • Terminal Terminal Bratang (6.3 km)',
                'latitude' => -7.2880935,
                'longitude' => 112.8016369,
                'kos_type' => 'Kos Putra'
            )
        );

        DB::table('facilities')->insert(
            array(
                'kos_id' => 6,
                'name' => '4 x 3 meter, Tidak Termasuk Listrik'
            )
        );

        DB::table('facilities')->insert(
            array(
                'kos_id' => 6,
                'name' => 'AC, Kasur, Meja, Lemari Baju, Kursi, Bantal'
            )
        );

        DB::table('facilities')->insert(
            array(
                'kos_id' => 6,
                'name' => 'Wifi, Kamar Mandi Luar'
            )
        );

        DB::table('facilities')->insert(
            array(
                'kos_id' => 6,
                'name' => 'Parkir, R.Tamu'
            )
        );

        DB::table('category_price')->insert(
            array(
                'kos_id' => 6,
                'name' => 'Per bulan',
                'price' => 1220000
            )
        );

        DB::table('my_office')->insert(
            array(
                'kos_id' => 6,
                'owner_name' => 'Sintia'
            )
        );

        DB::table('galleries')->insert(
            array(
                'kos_id' => 6,
                'filename' => 'https://raw.githubusercontent.com/zulfauzi92/Web-GIS/main/kos%20image/kos6/kos6-001.jpg'
            )
        );

        DB::table('galleries')->insert(
            array(
                'kos_id' => 6,
                'filename' => 'https://raw.githubusercontent.com/zulfauzi92/Web-GIS/main/kos%20image/kos6/kos6-002.jpg'
            )
        );

        DB::table('galleries')->insert(
            array(
                'kos_id' => 6,
                'filename' => 'https://raw.githubusercontent.com/zulfauzi92/Web-GIS/main/kos%20image/kos6/kos6-003.jpg'
            )
        );

        DB::table('galleries')->insert(
            array(
                'kos_id' => 6,
                'filename' => 'https://raw.githubusercontent.com/zulfauzi92/Web-GIS/main/kos%20image/kos6/kos6-004.jpg'
            )
        );

        DB::table('galleries')->insert(
            array(
                'kos_id' => 6,
                'filename' => 'https://raw.githubusercontent.com/zulfauzi92/Web-GIS/main/kos%20image/kos6/kos6-005.jpg'
            )
        );

        DB::table('galleries')->insert(
            array(
                'kos_id' => 6,
                'filename' => 'https://raw.githubusercontent.com/zulfauzi92/Web-GIS/main/kos%20image/kos6/kos6-006.jpg'
            )
        );


        // Schema::table('my_booking', function (Blueprint $table) {
        //     $table->integer('room_id')->unsigned()->change();
        //     $table->foreign('room_id')->references('id')->on('rooms')
        //         ->onUpdate('cascade')->onDelete('cascade');

        //     $table->integer('user_id')->unsigned()->change();
        //     $table->foreign('user_id')->references('id')->on('users')
        //         ->onUpdate('cascade')->onDelete('cascade');

        //     $table->integer('category_price_id')->unsigned()->change();
        //     $table->foreign('category_price_id')->references('id')->on('category_price')
        //         ->onUpdate('cascade')->onDelete('cascade');
        // });
    }

    /**
     * Reverse the migrations.
     *
     * @return void
     */
    public function down()
    {
        //
    }
}
