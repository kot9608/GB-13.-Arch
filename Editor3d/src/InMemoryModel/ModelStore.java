package InMemoryModel;

import ModelElements.Camera;
import ModelElements.Flash;
import ModelElements.PoligonalModel;
import ModelElements.Scene;

import java.util.ArrayList;
import java.util.List;

public class ModelStore implements ImodelChanger {
    public List<PoligonalModel> models;
    public List<Scene> scenes;
    public List<Flash> flashes;
    public List<Camera> cameras;
    private ImodelChangeObserver[] changeObservers;

    public ModelStore(ImodelChangeObserver[] changeObservers) {
        this.changeObservers = changeObservers;

        this.models = new ArrayList<>();
        this.scenes = new ArrayList<>();
        this.flashes = new ArrayList<>();
        this.cameras = new ArrayList<>();
    }

    public Scene getScane(int id)
    {
        return this.scenes.get(id);
    }

    @Override
    public void notifyChange(ImodelChanger sender) {

    }

}
