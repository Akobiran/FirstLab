class PokemonBox{
    private String PokemonValue;
    public PokemonBox(String PokemonValue){
        this.PokemonValue = PokemonValue;
    }
    public String getPokemonValue(){
        return PokemonValue;
    }
    public void setPokemonValue(String PokemonValue){
        this.PokemonValue=PokemonValue;
    }
}
public class Pokemon{
    public static void main(String []args){
        PokemonBox pokemonBox = new PokemonBox("Pikachu");
        System.out.println(pokemonBox.getPokemonValue());
        pokemonBox.setPokemonValue("Charmander");
        System.out.println(pokemonBox.getPokemonValue());
    }
}