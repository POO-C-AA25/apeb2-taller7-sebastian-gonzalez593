package Codigo.Problema3;

public class SMS extends Mensaje {
    private String contenido;

    public SMS(Movil remitente, Movil destinatario, String contenido) {
        super(remitente, destinatario);
        this.contenido = contenido;
    }

    @Override
    public void enviarMensaje() {
        System.out.println("Enviando SMS de " + remitente + " a " + destinatario);
    }

    @Override
    public void visualizarMensaje() {
        System.out.println("SMS: \"" + contenido + "\"");
    }
}

