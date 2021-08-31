/*
 Crear una clase Rectángulo que modele rectángulos por medio de cuatro puntos
(los vértices). La clase dispondrá de dos constructores: uno que cree un rectángulo
partiendo de sus cuatro vértices y otro que cree un rectángulo partiendo de la base
y la altura, de forma que su vértice inferior izquierdo esté en (0,0). La clase también
incluirá un método para calcular la superficie y otro que desplace el rectángulo en
el plano. Se deberán además definir los métodos getters y setters
correspondientes (𝑆𝑢𝑝𝑒𝑟𝑓𝑖𝑐𝑖𝑒 = 𝑏𝑎𝑠𝑒 ∗ 𝑎𝑙𝑡𝑢𝑟𝑎).
 */

package ejercicio07;


public class Rectangulo {
    
    private int v1;
    private int v2;
    private int v3;
    private int v4;
    private int base;
    private int altura;
    private int x=0;
    private int y=0;

    public Rectangulo(int v1, int v2, int v3, int v4) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
        this.v4 = v4;
    }

    public Rectangulo(int v1, int v2, int v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
        base = v2 - v1;
        altura = v3 - v1;   
    }
 

    public Rectangulo() {
        
    }

    public int getV1() {
        return v1;
    }

    public void setV1(int v1) {
        this.v1 = v1;
    }

    public int getV2() {
        return v2;
    }

    public void setV2(int v2) {
        this.v2 = v2;
    }

    public int getV3() {
        return v3;
    }

    public void setV3(int v3) {
        this.v3 = v3;
    }

    public int getV4() {
        return v4;
    }

    public void setV4(int v4) {
        this.v4 = v4;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    
    /**
     * 
     * @param base
     * @param altura
     * @return 
     */
    public int superficie(int base, int altura) {
        int superficie= base*altura;
        return superficie;
    }
    
    //se desplaza izq o derecha segun si es + o -
    public void desplazar(int n) {
        v1+=n; //v1=v1+n; v1=v1-n;
        v2+=n;
        v3+=n;
        v4+=n;
        System.out.println("v1: "+v1+" v2: "+v2+" v3: "+v3+" v4: "+v4);
    }
    
//    public void desplazarIzq(int n) {
//        v1-=n;
//        v2-=n;
//        v3-=n;
//        v4-=n;
//        System.out.println("");
//    }
    
}
