public static Fila {
    private static Fila fila;
    private Fila() {}
    public void Fila getInstance() {
        if(fila==null) {
            fila = new Fila;
        }
        return fila;
    }

    public entrar(String documento) {
        System.out.println("Entrando na fila: " + documento);
    }
}