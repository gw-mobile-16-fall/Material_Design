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

        mRecyclerView = (RecyclerView)findViewById(R.id.recycler_view_2);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.setItemAnimator( new DefaultItemAnimator());

        mAdapter = new SecondListAdapter(getData());
        mRecyclerView.setAdapter(mAdapter);
    }
    public  static List<SecondListItem> getData(){
        List<SecondListItem> models = new ArrayList<SecondListItem>();
        for (int i = 1; i <= 50; i++) {
            SecondListItem item = new SecondListItem("This is Item" + i + "Second List");
            models.add(item);
        }
        return  models;
    }
}
