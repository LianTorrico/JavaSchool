public class PoligonoColorato {
    private Colors colori= new Colors();
    private SegmentoColorato[] segmenti;
    public PoligonoColorato(Punto[] punti){
        segmenti= new SegmentoColorato[punti.length];
        if (punti.length<3){
            throw new IllegalArgumentException("Un poligono è formato da un minimo di 3 punti");//Minimo per poligono
        }
        for (int i=0; i<punti.length-1; i++){
            segmenti[i]= new SegmentoColorato(punti[i], punti[i+1]); //Poteva essere approcciato con .getX / .getY
        }
        segmenti[segmenti.length-1]=new SegmentoColorato(punti[punti.length -1], punti[0]);//Chiusura

    }
    public int getNumeroSegmenti(){
        return segmenti.length;
    }
    public SegmentoColorato getSegmento(int n) {
        if (n >= segmenti.length) {
            throw new IndexOutOfBoundsException(
                    "Segmento non esistente o irragiungibile");
        }
        return segmenti[n]; // x,y
    }
    public void setColore(int colore) {
        for (int i = 0; i < segmenti.length; i++) {
            colori.setColore(segmenti[i],colore); //Poligono intero
        }
    }
    public void setColore(int colore, int n) {
        if (n < 0 || n >= segmenti.length) {
            throw new IndexOutOfBoundsException(
                    "Segmento inesistente");
        }
        colori.setColore(segmenti[n],colore); //segmento specifico
    }
    public String getColori() {
        String risultato = "";
        for (int i = 0; i < segmenti.length; i++) {
            switch (colori.getColore(segmenti[i])) {
                case 0:
                    risultato += "rosso ";
                    break;
                case 1:
                    risultato += "verde ";
                    break;
                case 2:
                    risultato += "giallo ";
                    break;
                case 3:
                    risultato += "blu ";
                    break;
                case 4:
                    risultato += "bianco ";
                    break;
                case 5:
                    risultato += "nero ";
                    break;
                case 6:
                    risultato += "grigio ";
                    break;
                case 7:
                    risultato += "arancione ";
                    break;
                default:
                    risultato += "sconosciuto ";
            }
        }
        return risultato;
    }
}


/* esempio punti
X Y
0,0
5,0
5,3
0,3
Numero punti = Numero segmenti
 */
