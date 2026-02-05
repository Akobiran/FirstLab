import javax.imageio.plugins.tiff.GeoTIFFTagSet;
import java.awt.geom.PathIterator;

public class Pair <K,V> {
    private K first;
    private V second;
    public Pair( K first, V second){
        this.first=first;
        this.second=second;
    }
    public K getFirst(){
        return first;
    }
    public V getSecond(){
        return second;
    }

    @Override
    public String toString(){
        return first+ " -> " + second;
    }
}
