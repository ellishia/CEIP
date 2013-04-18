package solicitud.shared.buslines;

import org.monet.metamodel.GlossaryDefinition;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends GlossaryDefinition implements HasClientBehaviour {
  public $Definition$() {
    super();this._code = "mb7maug";
    this._name = "solicitud.shared.Buslines";
    this._isAbstract = null;this._label = "Rutas";
    this._ontology = "ParadasDeServicios";
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(solicitud.shared.buslines.$Definition$.class,"solicitud.shared.Buslines",null);
  }
  }
  
  public static String static_getName() {
    return "Buslines";
  }
  
  public String getClientBehaviour() {
    return "var mb7maug = new Object();mb7maug.refresh = function (node) {if (!node.isEditable()) return;};mb7maug.onChangeField = function (node, field) {};";
  }
}
