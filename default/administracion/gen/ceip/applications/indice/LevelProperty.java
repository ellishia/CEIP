package ceip.applications.indice;

import org.monet.metamodel.AttributeProperty;

@SuppressWarnings("all")
public class LevelProperty extends AttributeProperty {
  public LevelProperty() {
    super();this._code = "mh7c5cq";
    this._name = "Level";
    this._label = "Nivel Académico";
    this._type = org.monet.metamodel.AttributeProperty.TypeEnumeration.TERM;
    
  }
  
  public static String static_getName() {
    return "Level";
  }
}
