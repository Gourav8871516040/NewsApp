package com.example.newsapp.topheadlines;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.newsapp.R;

import java.util.List;

public class TopHeadlinesAdapter extends RecyclerView.Adapter<TopHeadlinesAdapter.ViewHolder> {

    List<TopHeadlinesModel> topHeadlinesModelList;
    Context context;
    private RecyclerViewClickListener listener;

    public TopHeadlinesAdapter(List<TopHeadlinesModel> topHeadlinesModelList, Context context , RecyclerViewClickListener listener) {
        this.topHeadlinesModelList = topHeadlinesModelList;
        this.context = context;
        this.listener=listener;
    }

    @NonNull
    @Override
    public TopHeadlinesAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.top_headlines_item_layout,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TopHeadlinesAdapter.ViewHolder holder, int position) {

        holder.title.setText(topHeadlinesModelList.get(position).getTitle());
        holder.desc.setText(topHeadlinesModelList.get(position).getDesc());
        holder.source.setText(topHeadlinesModelList.get(position).getSource());

    }

    @Override
    public int getItemCount() {
        return topHeadlinesModelList.size();
    }

    public interface RecyclerViewClickListener{
        void onClick(View v, int position);
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView title, desc, source;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.top_headline_title);
            desc = itemView.findViewById(R.id.top_headline_description);
            source = itemView.findViewById(R.id.top_headline_source_name);
            itemView.setOnClickListener(this::onClick);

        }

        public void onClick(View v) {
            listener.onClick(itemView, getAdapterPosition());
        }
    }


}
