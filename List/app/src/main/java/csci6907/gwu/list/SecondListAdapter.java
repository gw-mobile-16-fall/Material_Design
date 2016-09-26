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

public class SecondListAdapter extends RecyclerView.Adapter<SecondListAdapter.ViewHolder> {

    private List<SecondListItem> mdata = null;


    public SecondListAdapter(List<SecondListItem> data) {
        this.mdata = data;
    }
    @Override
    public SecondListAdapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_sec,viewGroup,false);
        SecondListAdapter.ViewHolder vh = new SecondListAdapter.ViewHolder(view);
        return vh;
    }
    @Override
    public void onBindViewHolder(SecondListAdapter.ViewHolder viewHolder, int position) {
        viewHolder.mContentView.setText(mdata.get(position).getContent());
    }
    @Override
    public int getItemCount() {
        return mdata.size();
    }
    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView mContentView;
        public ViewHolder(View itemView){
            super(itemView);
            mContentView = (TextView) itemView.findViewById(R.id.item_content);
        }
    }
    public SecondListItem getItem(int position) {
        return mdata.get(position);
    }

    public long getItemId(int position) {
        return position;
    }
}
