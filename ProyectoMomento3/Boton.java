
/* Se usa el "abstract" para tener a proposito un lienco que se puede usar para crear cosas completas (los otros botones)*/
public abstract class Boton {
    /* Se hace la definiciones de las enumeraciones */
    protected boolean iluminado;
    protected String idBoton;
 /* Se usa "Protected" ya que permite una flexibilidad mayor de los datos a la herencia de las clases hijas */
    public Boton(String idBoton){
        this.idBoton = idBoton;
        this.iluminado = false;
    }

    public abstract void presionar();
    public abstract void reset();

    public boolean estaIluminado(){
        return iluminado;
    }
    public void setIlumiado(boolean iluminado){
        this.iluminado = iluminado;
    }

    public String getIdBoton(){
        return idBoton;
    }
}

