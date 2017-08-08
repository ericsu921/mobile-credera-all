package com.credera.mobile.crederaall;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

/**
 * Created by mmckinley on 8/8/17.
 */

public class FireBaseHelper {
    private static DatabaseReference ref = null;

    private FireBaseHelper() {

    }

    public static DatabaseReference getReference() {
        if(ref == null) {
            ref = FirebaseDatabase.getInstance().getReference();
        }

        return ref;
    }

    public static void submitPost(DatabaseReference ref, Post post) {
        DatabaseReference postRef = ref.child("newsfeed").push();

        postRef.setValue(post);
    }
}