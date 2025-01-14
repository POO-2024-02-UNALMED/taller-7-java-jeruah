package comunicacion;

public class Alfabeto extends Pictograma{
    private String [] letras;
    private String interpretacion;

    public Alfabeto(String origen, String [] letras, String interpretacion){
        super(origen);
        this.letras = letras;
        this.interpretacion = interpretacion;
    }

    public String [] getLetras(){
        return letras;
    }
    public String interpretacion(){
        return interpretacion;
    }
    public int cantidadLetras(){
        return letras.length;
    }
    public String toString(){
        StringBuilder mensaje = new StringBuilder();
        for (String letra : this.letras){
            mensaje.append(letra).append(", ");
        }
        mensaje.setLength(mensaje.length()-2);
        return mensaje.toString();
    }
}
