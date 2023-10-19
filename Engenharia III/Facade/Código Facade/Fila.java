class Fila {
    private FemininaFila femininaFila;
    private MasculinoFila masculinoFila;
    private MistaFila mistaFila;

    public Fila() {
        femininaFila = new FemininaFila();
        masculinoFila = new MasculinoFila();
        mistaFila = new MistaFila();
    }

    public void entrarFeminina(String femininaFile) {
        femininaFila.entrarFeminina(femininaFile);
    }

    public void entrarMasculino(String masculinoFila) {
        masculinoFila.entrarMasculino(masculinoFile);
    }

    public void entrarMista(String mistaFile) {
        mistaFila.entrarMista(mistaFile);
    }
}