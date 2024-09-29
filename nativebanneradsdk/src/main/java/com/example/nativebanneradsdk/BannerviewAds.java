package com.example.nativebanneradsdk;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class BannerviewAds extends LinearLayout {
    private ImageView adIcon;
    private TextView adHeadline;
    private TextView adBody;

    public BannerviewAds(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public BannerviewAds(Context context) {
        super(context);
        init(context);
    }

    private void init(Context context) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.bannerview_ads, this, true);

        adIcon = findViewById(R.id.ad_icon);
        adHeadline = findViewById(R.id.ad_headline);
        adBody = findViewById(R.id.ad_body);
    }

    public void setAdIcon(int resId) {
        adIcon.setImageResource(resId);
    }

    public void setAdHeadline(String headline) {
        adHeadline.setText(headline);
    }

    public void setAdBody(String body) {
        adBody.setText(body);
    }
}
