package direc.students.index;

import org.monet.metamodel.AttributeProperty;

@SuppressWarnings("all")
public class LevelProperty extends AttributeProperty {
  public LevelProperty() {
    super();this._code = "med9lia";
    this._name = "Level";
    this._label = "Nivel";
    this._type = org.monet.metamodel.AttributeProperty.TypeEnumeration.TERM;
    
  }
  
  public static String static_getName() {
    return "Level";
  }
}
