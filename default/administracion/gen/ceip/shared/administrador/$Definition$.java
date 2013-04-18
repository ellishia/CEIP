package ceip.shared.administrador;

import org.monet.metamodel.RoleDefinition;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends RoleDefinition implements HasClientBehaviour {
  public $Definition$() {
    super();this._code = "mfehsta";
    this._name = "ceip.shared.Administrador";
    this._isAbstract = null;this._label = "Administrador";
    org.monet.metamodel.RoleDefinition.EnableServicesProperty enableServicesProperty1 = new org.monet.metamodel.RoleDefinition.EnableServicesProperty();
    enableServicesProperty1.getOntology().add("1b095c4e-021d-4d36-998e-6d493757d4c9");
    enableServicesProperty1.getOntology().add("ListadoDeAdmitidos");
    this.setEnableServices(enableServicesProperty1);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(ceip.shared.administrador.$Definition$.class,"ceip.shared.Administrador",null);
  }
  }
  
  public static String static_getName() {
    return "Administrador";
  }
  
  public String getClientBehaviour() {
    return "var mfehsta = new Object();mfehsta.refresh = function (node) {if (!node.isEditable()) return;};mfehsta.onChangeField = function (node, field) {};";
  }
}
