package uz.eskishahar.app.tashkentguide;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class MuseumsFragment extends Fragment {

    ListView listView;
    ArrayList<Information> informations;

public MuseumsFragment() {
   }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.list_view, container, false);

        setHasOptionsMenu(true);

        informations = new ArrayList<Information>();

        informations.add(new Information(getString(R.string.name_museums_nature), getString(R.string.address_museums_nature),
                getString(R.string.web_museum_nature), getString(R.string.phone_museums_nature),
                getString(R.string.work_time_museums_nature), getString(R.string.info_museums_nature),
                R.drawable.museum_nuture));
        informations.add(new Information(getString(R.string.name_museums_zoo), getString(R.string.address_museums_zoo),
                getString(R.string.web_museum_zoo), getString(R.string.phone_museums_zoo),
                getString(R.string.work_time_museums_zoo), getString(R.string.info_museums_zoo),
                R.drawable.museum_zoo));
        informations.add(new Information(getString(R.string.name_museums_victory), getString(R.string.address_museums_victory),
                getString(R.string.web_museum_victory_park), getString(R.string.phone_museums_victory),
                getString(R.string.work_time_museums_victory), getString(R.string.info_museums_victory),
                R.drawable.museum_victory));
        informations.add(new Information(getString(R.string.name_museums_temurids), getString(R.string.address_museums_temurids),
                getString(R.string.web_museum_amir_temur), getString(R.string.phone_museums_temurids),
                getString(R.string.work_time_museums_temurids), getString(R.string.info_museums_temurids),
                R.drawable.museum_amir_temur));
        informations.add(new Information(getString(R.string.name_museums_railways), getString(R.string.address_museums_railways),
                getString(R.string.web_museum_railway), getString(R.string.phone_museums_railways),
                getString(R.string.work_time_museums_railways), getString(R.string.info_museums_railways),
                R.drawable.museum_railway));

        InfoAdapter adapter = new InfoAdapter(getActivity(), R.layout.fragment, informations);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;

    }
}
