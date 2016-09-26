package csci6907.gwu.list;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class SecondActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private SecondListAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //get the view of recylcerview
        mRecyclerView = (RecyclerView)findViewById(R.id.recycler_view_2);

        // set recylcerview layout
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        // set recylcerview animation
        mRecyclerView.setItemAnimator( new DefaultItemAnimator());

        // bind adapter
        mAdapter = new SecondListAdapter(getData());
        mRecyclerView.setAdapter(mAdapter);
    }

    // create dummy dataset
    public  static List<SecondListItem> getData(){
        List<SecondListItem> models = new ArrayList<SecondListItem>();
        for (int i = 1; i <= 50; i++) {
            SecondListItem item = new SecondListItem("This is Item " + i + " of Second List");
            models.add(item);
        }
        return  models;
    }
}
