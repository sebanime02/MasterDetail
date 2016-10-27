package co.edu.unicauca.masterprueba;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by ENF on 27/10/2016.
 */

public class ListPatientFragment extends Fragment {

    private View rootview;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        rootview = inflater.inflate(R.layout.fragment_listpacientes,container,false);

        return rootview;
    }

    @Override
    public void onResume() {
        super.onResume();
    }
}
