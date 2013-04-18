package solicitud.shared.personalrelation;

import org.monet.metamodel.GlossaryDefinition;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends GlossaryDefinition implements HasClientBehaviour {
  public $Definition$() {
    super();this._code = "m_0avtw";
    this._name = "solicitud.shared.PersonalRelation";
    this._isAbstract = null;this._label = "Personal relation";
    this._ontology = "VinculosDeAdministracion";
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(solicitud.shared.personalrelation.$Definition$.class,"solicitud.shared.PersonalRelation",null);
  }
  }
  
  public static String static_getName() {
    return "PersonalRelation";
  }
  
  public String getClientBehaviour() {
    return "var m_0avtw = new Object();m_0avtw.refresh = function (node) {if (!node.isEditable()) return;};m_0avtw.onChangeField = function (node, field) {};";
  }
}
