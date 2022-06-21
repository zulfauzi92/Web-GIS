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
                'address' => 'Kost Deles Sukolilo Surabaya beralamat di: jln Deles 3 gang mawar',
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
                'filename' => 'https://github.com/zulfauzi92/Web-GIS/blob/main/kos%20image/kos1/kos1-001.jpg'
            )
        );

        DB::table('galleries')->insert(
            array(
                'kos_id' => 1,
                'filename' => 'https://github.com/zulfauzi92/Web-GIS/blob/main/kos%20image/kos1/kos1-002.jpg'
            )
        );

        DB::table('galleries')->insert(
            array(
                'kos_id' => 1,
                'filename' => 'https://github.com/zulfauzi92/Web-GIS/blob/main/kos%20image/kos1/kos1-003.jpg'
            )
        );

        DB::table('galleries')->insert(
            array(
                'kos_id' => 1,
                'filename' => 'https://github.com/zulfauzi92/Web-GIS/blob/main/kos%20image/kos1/kos1-004.jpg'
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
