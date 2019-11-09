package com.tegarap.rumahadat

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListRumahAdatAdapter(private val listRumahAdat: ArrayList<RumahAdat>) : RecyclerView.Adapter<ListRumahAdatAdapter.ListViewHolder>() {
    private lateinit var onItemClickCallback: OnItemClickCallback

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_row_rumah_adat, viewGroup, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listRumahAdat.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val rumahAdat = listRumahAdat[position]

        Glide.with(holder.itemView.context)
            .load(rumahAdat.gambar)
            .apply(RequestOptions().override(60, 60))
            .into(holder.imgPhoto)

        holder.tvName.text = rumahAdat.nama
        holder.tvDetail.text = rumahAdat.keterangan

        holder.itemView.setOnClickListener { onItemClickCallback.onItemClicked(listRumahAdat[holder.adapterPosition]) }
    }

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: RumahAdat)
    }

    class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_foto)
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_keterangan)
    }
}