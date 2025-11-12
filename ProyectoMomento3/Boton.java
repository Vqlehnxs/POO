
/* Se usa el "abstract" para tener a proposito un lienso que se puede usar para crear cosas completas (los otros botones)*/
public abstract class Boton {
    protected boolean iluminado;
    protected String idBoton;
 /* Se usa "Protected" ya que permite una flexibilidad mayor de los datos a la herencia de las clases hijas */

    public Boton(String idBoton){  /* Metodo constructor */
        this.idBoton = idBoton;
        this.iluminado = false;
    }
/* Aca utilizo metodos abstractos, ya que estos propios metodos seran sobreescritos  */

    public abstract void presionar();
    public abstract void reset();

    public boolean estaIluminado(){
        return iluminado;
    }
    /*Setter */
    public void setIlumiado(boolean iluminado){
        this.iluminado = iluminado;
    }
    /*Get */
    public String getIdBoton(){
        return idBoton;
    }
}

