package com.brigade.brigadiers;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.squareup.otto.Bus;

public class LoginFragment extends Fragment {

    public static Bus bus;


    public LoginFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        MrOtto.getInstance().register(this);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_login, container, false);
        return rootView;
    }

    @Override
    public void onPause() {
        super.onPause();
        // Always unregister when an object no longer should be on the bus.
        MrOtto.getInstance().unregister(this);
    }


    public void onUserLogged(){
        MrOtto.getInstance().post("UserLogged");
    }
}
