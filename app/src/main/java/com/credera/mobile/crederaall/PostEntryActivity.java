package com.credera.mobile.crederaall;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;

import java.util.ArrayList;

public class PostEntryActivity extends AppCompatActivity {

    private EditText postContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post_entry1);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        postContent = (EditText) findViewById(R.id.post_content);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        final MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.activity_post_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.menu_post:
                Post post = new Post();

                post.setContent(postContent.getText().toString());
                post.setFirstName("Cody");
                post.setLastName("Case");
                post.setTimePosted("Now");

                DatabaseReference ref = FireBaseHelper.getReference();

                FireBaseHelper.submitPost(ref, post);
                finish();
                return true;
        }

        return false;
    }
}
