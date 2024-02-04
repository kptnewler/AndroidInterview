package com.newler.androidinterview.view.textview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.newler.androidinterview.R
import com.newler.androidinterview.databinding.AutoSizeTextItemViewLayoutBinding

class AutoSizeTextActivityActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auto_size_text)
    }

    class TextAdapter: RecyclerView.Adapter<ViewHolder>() {
        class ViewHolder(private val itemView: View): RecyclerView.ViewHolder(itemView) {
            private val binding = AutoSizeTextItemViewLayoutBinding.bind(itemView)

            private fun setText(text: String) {

            }
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        }

        override fun getItemCount(): Int {
        }

        override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        }
    }
}