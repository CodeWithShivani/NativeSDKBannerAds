package com.example.nativebanneradsdk;

import android.content.Context;
import android.widget.Toast;

public class AdBannerLoader {

    public interface AdListener
    {
        public void onAdLoaded(BannerviewAds adview);
        public void onAdFailed(String error);
    }

    private Context context;
    private AdListener listener;

    public AdBannerLoader(Context context, AdListener listener)
    {
        this.context=context;
        this.listener=listener;
    }

    public void loadAd(Context ctx, int bannerDrawable,String headline , String description )
    {
        BannerviewAds bannerviewAds=new BannerviewAds(ctx);
        bannerviewAds.setAdIcon(bannerDrawable);
        bannerviewAds.setAdHeadline(headline);
        bannerviewAds.setAdBody(description);

        try
        {
        if(listener!=null)
        {
            listener.onAdLoaded(bannerviewAds);
            listener.onAdFailed("Try After sometime");
        }
        else {
            Toast.makeText(context, "Something is wrong in Loader", Toast.LENGTH_SHORT).show();
            System.out.println("Something is wrong in Loader");
        }
    }
        catch (Exception ex)
    {
        Toast.makeText(context, "catchloader  "+ex.getMessage(), Toast.LENGTH_SHORT).show();
    }
    }


}
