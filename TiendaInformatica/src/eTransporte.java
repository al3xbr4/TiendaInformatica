    /**
    * @author Alex Bordon
    */
public class eTransporte {
    private String Nombre;
    private String Destino;
    private int idPaquete;

    /**
     *
     * @param Nombre
     * @param Destino
     * @param idPaquete
     */

    public eTransporte(String Nombre, String Destino,int idPaquete) {

         this.Nombre = Nombre;
         this.Destino = Destino;
         this.idPaquete = idPaquete;

    }

    /**
     *
     * @param idPaquete
     * @return  Devuelve el destino al que debe llegar paquete.
     */
    public String EnviarPedido(int idPaquete){
        return this.Destino;

    }

    /**
     *
     * @param Nombre
     * @param Destino
     * @return Restablece/elimina los datos del pedido que ha sido entregado.
     */
    public void RecogePedido(String Nombre,String Destino){
        this.Nombre = null;
        this.Destino = null;
        this.idPaquete = 0;

    }

    /**
     *
     * @return
     */
    public String toString() {
        return "Nombre: " + Nombre + '\n'  +
                "Destino: " + Destino + '\n' +
                "IdPaquete: " + idPaquete + '\n' ;
    }
}
