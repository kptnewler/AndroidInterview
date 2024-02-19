package com.newler.androidinterview.view.textview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.newler.androidinterview.R
import com.newler.androidinterview.databinding.ActivityAutoSizeTextBinding
import com.newler.androidinterview.databinding.AutoSizeTextItemViewLayoutBinding

class AutoSizeTextActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityAutoSizeTextBinding.inflate(layoutInflater, null, false)
        setContentView(binding.root)
        val textList = MutableList(50) { "title $it" }
        val adapter = TextAdapter(textList)

        binding.recyclerView.let {
            it.adapter = adapter
            it.layoutManager =
                LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        }
    }

    class TextAdapter(private val texts: List<String>): RecyclerView.Adapter<ViewHolder>() {
        class ViewHolder(private val itemView: View): RecyclerView.ViewHolder(itemView) {
            private val binding = AutoSizeTextItemViewLayoutBinding.bind(itemView)

            fun setText(text: String) {
                binding.title.text = text
            }
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
            return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.auto_size_text_item_view_layout, parent, false))
        }

        override fun getItemCount(): Int = texts.size

        override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
            if (holder is ViewHolder) {
                holder.setText(texts[position])
            }
        }
    }
}