package Codigo.Problema3;

public class MMS extends Mensaje {
    private String archivoImagen;

    public MMS(Movil remitente, Movil destinatario, String archivoImagen) {
        super(remitente, destinatario);
        this.archivoImagen = archivoImagen;
    }

    @Override
    public void enviarMensaje() {
        System.out.println("Enviando MMS de " + remitente + " a " + destinatario);
    }

    @Override
    public void visualizarMensaje() {
        System.out.println("MMS: Imagen enviada: " + archivoImagen);
    }
}

