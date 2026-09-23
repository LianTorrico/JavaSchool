public class Segmento {
    private Punto start;
    private Punto end;
    public Segmento(Punto start, Punto end){ //Modifica, rende Segmento dipendente da Punto
        this.start = start;                  //Senza, Punto non avrebbe senso di esistere
        this.end = end;
    }
    public int lunghezza() {
        int lunghezzatotale;
        int x,y;
        x= start.getX();
        y= end.getY();
        lunghezzatotale = x+y;
        return lunghezzatotale;
    }
}

