public interface Cola <T> {
    void encolar(T elem);
    T desencolar();
    T asomar();
    Integer largo();
    boolean esVacia();
    void vaciar();
}
