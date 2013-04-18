package direc.claustrodoc.exportador;

import org.monet.metamodel.ExporterDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends ExporterDefinition implements HasBehaviour, HasClientBehaviour {
  public $Definition$() {
    super();this._code = "mggpfjq";
    this._name = "direc.ClaustroDoc.Exportador";
    this._isAbstract = null;this._label = "Exportador de Documento";
    this._target = new org.monet.metamodel.internal.Ref("direc.ClaustroDoc");
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(direc.claustrodoc.exportador.$Definition$.class,"direc.ClaustroDoc.Exportador",null);
  }
  }
  
  public static String static_getName() {
    return "Exportador";
  }
  
  public Class<?> getBehaviourClass() {
    return direc.claustrodoc.Exportador.class;
  }
  
  public String getClientBehaviour() {
    return "var mggpfjq = new Object();mggpfjq.refresh = function (node) {if (!node.isEditable()) return;};mggpfjq.onChangeField = function (node, field) {};";
  }
}
