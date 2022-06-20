public class Main {
    public static void main(String[] args) {
        Dog Rex = new Dog("Rex", 1);
        Dog Kel = new Dog("Kel", 5);
        Dog Caramelo = new Dog("Caramelo", 3, "Dourado");

        Rex.AndaOuCorre(Rex.Andar(6));
        Rex.Latir();

        Kel.AndaOuCorre(Kel.Andar(6));
        Kel.Latir();


    }

}