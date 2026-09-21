import java.awt.*;
import java.util.*;

public class Colors {
    private int rgb1;
    private int rgb2;
    private int rgb3;
    public int getColore(){ //Input per getRed, getGreen, getBlue
        String unionecolori;
        try{
            unionecolori=String.valueOf(rgb1)+String.valueOf(rgb2)+String.valueOf(rgb3);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        int colorefinale;
        try{
            colorefinale= Integer.valueOf(unionecolori);
        }
        catch (Exception e){
            throw new RuntimeException(e);
        }
        return colorefinale;
    }
    public Color setColore(int r, int g, int b) {
        boolean ErrorHandler = false;
        while (ErrorHandler!=true){
            if (r<255&&r>0&&g<255&&g>0&&b<255&b>0){
                ErrorHandler=true;
            }
            else {
                //Correzione r, g & b
                System.out.println("");
            }
        }

        /*prendo c in considerazione come se l'utente avvesse già eseguito getColor
          per ottenere l'rgb completo.
         */
        return 0;
    }
}
