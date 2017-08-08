package com.credera.mobile.crederaall;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.google.firebase.database.DatabaseReference;

public class PostEntryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post_entry1);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final Button postButton = (Button) findViewById(R.id.post_button);

        postButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Post post = new Post();

                post.setContent("Android Team, Best Team.");
                post.setFirstName("Cody");
                post.setLastName("Case");
                post.setTimePosted("Now");

                DatabaseReference ref = FireBaseHelper.getReference();

                FireBaseHelper.submitPost(ref, post);
            }
        });
    }
}
