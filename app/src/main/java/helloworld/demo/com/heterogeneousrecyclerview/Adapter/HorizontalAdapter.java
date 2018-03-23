package helloworld.demo.com.heterogeneousrecyclerview.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import helloworld.demo.com.heterogeneousrecyclerview.MainActivity;
import helloworld.demo.com.heterogeneousrecyclerview.R;
//import helloworld.demo.com.heterogeneousrecyclerview.pojos.HorizontalModel;
import helloworld.demo.com.heterogeneousrecyclerview.pojos.Model;
//import helloworld.demo.com.heterogeneousrecyclerview.pojos.VerticalModel;
//import helloworld.demo.com.heterogeneousrecyclerview.pojos.VerticalModel;



/**
 * Created by shyamramesh on 02/03/18.
 */

public class HorizontalAdapter extends RecyclerView.Adapter<HorizontalAdapter.MyViewHolder> {

    private static final String TAG = "HORIZONTAL ADAPTER";
    private List<String> modelList = new ArrayList<>();
    //Model model = new Model();
   // private String[] array;
    //private List<HorizontalModel> horizontallist  = new ArrayList<>();
    //private List<Object>items = new ArrayList<>();
    //private Context mContext;


//    public HorizontalAdapter(List<HorizontalModel> horizontallist)
//    {
//        this.horizontallist = horizontallist;
//
//    }

//    public HorizontalAdapter(List<Object> items) {
//        this.items = items;
//    }

//    public HorizontalAdapter(List<HorizontalModel> horizontallist)
//    {
//        this.horizontallist = horizontallist;
//    }

    public HorizontalAdapter(List<String> modelList) {
        this.modelList = modelList;

    }

//    public HorizontalAdapter(String[] array) {
//        this.array = array;
//    }

//    public HorizontalAdapter(Model model) {
//        this.model = model;
//    }

//    public HorizontalAdapter(String[] array) {
//        this.array = array;
//    }


//    public HorizontalAdapter(List<Object> items) {
//    }

//    public HorizontalAdapter(Context context)
//    {
//        this.mContext = context;
//        // this.verticallist = verticallist;
//    }

//    public void addItem2(String multiLineText) {
//      //  HorizontalModel horizontalModel = new HorizontalModel(multiLineText);
//       // horizontalModel.setText2(multiLineText);
//        horizontallist.add(multiLineText);
//        notifyDataSetChanged();
//    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.horizontal_line, parent, false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        //Model model = new Model();
        //List<String>answer = new ArrayList<>();
        //Model model = new Model();
        {//holder.textView.setText((String)model.getText2());

        //holder.textView.setText(modelList.get(position).getText2());
//        String[] str1 = modelList.get(position).getArray();
//        if(str1 != null)
//        for (String str2 : str1 )
//            for (String s : str2.split(",")) {
                //answer.add(s);
               // model.setMultipleText(s);
                holder.textView.setText(modelList.get(position));
            }
        //holder.textView.setText(modelList.get(position).getMultipleText());
               // holder.textView.setText((String[]) modelList.get(position).getArray());
       // modelList.get(position).getArray();
                //holder.textView.setText(answer.toArray(new String[answer.size()]));
          //  }


    }

    @Override
    public int getItemCount() {
        Log.e(TAG,"returning horizontal data");
      //  return items.size();
        return modelList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView textView;


        public MyViewHolder(View v) {
            super(v);
             textView = (TextView) v.findViewById(R.id.txt2);

        }
    }
}
