package direc.teachers.teacher;

import org.monet.metamodel.TextFieldProperty;

@SuppressWarnings("all")
public class LevelProperty extends TextFieldProperty {
  public LevelProperty() {
    super();this._code = "mvintow";
    this._name = "Level";
    this._label = "Nivel";
    
  }
  
  public static String static_getName() {
    return "Level";
  }
}
