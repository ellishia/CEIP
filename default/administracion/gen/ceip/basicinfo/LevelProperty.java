package ceip.basicinfo;

import org.monet.metamodel.SelectFieldProperty;

@SuppressWarnings("all")
public class LevelProperty extends SelectFieldProperty {
  public LevelProperty() {
    super();this._code = "mygtntq";
    this._name = "Level";
    this._label = "Nivel";
    
  }
  
  public static String static_getName() {
    return "Level";
  }
}
