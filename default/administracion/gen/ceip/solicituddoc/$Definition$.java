package ceip.solicituddoc;

import org.monet.metamodel.DocumentDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;
import org.monet.metamodel.interfaces.HasMappings;
import org.monet.metamodel.interfaces.HasSchema;

@SuppressWarnings("all")
public class $Definition$ extends DocumentDefinition implements HasBehaviour, HasClientBehaviour, HasSchema, HasMappings {
  public $Definition$() {
    super();this._code = "mt9mhfg";
    this._name = "ceip.solicitudDoc";
    this._isAbstract = null;this._label = "solicitudDoc";
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(ceip.solicituddoc.$Definition$.class,"ceip.solicitudDoc",null);
  }
  }
  
  public static String static_getName() {
    return "solicitudDoc";
  }
  
  public Class<?> getBehaviourClass() {
    return ceip.SolicitudDoc.class;
  }
  
  public String getClientBehaviour() {
    return "var mt9mhfg = new Object();mt9mhfg.refresh = function (node) {if (!node.isEditable()) return;};mt9mhfg.onChangeField = function (node, field) {};";
  }
  
  public Class<?> getSchemaClass() {
    return ceip.solicituddoc.Schema.class;
  }
  
  public Class<?> getMappingClass(final String code) {
    switch(code.hashCode()) {
    
    }
    return super.getMappingClass(code);
  }
}
