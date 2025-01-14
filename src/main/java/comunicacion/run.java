package comunicacion;

public class run {
    public static void main(String[] args) {
        Alfabeto alfabeto = new Alfabeto("alfabeto griego, occidente",
                new String [] { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"},
                "Alfabeto latino");
        System.out.println(alfabeto.toString());
    }
}
