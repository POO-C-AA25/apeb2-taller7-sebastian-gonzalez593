package Codigo.Problema3;

public class Problema3_Movil {
    public static void main(String[] args) {
        Movil m1 = new Movil("0991111111", "Carlos");
        Movil m2 = new Movil("0992222222");
        Movil m3 = new Movil("0993333333", "Lucía");

        Mensaje sms = new SMS(m1, m2, "Hola, ¿cómo estás?");
        Mensaje mms = new MMS(m3, m1, "foto_playa.jpg");

        sms.enviarMensaje();
        sms.visualizarMensaje();

        System.out.println();

        mms.enviarMensaje();
        mms.visualizarMensaje();
    }
}
