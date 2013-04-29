package ceip.canteendoc.importador;

import org.monet.metamodel.ImporterDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends ImporterDefinition implements HasBehaviour, HasClientBehaviour {
  public $Definition$() {
    super();this._code = "mgs9jew";
    this._name = "ceip.CanteenDoc.Importador";
    this._isAbstract = null;this._label = "Exportador de solicitud de Comedor";
    this._target = new org.monet.metamodel.internal.Ref("ceip.CanteenDoc");
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(ceip.canteendoc.importador.$Definition$.class,"ceip.CanteenDoc.Importador",null);
  }
  }
  
  public static String static_getName() {
    return "Importador";
  }
  
  public Class<?> getBehaviourClass() {
    return ceip.canteendoc.Importador.class;
  }
  
  public String getClientBehaviour() {
    return "var mgs9jew = new Object();mgs9jew.refresh = function (node) {if (!node.isEditable()) return;};mgs9jew.onChangeField = function (node, field) {};";
  }
}
