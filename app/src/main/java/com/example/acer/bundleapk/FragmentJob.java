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
public class FragmentJob extends Fragment {
    private Bundle bundle;
    private Pegawai pegawai2;
    private TextView txtNama2,txtPekerjaan,txtLamaKerja;

    public FragmentJob() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bundle=getArguments();
        pegawai2= (Pegawai) bundle.getSerializable("bungkus2");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view2 = inflater.inflate(R.layout.fragment_fragment_job, container, false);
        txtNama2 = (TextView)view2.findViewById(R.id.txt_nama2);
        txtPekerjaan = (TextView)view2.findViewById(R.id.txt_pekerjaan);
        txtLamaKerja = (TextView)view2.findViewById(R.id.txt_lmkerja);
        return view2;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        txtNama2.setText(pegawai2.getNama());
        txtPekerjaan.setText(pegawai2.getPekerjaan());
        txtLamaKerja.setText(pegawai2.getLamaKerja());

    }
}
