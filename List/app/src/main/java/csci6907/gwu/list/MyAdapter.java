package csci6907.gwu.list;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Minghao Pu on 9/26/16.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private List<ListItem> mdata = null;
    private LayoutInflater inflater;


    public MyAdapter(List<ListItem> data) {
        this.mdata = data;
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
    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView mTitleView;
        public TextView mDetailView;
        public ViewHolder(View itemView){
            super(itemView);
            mTitleView = (TextView) itemView.findViewById(R.id.item_title);
            mDetailView = (TextView) itemView.findViewById(R.id.item_detail);
        }
    }
    public ListItem getItem(int position) {
        return mdata.get(position);
    }

    public long getItemId(int position) {
        return position;
    }
}