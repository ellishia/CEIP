package ceip.boletin;

import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;
import org.monet.metamodel.interfaces.HasMappings;
import org.monet.metamodel.interfaces.HasSchema;

@SuppressWarnings("all")
public class $Definition$ extends ceip.academicrecords.$Definition$ implements HasBehaviour, HasClientBehaviour, HasSchema, HasMappings {
  public $Definition$() {
    super();this._code = "mk2ruba";
    this._name = "ceip.Boletin";
    this._parent = "ceip.AcademicRecords";
    this._isAbstract = null;this._label = "Boletin";
    this._template = nopackage.Resources.Template.Boletin;
    org.monet.metamodel.DocumentDefinition.MappingProperty mappingProperty3 = new org.monet.metamodel.DocumentDefinition.MappingProperty();
    mappingProperty3.setIndex(new org.monet.metamodel.internal.Ref("ceip.Boletines.Index"));
    this.getMappingList().add(mappingProperty3);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(ceip.boletin.$Definition$.class,"ceip.Boletin","ceip.AcademicRecords");
  }
  }
  
  public static String static_getName() {
    return "Boletin";
  }
  
  public Class<?> getBehaviourClass() {
    return ceip.Boletin.class;
  }
  
  public String getClientBehaviour() {
    return "var mk2ruba = new Object();mk2ruba.refresh = function (node) {if (!node.isEditable()) return;};mk2ruba.onChangeField = function (node, field) {};";
  }
  
  public Class<?> getSchemaClass() {
    return ceip.boletin.Schema.class;
  }
  
  public Class<?> getMappingClass(final String code) {
    switch(code.hashCode()) {
    case 1096268040:
    return ceip.boletin.Mapping__0.class;
    }
    return super.getMappingClass(code);
  }
}
