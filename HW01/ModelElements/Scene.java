package HW01.ModelElements;

import java.util.List;

public class Scene {
    public int Id;
    public List<PoligonalModel> Models;
    public List<Flash> Flashes;
    public List<Camera> Cameras;

    public Scene(int id, List<PoligonalModel> models, List<Flash> flashes, List<Camera> cameras) throws Exception{
        this.Id = id;
        if (models.size() > 0){
            this.Models = models;
        }
        else {
            throw new Exception("Нет модели");
        }
        this.Flashes = flashes;
        if (flashes.size() > 0){
            this.Cameras = cameras;
        }
        else {
            throw new Exception("Нет камеры");
        }
    }

    public Camera method1(Camera c){
        return c;
    }
    public Flash method2(Flash f, Camera c){
        return f;
    }
}
