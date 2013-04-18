package serv.userstransport.indice;

import org.monet.metamodel.AttributeProperty;

@SuppressWarnings("all")
public class StopProperty extends AttributeProperty {
  public StopProperty() {
    super();this._code = "maf5pfq";
    this._name = "Stop";
    this._label = "Parada";
    this._type = org.monet.metamodel.AttributeProperty.TypeEnumeration.TERM;
    
  }
  
  public static String static_getName() {
    return "Stop";
  }
}
