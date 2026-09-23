//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Punto[] triangolo= {
            new Punto(0, 0),
            new Punto(6, 0),
            new Punto(3, 8)
    };
    PoligonoColorato triangolocolorato= new PoligonoColorato(triangolo);
    triangolocolorato.setColore(2);
    triangolocolorato.setColore(0,2);
    System.out.println("TRIANGOLO\nNumero Lati: "+triangolocolorato.getNumeroSegmenti()+"\nColori: "+ triangolocolorato.getColori());
    Punto[] esagono= {
            new Punto(0,0),
            new Punto(1,0),
            new Punto(2,1),
            new Punto(2,2),
            new Punto(1,3),
            new Punto(0,2)
    };

    PoligonoColorato esagonocolorato= new PoligonoColorato(esagono); //1 verde 3 blu
    esagonocolorato.setColore(1,0);
    esagonocolorato.setColore(3,1);
    esagonocolorato.setColore(1,2);
    esagonocolorato.setColore(3,3);
    esagonocolorato.setColore(1,4);
    esagonocolorato.setColore(3,5);
    System.out.println("TRIANGOLO\nNumero Lati: "+esagonocolorato.getNumeroSegmenti()+"\nColori: "+ esagonocolorato.getColori());
    //IO.println
    }
