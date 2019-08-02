package com.example.simpleviewpager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CustomPagerAdapter adapter=new CustomPagerAdapter(this,getDataList());
        ViewPager viewPager=findViewById(R.id.viewPager);
        viewPager.setAdapter(adapter);
    }

public List<DataModel> getDataList(){
        List<DataModel> itemList=new ArrayList<>();
        int[]imageIds=new int[]{
                R.drawable.britam_tower,R.drawable.hazina_towers,R.drawable.kcb_rowers,R.drawable.le_mac,
                R.drawable.marble_towers,R.drawable.nyayo_house,R.drawable.ponte_city_partments,R.drawable.rahimtulla_tower,
                R.drawable.teleposta_towers,R.drawable.times_tower,R.drawable.uaptower
        };
        String []titles=new String[]{
                "Britam Towers","Hazina Towers","KCB Towers","Le Mac","Marble Towes","Nyayo House","Ponte City Apartments",
                "Rahumtulla Tower","Teleposta Towers","Times Towers","UAP Towers"
        };
    int count=imageIds.length;
    for(int i=0;i<count;i++){
        itemList.add(new DataModel(imageIds[i],titles[i]));

    }
    return itemList;

}
}
