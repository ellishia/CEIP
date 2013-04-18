package direc.parentsmdoc.exportador;

import org.monet.metamodel.ExporterDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends ExporterDefinition implements HasBehaviour, HasClientBehaviour {
  public $Definition$() {
    super();this._code = "msyyama";
    this._name = "direc.ParentsMDoc.Exportador";
    this._isAbstract = null;this._label = "Exportador de Documento";
    this._target = new org.monet.metamodel.internal.Ref("direc.ParentsMDoc");
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(direc.parentsmdoc.exportador.$Definition$.class,"direc.ParentsMDoc.Exportador",null);
  }
  }
  
  public static String static_getName() {
    return "Exportador";
  }
  
  public Class<?> getBehaviourClass() {
    return direc.parentsmdoc.Exportador.class;
  }
  
  public String getClientBehaviour() {
    return "var msyyama = new Object();msyyama.refresh = function (node) {if (!node.isEditable()) return;};msyyama.onChangeField = function (node, field) {};";
  }
}
