package edu.ec.utpl.poo.tallerHerencia.Codigo;

import edu.ec.utpl.poo.tallerHerencia.Main.*;

/**
 * Clase de pruebas
 */

public class MAIN {
    public static void main(String[] args) {

        Mensaje mensaje = new Mensaje("VIDEOS DE POOO");
        Video video = new Video("//c:/users", Licencia.COPYRIGHT, 300,
                "mp4", 3600, "COMO HAKEAR", false);
        Video video2 = new Video("//c:/users", Licencia.COPYRIGHT, 300,
                "mp4", 3600, "COMO HAKEAR", false);
        Imagen imagen = new Imagen("//c:users", Licencia.DOMINIO_PUBLICO, 20, "jpg",
                "POO", false);
        Dimension dime = new Dimension(10, 5);

        mensaje.calcularTamanioTotal();

    }
}
