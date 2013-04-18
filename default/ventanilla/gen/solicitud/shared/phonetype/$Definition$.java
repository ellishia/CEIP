package solicitud.shared.phonetype;

import org.monet.metamodel.GlossaryDefinition;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends GlossaryDefinition implements HasClientBehaviour {
  public $Definition$() {
    super();this._code = "moxxl_g";
    this._name = "solicitud.shared.PhoneType";
    this._isAbstract = null;this._label = "Phone Type";
    this._ontology = "TipoTelefono";
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(solicitud.shared.phonetype.$Definition$.class,"solicitud.shared.PhoneType",null);
  }
  }
  
  public static String static_getName() {
    return "PhoneType";
  }
  
  public String getClientBehaviour() {
    return "var moxxl_g = new Object();moxxl_g.refresh = function (node) {if (!node.isEditable()) return;};moxxl_g.onChangeField = function (node, field) {};";
  }
}
