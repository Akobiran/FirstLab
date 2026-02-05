public class Main{
    public static void main(String[] args) {
        Pokemon pikachu= new Pokemon("Pikachu ", "Electric");
        Pokemon charmander= new Pokemon ("Charmander", "Fire");
        System.out.println(pikachu);
        System.out.println(charmander);
        PokeBox  box=new PokeBox(pikachu);
        System.out.println(box.get());
        box.set(charmander);
        System.out.println(box.get());
    }
}