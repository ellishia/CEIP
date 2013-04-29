package ceip.transportdoc.importador;

import org.monet.metamodel.ImporterDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends ImporterDefinition implements HasBehaviour, HasClientBehaviour {
  public $Definition$() {
    super();this._code = "mct_qkw";
    this._name = "ceip.TransportDoc.Importador";
    this._isAbstract = null;this._label = "importador de solicitud de Transporte";
    this._target = new org.monet.metamodel.internal.Ref("ceip.TransportDoc");
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(ceip.transportdoc.importador.$Definition$.class,"ceip.TransportDoc.Importador",null);
  }
  }
  
  public static String static_getName() {
    return "Importador";
  }
  
  public Class<?> getBehaviourClass() {
    return ceip.transportdoc.Importador.class;
  }
  
  public String getClientBehaviour() {
    return "var mct_qkw = new Object();mct_qkw.refresh = function (node) {if (!node.isEditable()) return;};mct_qkw.onChangeField = function (node, field) {};";
  }
}
