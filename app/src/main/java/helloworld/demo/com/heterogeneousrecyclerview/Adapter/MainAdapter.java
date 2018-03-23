package helloworld.demo.com.heterogeneousrecyclerview.Adapter;

/**
 * Created by shyamramesh on 02/03/18.
 */


import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import helloworld.demo.com.heterogeneousrecyclerview.R;
//import helloworld.demo.com.heterogeneousrecyclerview.pojos.HorizontalModel;
import helloworld.demo.com.heterogeneousrecyclerview.pojos.Model;
//import helloworld.demo.com.heterogeneousrecyclerview.pojos.VerticalModel;


public class MainAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private static final String TAG = "MAIN ADAPTER";
    private final int VERTICAL = 1;
    private final int HORIZONTAL = 2;
    private final int HORIZONTAL_LINE = 3;

    List<Model> modelList = new ArrayList<>();

    private Context context;
//    private List<VerticalModel> verticallist = new ArrayList<>();
//    private List<HorizontalModel> horizontallist = new ArrayList<>();

    public MainAdapter(Context context) {
        this.context = context;

    }

    public void addItem(String singleLineText, String multiLineText, List<String> item) {
        Model model = new Model();
        if(multiLineText == null && item == null && singleLineText != null) {
            if (singleLineText != null)
            model.setText1(singleLineText);
            model.setTag("Single");
            notifyDataSetChanged();
        }
        else if(singleLineText == null && item == null && multiLineText != null)
        {
            model.setText2(multiLineText);
            //model.setText2(item);
            model.setTag("SingleString");
            notifyDataSetChanged();
           // model.settingMultiLineText(true);
        }
        else if(singleLineText == null && multiLineText == null && item != null)
        {
           // model.setArray(new String[]{(item)});
           // for(int i=0; i<item.size(); i++)
           // String myList[] = modelList.spliterator();
            model.setMultipleList(item);
            model.setTag("MultipleString");
            notifyDataSetChanged();
        }
        modelList.add(model);
        notifyDataSetChanged();
    }

//    public void addItem(String singleLineText) {
//        VerticalModel verticalModel = new VerticalModel();
//        verticalModel.setText1(singleLineText);
//        // Log.e(TAG,"setting single line text");
//        verticallist.add(verticalModel);
//        items.add(verticalModel);
//        //verticallist.add(singleLineText);
//        notifyDataSetChanged();
//        // Log.e(TAG,"text added to vertical list");
//        //items.add(new VERTICAL(singleLineText));
//    }
//
//    public void addItem2(String multiLineText) {
//        HorizontalModel horizontalModel = new HorizontalModel();
//        horizontalModel.setText2(multiLineText);
//        horizontallist.add(horizontalModel);
//        items.add(horizontalModel);
//        // horizontallist.add(multiLineText);
//        notifyDataSetChanged();
//    }


    //on create
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View v1, v2,v3;
        RecyclerView.ViewHolder holder = null;
        switch (viewType) {
            case VERTICAL:
                v1 = inflater.inflate(R.layout.vertical_line, parent, false);
                holder = new VerticalViewHolder(v1);
                break;

            case HORIZONTAL:
                v2 = inflater.inflate(R.layout.horizontal, parent, false);
                holder = new HorizontalViewHolder(v2);
                break;

            case HORIZONTAL_LINE:
                v3 = inflater.inflate(R.layout.horizontal_line,parent,false);
                holder = new HorizontalLineViewHolder(v3);
                break;
//            default:
//                v = inflater.inflate(R.layout.activity_main,parent,false);
//                holder = new HorizontalViewHolder(v);
//                break;
        }
        return holder;
    }

    //on bind
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
//        if(holder.getItemViewType() == VERTICAL)
//            verticalView((VerticalViewHolder)holder);
//         if(holder.getItemViewType() == HORIZONTAL)
//            horizontalView((HorizontalViewHolder)holder);

        switch (holder.getItemViewType()) {
            case VERTICAL:
                VerticalViewHolder vh1 = (VerticalViewHolder) holder;
                configureViewHolder1(vh1,position);
                break;

            case HORIZONTAL:
                HorizontalViewHolder vh2 = (HorizontalViewHolder) holder;
                configureViewHolder2(vh2,position);
                break;
            case HORIZONTAL_LINE:
                HorizontalLineViewHolder vh3 = (HorizontalLineViewHolder)holder;
                configureViewHolder3(vh3,position);
//            default:
//                RecyclerViewSimpleTextViewHolder vh = (RecyclerViewSimpleTextViewHolder) holder;
//                configureDefaultViewHolder(vh, position);
//                break;
        }

    }


    private void configureViewHolder1(VerticalViewHolder vh1,int position) {

      //  Model model = modelList.get(position);
//        vh1.textView.setText((String)model.getText1());

       // VerticalAdapter adapter1 = new VerticalAdapter(context,modelList);
       // vh1.recyclerView.setLayoutManager(new LinearLayoutManager(context));
       // vh1.recyclerView.setAdapter(adapter1);
        vh1.textView.setText(modelList.get(position).getText1());
        Log.e(TAG,"View Holder 1 Configured");
    }

    private void configureViewHolder2(HorizontalViewHolder vh2,int position) {
//        Model model = modelList.get(position);
//        vh2.textView.setText((String)model.getText2());
       // vh2.recyclerView.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false));
//        Model model = new Model();
//        String[] str1 = modelList.get(position).getArray();
//        if(str1 != null)
//            for (String str2 : str1 )
//                for (String s : str2.split(",")) {
//                    //answer.add(s);
//                    model.setMultipleText(s);
//                }
//                modelList.add(model);
        HorizontalAdapter adapter2 = new HorizontalAdapter(modelList.get(position).getMultipleList());
        vh2.recyclerView.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false));
        vh2.recyclerView.setAdapter(adapter2);
       // vh2.textView.setText(modelList.get(position).getText2());
        Log.e(TAG,"View Holder 2 Configured");
    }

    private void configureViewHolder3(HorizontalLineViewHolder vh3,int position){
        vh3.textView.setText(modelList.get(position).getText2());
    }

