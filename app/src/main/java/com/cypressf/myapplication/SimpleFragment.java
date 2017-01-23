package com.cypressf.myapplication;

import android.os.Bundle;
import android.support.v4.app.Fragment;

public class SimpleFragment extends Fragment {
    public static SimpleFragment newInstance(int position) {
        Bundle args = new Bundle();
        SimpleFragment fragment;

        switch (position) {
            case 0:
                fragment = new FragmentOne();
                break;
            case 1:
                fragment = new FragmentTwo();
                break;
            default:
                fragment = new SimpleFragment();
                break;
        }

        fragment.setArguments(args);
        return fragment;
    }
}
