import java.util.ArrayList;
import java.util.List;

public class ColaDinamica<T> implements Cola<T>{
    private List<T> elementos = new ArrayList<>();

   
    public ColaDinamica(){
        elementos = new ArrayList<>();
    }

    

    @Override
    public void encolar(T elem){
        elementos.add(elem);
    }

    @Override
    public T desencolar(){
        
        return elementos.remove(0);
    }
    @Override
    public T asomar(){
        
        return elementos.get(0);
        
    }
    @Override
    public Integer largo(){
        return elementos.size();
    }
    @Override
    public boolean esVacia(){
        return elementos.isEmpty();
    }
    @Override
    public void vaciar(){
        elementos.clear();
    }

    @Override
    public String toString(){
        String salida = "";
        for(T e : elementos){
            salida +=  e.toString() + " ";

        }
        return salida;
    }
}
