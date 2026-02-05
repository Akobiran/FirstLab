
public class Main {
    public static void main(String[] args){
        //Step 1  testing  for Bad version without generics
        Pokemon pikachu = new Pokemon("Pikachu ", "Electric");
        Pokemon charmander = new Pokemon("Charmander", "Fire");
        System.out.println(pikachu);
        System.out.println(charmander);
        PokeBox box = new PokeBox(pikachu);
        System.out.println(box.get());
        box.set(charmander);
        System.out.println(box.get()+ "pokemon was changed !");
        //Step 2 Testing Box class by applying generic concept
        Box<Pokemon> pokenmonBox = new Box<>(pikachu);
        Box<String> itemBox = new Box<>("Oran berry");
        Box<Integer> levelBox = new Box<>(125);
        System.out.println(pokenmonBox.getValue());
        System.out.println(itemBox.getValue());
        System.out.println(levelBox.getValue());
        //Step 3 Testing a pair class, using paired parametries
        Pair<Pokemon, String> itemsHeld= new Pair<>(pikachu,"Oran Berry");
        System.out.println(itemsHeld);
        //Step 4 Testing Bounded generics <T extends E>
        PokemonOnlyBox <Pokemon> b1= new PokemonOnlyBox<>(pikachu);
        System.out.println(b1.getType());
        //Step 5 tetsting that <T extends E> actually works with subclasess
        BattlePokemon squirtle= new BattlePokemon("Squirtle", "Water",60);
        PokemonOnlyBox <BattlePokemon> battleBox= new PokemonOnlyBox<>(squirtle);
        System.out.println(battleBox.getValue());
    }
}
