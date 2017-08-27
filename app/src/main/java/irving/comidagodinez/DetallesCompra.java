package irving.comidagodinez;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class DetallesCompra extends AppCompatActivity {

    Toolbar tb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalles_compra);
        tb = (Toolbar) findViewById(R.id.toolbar);

        setSupportActionBar(tb);
        tb.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DetallesCompra.this.finish();
            }
        });
    }
}
