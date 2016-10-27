package co.edu.unicauca.masterprueba;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by ENF on 27/10/2016.
 */

public class ListTipsFragment extends Fragment {
    private View rootView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_tips,container,false);

        return  rootView;
    }

    @Override
    public void onResume() {
        super.onResume();
    }
}
