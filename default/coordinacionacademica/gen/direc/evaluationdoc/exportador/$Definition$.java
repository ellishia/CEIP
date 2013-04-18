package direc.evaluationdoc.exportador;

import org.monet.metamodel.ExporterDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends ExporterDefinition implements HasBehaviour, HasClientBehaviour {
  public $Definition$() {
    super();this._code = "m1hxejw";
    this._name = "direc.EvaluationDoc.Exportador";
    this._isAbstract = null;this._label = "Exportador de Documento";
    this._target = new org.monet.metamodel.internal.Ref("direc.EvaluationDoc");
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(direc.evaluationdoc.exportador.$Definition$.class,"direc.EvaluationDoc.Exportador",null);
  }
  }
  
  public static String static_getName() {
    return "Exportador";
  }
  
  public Class<?> getBehaviourClass() {
    return direc.evaluationdoc.Exportador.class;
  }
  
  public String getClientBehaviour() {
    return "var m1hxejw = new Object();m1hxejw.refresh = function (node) {if (!node.isEditable()) return;};m1hxejw.onChangeField = function (node, field) {};";
  }
}
