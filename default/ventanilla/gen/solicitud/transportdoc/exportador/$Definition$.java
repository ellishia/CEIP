package solicitud.transportdoc.exportador;

import org.monet.metamodel.ExporterDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends ExporterDefinition implements HasBehaviour, HasClientBehaviour {
  public $Definition$() {
    super();this._code = "mct_qkw";
    this._name = "solicitud.transportDoc.Exportador";
    this._isAbstract = null;this._label = "exportador de solicitud de Transporte";
    this._target = new org.monet.metamodel.internal.Ref("solicitud.transportDoc");
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(solicitud.transportdoc.exportador.$Definition$.class,"solicitud.transportDoc.Exportador",null);
  }
  }
  
  public static String static_getName() {
    return "Exportador";
  }
  
  public Class<?> getBehaviourClass() {
    return solicitud.transportdoc.Exportador.class;
  }
  
  public String getClientBehaviour() {
    return "var mct_qkw = new Object();mct_qkw.refresh = function (node) {if (!node.isEditable()) return;};mct_qkw.onChangeField = function (node, field) {};";
  }
}
