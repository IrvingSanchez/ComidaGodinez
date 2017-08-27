package irving.comidagodinez;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by irving on 27/08/17.
 */

public class DescriptionDialog extends DialogFragment {

    private Platillo mPlato;
    private Activity activity;


    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        LayoutInflater inf = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View v = inf.inflate(R.layout.descripcion, null);
        TextView title = (TextView) v.findViewById(R.id.nombrePlato);
        title.setText(mPlato.getmPlatillo());

        TextView description = (TextView) v.findViewById(R.id.descripcionPlato);
        description.setText(mPlato.getmDescripcion());

        Button ordenar = (Button) v.findViewById(R.id.ordenar);
        ordenar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(activity,DetallesCompra.class);
                startActivity(i);
                dismiss();
            }
        });

        builder.setView(v);
        return builder.create();
    }

    public DescriptionDialog setPlatillo(Platillo mPlato, Activity activity) {
        this.mPlato = mPlato;
        this.activity = activity;
        return this;
    }

}

