package org.cuatrovientos.dam.entornosdesarrollo.ejemplomavenentorno;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculadora {
    private static Logger logger = LogManager.getLogger();
    private String operacionEnCurso;
    public static void main(String[] args) {
        System.out.println("Hello World!");
        logger.error("otro hello world " + args[0]);
        Calculadora miCalculadora = new Calculadora();
        try {
            switch (args[0]) {
                case "sumar":
                    int resultado = miCalculadora.sumar(args[1], args[2]);
                    System.out.println("Resultado: " + resultado);
                    break;
                default:
                    logger.error("Operación no soportada: " + args[0]);
                    break;
            }
        } catch (NumberFormatException e) {
            logger.error("Error al convertir los números", e);
        }
    }
    /*
     * comentario de tipo bloque
     * para informacion del codigo
     */
    
    
    // comentario de tipo linea
    //para explicar el codigo
   

    /**
     * comentario de tipo javadoc
     * 
     * @param numero1 el 1er numero a sumar
     * @param numero2 el 2do numero a sumar
     * @return el num sumado
     * TODO me falta validar que num1 y num2 sean enteros
     */
        
    public int sumar(String numero1, String numero2) {
        int numero1Int = Integer.parseInt(numero1);
        int numero2Int = Integer.parseInt(numero2);
        return numero1Int + numero2Int;
    }
    public String getOperacionEnCurso() {
        return operacionEnCurso;
    }
    public void setOperacionEnCurso(String operacionEnCurso) {
        this.operacionEnCurso = operacionEnCurso;
    }
}