package ceip.relatives.parent;

import org.monet.metamodel.TextFieldProperty;

@SuppressWarnings("all")
public class ProfessionProperty extends TextFieldProperty {
  public ProfessionProperty() {
    super();this._code = "m_ugeia";
    this._name = "Profession";
    this._label = "Profesión";
    
  }
  
  public static String static_getName() {
    return "Profession";
  }
}
