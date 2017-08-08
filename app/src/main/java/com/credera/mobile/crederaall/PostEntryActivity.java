package com.credera.mobile.crederaall;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;

import java.util.ArrayList;

public class PostEntryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post_entry1);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final EditText postContent = (EditText) findViewById(R.id.post_content);

        final Button postButton = (Button) findViewById(R.id.post_button);
        postButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Post post = new Post();

                post.setContent(postContent.getText().toString());
                post.setFirstName("Cody");
                post.setLastName("Case");
                post.setTimePosted("Now");

                DatabaseReference ref = FireBaseHelper.getReference();

                FireBaseHelper.submitPost(ref, post);
                finish();
            }
        });
    }
}
