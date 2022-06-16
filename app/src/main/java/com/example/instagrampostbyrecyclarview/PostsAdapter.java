package com.example.instagrampostbyrecyclarview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PostsAdapter extends RecyclerView.Adapter<PostsAdapter.PostViewHolder> {

    private ArrayList<Post> posts;

    public PostsAdapter(ArrayList<Post> posts) {
        this.posts = posts;
    }

    public class PostViewHolder extends RecyclerView.ViewHolder {
        public ImageView imgPost;
        public TextView txtPostTitle, txtPostLikes;
        public ImageView imageViewLikeButton;

        public PostViewHolder(@NonNull View itemView) {
            super(itemView);

            imgPost = itemView.findViewById(R.id.imgPost);
            txtPostTitle = itemView.findViewById(R.id.txtPostTitle);
            txtPostLikes = itemView.findViewById(R.id.txtPostLikes);
            imageViewLikeButton = itemView.findViewById(R.id.imgViewLikeButton);

            imageViewLikeButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Post post = posts.get(getAdapterPosition());
                    int likeCountStatus = Integer.parseInt(txtPostLikes.getText().toString());
                    likeCountStatus++;
                    post.setLikes(likeCountStatus);
                    txtPostLikes.setText(""+likeCountStatus);
                }
            });
        }
    }

    @NonNull
    @Override
    public PostViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.post_view, null);
        return new PostViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PostViewHolder holder, int position) {
        Post post = posts.get(position);
        holder.txtPostTitle.setText(post.getTitle());
        holder.imgPost.setImageResource(post.getImageId());
        holder.txtPostLikes.setText("" + post.getLikes());
        holder.imageViewLikeButton.setImageResource(post.getLikeImageId());

    }

    @Override
    public int getItemCount() {
        return posts.size();
    }
}


