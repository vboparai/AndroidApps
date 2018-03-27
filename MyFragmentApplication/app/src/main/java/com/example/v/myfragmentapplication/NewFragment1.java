package com.example.v.myfragmentapplication;


import android.app.Activity;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link NewFragment1#newInstance} factory method to
 * create an instance of this fragment.
 */
public class NewFragment1 extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private RadioGroup radioGroup;
    private RadioButton radioButton;
    private Button btnDisplay;


    public NewFragment1() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment NewFragment1.
     */
    // TODO: Rename and change types and number of parameters
    public static NewFragment1 newInstance(String param1, String param2) {
        NewFragment1 fragment = new NewFragment1();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

//        String str = getArguments().getString("theText");
//        Log.d("the value is ", str);
        return inflater.inflate(R.layout.fragment_new_fragment1, container, false);
    }

    private FragmentActivity myContext;
    public void submitBtn(View view){

        radioGroup = (RadioGroup)(getView().findViewById(R.id.radio));

        int selectedId = radioGroup.getCheckedRadioButtonId();

        radioButton = (RadioButton)(getView().findViewById(selectedId));

        Bundle bundle = new Bundle();
        bundle.putString("theButton", radioButton.getText().toString());

        Fragment frag = new NewFrangment2();
        Log.d("Bundle: ", "Before");
        frag.setArguments(bundle);
        Log.d("Bundle: ", "After");
        FragmentManager manager = myContext.getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.fragment1, frag);
        transaction.commit();
    }


}
