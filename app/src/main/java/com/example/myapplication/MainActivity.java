package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private ApiService service;
    private List<User> userList;
    private RecyclerView recyclerView;
    private CustomAdapter customAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userList = new ArrayList<>();
        service = ApiClient.getInstance().create(ApiService.class);

        service.getUser().enqueue(new Callback<JSONResponse>() {
            @Override
            public void onResponse(Call<JSONResponse> call, Response<JSONResponse> response) {

                JSONResponse jsonResponse = response.body();
                //userList = new ArrayList<>(Arrays.asList(jsonResponse.getData())); // using array
                userList = jsonResponse.getData();
                getRecyclerView(userList);

            }

            @Override
            public void onFailure(Call<JSONResponse> call, Throwable t) {
                Log.d("AAA", "error: " + t.getMessage().toString());
            }
        });

    }

    private void getRecyclerView(List<User> userList) {

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        customAdapter = new CustomAdapter(this, userList);
        recyclerView.setAdapter(customAdapter);

    }
}