package com.example.recycle

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.snackbar.Snackbar

class MeyveAdapter(var mContext:Context, var MeyvelerListesi:List<Meyveler>)
    :RecyclerView.Adapter<MeyveAdapter.CartTasarimTutucu>(){


    inner class CartTasarimTutucu (view:View):RecyclerView.ViewHolder(view){

        var imageViewMeyveResim:ImageView
        var textViewFiyat:TextView
        var textViewUrunAd:TextView
        var textViewGram:TextView
        var imageViewArti:ImageView

        init {
            imageViewMeyveResim = view.findViewById(R.id.imageViewMeyveResim)
            textViewFiyat = view.findViewById(R.id.textViewFiyat)
            textViewUrunAd = view.findViewById(R.id.textViewUrunAd)
            textViewGram = view.findViewById(R.id.textViewGram)
            imageViewArti = view.findViewById(R.id.imageViewArti)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CartTasarimTutucu {

        val tasarim = LayoutInflater.from(mContext).inflate(R.layout.card_tasarim,parent,false)
        return CartTasarimTutucu(tasarim)
    }

    override fun onBindViewHolder(holder: CartTasarimTutucu, position: Int) {
        val meyve = MeyvelerListesi.get(position)

        holder.textViewFiyat.text = "₺${meyve.meyve_fiyat}"
        holder.textViewUrunAd.text = "${meyve.meyve_ad}"
        holder.textViewGram.text = "${meyve.meyve_gram}"

        holder.imageViewMeyveResim.setImageResource(
            mContext.resources.getIdentifier(meyve.meyveResim_ad,"drawable",mContext.packageName))

        holder.imageViewArti.setOnClickListener {
            Snackbar.make(it, "${meyve.meyve_ad} Sepete eklendi.", Snackbar.LENGTH_LONG).show()
        }


    }

    override fun getItemCount(): Int {
        return MeyvelerListesi.size
    }

}