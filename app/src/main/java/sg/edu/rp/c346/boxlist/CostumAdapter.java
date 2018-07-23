package sg.edu.rp.c346.boxlist;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import java.util.ArrayList;

/**
 * Created by 16003806 on 23/7/2018.
 */

public class CostumAdapter extends ArrayAdapter {
    Context parent_context;
    int layout_id;
    ArrayList<ImagesList> imgList;

    public CostumAdapter(@NonNull Context context, int resource, @NonNull ArrayList<ImagesList> objects) {
        super(context, resource, objects);
        parent_context = context;
        layout_id = resource;
        imgList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(layout_id,parent,false);

        ImageView ivImg = view.findViewById(R.id.imageViewBox);

        ImagesList currentImg = imgList.get(position);

        String color = currentImg.getWhatColour();

        if(color.equalsIgnoreCase("blue")){
            ivImg.setImageResource(R.drawable.blue_box);
        }
        else if(color.equalsIgnoreCase("brown")){
            ivImg.setImageResource(R.drawable.brown_box);
        }
        else if(color.equalsIgnoreCase("orange")) {
            ivImg.setImageResource(R.drawable.orange_box);
        }

        return view;
    }
}
