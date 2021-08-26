/*
Crea una clase en Java donde declares una variable de tipo array de Strings que
contenga los doce meses del año, en minúsculas. A continuación declara una
variable mesSecreto de tipo String, y hazla igual a un elemento del array (por
ejemplo mesSecreto = mes[9]. El programa debe pedir al usuario que adivine el
mes secreto. Si el usuario acierta mostrar un mensaje, y si no lo hace, pedir que
vuelva a intentar adivinar el mes secreto. Un ejemplo de ejecución del programa
podría ser este:
Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: febrero
No ha acertado. Intente adivinarlo introduciendo otro mes: agosto
No ha acertado. Intente adivinarlo introduciendo otro mes: octubre
¡Ha acertado!
*/

package E_17;

public class Secreto {
    private String mesSecreto;
    private String aleatorio;

    public Secreto(String mesSecreto, String aleatorio) {
        this.mesSecreto = mesSecreto;
        this.aleatorio = aleatorio;
    }
    
    public Secreto(){
        String[] meses = {"enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"};
        this.aleatorio = meses[(int) Math.floor(Math.random()*12)];
        //System.out.println(aleatorio);
    }

    public String getMesSecreto() {
        return mesSecreto;
    }

    public void setMesSecreto(String mesSecreto) {
        this.mesSecreto = mesSecreto;
    }

    public String getAleatorio() {
        return aleatorio;
    }

    public void setAleatorio(String aleatorio) {
        this.aleatorio = aleatorio;
    }    
}
