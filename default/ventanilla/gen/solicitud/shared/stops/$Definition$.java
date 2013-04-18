package solicitud.shared.stops;

import org.monet.metamodel.GlossaryDefinition;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends GlossaryDefinition implements HasClientBehaviour {
  public $Definition$() {
    super();this._code = "mmgs97w";
    this._name = "solicitud.shared.Stops";
    this._isAbstract = null;this._label = "Paradas";
    this._ontology = "ParadasDeServicios";
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(solicitud.shared.stops.$Definition$.class,"solicitud.shared.Stops",null);
  }
  }
  
  public static String static_getName() {
    return "Stops";
  }
  
  public String getClientBehaviour() {
    return "var mmgs97w = new Object();mmgs97w.refresh = function (node) {if (!node.isEditable()) return;};mmgs97w.onChangeField = function (node, field) {};";
  }
}
