package com.tegarap.rumahadat

//sumber : https://www.romadecade.org/rumah-adat

object RumahAdatData {
    private val rumahAdatNames = arrayOf(
        "Bolon",
        "Gadang",
        "Krong Bade",
        "Rakit Limas",
        "Panggung Kajang Leko",
        "Rakyat",
        "Limas",
        "Nowou Sesat",
        "Badui",
        "Tanean Lajhan",
        "Joglo",
        "Sunda",
        "Bangsal Kencono",
        "Selaso Jatuh Kembar"
    )

    private val rumahAdatDetails = arrayOf(
        "Rumah Balon merupakan rumah Sumatra Utara yang menjadi identitas suku batak, yang berada di Sumatra Utara. Ada beberapa jenis rumah balon yang sempat populer, dan menjadi gaya arsitektur hunian rumah orang batak.",
        "Rumah Adat gadang atau rumah godang adalah rumah adat Minangkabau, yang hingga kini masih banyak di temui di Provinsi Sumatra Barat. Teringat bahwa kebudayaan melayu yang menyebar di sekitar Semenanjung Melaya.",
        "Rumah adat Nangroe Aceh Darussalam biasa dikenal dengan rumah adat kronge bade yang berasal dari. Provinsi paling barat di indonesia, yaitu Nangroe Aceh Darussalam.",
        "Rumah rakit limas, ialah rumah adat yang berasar dari Sumatra Utara,  sekilas jika kita perhatikan rumah adat rakit limas hampir sama dengan rumah adat limas. Karena rumah ini mempunyai arsitektur dan aksen yang sama.",
        "Rumah adat panggung kajang leko, adalah rumah  yang berasal dari provonsi Jambi. Rumah ini merupakan rumah adat yang cukup lengkap, karena didalam rumah in, memiliki 8 ruangan di dalamnya.",
        "Rumah adat di Indonesia yang berada di Bengkulu yaitu rumah rakyat, Rumah adat yang ini juga rumah adat yang cukup kompleks. Namun tidak sekompleks rumah adat jambi.",
        "Rumah limas adalah rumah adat Indonesia yang juga tergolong cukup menarik, dimana bentuk atap rumah yang mempunyai atap bentuk limas. Dengan gaya arsitektur lantai depan, bertingkat berbentuk panggung.",
        "Rumah adat sowou sesat yang mempunyai arti rumah ibadah, menurut cerita dari warga setempat. Rumah ini didirikan atas keinginan dalam beribadah.",
        "Rumah adat badui, merupakan rumah yang di buat oleh suku badui yang sedang berdiam diri di  banten. Ciri khas rumah adat badui ialah sedikit lebih tinggi seperti rumah panggung akan tetapi tingginya tidak ada setengah meter.",
        "Rumah tanean lanjhan merupakan rumah adat yang berasal dari Madura dan Jawa Timur, Namun jika dinilai dari segi kebudayaan dan juga adat. Memiliki sedikit perbedaan yang mencolok.",
        "Rumah joglo berasal dari jawa tengah, yang merupakan rumah adat dari suku jawa dari bagaian tengah dari pulau jawa. Rumah adat ini, memiliki beberapa bgaian ruangan di dalamnya.",
        "Rumah sunda ialah rumah adat di indonesia ang mempunyai bentuk rumah panggung yang tidak terlalu tinggi. pada bagian depan rumah dat sunda, terdapat tangga atau bisa disebut dengan golodog.",
        "Bangsal koncono adalah rumah adat Indonesia dari Provinsi Jogjakarta, Pada jaman dahulu. Rumah ini hanya ditempat tinggali oleh raja Jawa, dan juga bangsawan kerajaan saja.",
        "Selaso jatuh kembar adalah rumah adat di Indonesia, yang berasal dari Provinsi Riau, berdasarkan sejarah. Rumah adat selaso jatuh kembar, memiliki rumah yang mempunyai dua selasar."
    )

    private val rumahAdatImages = intArrayOf(
        R.drawable.bolon,
        R.drawable.gadang,
        R.drawable.krong_bade,
        R.drawable.rakit_limas,
        R.drawable.panggung_kajang_leko,
        R.drawable.rakyat,
        R.drawable.limas,
        R.drawable.nowou_sesat,
        R.drawable.badui,
        R.drawable.tanean_lanjhan,
        R.drawable.joglo,
        R.drawable.sunda,
        R.drawable.bangsal_kencono,
        R.drawable.selaso_jatuh_kembar
    )

    val listDataRumahAdat: ArrayList<RumahAdat>
        get() {
            val list = arrayListOf<RumahAdat>()
            for (position in rumahAdatNames.indices) {
                val rumahAdat = RumahAdat()
                rumahAdat.nama = rumahAdatNames[position]
                rumahAdat.keterangan = rumahAdatDetails[position]
                rumahAdat.gambar = rumahAdatImages[position]
                list.add(rumahAdat)
            }
            return list
        }
}