//    private void configureDefaultViewHolder(RecyclerViewSimpleTextViewHolder vh,int position)
//    {
//        verticallist.get(position);
//    }

//    private void verticalView(VerticalViewHolder holder)
//    {
//        //VerticalModel verticalModel = new VerticalModel();
//       // VerticalAdapter adapter1 = new VerticalAdapter(verticalModel.getData());
//        VerticalAdapter adapter1 = new VerticalAdapter(verticallist);
//        holder.recyclerView.setLayoutManager(new LinearLayoutManager(context));
//        holder.recyclerView.setAdapter(adapter1);
//
//    }
//
//    private void horizontalView(HorizontalViewHolder holder)
//    {
//        HorizontalAdapter adapter = new HorizontalAdapter(horizontallist);
//      //  HorizontalAdapter adapter = new HorizontalAdapter((ArrayList<HorizontalModel>) horizontallist);
//        holder.recyclerView.setLayoutManager(new LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false));
//        holder.recyclerView.setAdapter(adapter);
//    }

    public int getItemCount() {
        Log.e(TAG, "returning vertical and horizontal data");
        // return verticallist.size() + horizontallist.size();
        return modelList.size();
        // return objects.size();
        //  return horizontallist.size();
    }

    public int getItemViewType(int position) {
        //if(verticallist.get(position).IfSingleLineText() != null) {
        // VerticalModel verticalModel = (VerticalModel) verticallist.get(position);
//        if (items.get(position) instanceof VerticalModel)
//            return VERTICAL;
//        if (items.get(position) instanceof HorizontalModel)
//            return HORIZONTAL;
//        return -1;

        if (modelList.get(position).getTag().equals("Single"))
            return VERTICAL;
        else if (modelList.get(position).getTag().equals("SingleString"))
        {
            return HORIZONTAL_LINE;
        }
        else if(modelList.get(position).getTag().equals("MultipleString")){
            // if (modelList.get(position).getTag() != null)
            return HORIZONTAL;
        }

        return -1;
    }


    public class VerticalViewHolder extends RecyclerView.ViewHolder {
       // RecyclerView recyclerView;
        TextView textView;

        VerticalViewHolder(View v1) {
            super(v1);
            //recyclerView = (RecyclerView) v1.findViewById(R.id.rv);
            textView = (TextView)v1.findViewById(R.id.txt1);


        }
    }

    public class HorizontalViewHolder extends RecyclerView.ViewHolder {
        RecyclerView recyclerView;
       // TextView textView;
        HorizontalViewHolder(View v2) {
            super(v2);
            recyclerView = (RecyclerView) v2.findViewById(R.id.rv);
           // textView = (TextView)v2.findViewById(R.id.txt2);

        }
    }

    public class HorizontalLineViewHolder extends RecyclerView.ViewHolder{
        TextView textView;
        HorizontalLineViewHolder(View v3)
        {
            super(v3);
            textView = (TextView)v3.findViewById(R.id.txt2);
        }
    }

//    public class RecyclerViewSimpleTextViewHolder extends RecyclerView.ViewHolder
//    {
//        RecyclerView recyclerView;
//        RecyclerViewSimpleTextViewHolder(View v)
//        {
//            super(v);
//            recyclerView = (RecyclerView) v.findViewById(R.id.rv);
//        }
//
//
//    }
}
