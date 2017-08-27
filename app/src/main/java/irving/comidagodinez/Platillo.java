package irving.comidagodinez;

/**
 * Created by irving on 26/08/17.
 */

public class Platillo {
    private int mCantidad;
    private String mPlatillo;
    private String mDescripcion;
    private int mItemId;

    public Platillo(String nombrePlato, String descripcion, int cantidad, int itemId)
    {
        this.mCantidad = cantidad;
        this.mPlatillo = nombrePlato;
        this.mDescripcion = descripcion;
        this.mItemId = itemId;
    }

    public int getmCantidad() {
        return mCantidad;
    }

    public void setmCantidad(int mCantidad) {
        this.mCantidad = mCantidad;
    }

    public String getmPlatillo() {
        return mPlatillo;
    }

    public void setmPlatillo(String mPlatillo) {
        this.mPlatillo = mPlatillo;
    }

    public int getmItemId() {
        return mItemId;
    }

    public void setmItemId(int mItemId) {
        this.mItemId = mItemId;
    }

    public String getmDescripcion() {
        return mDescripcion;
    }

    public void setmDescripcion(String mDescripcion) {
        this.mDescripcion = mDescripcion;
    }
}
