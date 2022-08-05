package com.example.myapplication;

import android.os.Bundle;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class AccountFragment extends Fragment {
    FloatingActionButton fab;
    LinearLayoutCompat linearLayoutCompat2;
    LinearLayoutCompat linearLayoutCompat3;
    LinearLayoutCompat linearLayoutCompat4;
    LinearLayoutCompat linearLayoutCompat5;

    private void showBottomSheetDialog() {

        final BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(getActivity());
        bottomSheetDialog.setContentView(R.layout.activity_bottom_sheet);
        bottomSheetDialog.show();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_account, container, false);

        linearLayoutCompat2 = view.findViewById(R.id.linearLayoutCompat2);
        linearLayoutCompat3 = view.findViewById(R.id.linearLayoutCompat3);
        linearLayoutCompat4 = view.findViewById(R.id.linearLayoutCompat4);
        linearLayoutCompat5 = view.findViewById(R.id.linearLayoutCompat5);

        fab = view.findViewById(R.id.edit_button);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showBottomSheetDialog();
            }
        });


        linearLayoutCompat2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Shipping Address", Toast.LENGTH_SHORT).show();
            }
        });


        return view;

    }
}