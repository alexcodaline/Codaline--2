package com.example.alex.home_codaline2.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.alex.home_codaline2.R;


public class FirstFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_first, container, false);
    }
    private EditText f1text;
    private TextView f2text;
    private Button button1;

    @Override

    public void onStart() {
        super.onStart();
        f1text = (EditText) getActivity().findViewById(R.id.f1text);
        f2text  = (TextView) getActivity().findViewById(R.id.f2text);
        button1 = (Button) getActivity().findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int c = f1text.getText().length();
                String.valueOf(c);
               f2text.setText("Symbols: " + c);

            }
        });
    }

}
