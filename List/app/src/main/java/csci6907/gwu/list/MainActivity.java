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
    private MyAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView1 = (RecyclerView)findViewById(R.id.recycler_view_1);
        mRecyclerView1.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView1.setItemAnimator( new DefaultItemAnimator());

        mAdapter = new MyAdapter(getData());
        mRecyclerView1.setAdapter(mAdapter);
    }
    public  static List<ListItem> getData(){
        List<ListItem> models = new ArrayList<ListItem>();
        for (int i = 1; i <= 50; i++) {
            ListItem item = new ListItem("Item" + i,"This is the detail fo item" + i);
            models.add(item);
        }
        return  models;
    }
}
