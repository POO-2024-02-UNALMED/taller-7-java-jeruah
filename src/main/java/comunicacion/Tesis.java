package comunicacion;

public class Tesis extends Escrito{
    String idea;
    String [] argumentos;
    String conclusion;
    String referencias;
    String interpretacion;

    public Tesis(String origen, String titulo, String autor, int paginas, String idea, String [] argumentos, String conclusion, String referencias, String interpretacion){
        super(origen, titulo, autor, paginas);
        this.idea = idea;
        this.argumentos = argumentos;
        this.conclusion = conclusion;
        this.referencias = referencias;
        this.interpretacion = interpretacion;
    }

    public int palabrasTotales(int palabrasPagina){
        return this.getPaginas() * palabrasPagina * 5;
    }
    public String interpretacion(){
        return this.interpretacion;
    }
    public String toString() {
        return this.getOrigen() + "\n" +
                this.getTitulo() + "\n" +
                this.getAutor() + "\n" +
                this.getPaginas() + "\n" +
                this.idea + "\n" +
                argumentos.length+ "\n" +
                this.conclusion + "\n" +
                this.referencias;
    }

    public String getIdea() {
        return idea;
    }
    public String [] getArgumentos() {
        return argumentos;
    }
    public String getConclusion() {
        return conclusion;
    }
    public String getReferencias() {
        return referencias;
    }
}
