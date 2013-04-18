package ceip.centerinformation;

import org.monet.metamodel.TextFieldProperty;

@SuppressWarnings("all")
public class ComplementaryCriteriaProperty extends TextFieldProperty {
  public ComplementaryCriteriaProperty() {
    super();this._code = "m_wiiag";
    this._name = "ComplementaryCriteria";
    this._label = "Criterio complementario";
    
  }
  
  public static String static_getName() {
    return "ComplementaryCriteria";
  }
}
