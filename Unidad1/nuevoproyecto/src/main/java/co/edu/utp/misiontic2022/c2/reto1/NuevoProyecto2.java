public class NuevoProyecto2 {
  
    private double pMonto;
    private double pInteres;
    private int pPeriodo;

    
    public NuevoProyecto2(){
        pMonto = 0;
        pInteres = 0;
        pPeriodo = 0;
    }
    
    public NuevoProyecto2(int pPeriodo, double pMonto, double pInteres){
        this.pMonto = pMonto;
        this.pInteres = pInteres;
        this.pPeriodo = pPeriodo;
    }

    public static void main(String[] args) {
        NuevoProyecto np = new NuevoProyecto(12,10000000,0.9);
        System.out.println(np.calcularInteresSimple());
        System.out.println(np.calcularInteresCompuesto());
        System.out.println(np.compararInversion());
        
        // NuevoProyecto np2 = new NuevoProyecto(6,10000000.0,1.2);
        // System.out.println(np2.calcularInteresSimple());
        // System.out.println(np2.calcularInteresCompuesto());
        // System.out.println(np2.compararInversion());
        
    }
    
    public double calcularInteresSimple(){
        double interesSimple = pMonto*(pInteres/100)*pPeriodo;
        return Math.round(interesSimple);
    }
    
    public double calcularInteresCompuesto(){
        double interesCompuesto = pMonto*(Math.pow((1+(pInteres/100)),pPeriodo)-1);
        return Math.round(interesCompuesto);
    }

    public double compararInversion(int pPeriodo, double pMonto, double pInteres){
        this.pMonto = pMonto;
        this.pInteres = pInteres;
        this.pPeriodo = pPeriodo;
        double diferencia = calcularInteresCompuesto() - calcularInteresSimple();
        return diferencia;
        
    }
    public double compararInversion(){
        double diferencia = 0; 
               diferencia = calcularInteresCompuesto() - calcularInteresSimple();
        return diferencia;
        
    }
    

}