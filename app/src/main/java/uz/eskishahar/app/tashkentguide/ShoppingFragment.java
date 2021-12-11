package uz.eskishahar.app.tashkentguide;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class ShoppingFragment extends Fragment {

    ListView listView;
    ArrayList<Information> informations;

public ShoppingFragment() {
   }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.list_view, container, false);

        setHasOptionsMenu(true);

        informations = new ArrayList<Information>();

        informations.add(new Information(getString(R.string.name_shopping_samarkand_darvoza), getString(R.string.address_shopping_samarkand_darvoza),
                getString(R.string.web_shopping_samarqand), getString(R.string.phone_shopping_samarkand_darvoza),
                getString(R.string.work_time_shopping_samarkand_darvoza), getString(R.string.info_shopping_samarkand_darvoza),
                R.drawable.shopping_samarqand));
        informations.add(new Information(getString(R.string.name_shopping_chorsu_bazaar), getString(R.string.address_shopping_chorsu_bazaar),
                getString(R.string.web_shopping_chorsu), getString(R.string.phone_shopping_chorsu_bazaar),
                getString(R.string.work_time_shopping_chorsu_bazaar), getString(R.string.info_shopping_chorsu_bazaar),
                R.drawable.shopping_chorsu));
        informations.add(new Information(getString(R.string.name_shopping_yangiabad), getString(R.string.address_shopping_yangiabad),
                getString(R.string.web_shopping_yangiabad), getString(R.string.phone_shopping_yangiabad),
                getString(R.string.work_time_shopping_yangiabad), getString(R.string.info_shopping_yangiabad),
                R.drawable.shopping_yangiabad));
        informations.add(new Information(getString(R.string.name_shopping_next), getString(R.string.address_shopping_next),
                getString(R.string.web_shopping_next), getString(R.string.phone_shopping_next),
                getString(R.string.work_time_shopping_next), getString(R.string.info_shopping_next),
                R.drawable.shopping_next));
        informations.add(new Information(getString(R.string.name_shopping_megaplanet), getString(R.string.address_shopping_megaplanet),
                getString(R.string.web_shopping_mega), getString(R.string.phone_shopping_megaplanet),
                getString(R.string.work_time_shopping_megaplanet), getString(R.string.info_shopping_megaplanet),
                R.drawable.shopping_mega_planet));

        InfoAdapter adapter = new InfoAdapter(getActivity(), R.layout.fragment, informations);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;

    }
}
