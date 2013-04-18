package ceip.boletin.exportador;

import org.monet.metamodel.ExporterDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends ExporterDefinition implements HasBehaviour, HasClientBehaviour {
  public $Definition$() {
    super();this._code = "m97fegw";
    this._name = "ceip.Boletin.Exportador";
    this._isAbstract = null;this._label = "Exportador de Documento";
    this._target = new org.monet.metamodel.internal.Ref("ceip.Boletin");
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(ceip.boletin.exportador.$Definition$.class,"ceip.Boletin.Exportador",null);
  }
  }
  
  public static String static_getName() {
    return "Exportador";
  }
  
  public Class<?> getBehaviourClass() {
    return ceip.boletin.Exportador.class;
  }
  
  public String getClientBehaviour() {
    return "var m97fegw = new Object();m97fegw.refresh = function (node) {if (!node.isEditable()) return;};m97fegw.onChangeField = function (node, field) {};";
  }
}
