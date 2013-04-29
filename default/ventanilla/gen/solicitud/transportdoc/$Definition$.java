package solicitud.transportdoc;

import org.monet.metamodel.DocumentDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;
import org.monet.metamodel.interfaces.HasMappings;
import org.monet.metamodel.interfaces.HasSchema;

@SuppressWarnings("all")
public class $Definition$ extends DocumentDefinition implements HasBehaviour, HasClientBehaviour, HasSchema, HasMappings {
  public $Definition$() {
    super();this._code = "mnpvp0a";
    this._name = "solicitud.transportDoc";
    this._isAbstract = null;this._label = "transportDoc";
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(solicitud.transportdoc.$Definition$.class,"solicitud.transportDoc",null);
  }
  }
  
  public static String static_getName() {
    return "transportDoc";
  }
  
  public Class<?> getBehaviourClass() {
    return solicitud.TransportDoc.class;
  }
  
  public String getClientBehaviour() {
    return "var mnpvp0a = new Object();mnpvp0a.refresh = function (node) {if (!node.isEditable()) return;};mnpvp0a.onChangeField = function (node, field) {};";
  }
  
  public Class<?> getSchemaClass() {
    return solicitud.transportdoc.Schema.class;
  }
  
  public Class<?> getMappingClass(final String code) {
    switch(code.hashCode()) {
    
    }
    return super.getMappingClass(code);
  }
}
