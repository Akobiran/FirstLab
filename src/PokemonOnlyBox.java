public class PokemonOnlyBox <T extends Pokemon>{
    private T value;
    public PokemonOnlyBox(T value){
        this.value=value;
    }
    public T getValue(){
        return value;
    }
    public void setValue(T newValue){
        this.value=value;
    }
    public String getType(){
        return value.getType();
    }
}
