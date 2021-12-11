package uz.eskishahar.app.tashkentguide;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class MosquesFragment extends Fragment {

    ListView listView;
    ArrayList<Information> informations;


public MosquesFragment() {
   }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.list_view, container, false);

        setHasOptionsMenu(true);

        informations = new ArrayList<Information>();

        informations.add(new Information(getString(R.string.name_mosque_khazrati_imam), getString(R.string.address_mosque_khazrati_imam),
                getString(R.string.web_site_khazrati_imom), getString(R.string.phone_mosque_khazrati_imam),
                getString(R.string.work_time_mosque_khazrati_imam), getString(R.string.info_mosque_khazrati_imam),
                R.drawable.mosque_khazrat));
        informations.add(new Information(getString(R.string.name_mosque_sheikh_zayniddin), getString(R.string.address_mosque_sheikh_zayniddin),
                getString(R.string.web_site_sheikh_zayniddin), getString(R.string.phone_mosque_sheikh_zayniddin),
                getString(R.string.work_time_mosque_sheikh_zayniddin), getString(R.string.info_mosque_sheikh_zayniddin),
                R.drawable.mosque_sheyx_zayniddin));
        informations.add(new Information(getString(R.string.name_mosque_minor), getString(R.string.address_mosque_minor),
                getString(R.string.web_site_minor), getString(R.string.phone_mosque_minor),
                getString(R.string.work_time_mosque_minor), getString(R.string.info_mosque_minor),
                R.drawable.mosque_minor));
        informations.add(new Information(getString(R.string.name_mosque_islam_ota), getString(R.string.address_mosque_islam_ota),
                getString(R.string.web_site_islam_ota), getString(R.string.phone_mosque_islam_ota),
                getString(R.string.work_time_mosque_islam_ota), getString(R.string.info_mosque_islam_ota),
                R.drawable.mosque_islom_ota));
        informations.add(new Information(getString(R.string.name_mosque_shekh_muhammadsodik), getString(R.string.address_mosque_shekh_muhammadsodik),
                getString(R.string.web_site_muhammad_sadyk), getString(R.string.phone_mosque_shekh_muhammadsodik),
                getString(R.string.work_time_mosque_shekh_muhammadsodik), getString(R.string.info_mosque_shekh_muhammadsodik),
                R.drawable.mosque_shayh_m));

        InfoAdapter adapter = new InfoAdapter(getActivity(), R.layout.fragment, informations);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;

    }
}
