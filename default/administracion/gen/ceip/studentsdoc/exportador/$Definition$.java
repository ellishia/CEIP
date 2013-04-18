package ceip.studentsdoc.exportador;

import org.monet.metamodel.ExporterDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends ExporterDefinition implements HasBehaviour, HasClientBehaviour {
  public $Definition$() {
    super();this._code = "md3d7cg";
    this._name = "ceip.StudentsDoc.Exportador";
    this._isAbstract = null;this._label = "Exportador de Documento";
    this._target = new org.monet.metamodel.internal.Ref("ceip.StudentsDoc");
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(ceip.studentsdoc.exportador.$Definition$.class,"ceip.StudentsDoc.Exportador",null);
  }
  }
  
  public static String static_getName() {
    return "Exportador";
  }
  
  public Class<?> getBehaviourClass() {
    return ceip.studentsdoc.Exportador.class;
  }
  
  public String getClientBehaviour() {
    return "var md3d7cg = new Object();md3d7cg.refresh = function (node) {if (!node.isEditable()) return;};md3d7cg.onChangeField = function (node, field) {};";
  }
}
