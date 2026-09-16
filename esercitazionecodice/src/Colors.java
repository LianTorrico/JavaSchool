public class Colors {
    private int rgb1;
    private int rgb2;
    private int rgb3;
    public int getColore(){
        string unionecolori;
        unionecolori=rgb1.toString()+rgb2.toString()+rgb3.toString();
        int colorefinale= unionecolori.toInt32;
        return colorefinale;
    }
    public int setColore(int c) {
        /*prendo c in considerazione come se l'utente avvesse già eseguito getColor
          per ottenere l'rgb completo.
         */
        return 0;
    }
}
