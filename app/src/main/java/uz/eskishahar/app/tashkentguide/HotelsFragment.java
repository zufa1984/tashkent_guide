package uz.eskishahar.app.tashkentguide;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class HotelsFragment extends Fragment {

    ListView listView;
    ArrayList<Information> informations;


    public HotelsFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.list_view, container, false);

        setHasOptionsMenu(true);

        informations = new ArrayList<Information>();

        informations.add(new Information(getString(R.string.name_hotel_hyatt_regency), getString(R.string.address_hotel_hyatt_regency),
                getString(R.string.web_hotels_hyatt_regency), getString(R.string.phone_hotel_hyatt_regency),
                getString(R.string.work_time_hotel_hyatt_regency), getString(R.string.info_hotel_hyatt_regency),
                R.drawable.hotel_hyatt));
        informations.add(new Information(getString(R.string.name_hotel_hilton), getString(R.string.address_hotel_hilton),
                getString(R.string.web_hotels_hilton), getString(R.string.phone_hotel_hilton),
                getString(R.string.work_time_hotel_hilton), getString(R.string.info_hotel_hilton),
                R.drawable.hotel_hilton));
        informations.add(new Information(getString(R.string.name_hotel_ichan_qala), getString(R.string.address_hotel_ichan_qala),
                getString(R.string.web_hotels_ichan_kala), getString(R.string.phone_hotel_ichan_qala),
                getString(R.string.work_time_hotel_ichan_qala), getString(R.string.info_hotel_ichan_qala),
                R.drawable.hotel_ichan_kala));
        informations.add(new Information(getString(R.string.name_hotel_wyndham), getString(R.string.address_hotel_wyndham),
                getString(R.string.web_hotels_wyndham), getString(R.string.phone_hotel_wyndham),
                getString(R.string.work_time_hotel_wyndham), getString(R.string.info_hotel_wyndham),
                R.drawable.hotel_wyndham));
        informations.add(new Information(getString(R.string.name_hotel_city_palace), getString(R.string.address_hotel_city_palace),
                getString(R.string.web_hotels_city_palace), getString(R.string.phone_hotel_city_palace),
                getString(R.string.work_time_hotel_city_palace), getString(R.string.info_hotel_city_palace),
                R.drawable.hotel_city_palace));

        InfoAdapter adapter = new InfoAdapter(getActivity(), R.layout.fragment, informations);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;

    }
}
