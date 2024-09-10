public class TEST {
    public static void main(String[] args) {
        ColaEstatica p = new ColaEstatica(4);
    
        p.encolar(1);
        p.encolar(2);
        p.encolar(3);
        p.encolar(4); // último elemento segun capacidad
        p.encolar(1); // agrega 2 a capacidad
        p.encolar(2);
        p.encolar(3); // ultimo elemento según capacidad
        p.encolar(4); // agrega 2 a capacidad

        System.out.println("Desencolar: " + p.desencolar());
        System.out.println("Tope: " + p.asomar());
        System.out.println(p.toString());
        
        // Dinámica
        Cola<Integer> p1 = new ColaDinamica<>();

        p1.encolar(1);
        p1.encolar(2);
        p1.encolar(3);
        p1.encolar(4);
        p1.encolar(5);
        
        System.out.println("Desencolar: " + p1.desencolar());
        System.out.println("Tope: " + p1.asomar());
        System.out.println(p1.toString());
            
    }
    

}
