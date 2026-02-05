import java.util.List;
import java.util.ArrayList;
public class Main {
    // swapping the contents of two boxes
    public static <T> void swap(Box<T> a, Box<T> b ){
        T  temp=a.getValue();
        a.setValue(b.getValue());
        b.setValue(temp);
    }
    //  Playing with wildCards and building a method that prints any List of Pokemon
    public static void printTeam(java.util.List<? extends Pokemon> team ){
        for (Pokemon pokemon: team){
            System.out.print(pokemon+ ",");
        }
        System.out.println();
    }
    public static void main(String[] args){
        //This is the first test for Bad version without generics
        Pokemon pikachu = new Pokemon("Pikachu", "Electric");
        Pokemon charmander = new Pokemon("Charmander", "Fire");
        System.out.println(pikachu);
        System.out.println(charmander);
        System.out.println();
        PokeBox box = new PokeBox(pikachu);
        System.out.println(box.get()+ "<-- Initial pokemon");
        box.set(charmander);
        System.out.println(box.get()+ " <-- pokemon was changed !");
         System.out.println();
        //Step 2 Testing Box  class by applying generic concept
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
        //Step 4 Testing Bounded generics <T extends E>
        PokemonOnlyBox <Pokemon> b1= new PokemonOnlyBox<>(pikachu);
        System.out.println(b1.getType());
        System.out.println();

        //Step 5 tetsting that <T extends E> actually works with subclasess
        BattlePokemon squirtle= new BattlePokemon("Squirtle", "Water",60);
        PokemonOnlyBox <BattlePokemon> battleBox= new PokemonOnlyBox<>(squirtle);
        System.out.println(battleBox.getValue());
        System.out.println();

        //Step 6 swapping the contents of two boxes
        Box<String> a= new Box<>("Potion"  );
        Box<String> b=new Box<>("Rare candy");
        System.out.println("Before swapping a : " + a.getValue());
        System.out.println("Before swapping b : "+ b.getValue());
        swap(a,b);
        System.out.println();
        System.out.println("After  swapping a : " + a.getValue());
        System.out.println("After  swapping b : "+ b.getValue());

        //Step 7: Testing Wildcards method that prints any List of Pokemon
        ArrayList<Pokemon> listPokemon= new ArrayList<>();
        ArrayList<BattlePokemon> listBattlePokemon= new ArrayList<>();
        listPokemon.add(pikachu);
        listPokemon.add(charmander);
        listPokemon.add(new Pokemon("Flash","Super"));
        listBattlePokemon.add(squirtle );
        listBattlePokemon.add(new BattlePokemon("Batman", "fast",70));
        listBattlePokemon.add(new BattlePokemon("Arrow","slow", 90));
        printTeam(listPokemon);
        System.out.println();
        printTeam(listBattlePokemon);

    }

}