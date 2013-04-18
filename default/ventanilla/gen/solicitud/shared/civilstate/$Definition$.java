package solicitud.shared.civilstate;

import org.monet.metamodel.GlossaryDefinition;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends GlossaryDefinition implements HasClientBehaviour {
  public $Definition$() {
    super();this._code = "myt4eiw";
    this._name = "solicitud.shared.CivilState";
    this._isAbstract = null;this._label = "Civil State";
    this._ontology = "EstadoCivilDeAdministracion";
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(solicitud.shared.civilstate.$Definition$.class,"solicitud.shared.CivilState",null);
  }
  }
  
  public static String static_getName() {
    return "CivilState";
  }
  
  public String getClientBehaviour() {
    return "var myt4eiw = new Object();myt4eiw.refresh = function (node) {if (!node.isEditable()) return;};myt4eiw.onChangeField = function (node, field) {};";
  }
}
