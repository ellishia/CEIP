package ceip.boletines.index;

import org.monet.metamodel.AttributeProperty;

@SuppressWarnings("all")
public class StudentNameProperty extends AttributeProperty {
  public StudentNameProperty() {
    super();this._code = "m1asb2a";
    this._name = "StudentName";
    this._label = "Nombre de Alumno";
    this._type = org.monet.metamodel.AttributeProperty.TypeEnumeration.STRING;
    
  }
  
  public static String static_getName() {
    return "StudentName";
  }
}
