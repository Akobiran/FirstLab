import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
public class Main{
    public static <T> void swap(Box<T> a, Box<T> b){
        T temp=a.getValue();
        a.setValue(b.getValue());
        b.setValue(temp);
    }
    public static void printTeam(java.util.List<? extends Pokemon> team){
        for (Pokemon pokemon : team ){
            System.out.print(pokemon+",");
        }
        System.out.println();
    }
    public static void main(String[] args){
        //Step 1  first test for Bad version without generics
        Pokemon pikachu = new Pokemon("Pikachu", "Electric");
        Pokemon charmander = new Pokemon("Charmander", "Fire");
        System.out.println(pikachu);
        System.out.println(charmander);
        System.out.println();
        PokeBox box = new PokeBox(pikachu);
        System.out.println(box.get()+ " <-- Initial pokemon");
        box.set(charmander);
        System.out.println(box.get()+ " <-- pokemon was changed !");
        System.out.println();

        //Step 2 Testing Box class by applying generic concept
        Box<Pokemon> pokenmonBox = new Box<>(pikachu);
        Box<String> itemBox = new Box<>("Oran berry");
        Box<Integer> levelBox = new Box<>(125);
        System.out.println(pokenmonBox.getValue());
        System.out.println(itemBox.getValue());
        System.out.println(levelBox.getValue());
        System.out.println();

        //Step 3 Testing a pair class, using paired parametries
        Pair<Pokemon, String> itemsHeld= new Pair<>(pikachu,"Oran Berry");
        System.out.println(itemsHeld);
        System.out.println();

        //Step 4 Testing Bounded generics <T extends E>
        PokemonOnlyBox <Pokemon> b1= new PokemonOnlyBox<>(pikachu);
        System.out.println(b1.getType());
        System.out.println();

        //Step 5 tetsting that <T extends E> actually works with subclasess
        BattlePokemon squirtle= new BattlePokemon("Squirtle", "Water",60);
        PokemonOnlyBox <BattlePokemon> battleBox= new PokemonOnlyBox<>(squirtle);
        System.out.println(battleBox.getValue());
        System.out.println();

        //Step 6: Testing swap method that changes the context of two boxes
        Box<String> a = new Box<>("Potion");
        Box<String> b = new Box<>("Rare Candy");
        System.out.println("Before: a=" + a.getValue() + ", b=" + b.getValue());
        swap(a, b);
        System.out.println("After:  a=" + a.getValue() + ", b=" + b.getValue());
        System.out.println();
        //Step 7 : Playing with wildcards and testing the method if it actually prints any List of Pokemon
        ArrayList<Pokemon> listPokemon= new ArrayList<>();
             listPokemon.add(pikachu);
             listPokemon.add(charmander);
             ArrayList<BattlePokemon> listBattlePokemon=new ArrayList<>();
             listBattlePokemon.add(squirtle);
             listBattlePokemon.add(new BattlePokemon("Flash","super", 76));
             printTeam(listBattlePokemon);
             printTeam(listPokemon);

    }
}