package solicitud.admiteddoc;

import org.monet.metamodel.DocumentDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;
import org.monet.metamodel.interfaces.HasMappings;
import org.monet.metamodel.interfaces.HasSchema;

@SuppressWarnings("all")
public class $Definition$ extends DocumentDefinition implements HasBehaviour, HasClientBehaviour, HasSchema, HasMappings {
  public $Definition$() {
    super();this._code = "msnjbva";
    this._name = "solicitud.AdmitedDoc";
    this._isAbstract = null;this._label = "Listado de Alumnos";
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(solicitud.admiteddoc.$Definition$.class,"solicitud.AdmitedDoc",null);
  }
  }
  
  public static String static_getName() {
    return "AdmitedDoc";
  }
  
  public Class<?> getBehaviourClass() {
    return solicitud.AdmitedDoc.class;
  }
  
  public String getClientBehaviour() {
    return "var msnjbva = new Object();msnjbva.refresh = function (node) {if (!node.isEditable()) return;};msnjbva.onChangeField = function (node, field) {};";
  }
  
  public Class<?> getSchemaClass() {
    return solicitud.admiteddoc.Schema.class;
  }
  
  public Class<?> getMappingClass(final String code) {
    switch(code.hashCode()) {
    
    }
    return super.getMappingClass(code);
  }
}
