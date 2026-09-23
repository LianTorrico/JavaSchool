public class SegmentoColorato {
    private Colors colori= new Colors(); //Metodi per colori
    private Punto start;
    private Punto end;
    public int colore=0;
    public SegmentoColorato(Punto start, Punto end) {
        this.start=start;
        this.end=end;
        this.colore=colore; //Default 0 (Rosso)
    }

}
