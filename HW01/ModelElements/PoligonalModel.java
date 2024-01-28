package HW01.ModelElements;

import java.util.ArrayList;
import java.util.List;

public class PoligonalModel {
    public List<Poligon> Poligons;
    public List<Texture> Textures;

    public PoligonalModel(List<Texture> texture){
        this.Textures = texture;
        this.Poligons = new ArrayList<>();
        Poligons.add(new Poligon(null));
    }
    
}
