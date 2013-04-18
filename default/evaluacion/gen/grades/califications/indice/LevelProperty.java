package grades.califications.indice;

import org.monet.metamodel.AttributeProperty;

public class LevelProperty extends AttributeProperty {
  public LevelProperty() {
    super();this._code = "mevbxmw";
    this._name = "Level";
    this._label = "Curso";
    this._type = org.monet.metamodel.AttributeProperty.TypeEnumeration.TERM;
    
  }
  
  public static String static_getName() {
    return "Level";
  }
}
