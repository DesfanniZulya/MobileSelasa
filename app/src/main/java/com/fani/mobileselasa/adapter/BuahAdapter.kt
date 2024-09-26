package com.fani.mobileselasa.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.fani.mobileselasa.CustomImageRecycleView
import com.fani.mobileselasa.DetailBuahActivity
import com.fani.mobileselasa.PhotoDetailActivity
import com.fani.mobileselasa.R
import com.fani.mobileselasa.model.ModelBuah


class BuahAdapter(
    val itemList: ArrayList<ModelBuah>,
   private val getActivity: CustomImageRecycleView
) :
    RecyclerView.Adapter<BuahAdapter.ModelViewHolder>() {

    // ViewHolder class
    class ModelViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
       lateinit var itemImage: ImageView
      lateinit var itemText: TextView


        init {
            itemImage = itemView.findViewById(R.id.gambar) as ImageView
            itemText = itemView.findViewById(R.id.nama) as TextView
        }
    }


    // Create new views (invoked by the layout manager)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ModelViewHolder {
        val nView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_customeimage, parent, false)
        return ModelViewHolder(nView)
    }

    // Return the size of your dataset
    override fun getItemCount(): Int {
        return itemList.size
    }

    // Replace the contents of a view (invoked by the layout manager)
    override fun onBindViewHolder(holder: ModelViewHolder, position: Int) {

        holder.itemImage.setImageResource(itemList[position].image)
        holder.itemText.setText(itemList[position].deskripsi)


        // Set an onClickListener to start a new activity
        holder.itemView.setOnClickListener {
            //deklarasi intent
            val intent = Intent(getActivity, DetailBuahActivity::class.java)
            //baru put extra variable yang ingin dilempar
            intent.putExtra("deskripsi", itemList[position].deskripsi)
            intent.putExtra("image", itemList[position].image)
            //passed ke detail
            getActivity.startActivity(intent)
        }
    }
}