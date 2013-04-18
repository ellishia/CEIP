package ceip.historial;

import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;
import org.monet.metamodel.interfaces.HasMappings;
import org.monet.metamodel.interfaces.HasSchema;

@SuppressWarnings("all")
public class $Definition$ extends ceip.academicrecords.$Definition$ implements HasBehaviour, HasClientBehaviour, HasSchema, HasMappings {
  public $Definition$() {
    super();this._code = "mskmouq";
    this._name = "ceip.Historial";
    this._parent = "ceip.AcademicRecords";
    this._isAbstract = null;this._label = "Historial";
    this._template = ceip.Resources.Template.Historial;
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(ceip.historial.$Definition$.class,"ceip.Historial","ceip.AcademicRecords");
  }
  }
  
  public static String static_getName() {
    return "Historial";
  }
  
  public Class<?> getBehaviourClass() {
    return ceip.Historial.class;
  }
  
  public String getClientBehaviour() {
    return "var mskmouq = new Object();mskmouq.refresh = function (node) {if (!node.isEditable()) return;};mskmouq.onChangeField = function (node, field) {};";
  }
  
  public Class<?> getSchemaClass() {
    return ceip.historial.Schema.class;
  }
  
  public Class<?> getMappingClass(final String code) {
    switch(code.hashCode()) {
    
    }
    return super.getMappingClass(code);
  }
}
