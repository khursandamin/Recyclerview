package com.example.myrecyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.zip.Inflater;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {
    Context context;
    String[] programNameList;
    String[]programDescription;
    public static class ViewHolder extends RecyclerView.ViewHolder{
        TextView rowName;
        TextView rowDescription;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
           rowName=itemView.findViewById(R.id.textView1);
           rowDescription=itemView.findViewById(R.id.textView2);
        }
    }
    public RecyclerAdapter(Context context, String[]programNameList,String[]programDescription){
        this.context=context;
        this.programNameList=programNameList;
        this.programDescription=programDescription;
    }
    @NonNull
    @Override
    public RecyclerAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater= LayoutInflater.from(context);
        View view= inflater.inflate(R.layout.single_item,parent,false);
                ViewHolder viewHolder=new ViewHolder(view);
                return viewHolder;

    }



    @Override
    public void onBindViewHolder(@NonNull RecyclerAdapter.ViewHolder holder, int position) {
        holder.rowName.setText(programNameList[position]);
        holder.rowDescription.setText(programDescription[position]);

    }

    @Override
    public int getItemCount() {
        return programNameList.length;
    }
}
