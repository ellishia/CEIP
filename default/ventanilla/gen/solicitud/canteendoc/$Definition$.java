package solicitud.canteendoc;

import org.monet.metamodel.DocumentDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;
import org.monet.metamodel.interfaces.HasMappings;
import org.monet.metamodel.interfaces.HasSchema;

@SuppressWarnings("all")
public class $Definition$ extends DocumentDefinition implements HasBehaviour, HasClientBehaviour, HasSchema, HasMappings {
  public $Definition$() {
    super();this._code = "mlduu8q";
    this._name = "solicitud.canteenDoc";
    this._isAbstract = null;this._label = "canteendoc";
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(solicitud.canteendoc.$Definition$.class,"solicitud.canteenDoc",null);
  }
  }
  
  public static String static_getName() {
    return "canteenDoc";
  }
  
  public Class<?> getBehaviourClass() {
    return solicitud.CanteenDoc.class;
  }
  
  public String getClientBehaviour() {
    return "var mlduu8q = new Object();mlduu8q.refresh = function (node) {if (!node.isEditable()) return;};mlduu8q.onChangeField = function (node, field) {};";
  }
  
  public Class<?> getSchemaClass() {
    return solicitud.canteendoc.Schema.class;
  }
  
  public Class<?> getMappingClass(final String code) {
    switch(code.hashCode()) {
    
    }
    return super.getMappingClass(code);
  }
}
