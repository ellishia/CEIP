package direc.ejemplares.indice;

import org.monet.metamodel.AttributeProperty;

@SuppressWarnings("all")
public class CodigoProperty extends AttributeProperty {
  public CodigoProperty() {
    super();this._code = "mp_wqqg";
    this._name = "Codigo";
    this._label = "ISBN";
    this._type = org.monet.metamodel.AttributeProperty.TypeEnumeration.TERM;
    
  }
  
  public static String static_getName() {
    return "Codigo";
  }
}
