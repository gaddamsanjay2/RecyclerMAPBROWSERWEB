package com.example.recyclermapbrowserweb;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterClass extends RecyclerView.Adapter<AdapterClass.TouristVH> {
    Context context;
    List<ModelClass> modelClassList;

    public AdapterClass(Context context, List<ModelClass> modelClassList) {
        this.context = context;
        this.modelClassList = modelClassList;
    }

    @NonNull
    @Override
    public TouristVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.custsom_recycler,parent,false);
        return new TouristVH(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TouristVH holder, int position) {
        ModelClass modelClass=modelClassList.get(position);
        holder.placeimage.setImageResource(modelClassList.get(position).getTimage());
        holder.nameTextview.setText(modelClassList.get(position).getTpname());
        holder.downimageview.setImageResource(modelClassList.get(position).getDownarrow());
        holder.callimageview.setImageResource(modelClassList.get(position).getCall());
        holder.mapimageview.setImageResource(modelClassList.get(position).getMap());
        holder.browsetmageview.setImageResource(modelClassList.get(position).getBrowse());

        boolean isExpand=modelClassList.get(position).isExpand();
        holder.expandableLayout.setVisibility(isExpand ? View.VISIBLE:View.GONE);

      /*  holder.browsetmageview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.lonelyplanet.com/articles/taj-mahal-visitor-limits"));

                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK|Intent.FLAG_ACTIVITY_CLEAR_TASK);
                context.startActivity(intent);



            }
        });*/



    }

    @Override
    public int getItemCount() {
        return modelClassList.size();
    }

    public class TouristVH extends RecyclerView.ViewHolder {
        TextView nameTextview;
        ImageView placeimage,downimageview,callimageview,mapimageview,browsetmageview;
        LinearLayout expandableLayout;


        public TouristVH(@NonNull View itemView) {
            super(itemView);

            placeimage=itemView.findViewById(R.id.touristimageid);
            nameTextview=itemView.findViewById(R.id.touristid);
            downimageview=itemView.findViewById(R.id.downarrowid);
            callimageview=itemView.findViewById(R.id.callid);
            mapimageview=itemView.findViewById(R.id.locationid);
            browsetmageview=itemView.findViewById(R.id.browseid);

            expandableLayout=itemView.findViewById(R.id.expandablelayout);

            downimageview.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ModelClass modelClass=modelClassList.get(getAdapterPosition());
                    modelClass.setExpand(!modelClass.isExpand());
                    notifyItemChanged(getAdapterPosition());
                }
            });
            callimageview.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent=new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+modelClassList.get(getAdapterPosition()).getMobilenumber()));
                    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK|Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    context.startActivity(intent);
                }
            });

            mapimageview.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String label=modelClassList.get(getAdapterPosition()).getTpname();
                    String uriBegin="geo:"+modelClassList.get(getAdapterPosition()).getLatitude()+","+modelClassList.get(getAdapterPosition()).getLatitude();
                    String query=modelClassList.get(getAdapterPosition()).getLatitude()+","+modelClassList.get(getAdapterPosition()).getLongitude()+"("+label+")";
                    String encodedquery=Uri.encode(query);
                    String uriString=uriBegin+"?q="+encodedquery+"&z=16";

                    Uri uri=Uri.parse(uriString);
                    Intent intent=new Intent(Intent.ACTION_VIEW,uri);
                    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK|Intent.FLAG_ACTIVITY_CLEAR_TASK);

                    context.startActivity(intent);
                }
            });
            browsetmageview.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse(modelClassList.get(getAdapterPosition()).getLink()));
                    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK|Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    context.startActivity(intent);
                }
            });
        }
    }
}
