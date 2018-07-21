package com.udacity.gradle.builditbigger;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import static com.udacity.gradle.builditbigger.MainActivity.paidFlavor;


/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {
    private Button jokeButton;
    private TextView flavorTV;
    public MainActivityFragment() {
        //Required Empty Constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_main, container, false);

        jokeButton = (Button)root.findViewById(R.id.joke_btn);

        jokeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new EndpointsAsyncTask().execute(getActivity());

            }
        });

        flavorTV = (TextView)root.findViewById(R.id.flavor_tv);
//        if (paidFlavor){
//            flavorTV.setText("PAID VERSION");
//        }else {
//            flavorTV.setText("FREE VERSION");
//
//        }

//        AdView mAdView = (AdView) root.findViewById(R.id.adView);
//        // Create an ad request. Check logcat output for the hashed device ID to
//        // get test ads on a physical device. e.g.
//        // "Use AdRequest.Builder.addTestDevice("ABCDEF012345") to get test ads on this device."
//        AdRequest adRequest = new AdRequest.Builder()
//                .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
//                .build();
//        mAdView.loadAd(adRequest);
//        return root;
        return root;
    }
}
