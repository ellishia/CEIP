package solicitud.shared.padre;

import org.monet.metamodel.RoleDefinition;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends RoleDefinition implements HasClientBehaviour {
  public $Definition$() {
    super();this._code = "m_dji1q";
    this._name = "solicitud.shared.Padre";
    this._isAbstract = null;this._label = "Padre";
    org.monet.metamodel.RoleDefinition.EnableServicesProperty enableServicesProperty1 = new org.monet.metamodel.RoleDefinition.EnableServicesProperty();
    enableServicesProperty1.getOntology().add("SolicitudPlaza");
    this.setEnableServices(enableServicesProperty1);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(solicitud.shared.padre.$Definition$.class,"solicitud.shared.Padre",null);
  }
  }
  
  public static String static_getName() {
    return "Padre";
  }
  
  public String getClientBehaviour() {
    return "var m_dji1q = new Object();m_dji1q.refresh = function (node) {if (!node.isEditable()) return;};m_dji1q.onChangeField = function (node, field) {};";
  }
}
