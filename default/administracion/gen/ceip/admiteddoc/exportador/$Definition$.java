package ceip.admiteddoc.exportador;

import org.monet.metamodel.ExporterDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends ExporterDefinition implements HasBehaviour, HasClientBehaviour {
  public $Definition$() {
    super();this._code = "mhdcjzg";
    this._name = "ceip.AdmitedDoc.Exportador";
    this._isAbstract = null;this._label = "Exportador de Documento";
    this._target = new org.monet.metamodel.internal.Ref("ceip.AdmitedDoc");
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(ceip.admiteddoc.exportador.$Definition$.class,"ceip.AdmitedDoc.Exportador",null);
  }
  }
  
  public static String static_getName() {
    return "Exportador";
  }
  
  public Class<?> getBehaviourClass() {
    return ceip.admiteddoc.Exportador.class;
  }
  
  public String getClientBehaviour() {
    return "var mhdcjzg = new Object();mhdcjzg.refresh = function (node) {if (!node.isEditable()) return;};mhdcjzg.onChangeField = function (node, field) {};";
  }
}
