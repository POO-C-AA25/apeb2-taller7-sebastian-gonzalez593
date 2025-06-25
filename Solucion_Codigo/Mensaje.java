package Codigo.Problema3;

public abstract class Mensaje {
    protected Movil remitente;
    protected Movil destinatario;

    public Mensaje(Movil remitente, Movil destinatario) {
        this.remitente = remitente;
        this.destinatario = destinatario;
    }

    public abstract void enviarMensaje();
    public abstract void visualizarMensaje();
}
