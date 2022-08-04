package edu.ec.utpl.poo.tallerHerencia.Main;

import java.util.ArrayList;
import java.util.List;

/**
 * La clase Mensaje representa una ubicacion para con los atributos dados lanzar un mensaje
 * Tiene una lista de multimedias
 */

public class Mensaje {

    private String texto;
    private List<Multimedia> multimedias;

    /**
     * Crea un Mensaje(Construtor) encargado de inicializar los siguientes parametros:
     * @param texto Lo que va escrito en el mensaje
     */
    public Mensaje(String texto) {
        this.texto = texto;
        multimedias = new ArrayList<>();
    }

    /**
     * El metodo calcularTamanioTotal
     * Se encarga de recorrer la lista
     * Se encarga Sumar el tamaño de la listas para poder obtener un total
     * @return El total de dicha suma
     */
    public double calcularTamanioTotal(){
        double total = 0;
        for(var multimedia : multimedias) {
            total += multimedia.getTamanio();
        }
        return total;
    }

    /**
     * El metodo calcularDuracionTotal
     * Se encarga de recorrer la lista
     * Conocer si es una instacia de Video
     * Sumar la todas las duraciones en la lista
     * @return La duracion total de dicha suma
     */
    public double calcularDuracionTotal(){
        double total = 0;
        for(var multimedia : multimedias){
            if(multimedia instanceof Video){
                Video vi = (Video) multimedia;
                total += vi.getDuracion();
            }
        }
        return total;
    }

    /**
     * El metodo obtenerAnchoMayor
     * Se encarga de recorre la lista
     * Conocer si es una instancia de Imagen
     * Comparar todos los anchos para asi conocer cual es el mayor
     * @return El ancho mayor de la lista
     */
    public int obtenerAnchoMayor(){
        int anchoMayor = 0;
        for(var multimedia : multimedias){
            if(multimedia instanceof Imagen){
                Imagen picture = (Imagen) multimedia;
                if(anchoMayor < picture.getDimension().getAncho()){
                    anchoMayor = picture.getDimension().getAncho();
                }
            }
        }
        return anchoMayor;
    }

    /**
     * El metodo contarMultimediaCR
     * Se encarga de recorre la lista
     * Compara si el atributo Licencia es igual a COPYRIGHT
     * @return Cuantos de la lista multimedia tienen COPYRIGHT
     */
    public int contarMultimediaCR(){
        int count = 0;
        for(var multimedia : multimedias){
            if(multimedia.getLicencia().equals(Licencia.COPYRIGHT)){
                count++;
            }
        }
        return count;
    }

    /**
     * Devuelve el texto
     * @return texto
     */
    public String getTexto() {
        return texto;
    }

    /**
     * Permite cambiar dicho texto
     * @param texto
     */
    public void setTexto(String texto) {
        this.texto = texto;
    }

    /**
     * Devuelve una lista de multimedias
     * @return la lsita creada por la clase Mulimedias
     */
    public List<Multimedia> getMultimedias() {
        return multimedias;
    }

    /**
     *Permite cambiar esa lista
     * @param multimedias
     */
    public void setMultimedias(List<Multimedia> multimedias) {
        this.multimedias = multimedias;
    }
}
