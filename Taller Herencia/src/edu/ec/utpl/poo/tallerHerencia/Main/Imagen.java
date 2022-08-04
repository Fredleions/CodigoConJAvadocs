package edu.ec.utpl.poo.tallerHerencia.Main;

/**
 * La clase Imagen representa una ubicacion, en la cual, ponemos los atribuos de un tipo de imagen
 * Ademas extiende de la clase multimedia
 * Tiene una asociacion de composición con dimension
 */
public class Imagen  extends Multimedia {

    private String textoAlt;
    private Dimension dimension;
    private boolean esTransparente;

    /**
     * Crea una Imagen(CONSTRUCTOR) encargado de incializar los siguietnes parametros:
     * @param ruta Ubicacion del archivo
     * @param licencia Que tipo de licencia es ya sea COPYRIGHT, CREATIVE_COMMONS, DOMINIO_PUBLICO
     * @param tamanio Cuanto pesa o ocupa
     * @param extension que formato lleva el archivo
     * @param textoAlt El texto de la imagen
     * @param esTransparente si es transparente
     */

    public Imagen(String ruta, Licencia licencia, double tamanio, String extension,
                  String textoAlt, boolean esTransparente) {
        super(ruta, licencia, tamanio, extension);
        this.textoAlt = textoAlt;
        this.esTransparente = esTransparente;
    }

    /**
     * Devuleve el texto de la iamgen
     * @return textoAlt
     */
    public String getTextoAlt() {
        return textoAlt;
    }

    /**
     * Permite cambiar el textoAlt
     * @param textoAlt
     */
    public void setTextoAlt(String textoAlt) {
        this.textoAlt = textoAlt;
    }

    /**
     * Inicializa los atributos de la Clase Dimension
     * @param alto
     * @param ancho
     */
    public void adddimension(int alto, int ancho) {
        dimension = new Dimension(alto, ancho);
    }

    /**
     * Devuelve el objeto dimension
     * @return dimension
     */
    public Dimension getDimension() {
        return dimension;
    }

    /**
     * Permite cambiar le objeto dimension
     * @param dimension
     */
    public void setDimension(Dimension dimension) {
        this.dimension = dimension;
    }

    /**
     * Devuelve si es transparente
     * @return true or false
     */
    public boolean isEsTransparente() {
        return esTransparente;
    }

    /**
     * Permite cambiar si es transparente o no
     * @param esTransparente
     */
    public void setEsTransparente(boolean esTransparente) {
        this.esTransparente = esTransparente;
    }
}
