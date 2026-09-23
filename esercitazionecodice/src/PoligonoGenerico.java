public class PoligonoGenerico {
    private Segmento[] segmenti;
    public PoligonoGenerico(Punto[] punti){
        segmenti= new Segmento[punti.length];
        if (punti.length<3){
            throw new IllegalArgumentException("Un poligono è formato da un minimo di 3 punti");//Minimo per poligono
        }
        for (int i=0; i<punti.length-1; i++){
            segmenti[i]= new Segmento(punti[i], punti[i+1]); //Poteva essere approcciato con .getX / .getY
        }
        segmenti[segmenti.length-1]=new Segmento(punti[punti.length -1], punti[0]);//Chiusura

    }
    public int getNumeroSegmenti(){
        return segmenti.length;
    }
    public Segmento getSegmento(int n) {
        if (n >= segmenti.length) {
            throw new IndexOutOfBoundsException(
                    "Segmento non esistente o irragiungibile");
        }
        return segmenti[n]; // x,y
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
