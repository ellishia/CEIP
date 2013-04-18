package solicitud.admiteddoc.importador;

import org.monet.metamodel.ImporterDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends ImporterDefinition implements HasBehaviour, HasClientBehaviour {
  public $Definition$() {
    super();this._code = "msu7ewg";
    this._name = "solicitud.AdmitedDoc.Importador";
    this._isAbstract = null;this._label = "Importador";
    this._target = new org.monet.metamodel.internal.Ref("solicitud.AdmitedDoc");
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(solicitud.admiteddoc.importador.$Definition$.class,"solicitud.AdmitedDoc.Importador",null);
  }
  }
  
  public static String static_getName() {
    return "Importador";
  }
  
  public Class<?> getBehaviourClass() {
    return solicitud.admiteddoc.Importador.class;
  }
  
  public String getClientBehaviour() {
    return "var msu7ewg = new Object();msu7ewg.refresh = function (node) {if (!node.isEditable()) return;};msu7ewg.onChangeField = function (node, field) {};";
  }
}
