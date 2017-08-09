package com.credera.mobile.crederaall;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by meamma on 8/8/2017.
 */

public class NewsFeedCard extends LinearLayout {

    private TextView mTextView;

    public NewsFeedCard(Context context) {
        super(context);
        inflate(context, R.layout.news_feed_card, this);
        mTextView = (TextView) findViewById((R.id.info_text));
    }

    public void setText(String text) {
        mTextView.setText(text);
    }

}
