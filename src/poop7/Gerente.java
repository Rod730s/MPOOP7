package poop7;

/**
 *
 * @author rodri_001
 */
public class Gerente extends Empleado {
    private float presupuesto;

    public Gerente() {
        // Constructor vacío
    }

    public Gerente(float presupuesto, String nombre, int numEmpleado, float sueldo) {
        super(nombre, numEmpleado, sueldo);
        this.presupuesto = presupuesto;
    }

    public Gerente(float presupuesto) {
        this.presupuesto = presupuesto;
    }

    public float getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(float presupuesto) {
        this.presupuesto = presupuesto;
    }

    public float asignarPresupuesto(float presupuesto) {
        this.presupuesto = presupuesto;
        return presupuesto;
    }

    @Override
    public String toString() {
        return super.toString() + " Gerente{" + "presupuesto=" + presupuesto + '}';
    }
}
