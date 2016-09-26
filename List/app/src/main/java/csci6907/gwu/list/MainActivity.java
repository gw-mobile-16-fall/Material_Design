package csci6907.gwu.list;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView1;
    private ListAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //get the view of recylcerview
        mRecyclerView1 = (RecyclerView)findViewById(R.id.recycler_view_1);

        // set recylcerview layout
        mRecyclerView1.setLayoutManager(new LinearLayoutManager(this));

        // set recylcerview animation
        mRecyclerView1.setItemAnimator( new DefaultItemAnimator());

        // bind adapter
        mAdapter = new ListAdapter(this, getData());
        mRecyclerView1.setAdapter(mAdapter);
    }

    // create dummy dataset
    public  static List<ListItem> getData(){
        List<ListItem> models = new ArrayList<ListItem>();
        for (int i = 1; i <= 50; i++) {
            ListItem item = new ListItem("Item" + i,"This is the detail fo item" + i);
            models.add(item);
        }
        return  models;
    }
}
