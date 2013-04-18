package grades.controls.indice;

import org.monet.metamodel.AttributeProperty;

public class GroupProperty extends AttributeProperty {
  public GroupProperty() {
    super();this._code = "msmlfaw";
    this._name = "Group";
    this._label = "Grupo";
    this._type = org.monet.metamodel.AttributeProperty.TypeEnumeration.TERM;
    
  }
  
  public static String static_getName() {
    return "Group";
  }
}
