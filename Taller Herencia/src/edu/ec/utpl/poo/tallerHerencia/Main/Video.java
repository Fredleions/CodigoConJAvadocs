package edu.ec.utpl.poo.tallerHerencia.Main;

/**
 * La clase Video representa una ubicaccion donde se pueden poner atributos de un video
 * Ademas que extiende de la clase multimedia
 */

public class Video extends Multimedia {

    private double duracion;
    private String titulo;
    private boolean estaTranscrito;

    /**
     * Crea un viedo(CONSTRUCTOT) que inicializa los siguientes parametros:
     * @param ruta En donde esta ubicado
     * @param licencia Que tipo de licencia es ya sea COPYRIGHT, CREATIVE_COMMONS, DOMINIO_PUBLICO
     * @param tamanio Cuanto pesa o ocupa
     * @param extension El tipo de formato de video
     * @param duracion El tiempo de duracion del mismo
     * @param titulo El titulo del video
     * @param estaTranscrito Si el video esta transcrito
     */

    public Video(String ruta, Licencia licencia, double tamanio, String extension,
                 double duracion, String titulo, boolean estaTranscrito) {
        super(ruta, licencia, tamanio, extension);
        this.duracion = duracion;
        this.titulo = titulo;
        this.estaTranscrito = estaTranscrito;
    }

    /**
     * Devuelve el tiempo de duracion
     * @return La duracion del video
     */
    public double getDuracion() {
        return duracion;
    }

    /**
     * Permite Cambiar el atributo duracion
     * @param duracion
     */
    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    /**
     * Devuelve el Titulo del video
     * @return Nombre del titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Permite Cambiar el atributo titulo
     * @param titulo
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Devuelve si es transcito o no
     * @return un verdadero o falso
     */
    public boolean isEstaTranscrito() {
        return estaTranscrito;
    }

    /**
     * Permite Cambiar el atributo estaTranscrito
     * @param estaTranscrito
     */
    public void setEstaTranscrito(boolean estaTranscrito) {
        this.estaTranscrito = estaTranscrito;
    }
}
