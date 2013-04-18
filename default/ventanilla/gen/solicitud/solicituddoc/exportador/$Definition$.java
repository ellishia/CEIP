package solicitud.solicituddoc.exportador;

import org.monet.metamodel.ExporterDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends ExporterDefinition implements HasBehaviour, HasClientBehaviour {
  public $Definition$() {
    super();this._code = "mbriung";
    this._name = "solicitud.solicitudDoc.Exportador";
    this._isAbstract = null;this._label = "Exportador de Documento";
    this._target = new org.monet.metamodel.internal.Ref("solicitud.solicitudDoc");
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(solicitud.solicituddoc.exportador.$Definition$.class,"solicitud.solicitudDoc.Exportador",null);
  }
  }
  
  public static String static_getName() {
    return "Exportador";
  }
  
  public Class<?> getBehaviourClass() {
    return solicitud.solicituddoc.Exportador.class;
  }
  
  public String getClientBehaviour() {
    return "var mbriung = new Object();mbriung.refresh = function (node) {if (!node.isEditable()) return;};mbriung.onChangeField = function (node, field) {};";
  }
}
