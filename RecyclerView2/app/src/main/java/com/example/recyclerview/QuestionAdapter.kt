package com.example.recyclerview

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.databinding.RecyclerRowBinding

class QuestionAdapter(val questionList:ArrayList<Question>):RecyclerView.Adapter<QuestionAdapter.QuestionHolder>(){
    class QuestionHolder(val binding: RecyclerRowBinding):RecyclerView.ViewHolder(binding.root){
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): QuestionHolder {
        val binding= RecyclerRowBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return QuestionHolder(binding)
    }

    override fun getItemCount(): Int {
        return questionList.size
    }

    override fun onBindViewHolder(holder: QuestionHolder, position: Int) {
        holder.binding.recyclerTextView.text=questionList.get(position).proqram
        holder.binding.imgview.setImageResource(questionList.get(position).image)


        holder.itemView.setOnClickListener{
            val intent= Intent(holder.itemView.context,DetailsActivity::class.java)
            intent.putExtra("question",questionList.get(position))
            holder.itemView.context.startActivity(intent)
        }
    }
}