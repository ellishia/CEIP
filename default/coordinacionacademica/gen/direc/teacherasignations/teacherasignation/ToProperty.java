package direc.teacherasignations.teacherasignation;

import org.monet.metamodel.DateFieldProperty;

@SuppressWarnings("all")
public class ToProperty extends DateFieldProperty {
  public ToProperty() {
    super();this._code = "mhzbcfg";
    this._name = "To";
    this._label = "Hasta";
    this._precision = org.monet.metamodel.DateFieldPropertyBase.PrecisionEnumeration.DAYS;
    
  }
  
  public static String static_getName() {
    return "To";
  }
}
