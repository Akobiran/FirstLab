
public class Main {
    public static void main(String[] args) {
        Pokemon pikachu = new Pokemon("Pikachu ", "Electric");
        Pokemon charmander = new Pokemon("Charmander", "Fire");
        System.out.println(pikachu);
        System.out.println(charmander);
        PokeBox box = new PokeBox(pikachu);
        System.out.println(box.get());
        box.set(charmander);
        System.out.println(box.get()+ "pokemon was changed !");
        Box<Pokemon> pokenmonBox = new Box<>(pikachu);
        Box<String> itemBox = new Box<>("Oran berry");
        Box<Integer> levelBox = new Box<>(125);
        System.out.println(pokenmonBox.getValue());
        System.out.println(itemBox.getValue());
        System.out.println(levelBox.getValue());

    }
}