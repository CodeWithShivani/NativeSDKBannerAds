package com.example.nativesdkbannerads;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.Toast;

import com.example.nativebanneradsdk.AdBannerLoader;
import com.example.nativebanneradsdk.BannerviewAds;


public class MainActivity extends AppCompatActivity {
    private FrameLayout adContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        adContainer=findViewById(R.id.ad_container);

        try
        {
            AdBannerLoader adLoader=new AdBannerLoader(this, new AdBannerLoader.AdListener() {
                @Override
                public void onAdLoaded(BannerviewAds adview) {
                    adContainer.addView(adview);
                }

                @Override
                public void onAdFailed(String error) {
                    System.out.println("error  "+error);

                }
            });
            adLoader.loadAd(this,R.drawable.bannerimage,"This is a native banner ad","Download our amazing app now!");
        }
        catch (Exception ex)
        {
            Toast.makeText(this, "catch  "+ex.getMessage(), Toast.LENGTH_SHORT).show();
        }


    }
}