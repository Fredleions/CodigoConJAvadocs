package edu.ec.utpl.poo.tallerHerencia.Main;

/**
 * La clase dimension representa una ubicacion en la cual pondremos el alto como el ancho de la imagen
 */
public class Dimension {

    private int ancho;
    private int alto;

    /**
     * Crea una Dimension(CONSTRUCTOR) encargado de inicializar los siguientes aprametros:
     * @param ancho La longitud de la imagen en el eje x
     * @param alto La logitud de la imagen en el eje y
     */
    public Dimension(int ancho, int alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    /**
     * Devuelve el ancho de la imagen
     * @return ancho
     */
    public int getAncho() {
        return ancho;
    }

    /**
     * Devuelve el alto de la imagen
     * @return alto
     */
    public int getAlto() {
        return alto;
    }

    /**
     * Permite cambair el ancho
     * @param ancho
     */
    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    /**
     * Permite cambiar el alto
     * @param alto
     */
    public void setAlto(int alto) {
        this.alto = alto;
    }
}
