/** File Punto.java */
public class Punto {
    private int x;
    private int y;
    
    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public int getX() {
        return this.x;
    }
    
    public int getY() {
        return this.y;
    }
    
    public void sposta(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

