package ceip.califications.indice;

import org.monet.metamodel.AttributeProperty;

@SuppressWarnings("all")
public class GradeProperty extends AttributeProperty {
  public GradeProperty() {
    super();this._code = "mkrpqvg";
    this._name = "Grade";
    this._label = "Nota";
    this._type = org.monet.metamodel.AttributeProperty.TypeEnumeration.STRING;
    
  }
  
  public static String static_getName() {
    return "Grade";
  }
}
