package irving.comidagodinez;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by irving on 26/08/17.
 */

public class AdaptadorPlatillo extends BaseAdapter {


    protected Activity activity;
    protected ArrayList<Platillo> items;

    public AdaptadorPlatillo (Activity activity, ArrayList<Platillo> items) {
        this.activity = activity;
        this.items = items;
    }

    public void addAll(ArrayList<Platillo> category) {
        for (int i = 0; i < category.size(); i++) {
            items.add(category.get(i));
        }
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;

        if (convertView == null) {
            LayoutInflater inf = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = inf.inflate(R.layout.item, null);
        }

        Platillo dir = items.get(position);

        TextView title = (TextView) v.findViewById(R.id.platillo);
        title.setText(dir.getmPlatillo());

        TextView description = (TextView) v.findViewById(R.id.cantidad);
        description.setText(String.valueOf(dir.getmCantidad()));

        return v;
    }
}
