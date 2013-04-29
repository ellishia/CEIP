package solicitud.canteendoc.exportador;

import org.monet.metamodel.ExporterDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends ExporterDefinition implements HasBehaviour, HasClientBehaviour {
  public $Definition$() {
    super();this._code = "mgs9jew";
    this._name = "solicitud.canteenDoc.Exportador";
    this._isAbstract = null;this._label = "Exportador de solicitud de Comedor";
    this._target = new org.monet.metamodel.internal.Ref("solicitud.canteenDoc");
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(solicitud.canteendoc.exportador.$Definition$.class,"solicitud.canteenDoc.Exportador",null);
  }
  }
  
  public static String static_getName() {
    return "Exportador";
  }
  
  public Class<?> getBehaviourClass() {
    return solicitud.canteendoc.Exportador.class;
  }
  
  public String getClientBehaviour() {
    return "var mgs9jew = new Object();mgs9jew.refresh = function (node) {if (!node.isEditable()) return;};mgs9jew.onChangeField = function (node, field) {};";
  }
}
