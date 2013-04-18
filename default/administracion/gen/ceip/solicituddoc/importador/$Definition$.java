package ceip.solicituddoc.importador;

import org.monet.metamodel.ImporterDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends ImporterDefinition implements HasBehaviour, HasClientBehaviour {
  public $Definition$() {
    super();this._code = "mbriung";
    this._name = "ceip.solicitudDoc.Importador";
    this._isAbstract = null;this._label = "Importador de Solicitud";
    this._target = new org.monet.metamodel.internal.Ref("ceip.solicitudDoc");
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(ceip.solicituddoc.importador.$Definition$.class,"ceip.solicitudDoc.Importador",null);
  }
  }
  
  public static String static_getName() {
    return "Importador";
  }
  
  public Class<?> getBehaviourClass() {
    return ceip.solicituddoc.Importador.class;
  }
  
  public String getClientBehaviour() {
    return "var mbriung = new Object();mbriung.refresh = function (node) {if (!node.isEditable()) return;};mbriung.onChangeField = function (node, field) {};";
  }
}
