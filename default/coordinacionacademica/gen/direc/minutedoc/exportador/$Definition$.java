package direc.minutedoc.exportador;

import org.monet.metamodel.ExporterDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends ExporterDefinition implements HasBehaviour, HasClientBehaviour {
  public $Definition$() {
    super();this._code = "mxqppyg";
    this._name = "direc.MinuteDoc.Exportador";
    this._isAbstract = null;this._label = "TLabel";
    this._target = new org.monet.metamodel.internal.Ref("direc.MinuteDoc");
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(direc.minutedoc.exportador.$Definition$.class,"direc.MinuteDoc.Exportador",null);
  }
  }
  
  public static String static_getName() {
    return "Exportador";
  }
  
  public Class<?> getBehaviourClass() {
    return direc.minutedoc.Exportador.class;
  }
  
  public String getClientBehaviour() {
    return "var mxqppyg = new Object();mxqppyg.refresh = function (node) {if (!node.isEditable()) return;};mxqppyg.onChangeField = function (node, field) {};";
  }
}
