package csci6907.gwu.list;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Minghao Pu on 9/26/16.
 */

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ViewHolder> {

    private List<ListItem> mdata = null;
    private Context mContext;


    public ListAdapter(Context context, List<ListItem> data) {
        this.mdata = data;
        this.mContext = context;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item,viewGroup,false);
        ViewHolder vh = new ViewHolder(view);
        return vh;
    }
    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int position) {
        viewHolder.mTitleView.setText(mdata.get(position).getTitle());
        viewHolder.mDetailView.setText(mdata.get(position).getDetail());
    }
    @Override
    public int getItemCount() {
        return mdata.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public TextView mTitleView;
        public TextView mDetailView;
        public ViewHolder(View itemView){
            super(itemView);
            mTitleView = (TextView) itemView.findViewById(R.id.item_title);
            mDetailView = (TextView) itemView.findViewById(R.id.item_detail);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            mContext.startActivity(new Intent(mContext, SecondActivity.class));
        }
    }
    public ListItem getItem(int position) {
        return mdata.get(position);
    }

    public long getItemId(int position) {
        return position;
    }


}