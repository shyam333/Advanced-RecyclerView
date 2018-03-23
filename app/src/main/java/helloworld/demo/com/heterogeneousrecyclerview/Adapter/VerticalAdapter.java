//package helloworld.demo.com.heterogeneousrecyclerview.Adapter;
//
//import android.content.Context;
//import android.support.v7.widget.RecyclerView;
//import android.util.Log;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.ImageView;
//import android.widget.TextView;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import helloworld.demo.com.heterogeneousrecyclerview.R;
////import helloworld.demo.com.heterogeneousrecyclerview.pojos.HorizontalModel;
//import helloworld.demo.com.heterogeneousrecyclerview.pojos.Model;
////import helloworld.demo.com.heterogeneousrecyclerview.pojos.VerticalModel;
//
//
///**
// * Created by shyamramesh on 02/03/18.
// */
//
//public class VerticalAdapter extends RecyclerView.Adapter<VerticalAdapter.MyViewHolder>
//{
//
//    private static final String TAG = "VERTICAL ADAPTER";
//     private List<Model> modelList = new ArrayList<>();
//     Context context;
//
//
//    public VerticalAdapter(Context context,List<Model> modelList) {
//        this.context = context;
//        this.modelList = modelList;
//
//    }
//
////    public VerticalAdapter(Model model) {
////        this.model = model
////    }
//
//    //List<Object>items = new ArrayList<>();
//
////    public VerticalAdapter(List<Object> items) {
////        this.items = items;
////
////    }
//
////    public VerticalAdapter(List<Object> items) {
////        this.items = items;
////    }
//
//
//    // VerticalModel verticalModel = new VerticalModel();
//
////    public VerticalAdapter(String data) {
////        this.verticalModel = data;
////    }
//
//    //   private MainAdapter mContext;
//
////    public VerticalAdapter(MainAdapter context)
////    {
////        this.mContext = context;
////       // this.verticallist = verticallist;
////    }
//
//
////    public VerticalAdapter(List<VerticalModel> verticallist)
////    {
////        this.verticallist = verticallist;
////    }
//
//
//
////    public VerticalAdapter(List<VerticalModel> verticallist) {
////        this.verticallist = verticallist;
////    }
//
//
//
////
////    public VerticalAdapter() {
////
////    }
//
//
//
//
////    public void addItem1(String singleLineText) {
////       // VerticalModel verticalModel = new VerticalModel(singleLineText);
////       // verticalModel.setText1(singleLineText);
////        Log.e(TAG,"setting single line text");
////        verticallist.add(singleLineText);
////        notifyDataSetChanged();
////    }
//
//    //oncreate
//    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
//    {
//        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.vertical_line,parent,false);
//        return new MyViewHolder(v);
//    }
//
//    //onBind
//    public void onBindViewHolder(MyViewHolder holder,int position)
//    {
//       // holder.textView.setText((String)verticallist.get(position));
//
////        Model model = modelList.get(position);
////        holder.textView.setText((String)model.getText1());
//
//        // VerticalModel verticalModel = (VerticalModel) verticallist.get(position);
//
////        Log.e(TAG,"text1 binded");
//
//        // holder.textView.setText((String) modelList.get(position));
//       // Model model = new Model();
//        holder.textView.setText(modelList.get(position).getText1());
//    }
//
//    public int getItemCount()
//    {
//        Log.e(TAG,"returning vertical data");
//            return modelList.size();
//        //return items.size();
//    }
//
//
//
//    public class MyViewHolder extends RecyclerView.ViewHolder
//    {
//        TextView textView;
//        public MyViewHolder(View v)
//        {
//            super(v);
//            textView = (TextView) v.findViewById(R.id.txt1);
//
//        }
//    }
//
//
//}
//
