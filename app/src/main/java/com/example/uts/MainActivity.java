package com.example.uts;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private List<Item> itemList;
    private ItemAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Inisialisasi RecyclerView
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Inisialisasi list item
        itemList = new ArrayList<>();
        addItemToList();

        // Inisialisasi adapter
        adapter = new ItemAdapter(itemList);
        recyclerView.setAdapter(adapter);
    }

    private void addItemToList() {
        // Tambahkan item ke list
        itemList.add(new Item("Nadeo Argawinata", "Posisi: Penjaga Gawang\nTanggal Lahir: 9 Maret 1997 (26 tahun)\nTinggi Badan: 187 cm\nKlub: Borneo FC Samarinda", R.drawable.nadeo));
        itemList.add(new Item("Ernando Ari Sutaryadi", "Posisi: Penjaga Gawang\nTempat Lahir: Semarang, Indonesia\nTanggal Lahir: 2 Februari 2002 (21 tahun)\nKebangsaan: Indonesia\nKlub: Persebaya Surabaya\nNo Punggung: 21\nTinggi: 178 cm", R.drawable.ernando));
        itemList.add(new Item("Justin Quincy Hubner", "Tanggal lahir: 14 Sep 2003 (20)\nTempat kelahiran: Den Bosch Belanda\nTinggi: 1,87 m\nKebangsaan: Indonesia Belanda\nPosisi: Bek-Tengah\nKlub Saat Ini: Cerezo Osaka", R.drawable.justin));
        itemList.add(new Item("Rizky Ridho Ramadhani", "Tanggal lahir: 21 November 2001 (umur 22)\nTempat lahir: Surabaya, Indonesia\nKebangsaan: Indonesia\nTinggi: 182 cm\nPosisi: Bek tengah\nKlub: Persija Jakarta", R.drawable.rizky));
        itemList.add(new Item("Jordi Amat", "Posisi: Bek\nTanggal Lahir: 21 Maret 1992 (31 tahun)\nTinggi Badan: 184 cm\nKlub: Johor Darul Takzim FC", R.drawable.jordi));
        itemList.add(new Item("Pratama Arhan", "Posisi: Bek\nTanggal Lahir: 21 Desember 2001 (22 tahun)\nTinggi Badan: 172 cm\nKlub: Tokyo Verdy", R.drawable.pratama));
        itemList.add(new Item("Ivar Jenner", "Posisi: Gelandang\nTanggal Lahir: 10 Januari 2004 (20 tahun)\nTinggi Badan: 188 cm\nKlub: Jong Ultrecht", R.drawable.ivar));
        itemList.add(new Item("Ricky Kambuaya", "Posisi: Gelandang\nTanggal Lahir: 5 Mei 1996 (27 tahun )\nTinggi Badan: 172 cm\nKlub: Dewa United", R.drawable.ricky));
        itemList.add(new Item("Egy Maulana Vikri", "Posisi: Gelandang\nTanggal Lahir: 7 Juli 2000 ( 23 tahun )\nTinggi Badan: 170 cm\nKlub: Dewa United", R.drawable.egy));
        itemList.add(new Item("Witan Sulaeman", "Posisi: Gelandang\nTanggal Lahir: 8 Oktober 2001 (22 tahun )\nTinggi Badan: 170 cm\nKlub: Persija Jakarta", R.drawable.witan));
        itemList.add(new Item("Marselino Ferdinan", "Posisi: Gelandang\nTanggal Lahir: 9 September 2004 (19 tahun)\nTinggi Badan: 176 cm\nKlub: KMSK Deinze", R.drawable.marselino));
        itemList.add(new Item("Yakob Sayuri", "Posisi: Gelandang\nTanggal Lahir: 22 September 1997 (26 tahun)\nTinggi Badan: 168 cm\nKlub: PSM Makassar", R.drawable.yakob));
        itemList.add(new Item("Rafael Struick", "Posisi: Penyerang\nTanggal Lahir: 27 Maret 2003 (20 tahun)\nTinggi Badan: 187 cm\nKlub: ADO Den Haag", R.drawable.rafael));
        itemList.add(new Item("Hokky Caraka", "Posisi: Penyerang\nTanggal Lahir: 21 Agustus 2004 (19 tahun)\nTinggi Badan: 178 cm\nKlub: PSS Sleman", R.drawable.hokky));
        itemList.add(new Item("Ramadhan Sananta", "Posisi: Penyerang\nTanggal Lahir: 27 November 2002 (21 tahun)\nTinggi Badan: 182 cm\nKlub: Persis Solo", R.drawable.ramadhan));
        itemList.add(new Item("Elkan Baggott", "Posisi: Bek\nTanggal Lahir: 23 Oktober 2002 (21 tahun)\nTinggi: 194 cm\nKlub: Ipswich Town", R.drawable.elkan));
    }

    private class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ItemViewHolder> {
        private List<Item> itemList;

        public ItemAdapter(List<Item> itemList) {
            this.itemList = itemList;
        }

        @NonNull
        @Override
        public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.itemlayout, parent, false);
            return new ItemViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {
            Item currentItem = itemList.get(position);
            holder.textViewName.setText(currentItem.getName());
            holder.textViewDetails.setText(currentItem.getDetails());
            holder.imageViewItem.setImageResource(currentItem.getImageResourceId());
        }

        @Override
        public int getItemCount() {
            return itemList.size();
        }

        class ItemViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
            TextView textViewName, textViewDetails;
            ImageView imageViewItem;

            ItemViewHolder(View itemView) {
                super(itemView);
                textViewName = itemView.findViewById(R.id.textViewName);
                textViewDetails = itemView.findViewById(R.id.textViewDetails);
                imageViewItem = itemView.findViewById(R.id.imageViewItem);
                itemView.setOnClickListener(this);
            }

            @Override
            public void onClick(View view) {
                int position = getAdapterPosition();
                Item item = itemList.get(position);

                // Meneruskan data yang diperlukan ke aktivitas Detail
                Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                intent.putExtra("itemName", item.getName());
                intent.putExtra("itemDetails", item.getDetails());
                intent.putExtra("itemImage", item.getImageResourceId());
                MainActivity.this.startActivity(intent);
            }
        }
    }
}
