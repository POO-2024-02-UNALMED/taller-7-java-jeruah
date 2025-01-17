package comunicacion;

public class Fabula extends Escrito{
    String ensenanza;
    String interpretacion;

    public Fabula(String origen, String titulo, String autor, int paginas, String ensenanza, String interpretacion){
        super(origen, titulo, autor, paginas);
        this.ensenanza = ensenanza;
        this.interpretacion = interpretacion;
    }

    public int palabrasTotales(int palabrasPagina){
        return this.getPaginas() * palabrasPagina;
    }
    public String interpretacion(){
        return this.interpretacion;
    }
    public String toString(){
        return this.getOrigen() + "\n" + this.getTitulo() + "\n" + this.getAutor() + "\n" + this.getPaginas() + "\n" + this.ensenanza;
    }

    public String getEnsenanza() {
        return ensenanza;
    }
}
