package com.example.myapplication;


import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import me.relex.circleindicator.CircleIndicator;


public class HomeFragment extends Fragment {


    ArrayList personNames = new ArrayList<>(Arrays.asList("Vegetables ", "Grocery", "Bakery",
                                                          "Nutrition", "Baby & Child", "Drinks, Tea & Coffee"));
    ArrayList<Integer> personImages = new ArrayList<>(Arrays.asList(R.drawable.med_a,R.drawable.med_c,R.drawable.med_b,
                                                                    R.drawable.med_d,R.drawable.med_e,R.drawable.med_f ));
    ViewPager viewPager;
    CircleIndicator circleIndicator;
    RecyclerView recyclerView;
    GridView gridView2;
    GridView gridView3;
   // ArrayList imgList =new ArrayList<>();
    GridLayoutManager gridLayoutManager;
    GvAdapter gvAdapter;


    //ArrayList<String> list;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        viewPager = view.findViewById(R.id.viewPager);
        circleIndicator = view.findViewById(R.id.circleIndicator);
        gridView2 = view.findViewById(R.id.my_GV2);
        gridView3 = view.findViewById(R.id.my_GV3);
        recyclerView = view.findViewById(R.id.recyclerView);

//        list = new ArrayList<>();

//        list.add("one");
//        list.add("two");
//        list.add("three");
//        list.add("four");
//        list.add("five");
//        list.add("six");
        gridLayoutManager = new GridLayoutManager(getContext(),3);

        recyclerView.setLayoutManager(gridLayoutManager);

        gvAdapter = new GvAdapter(personNames,personImages, getActivity());
        recyclerView.setAdapter(gvAdapter);

       /* int logo[]={R.drawable.med_a, R.drawable.med_b,R.drawable.med_c,
                    R.drawable.med_d, R.drawable.med_e,R.drawable.med_f};*/
        int[] img ={R.drawable.group_a,R.drawable.group_b,R.drawable.group_c};
        int[] imglong ={R.drawable.long_banner};

        List<Integer> imageList = new ArrayList<>();
        imageList.add(R.drawable.upperpic);
        imageList.add(R.drawable.banner);
        imageList.add(R.drawable.banner_a);
        imageList.add(R.drawable.upperpic);


        GvAdapter2 gvAdapter2 = new GvAdapter2(getActivity().getApplicationContext(),img);
        gridView2.setAdapter(gvAdapter2);

        GvAdapter3 gvAdapter3 = new GvAdapter3(getActivity().getApplicationContext(),imglong);
        gridView3.setAdapter(gvAdapter3);

        gridView2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                    case 1:
                    case 2:
                        Intent intent = new Intent(getContext(),GridPage1.class);
                        intent.putExtra("image",img[position]);
                        startActivity(intent);
                        break;
                }
            }
        });

        MyAdapter myAdapter = new MyAdapter(imageList);
        viewPager.setAdapter(myAdapter);

        circleIndicator.setViewPager(viewPager);
        return view;
    }
}