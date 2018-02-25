package com.example.tiara.tiarasabrina_1202150259_modul3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class DaftarAirMineral extends AppCompatActivity {
    private RecyclerView recyclerView; //membuat variable dari recycler view
    private AirMineralAdapter adapt; //membuat variabel dari kelas air mineral adapatr
    public static ArrayList <ItemAirMineral> contain; //membuuat variable arraylist


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_air_mineral);

        //memmbuat isi dari arraylist
        contain = isi();
        recyclerView = (RecyclerView)findViewById(R.id.RecycleItem); //mengisi variabel dgn id RecycleItem
        adapt = new AirMineralAdapter(contain); //mensetting adapter untuk menjalankan contain
        recyclerView.setAdapter(adapt); //set adapter pada recycler view

        int gridColumnCount = getResources().getInteger(R.integer.grid_column_count); //dapatkan integer dari file sumber daya integers.xml

        recyclerView.setLayoutManager(new GridLayoutManager(this, gridColumnCount)); //Mengubah LinearLayoutManager ke GridLayoutManager

    }
    //isi dari ArrayList
    public ArrayList<ItemAirMineral> isi(){
        ArrayList<ItemAirMineral> data = new ArrayList<>();
        data.add(new ItemAirMineral("Aqua","Air mineral merk AQUA","Aqua adalah sebuah merek air minum dalam kemasan (AMDK) yang diproduksi oleh PT Aqua Golden Mississippi Tbk di Indonesia sejak tahun 1973. Selain di Indonesia, Aqua juga dijual di Malaysia, Singapura, dan Brunei. ",R.drawable.aqua));
        data.add(new ItemAirMineral("Pristine","Air mineral merk Pristine","PRISTINE bukan Air Mineral biasa karena PRISTINE bukan hanya sekedar menghilangkan dahaga, tapi juga bermanfaat bagi kesehatan. Dengan proses Ionisasi, suatu prosess dimana memisahkan air dan mineral menjadi ion molekul yang lebih kecil",R.drawable.pristine));
        data.add(new ItemAirMineral("Le Minerale","Air Mineral merk Le Minerale","Le Minerale adalah air mineral baru dari Mayora, berupa air mineral pegunungan yang mengandung mineral alami yang dibutuhkan tubuh sehari-hari.",R.drawable.leminerale));
        data.add(new ItemAirMineral("Cleo","Air Mineral merk Cleo","Cleo adalah air murni berkadar kemurnian 99,99% mengandung oksigen sampai dengan 8mg/L @ 20°C. Air Murni Cleo diambil dari mata air pegunungan dan diproses melalui hyper membrane filter 0,0001 mikron sehingga tidak mengandung mikroorganisme dan mineral anorganik, misalnya chlorine dan natrium fluoride",R.drawable.cleo));
        data.add(new ItemAirMineral("Club","Air Mineral merk Club","CLUB air mineral dalam kemasan erkomitmen untuk menjaga kualitas sumber air agar tidak terkontaminasi dari gangguan peresapan dari lingkungan luar. ",R.drawable.club));
        data.add(new ItemAirMineral("Amidis","Air Mineral merk Amidis","AMIDIS adalah air minum kesehatan yang diproses melalui sistem distilasi atau penyulingan atau penguapan,melalui proses pemanasan hingga 180 derajat celcius sehingga menghasilkan air minum yang murni (NON-MINERAL) tanpa kandungan polutan",R.drawable.amidis));
        data.add(new ItemAirMineral("Equil","Air Mineral merk Equil","Equil sendiri dikemas dalam botol kaca hijau dengan lekuk elegan. Minuman ini memiliki dua varian produk, yaitu natural (tawar) dan sparkling (bersoda). Harganya pun relatif lebih mahal, dengan 1 botol Equil 380 ml setara dengan 20 kali harga air minum kemasan biasa.",R.drawable.equil));
        data.add(new ItemAirMineral("Evian","Air Mineral merk Evian","Evian (pengucapan bahasa Perancis: [evjɑ̃ ]) adalah sebuah merek air mineral Perancis yang berasal dari berbagai sumber dekat Évian-les-Bains, di pesisir selatan Lac Léman. Saat ini Evian dimiliki oleh Groupe Danone, sebuah perusahaan multinasional Perancis.",R.drawable.evian));
        data.add(new ItemAirMineral("Nestle","Air Mineral merk Nestle","Nestle Pure Life, sebagai air minum nomor satu di dunia -berdasar data Zenith Internasional 2009- dan telah tersedia di lebih dari 40 negara, menginformasikan tentang pentingnya masyarakat mengonsumsi air minum yang terjaga higienitasnya dengan level total koloni mikroorganisme",R.drawable.nestle));
        data.add(new ItemAirMineral("Vit","Air Mineral merk Vit","VIT adalah produk air mineral dalam kemasan yang masih satu induk dengan Aqua, diproduksi dari mata air pilihan yang memenuhi standarisasi kebersihannya, diolah dengan teknologi yang terbaik yang menjadikan VIT aman, sehat dan segar untuk di konsumsi.",R.drawable.vit));
        return data;

    }
}
