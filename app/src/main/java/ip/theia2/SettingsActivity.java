package ip.theia2;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Laptop on 11/03/2016.
 */
public class SettingsActivity extends Fragment {

    public SettingsActivity(){
        // constructor
    }

    // this makes the settings_page.xml page
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.settings_page, container, false);

        return rootView;
    }

}