import java.util.Arrays;

public class ColaEstatica implements Cola<Integer> {
    private static  final int LONG_DEFAULT = 10;
    private static  final int LONG_AUMENTO = 2;
    private Integer[] elementos;
    private Integer cantElemEncolados;
    

    public ColaEstatica(){
        this(LONG_DEFAULT);
    }

    public ColaEstatica( int tamanio){
        elementos = new Integer[tamanio];
        cantElemEncolados = 0;
    }

    @Override
    public void encolar(Integer elem){
        if (cantElemEncolados == elementos.length){
            elementos = Arrays.copyOf(elementos, cantElemEncolados + LONG_AUMENTO);
        }
        elementos[cantElemEncolados++] = elem;
    }

    @Override
    public Integer desencolar(){
            
        int fletar = asomar();
        for (int i=0; i < cantElemEncolados - 1;i++){
            elementos[i] = elementos[i+1]; 
        }
        cantElemEncolados--;

        if (cantElemEncolados < elementos.length / 2){
            elementos = Arrays.copyOf(elementos, cantElemEncolados + LONG_AUMENTO);
        }
    
        return fletar;
    }
    @Override
    public Integer asomar(){
        if (esVacia()){
            throw new RuntimeException("Cola vacia");
        }
        return elementos[0];
        
    }
    @Override
    public Integer largo(){
        return cantElemEncolados;
    }
    @Override
    public boolean esVacia(){
        return cantElemEncolados == 0;
    }
    @Override
    public void vaciar(){
        elementos = new Integer[LONG_DEFAULT];
    }

    @Override
    public String toString(){
        String salida = "";
        for(int i = 0 ; i < cantElemEncolados;i++ ){
            salida +=  elementos[i].toString() + " ";

        }
        return salida;
    }

}