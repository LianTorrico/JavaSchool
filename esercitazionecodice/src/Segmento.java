public class Segmento {
    private int start;
    private int end;
    public Segmento(int start, int end){
        this.start = start;
        this.end = end;
    }
    public int lunghezza() {
        int lunghezzatotale;
        lunghezzatotale = start + end;
        return lunghezzatotale;
    }
}

