package com.example.myapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.List;

public class ViewAllActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private GridView gridView;
    public static List<WishlistModel> wishlistModelList;
    public static List<HorizontalProductScrollModel> horizontalProductScrollModelList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_all);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(true);
        getSupportActionBar().setTitle(getIntent().getStringExtra("title"));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        recyclerView = findViewById(R.id.recycler_view);
        gridView = findViewById(R.id.grid_view);

        int layout_code = getIntent().getIntExtra("layout_code", -1);

        if (layout_code == 0) {
            recyclerView.setVisibility(View.VISIBLE);
            LinearLayoutManager layoutManager = new LinearLayoutManager(this);
            layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
            recyclerView.setLayoutManager(layoutManager);

//            List<WishlistModel> wishlistModelList = new ArrayList<>();
//            wishlistModelList.add(new WishlistModel(R.drawable.sickle, "Sickle", "Rs.149/-", "Rs.179/-", "Cash on delivery"));
//            wishlistModelList.add(new WishlistModel(R.drawable.sickle, "Sickle", "Rs.149/-", "Rs.179/-", "Cash on delivery"));
//            wishlistModelList.add(new WishlistModel(R.drawable.sickle, "Sickle", "Rs.149/-", "Rs.179/-", "Cash on delivery"));
//            wishlistModelList.add(new WishlistModel(R.drawable.sickle, "Sickle", "Rs.149/-", "Rs.179/-", "Cash on delivery"));
//            wishlistModelList.add(new WishlistModel(R.drawable.sickle, "Sickle", "Rs.149/-", "Rs.179/-", "Cash on delivery"));
//            wishlistModelList.add(new WishlistModel(R.drawable.sickle, "Sickle", "Rs.149/-", "Rs.179/-", "Cash on delivery"));
//            wishlistModelList.add(new WishlistModel(R.drawable.sickle, "Sickle", "Rs.149/-", "Rs.179/-", "Cash on delivery"));
//            wishlistModelList.add(new WishlistModel(R.drawable.sickle, "Sickle", "Rs.149/-", "Rs.179/-", "Cash on delivery"));
//            wishlistModelList.add(new WishlistModel(R.drawable.sickle, "Sickle", "Rs.149/-", "Rs.179/-", "Cash on delivery"));
//            wishlistModelList.add(new WishlistModel(R.drawable.sickle, "Sickle", "Rs.149/-", "Rs.179/-", "Cash on delivery"));
//            wishlistModelList.add(new WishlistModel(R.drawable.sickle, "Sickle", "Rs.149/-", "Rs.179/-", "Cash on delivery"));

            WishlistAdapter adapter = new WishlistAdapter(wishlistModelList, false);
            recyclerView.setAdapter(adapter);
            adapter.notifyDataSetChanged();
        } else if (layout_code == 1) {
            gridView.setVisibility(View.VISIBLE);


//            horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.drawable.sickle, "Title", "Descripion", "Price"));
//            horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.drawable.red_email, "Title", "Descripion", "Price"));
//            horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.drawable.sickle, "Title", "Descripion", "Price"));
//            horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.drawable.shopping_cart, "Title", "Descripion", "Price"));
//            horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.drawable.sickle, "Title", "Descripion", "Price"));
//            horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.drawable.profile, "Title", "Descripion", "Price"));
//            horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.drawable.sickle, "Title", "Descripion", "Price"));
//            horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.drawable.ic_menu_gallery, "Title", "Descripion", "Price"));
//            horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.drawable.sickle, "Title", "Descripion", "Price"));
//            horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.drawable.shopping_cart, "Title", "Descripion", "Price"));
//            horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.drawable.sickle, "Title", "Descripion", "Price"));
//            horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.drawable.profile, "Title", "Descripion", "Price"));
//            horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.drawable.sickle, "Title", "Descripion", "Price"));
//            horizontalProductScrollModelList.add(new HorizontalProductScrollModel(R.drawable.profile, "Title", "Descripion", "Price"));

            GridProductLayoutAdapter gridProductLayoutAdapter = new GridProductLayoutAdapter(horizontalProductScrollModelList);
            gridView.setAdapter(gridProductLayoutAdapter);
        }
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}