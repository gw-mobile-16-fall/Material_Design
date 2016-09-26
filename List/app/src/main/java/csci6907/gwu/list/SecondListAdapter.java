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

/**
 * This is the adapter class for the second list
 */
public class SecondListAdapter extends RecyclerView.Adapter<SecondListAdapter.ViewHolder> {

    private List<SecondListItem> mdata = null;

    // initiate the adapter
    public SecondListAdapter(List<SecondListItem> data) {
        this.mdata = data;
    }
    @Override

    //create the view of the item and store in temporal space
    public SecondListAdapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_sec,viewGroup,false);
        SecondListAdapter.ViewHolder vh = new SecondListAdapter.ViewHolder(view);
        return vh;
    }
    @Override
    // bind the view with the data from dataset
    public void onBindViewHolder(SecondListAdapter.ViewHolder viewHolder, int position) {
        viewHolder.mContentView.setText(mdata.get(position).getContent());
    }
    @Override
    //return the total number of item in the dataset
    public int getItemCount() {
        return mdata.size();
    }

    //create the viewholder class
    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView mContentView;

        // constructor of item viewholder
        public ViewHolder(View itemView){
            super(itemView);
            mContentView = (TextView) itemView.findViewById(R.id.item_content);
        }
    }

    // return the item in certain position
    public SecondListItem getItem(int position) {
        return mdata.get(position);
    }

    // return the id of item in certain position
    public long getItemId(int position) {
        return position;
    }
}
