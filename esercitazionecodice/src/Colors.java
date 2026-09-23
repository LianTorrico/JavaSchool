import java.awt.*;
import java.util.*;

public class Colors {
    //---
    //Non è necessario creare un colore, bensì è un codice identificativo (Punto 6).
    //---
    public int getColore(SegmentoColorato segmentoColorato){
        return segmentoColorato.colore;
    }
    public int setColore(SegmentoColorato segmentoColorato, int colore) {
        segmentoColorato.colore=colore;
        return 0;
    } //Nessun colore, cambia 'codice identificativo' ad oggetto
    public String getNomeColore(int n) {
        String coloreoutput = "";
        switch (n) {
            case 0:
                coloreoutput = "rosso ";
                break;
            case 1:
                coloreoutput = "verde ";
                break;
            case 2:
                coloreoutput = "giallo ";
                break;
            case 3:
                coloreoutput = "blu ";
                break;
            case 4:
                coloreoutput = "bianco ";
                break;
            case 5:
                coloreoutput = "nero ";
                break;
            case 6:
                coloreoutput = "grigio ";
                break;
            case 7:
                coloreoutput = "arancione ";
                break;
            default:
                coloreoutput = "sconosciuto ";
        }
        return coloreoutput;
    }
    }
