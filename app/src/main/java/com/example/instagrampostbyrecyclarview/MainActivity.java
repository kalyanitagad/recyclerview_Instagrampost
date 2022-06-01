package com.example.instagrampostbyrecyclarview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Post> posts;
    private RecyclerView recyclerPosts;
    private PostsAdapter postsAdapter;
    private int[] imgPost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initData();
        initViews();

    }

    private void initViews() {
        recyclerPosts = findViewById(R.id.recyclerPosts);
        recyclerPosts.setLayoutManager(
                new LinearLayoutManager(
                        this, LinearLayoutManager.VERTICAL, false
                )
        );

        postsAdapter = new PostsAdapter(posts);
        recyclerPosts.setAdapter(postsAdapter);
    }

    private void initData() {
        imgPost = new int[]
                {
                        R.drawable.ic_launcher_insta,
                        R.drawable.ic_launcher_insta,
                        R.drawable.ic_launcher_insta,
                        R.drawable.ic_launcher_insta,
                        R.drawable.ic_launcher_insta,
                        R.drawable.ic_launcher_insta,
                        R.drawable.ic_launcher_insta,
                        R.drawable.ic_launcher_insta,
                        R.drawable.ic_launcher_insta,
                        R.drawable.ic_launcher_insta,
                        R.drawable.ic_launcher_insta,

                };

        posts = new ArrayList<Post>();

        for (int i = 0; i <= 10; i++) {
            posts.add(
                    new Post(
                            i,
                            "Instagram",
                            0,
                            imgPost[i],
                            R.drawable.like4
                    )
            );

        }
    }
}