package direc.schedule.indice;

import org.monet.metamodel.AttributeProperty;

@SuppressWarnings("all")
public class SubjectProperty extends AttributeProperty {
  public SubjectProperty() {
    super();this._code = "mno6_qg";
    this._name = "Subject";
    this._label = "Asignatura";
    this._type = org.monet.metamodel.AttributeProperty.TypeEnumeration.STRING;
    
  }
  
  public static String static_getName() {
    return "Subject";
  }
}
