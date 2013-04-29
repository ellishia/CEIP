package ceip.academicrecords;

import org.monet.metamodel.DocumentDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;
import org.monet.metamodel.interfaces.HasMappings;
import org.monet.metamodel.interfaces.HasSchema;

@SuppressWarnings("all")
public class $Definition$ extends DocumentDefinition implements HasBehaviour, HasClientBehaviour, HasSchema, HasMappings {
  public $Definition$() {
    super();this._code = "ml2_wla";
    this._name = "ceip.AcademicRecords";
    this._isAbstract = new IsAbstract();this._label = "AcademicRecords";
    this._template = nopackage.Resources.Template.AcademicRecords;
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(ceip.academicrecords.$Definition$.class,"ceip.AcademicRecords",null);
  }
  }
  
  public static String static_getName() {
    return "AcademicRecords";
  }
  
  public Class<?> getBehaviourClass() {
    return ceip.AcademicRecords.class;
  }
  
  public String getClientBehaviour() {
    return "var ml2_wla = new Object();ml2_wla.refresh = function (node) {if (!node.isEditable()) return;};ml2_wla.onChangeField = function (node, field) {};";
  }
  
  public Class<?> getSchemaClass() {
    return ceip.academicrecords.Schema.class;
  }
  
  public Class<?> getMappingClass(final String code) {
    switch(code.hashCode()) {
    
    }
    return super.getMappingClass(code);
  }
}
