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

/**
 * This is the adapter class for the list
 */
public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ViewHolder> {

    private List<ListItem> mdata = null;
    private Context mContext;

    // initiate the adapter
    public ListAdapter(Context context, List<ListItem> data) {
        this.mdata = data;
        this.mContext = context;
    }
    @Override
    //create the view of the item and store in temporal space
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {

        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item,viewGroup,false);
        ViewHolder vh = new ViewHolder(view);
        return vh;
    }

    // bind the view with the data from dataset
    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int position) {
        viewHolder.mTitleView.setText(mdata.get(position).getTitle());
        viewHolder.mDetailView.setText(mdata.get(position).getDetail());
    }
    @Override
    //return the total number of item in the dataset
    public int getItemCount() {
        return mdata.size();
    }

    //create the viewholder class
    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public TextView mTitleView;
        public TextView mDetailView;

        // constructor of item viewholder
        public ViewHolder(View itemView){
            super(itemView);
            mTitleView = (TextView) itemView.findViewById(R.id.item_title);
            mDetailView = (TextView) itemView.findViewById(R.id.item_detail);

            // expose the click function to the view
            itemView.setOnClickListener(this);
        }

        @Override
        // add click function for each item
        public void onClick(View v) {
            // create a new activity which jump to the second list
            mContext.startActivity(new Intent(mContext, SecondActivity.class));
        }
    }

    // return the item in certain position
    public ListItem getItem(int position) {
        return mdata.get(position);
    }
    // return the id of item in certain position
    public long getItemId(int position) {
        return position;
    }


}