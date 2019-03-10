package com.example.novel;

import android.content.Context;


import java.util.ArrayList;
import java.util.List;

public class NovelPresenter {
    Context context;
    List<ModelNovel> modelNovels = new ArrayList<>();
    MainView view;
    public NovelPresenter (MainView view,Context context){
        this.view = view;
        this.context = context;
    }

    public void setData(){
        ModelNovel novel;

        novel = new ModelNovel( "Edensor",R.drawable.edensor, "Berbeda dengan latar cerita dari Laskar Pelangi dan Sang Pemimpi, Edensor mengambil latar di luar negeri saat tokoh-tokoh utamanya, Ikal dan Arai mendapat beasiswa dari Uni Eropa untuk kuliah S2 di Prancis. Dalam Edensor, Andrea tetap dengan ciri khasnya, menulis kisah ironi menjadi parodi dan menertawakan kesedihan dengan balutan pandangan intelegensia tentang culture shock ketika kedua tokoh utama tersebut yang berasal dari pedalaman Melayu di Pulau Belitong tiba-tiba berada di Paris. Mimpi-mimpi untuk menjelajah Eropa sampai Afrika dan menemukan keterkaitan yang tak terduga dari peristiwa-peristiwa dari masa lalu mereka berdua.Dan pencarian akan cinta sejati menjadi motivasi yang menyemangati penjelajahan mereka dari bekunya musim dingin di daratan Rusia di Eropa sampai panas kering di gurun Sahara.");
        modelNovels.add(novel);
        novel = new ModelNovel("Sang Pemimpi", R.drawable.sangpemimp, "Sang Pemimpi adalah novel kedua dalam tetralogi Laskar Pelangi karya Andrea Hirata yang diterbitkan oleh Bentang Pustaka pada Juli 2006. Dalam novel ini, Andrea mengeksplorasi hubungan persahabatannya dengan dua anak yatim piatu, Arai Ichsanul Mahidin dan Jimbron, serta kekuatan mimpi yang dapat membawa Andrea dan Arai melanjutkan studi ke Sorbonne, Paris, Prancis.\n" +
                "\n" +
                "Dalam novel Sang Pemimpi, Andrea Hirata bercerita tentang kehidupannya di Belitong pada masa SMA. Tiga tokoh utama dalam karya ini adalah Ikal, Arai dan Jimbron. Ikal tidak lain adalah Andrea Hirata sendiri, sedangkan Arai Ichsanul Mahidin adalah saudara jauhnya yang menjadi yatim piatu ketika masih kecil. Arai disebut simpai keramat karena dalam keluarganya ia adalah orang terakhir yang masih hidup dan ia pun diangkat menjadi anak oleh ayah Ikal. Jimbron merupakan teman Arai dan Ikal yang sangat terobsesi dengan kuda dan gagap bila sedang antusias terhadap sesuatu atau ketika gugup. Ketiganya melewati kisah persahabatan yang terjalin dari kecil hingga mereka bersekolah di SMA Negeri Bukan Main, SMA pertama yang berdiri di Belitung bagian timur.");
        modelNovels.add(novel);
        novel = new ModelNovel("Maryamah Karpov",R.drawable.maryamahkarpo ,"Maryamah Karpov adalah novel keempat karya Andrea Hirata yang diterbitkan oleh Bentang Pustaka pada November 2008. Maryamah Karpov merupakan buku terakhir dari Tetralogi Laskar Pelangi dan terdiri dari 2 buku , bagian pertamanya dengan sub judul : Mimpi-Mimpi Lintang. Di buku ini rencananya Andrea akan mengisahkan tentang Arai, Lintang, A Ling, dan beberapa pertanyaan yang belum sempat terjawab di 3 buku terdahulu.\n" +
                "\n" +
                "Maryamah Karpov dirilis pada tanggal 28 November 2008 di toko buku MP Book Point, Jakarta, dan beredar secara resmi mulai tanggal 29 November 2008.Launching buku ini mendapatkan expose yang cukup besar dari media massa dan mendapat perhatian banyak dari khalayak pecinta buku terutama oleh penggemar tetralogi Laskar Pelangi.");
        modelNovels.add(novel);
        novel = new ModelNovel("Ayah",R.drawable.ayahh ,"Betapa Sabari menyayangi Zorro. Ingin dia memeluknya sepanjang waktu. Dia terpesona melihat makhluk kecil yang sangat indah dan seluruh kebaikan yang terpancar\n" +
                "darinya. Diciuminya anak itu dari kepala sampai ke jari-jemari kakinya yang mungil. Kalau malam Sabari susah susah tidur lantaran membayangkan bermacam rencana\n" +
                "yang akan dia lalui dengan anaknya jika besar nanti. Dia ingin mengajaknya melihat pawai 17 Agustus, mengunjungi pasar malam, membelikannya mainan,\n" +
                "menggandengnya ke masjid, mengajarinya berpuasa dan mengaji, dan memboncengnya naik sepeda saban sore ke taman kota");
        modelNovels.add(novel);
        novel = new ModelNovel("Padang Bulan",R.drawable.padangbulann ,"Melalui pergolakan nasib seorang perempuan dan huru-hara kecemburuan, Andrea Hirata kembali memilih sudut yang tidak terduga untuk menampilkan kisah yang inspiratif tentang kegigihan karakter-karakter di dalam novelnya. Novel Padang Bulan bermula dari kisah seorang gadis kecil berusia 14 tahun, Enong namanya, yang sangat gemar pada pelajaran bahasa Inggris, namun secara mendadak terpaksa harus berhenti sekolah dan mengambil alih seluruh tanggung jawab keluarga. Tersambung pada sekuel novel ini, Cinta di Dalam Gelas, perjalanan nasib anak perempuan kecil itu, melalui gaya khasnya: menertawakan kepedihan, memarodikan tragedi, mengkritik tanpa menjadi sarkastik, kisah Enong menjadi seperti panggung di dalam lembaran-lembaran kertas. Membaca novel ini seperti melihat sebuah gambar. ");
        modelNovels.add(novel);
        novel = new ModelNovel("Danur",R.drawable.danurr ,"Jangan heran jika mendapatiku sedang berbicara sendirian atau tertawa tanpa seorang pun terlihat sedang bersamaku. Saat itu. mungkin saja aku sedang bersama salah satu dari lima sahabatku.\n" +
                "\n" +
                "Kalian mungkin tak melihatnya.... Wajar. Mereka memang tak kasat mata dan sering disebut... hantu. Ya, mereka adalah hantu, jiwa-jiwa penasaran atas kehidupan yang dianggap mereka tidak adil.\n" +
                "\n" +
                "Kelebihanku dapat melihat mereka adalah anugerah sekaligus kutukanku. Kelebihan ini membawaku ke dalam persahabatan unik dengan lima anak hantu Belanda. Hari-hariku dilewati dengan canda tawa Peter, pertengkaran Hans dan Hendrick—dua sahabat yang sering berkelahi—alunan lirih biola William, dan tak lupa: rengekan si Bungsu Johnsen.\n" +
                "\n" +
                "Jauh dari kehidupan \"normal\" adalah harga yang harus dibayar atas kebahagiaanku bersama mereka. Dan semua itu harus berubah ketika persahabatan kami meminta lebih. yaitu kebersamaan selamanya. Aku tak bisa memberi itu. Aku mulai menyadari bahwa hidupku bukan hanya milikku seorang....\n" +
                "\n" +
                "Namaku Risa. Aku bisa melihat 'mereka'. \n" +
                "\n" +
                "Dan 'mereka', sesungguhnya, hanya butuh didengar.\n");
        modelNovels.add(novel);





        view.onSucsess(modelNovels);

    }
}
