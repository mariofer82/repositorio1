

public class Punto {
     protected int x, y;

     public Punto ( int x, int y ) {
         this.x = x;
         this.y = y;
     }
     /**
     * Devuelve la distancia al eje de coordenadas
     *
     */
     public double distancia() {
         return Math.sqrt(Math.pow(x,2.0)+Math.pow(y,2.0));
     }
}
