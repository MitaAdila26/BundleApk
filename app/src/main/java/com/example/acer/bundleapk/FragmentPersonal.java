package com.example.acer.bundleapk;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.acer.bundleapk.Pegawai;
import com.example.acer.bundleapk.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentPersonal extends Fragment {
    private Bundle bundle;
    private Pegawai pegawainya;
    private TextView txtNama1,txtAlamat,txtNoHp;

    public FragmentPersonal() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bundle=getArguments();
        pegawainya= (Pegawai) bundle.getSerializable("bungkus1");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fragment_personal, container, false);
        txtNama1 = (TextView)view.findViewById(R.id.txt_nama1);
        txtAlamat = (TextView)view.findViewById(R.id.txt_alamat);
        txtNoHp = (TextView)view.findViewById(R.id.txt_nohp);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        txtNama1.setText(pegawainya.getNama());
        txtAlamat.setText(pegawainya.getAlamat());
        txtNoHp.setText(pegawainya.getNoHp());
    }
}
