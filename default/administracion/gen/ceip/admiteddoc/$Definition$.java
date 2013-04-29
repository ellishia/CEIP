package ceip.admiteddoc;

import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;
import org.monet.metamodel.interfaces.HasMappings;
import org.monet.metamodel.interfaces.HasSchema;

@SuppressWarnings("all")
public class $Definition$ extends ceip.academicrecords.$Definition$ implements HasBehaviour, HasClientBehaviour, HasSchema, HasMappings {
  public $Definition$() {
    super();this._code = "mbafqga";
    this._name = "ceip.AdmitedDoc";
    this._parent = "ceip.AcademicRecords";
    this._isAbstract = null;this._label = "Listado de Admitidos";
    this._template = nopackage.Resources.Template.AdmitedList;
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(ceip.admiteddoc.$Definition$.class,"ceip.AdmitedDoc","ceip.AcademicRecords");
  }
  }
  
  public static String static_getName() {
    return "AdmitedDoc";
  }
  
  public Class<?> getBehaviourClass() {
    return ceip.AdmitedDoc.class;
  }
  
  public String getClientBehaviour() {
    return "var mbafqga = new Object();mbafqga.refresh = function (node) {if (!node.isEditable()) return;};mbafqga.onChangeField = function (node, field) {};";
  }
  
  public Class<?> getSchemaClass() {
    return ceip.admiteddoc.Schema.class;
  }
  
  public Class<?> getMappingClass(final String code) {
    switch(code.hashCode()) {
    
    }
    return super.getMappingClass(code);
  }
}
