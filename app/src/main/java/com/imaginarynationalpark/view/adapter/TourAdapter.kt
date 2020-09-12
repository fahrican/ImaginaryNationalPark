package com.imaginarynationalpark.view.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.imaginarynationalpark.R
import com.imaginarynationalpark.databinding.ItemTourBinding
import com.imaginarynationalpark.model.Item

class TourAdapter : ListAdapter<Item, TourViewHolder>(TourDiffUtil()) {

    private lateinit var viewGroupContext: Context

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TourViewHolder {
        viewGroupContext = parent.context
        val itemArticleBinding: ItemTourBinding = DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            R.layout.item_tour,
            parent,
            false
        )
        return TourViewHolder(itemArticleBinding)
    }

    override fun onBindViewHolder(holder: TourViewHolder, position: Int) {
        holder.itemTourBinding.item = getItem(position)
        holder.itemTourBinding.itemCard.setOnClickListener {
            setIntentForNewsDetail(getItem(position))
        }
    }

    private fun setIntentForNewsDetail(item: Item) {
        /*val tourDetailIntent = Intent(viewGroupContext, NewsDetailActivity::class.java)
        if (article.urlToImage == null) {
            article.urlToImage = DUCK_DUCK_GO_PICTURE
            tourDetailIntent.putExtra(ARTICLE, article)
        } else {
            tourDetailIntent.putExtra(ARTICLE, article)
        }
        viewGroupContext.startActivity(tourDetailIntent)*/
    }

}

class TourViewHolder(
    val itemTourBinding: ItemTourBinding
) : RecyclerView.ViewHolder(itemTourBinding.root)

class TourDiffUtil : DiffUtil.ItemCallback<Item>() {

    override fun areItemsTheSame(oldItem: Item, newItem: Item): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: Item, newItem: Item): Boolean {
        return oldItem == newItem
    }

}