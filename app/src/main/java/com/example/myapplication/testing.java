//
//SOMNATH sends you a file:
//        RecyclerViewAll.zip (110.58 KB)
//        Interrupted
//
//        SOMNATH
//        (4:06:51 PM) package Adapter;
//
//import android.annotation.SuppressLint;
//import android.app.Activity;
//import android.content.Context;
//import android.content.Intent;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.ImageView;
//import android.widget.ProgressBar;
//import android.widget.TextView;
//import android.widget.Toast;
//
//import androidx.annotation.NonNull;
//import androidx.fragment.app.FragmentManager;
//import androidx.recyclerview.widget.RecyclerView;
//
//import com.news.sankhep.R;
//import com.news.sankhep.activity.BookmarkActivity;
//import com.news.sankhep.activity.HomeActivity;
//import com.news.sankhep.activity.WebviewActivity;
//import com.squareup.picasso.Picasso;
//
//import java.util.List;
//
//import Models.NewsList;
//import Utilites.BottomSheetDialog;
//import Utilites.MyPrefernces;
//
//public class BookmarkAdapter extends RecyclerView.Adapter<BookmarkAdapter.ViewHolder>{
//
//    List<NewsList> newsList;
//    Context ctx;
//    MyPrefernces myPrefernces;
//    Activity activity;
//    FragmentManager fragmentManager;
//
//    public BookmarkAdapter(List<NewsList> newsList, Context context, Activity activity, FragmentManager supportFragmentManager) {
//        this.newsList = newsList;
//        this.ctx = context;
//        this.activity = activity;
//        this.fragmentManager = supportFragmentManager;
//    }
//
//    @NonNull
//    @Override
//    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.bookmark_item, parent,false);
//        return new ViewHolder(view);
//    }
//
//    @Override
//    public void onBindViewHolder(@NonNull ViewHolder holder, @SuppressLint("RecyclerView"int position) {
//
//
//        if (newsList.get(position).getNewsContentType().equals("raw") {
//            Picasso.get()
//                    .load(R.drawable.vb)
//                    .into(holder.imagesview);
//
//        }
//        else if (newsList.get(position).getNewsContentType().equals("youtube") {
//            Picasso.get()
//                    .load(R.drawable.ybg)
//                    .into(holder.imagesview);
//
//
//            holder.imagesview.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View view) {
//                    Intent intent = new Intent(ctx, WebviewActivity.class);
//                    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//                    intent.putExtra("url", newsList.get(position).getNewsImageVideoLink());
//                    ctx.startActivity(intent);
//                    //Toast.makeText(ctx, "Youtube clicked", Toast.LENGTH_SHORT).show();
//                }
//            });
//
//
//        } else {
//            Picasso.get()
//                    .load(newsList.get(position).getNewsImageVideoLink())
//                    .placeholder(R.drawable.loading)
//                    .error(R.drawable.errorloading)
//                    .into(holder.imagesview);
//        }
//
//
//        holder.newsHeading.setText(newsList.get(position).getNewsHeadline1());
//        myPrefernces= new MyPrefernces(ctx);
//
//        holder.unbookmark.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                BottomSheetDialog bottomSheet = new BottomSheetDialog(newsList, position);
//                bottomSheet.show(fragmentManager,
//                        "ModalBottomSheet";
//            }
//        });
//    }
//
//    @Override
//    public int getItemCount() {
//        return newsList.size();
//    }
//
//    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
//        ImageView imagesview, unbookmark;
//        TextView newsHeading;
//
//        public ViewHolder (@NonNull View itemView) {
//            super(itemView);
//            itemView.setOnClickListener(this);
//            imagesview = itemView.findViewById(R.id.images);
//            newsHeading =itemView.findViewById(R.id.tx54e2);
//            unbookmark = itemView.findViewById(R.id.img7825re);
//
//        }
//
//        @Override
//        public void onClick(View view) {
//            Toast.makeText(ctx, "Book mark Cliekd", Toast.LENGTH_SHORT).show();
//            Intent intent = new Intent(ctx, HomeActivity.class);
//            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//            intent.putExtra("id", newsList.get(getAbsoluteAdapterPosition()).getId());
//            ctx.startActivity(intent);
//        }
//
//    }
//
//
//}
