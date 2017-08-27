package irving.comidagodinez;


import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

 public class Menu extends AppCompatActivity {

    ListView lv;
    ArrayList<Platillo> arrayMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        lv = (ListView) findViewById(R.id.lista);
        arrayMenu = new ArrayList<>();
        Platillo p1 = new Platillo("Chiles en Nogada",
                "Este es un platillo típico Mexicano durante las fiestas patrias. " +
                "Es un chile poblano relleno de carne molida con pasas y acitrón, " +
                        "bañado en una salsa de nuez. Decorado con granada y perejil.",
                50, 0);
        Platillo p2 = new Platillo("Carne Asada", "Descripción",50, 1);
        Platillo p3 = new Platillo("Pollo a la Crema", "Pieza de pollo bañada en crema.",50, 2);

        arrayMenu.add(p1);
        arrayMenu.add(p2);
        arrayMenu.add(p3);
        AdaptadorPlatillo adapter = new AdaptadorPlatillo(this, arrayMenu);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                DescriptionDialog dialogo = new DescriptionDialog().setPlatillo(arrayMenu.get(position),Menu.this);
                dialogo.show(fragmentManager, "tagDescripcion");
            }
        });
    }
}
