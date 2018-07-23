package sg.edu.rp.c346.boxlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvImg;

    ArrayList<ImagesList> alImgList;
    CostumAdapter caImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvImg = findViewById(R.id.listViewImages);

        alImgList = new ArrayList<>();

        ImagesList img1 = new ImagesList("blue");
        ImagesList img2 = new ImagesList("orange");
        ImagesList img3 = new ImagesList("brown");
        alImgList.add(img1);
        alImgList.add(img2);
        alImgList.add(img3);

        caImg = new CostumAdapter(this,R.layout.images_list,alImgList);

        lvImg.setAdapter(caImg);


    }
}
