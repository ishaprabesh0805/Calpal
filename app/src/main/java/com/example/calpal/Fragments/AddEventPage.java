package com.example.calpal.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.calpal.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link AddEventPage#newInstance} factory method to
 * create an instance of this fragment.
 */
public class AddEventPage extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public AddEventPage() {
        // Required empty public constructor to instantiate the fragment class when needed
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment AddEventPage.
     */
    // TODO: Rename and change types and number of parameters
    public static AddEventPage newInstance(String param1, String param2) {
        AddEventPage fragment = new AddEventPage();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        // Links xml fragment_add_event_page.xml with this file
        return inflater.inflate(R.layout.fragment_add_event_page, container, false);
    }
}