package helloworld.demo.com.heterogeneousrecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

//import helloworld.demo.com.heterogeneousrecyclerview.Adapter.HorizontalAdapter;
import helloworld.demo.com.heterogeneousrecyclerview.Adapter.MainAdapter;
//import helloworld.demo.com.heterogeneousrecyclerview.Adapter.VerticalAdapter;
//import helloworld.demo.com.heterogeneousrecyclerview.Adapter.VerticalAdapter;
//import helloworld.demo.com.heterogeneousrecyclerview.pojos.HorizontalModel;
//import helloworld.demo.com.heterogeneousrecyclerview.pojos.VerticalModel;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MAIN ACTIVITY";
    private MainAdapter mAdapter;
    private EditText singleline,multiline;
    Button addSingleLine;
    Button addMultiLine;
    List<String>splittedItems = new ArrayList<>();
//    VerticalAdapter adapter1;
//    HorizontalAdapter adapter2;
//    private List<String> verticallist = new ArrayList<>();
//    private List<String>horizontallist = new ArrayList<>();
//  //  ArrayList<Object>items = new ArrayList<>();


 //   ArrayList<Object>objects = new ArrayList<>();
//    private VerticalAdapter mAdapter1;
//    private HorizontalAdapter mAdapter2;
//    ArrayList<VerticalModel> verticallist;
//    ArrayList<HorizontalModel> horizontallist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        singleline = (EditText)findViewById(R.id.edt1);
        multiline = (EditText)findViewById(R.id.edt2);
        addSingleLine = (Button) findViewById(R.id.btn1);
        addMultiLine = (Button) findViewById(R.id.btn2);

        RecyclerView recyclerview = (RecyclerView)findViewById(R.id.rv);
        mAdapter = new MainAdapter(this);
        Log.e(TAG,"main adapter called");
        recyclerview.setLayoutManager(new LinearLayoutManager(this));
        recyclerview.setAdapter(mAdapter);


//        mAdapter1 = new VerticalAdapter(this);
//        Log.e(TAG,"vertical adapter called");
//        recyclerview.setAdapter(mAdapter1);
//        recyclerview.setLayoutManager(new LinearLayoutManager(this));
//
//        mAdapter2 = new HorizontalAdapter(this);
//        recyclerview.setAdapter(mAdapter2);
//        Log.e(TAG,"horizontal adapter called");
//        recyclerview.setLayoutManager(new LinearLayoutManager(this));

        addSingleLine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String singleLineText = singleline.getText().toString();
                if(singleLineText.length() != 0)
                {
                    // adapter1.addItem1(singleLineText);
                    // verticallist.add(singleLineText);
                    // items.add(new VERTICAL(singleLineText));
                    mAdapter.addItem(singleLineText,null,null);
                    mAdapter.notifyDataSetChanged();
                    Log.e(TAG,"adding single line text");
                    //notifyDataSetChanged();
                    //addItem1(singleLineText);
                }
                singleline.getText().clear();
               //getVerticalData();
            }
        });

        addMultiLine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // String text = multiline.getText().toString();
                String multiLineText = multiline.getText().toString();
                if(!multiLineText.contains(","))
                {
                    mAdapter.addItem(null,multiLineText,null);
                    mAdapter.notifyDataSetChanged();

                }
                else if(multiLineText.contains(",")) {
                    String myList[] = multiLineText.split(",");
                    for (String item : myList) {
                        splittedItems.add(item);
                    }
                    mAdapter.addItem(null, null, splittedItems);
                    mAdapter.notifyDataSetChanged();
                }
                    multiline.getText().clear();
                }

//                else if(multiLineText.contains(",")){
//                    modelList.add(multiLineText);
//                    mAdapter.addItem(null,null,modelList);
//
//                }
            //}
        });
    }

//    private void getVerticalData() {
//
//        String singleLineText = singleline.getText().toString();
//        if(singleLineText.length() != 0)
//        {
//            // adapter1.addItem1(singleLineText);
//            // verticallist.add(singleLineText);
//            // items.add(new VERTICAL(singleLineText));
//            mAdapter.addItem(singleLineText,null);
//            mAdapter.notifyDataSetChanged();
//            Log.e(TAG,"adding single line text");
//            //notifyDataSetChanged();
//            //addItem1(singleLineText);
//        }
//        singleline.getText().clear();
//    }
//    public void addItem1(String singleLineText) {
//        VerticalModel verticalModel = new VerticalModel(singleLineText);
//        verticalModel.setText1(singleLineText);
//        Log.e(TAG,"setting single line text");
//        verticallist.add(verticalModel);
//        notifyDataSetChanged();
//    }
//private ArrayList<Object> getObject()
//{
//    objects.add(verticallist);
//    objects.add(horizontallist);
//    return objects;
//}
//public static ArrayList<VerticalModel> getVerticalData()
//{
//    ArrayList<VerticalModel> singleVertical = new ArrayList();
//    singleVertical.add()
//
//    return singleVertical;
//}
//
//    public static ArrayList<HorizontalModel> getHorizontalData()
//    {
//        ArrayList<HorizontalModel> singleHorizontals = new ArrayList<>();
//
//        return singleHorizontals;
//    }
}
