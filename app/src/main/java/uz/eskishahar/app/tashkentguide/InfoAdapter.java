package uz.eskishahar.app.tashkentguide;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.ArrayList;

public class InfoAdapter extends ArrayAdapter<Information> {
    public InfoAdapter(@NonNull Activity context, int simple_list_item_1, @NonNull ArrayList<Information> information) {
        super(context, simple_list_item_1, information);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.fragment, parent, false);
        }

        Information currentInformation = getItem(position);

        TextView nameTextView = listItemView.findViewById(R.id.name);
        nameTextView.setText(currentInformation.getName());

        TextView addressTextView = listItemView.findViewById(R.id.address);
        addressTextView.setText(currentInformation.getAddress());

        TextView webSiteTextView = listItemView.findViewById(R.id.webSite);
        webSiteTextView.setText(currentInformation.getWebsite());

        TextView contactsTextView = listItemView.findViewById(R.id.contacts);
        contactsTextView.setText(currentInformation.getContacts());

        TextView workTimeTextView = listItemView.findViewById(R.id.workTime);
        workTimeTextView.setText(currentInformation.getWorkTime());

        TextView infoTextView = listItemView.findViewById(R.id.info);
        infoTextView.setText(currentInformation.getInfo());

        ImageView imageView = listItemView.findViewById(R.id.imageOfObject);
        imageView.setImageResource(currentInformation.getImage());

        return listItemView;
    }
}
