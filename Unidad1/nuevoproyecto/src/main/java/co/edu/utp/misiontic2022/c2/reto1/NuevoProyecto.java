package co.edu.utp.misiontic2022.c2.reto1;

public class NuevoProyecto {
    public static void main(String[] args) {
        NuevoProyecto np = new NuevoProyecto(12,10000000,0.9);
        System.out.println(np.calcularInteresSimple()); 
        System.out.println(np.calcularInteresCompuesto()); 
        System.out.println(np.compararInversion());
    }

    private int periodo;
    private Double monto;
    private Double interes;
    
    // -----------------------------------------------------------------
// Atributos
// -----------------------------------------------------------------
// -----------------------------------------------------------------
// Métodos
// -----------------------------------------------------------------
    NuevoProyecto(){
        this(0, 0.0, 0.0);
    }

    NuevoProyecto(int periodo, double monto, double interes){
        this.periodo = periodo;
        this.monto = monto;
        this.interes = interes;
    }

    // public NuevoProyecto(int periodo, int monto, double d) {
    // }

    public double calcularInteresSimple(){
        return Math.round(monto * (interes / 100) * periodo);
        //return monto * (interes / 100) * periodo;
    }
    public double calcularInteresCompuesto(){
        return Math.round(monto * (Math.pow((1 + (interes / 100)), periodo) - 1));
        //return monto * (Math.pow((1 + (interes / 100)), 3) - 1);
    }
    /**
    * Método para comparar la diferencia en el total de intereses generados para
    el proyecto.
    * Respuesta al Reto.
    */
    public double compararInversion ( int pPeriodo, double pMonto, double pInteres )
    {
        this.periodo = pPeriodo;
        this.monto = pMonto;
        this.interes = pInteres;
        return calcularInteresCompuesto() - calcularInteresSimple();
    }

    public double compararInversion()
    {
        return calcularInteresCompuesto() - calcularInteresSimple();
    }
    
}

