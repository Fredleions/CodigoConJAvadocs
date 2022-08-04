package edu.ec.utpl.poo.tallerHerencia.Main;

/**
 * La clase Multimedia representa una ubicacion, en la cual, podemos ubicar los atritos
 * de un archivo multimedia
 * Ademas que la clase multimedia tiene un tipo de Licencias
 */

public class Multimedia {

    private String ruta;
    private Licencia licencia;
    private double tamanio;
    private String extension;

    /**
     * Crea un Multimedia(CONSTRUCTOR) que se encarga de inicializar los siguientes aprametros:
     * @param ruta en donde se ubica el archivo
     * @param licencia Que tipo de licencia es ya sea COPYRIGHT, CREATIVE_COMMONS, DOMINIO_PUBLICO
     * @param tamanio Cuanto pesa o ocupa
     * @param extension El tipo de formato de video
     */
    public Multimedia(String ruta, Licencia licencia, double tamanio, String extension) {
        this.ruta = ruta;
        this.licencia = licencia;
        this.tamanio = tamanio;
        this.extension = extension;
    }

    /**
     * Devuelve la ruta del archivo
     * @return ruta
     */
    public String getRuta() {
        return ruta;
    }

    /**
     * Permite cambiar la ruta del archivo
     * @param ruta
     */
    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    /**
     * Devuelve la Licencia que tiene el archivo
     * @return licencia
     */
    public Licencia getLicencia() {
        return licencia;
    }

    /**
     * Permite cambiar el parametro Licencia
     * @param licencia
     */
    public void setLicencia(Licencia licencia) {
        this.licencia = licencia;
    }

    /**
     * Devuelve el tamaño del archivo
     * @return tamanio
     */
    public double getTamanio() {
        return tamanio;
    }

    /**
     * Permite cambiar el tamaño
     * @param tamanio
     */
    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }

    /**
     * Devuelve la extecion o formato
     * @return extension
     */
    public String getExtension() {
        return extension;
    }

    /**
     * Permite cambiar el formato
     * @param extension
     */
    public void setExtension(String extension) {
        this.extension = extension;
    }
}
