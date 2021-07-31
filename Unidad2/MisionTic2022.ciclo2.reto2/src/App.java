// Esta clase es para las pruebas, no se debe subir como parte de la solución 
public class App { 
    public static void main(String[] args) { 
    //Caso de Prueba 1 
    Dispositivo dispositivos[]=new Dispositivo[5];
    dispositivos[0]=new Dispositivo(200.0, 3, 'C');
    dispositivos[1]=new Tablet(150.0, 2);
    dispositivos[2]=new Portatil(500.0, 3, 'E', 250);
    dispositivos[3]=new Tablet();
    dispositivos[4]=new Dispositivo(600.0, 3, 'D');
    PrecioTotal solucion1 = new PrecioTotal(dispositivos);
    solucion1.mostrarTotales();
    // Portatil portatil = new Portatil(200, 3);
    // System.out.println(portatil.calcularPrecio());
    }
}


// Inicio de la solución 
class PrecioTotal { 
    // Atributos totalDispositivos, totalPortatiles, totalTablets y listaDispositivos.
    public double totalDispositivos = 0;
    public double totalPortatiles = 0;
    public double totalTablets = 0;
    //public ArrayList<Dispositivo> listaDispositivos = new ArrayList<Dispositivo>();
    public Dispositivo[] listaDispositivos;
    // Constructores 
    PrecioTotal(Dispositivo[] pDispositivos){
        listaDispositivos = pDispositivos;
        for (int i = 0; i < pDispositivos.length; i++) {
            //this.listaDispositivos.add(pDispositivos[0]);
            //Arrays.fill(listaDispositivos, pDispositivos[i]); 
            double precioDispositivo = pDispositivos[i].calcularPrecio();
            this.totalDispositivos += precioDispositivo;
            if(pDispositivos[i] instanceof Portatil){
                this.totalPortatiles += precioDispositivo;
            }else if(pDispositivos[i] instanceof Tablet){
                this.totalTablets += precioDispositivo;
            }
        }
    }
    // Metodos 
    public void mostrarTotales(){ 
    // Calculo de totales 
    System.out.println("La suma del precio de los Dispositivos es de " + totalDispositivos); 
    System.out.println("La suma del precio de los Computadores portatiles es de " + totalPortatiles); 
    System.out.print("La suma del precio de las Tablets es de " + totalTablets); 
    }  
}
 
class Dispositivo {
    //Constantes y atributos
    public static final char CONSUMO_W_BASE = 'F';
    public static final int PESO_BASE = 1;
    public static final double PRECIO_BASE = 100.0;
    public char consumoW;
    public int peso;
    public double precioBase;
    public double adicion;
    //Constructores
    public Dispositivo(){
        this.consumoW = CONSUMO_W_BASE;
        this.peso = PESO_BASE;
        this.precioBase = PRECIO_BASE;
    }
    
    public Dispositivo(double precioBase, int peso){
     this.precioBase = precioBase;
     this.peso = peso;
     this.consumoW = CONSUMO_W_BASE;
    //codigo
    } 
     
    public Dispositivo(double precioBase, int peso, char consumoW){ 
    this(precioBase, peso);
    comprobarconsumoW(consumoW);
    } 
    // Metodos 
     
    public void comprobarconsumoW(char consumoW){
        if(consumoW != 'F'){
            this.consumoW=consumoW;
            }else{
            this.consumoW=CONSUMO_W_BASE;
            }
    }

    public void adicionConsumoW(){
        if(this.consumoW == 'A'){
            this.adicion += 100; 
        }else if(this.consumoW == 'B'){
            this.adicion += 80;
        }else if(this.consumoW == 'C'){
            this.adicion += 60;
        }else if(this.consumoW == 'D'){
            this.adicion += 50;
        }else if(this.consumoW == 'E'){
            this.adicion += 30;
        }else if(this.consumoW == 'F'){
            this.adicion += 10;
        }
    }

    public void adicionPeso(){
        if(this.peso > 1 && this.peso <= 2){
            this.adicion += 10;
        }else if(this.peso > 2 && this.peso <= 3){
            this.adicion += 50;
        }else if(this.peso > 3 && this.peso <= 4){
            this.adicion += 80;
        }else if(this.peso > 4){
            this.adicion += 100;
        }
    }

    public Double calcularPrecio(){ 
    adicionConsumoW();
    adicionPeso();
    return precioBase + adicion;
    }
}
     

class Tablet extends Dispositivo{ 
    //Constantes y atributos
    private static final int MEMORIA_RAM_BASE = 1;
    public int memoriaRam;
    //Constructor 
    public Tablet(){ 
        super();
        this.memoriaRam = MEMORIA_RAM_BASE;
    } 
    public Tablet(double precioBase, int peso){ 
        super(precioBase, peso);
        this.memoriaRam = MEMORIA_RAM_BASE;
    } 
    public Tablet(double precioBase, Integer peso, char consumoW, Integer memoriaRam){ 
        super(precioBase, peso, consumoW);
        this.memoriaRam = memoriaRam;
    } 
    // Métodos
    private void adicionMemoriaRam() {
        if(this.memoriaRam > 1 && this.memoriaRam <= 2){
            this.adicion += 5;
        }else if(this.memoriaRam > 2 && this.memoriaRam <= 4){
            this.adicion += 25;
        }else if(this.memoriaRam > 4){
            this.adicion += 50;
        }
    }

    public Double calcularPrecio(){
        adicionMemoriaRam();
        return super.calcularPrecio();
    }
     
} 
    
class Portatil extends Dispositivo{ 
    //Constantes y atributos 
    public static final int DD_BASE = 250;
    private int discoDuro;

    //Constructor 
    public Portatil (){ 
        super();
        this.discoDuro = DD_BASE;
    } 
     
    public Portatil(double precioBase, int peso){ 
        super(precioBase, peso);
        this.discoDuro = DD_BASE;
    } 
     
    public Portatil(double precioBase, int peso, char consumoW, int discoDuro){ 
        super(precioBase, peso, consumoW);
        this.discoDuro = discoDuro;
    } 
     
    // Métodos 
    public void adicionDD(){
        if(this.discoDuro > 250 && this.discoDuro <= 500){
            this.adicion += 10;
        }else if(this.discoDuro > 500 && this.discoDuro <= 1000){
            this.adicion += 50;
        }else if(this.discoDuro > 1000){
            this.adicion += 100;
        }
    }
    public Double calcularPrecio(){ 
        adicionDD();
        return super.calcularPrecio();
    } 
} 
     
    // Fin de la solución  
    
     
     