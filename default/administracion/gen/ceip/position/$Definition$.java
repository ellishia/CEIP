package ceip.position;

import ceip.position.AcademicYearProperty;
import ceip.position.SpecificPositionProperty;
import org.monet.metamodel.FormDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;
import org.monet.metamodel.interfaces.HasMappings;
import org.monet.metamodel.interfaces.HasProperties;

@SuppressWarnings("all")
public class $Definition$ extends FormDefinition implements HasBehaviour, HasClientBehaviour, HasProperties, HasMappings {
  public $Definition$() {
    super();this._code = "mb16loa";
    this._name = "ceip.Position";
    this._isAbstract = null;this._label = "Plaza";
    this.addSelectFieldProperty(AcademicYear);
    this.addSectionFieldProperty(SpecificPosition);
    org.monet.metamodel.FormDefinition.MappingProperty mappingProperty3 = new org.monet.metamodel.FormDefinition.MappingProperty();
    mappingProperty3.setIndex(new org.monet.metamodel.internal.Ref("ceip.AvailablePositions.Indice"));
    this.getMappingList().add(mappingProperty3);
    org.monet.metamodel.FormDefinition.PropertiesProperty propertiesProperty5 = new org.monet.metamodel.FormDefinition.PropertiesProperty();
    this.setProperties(propertiesProperty5);
    org.monet.metamodel.FormDefinition.FormViewProperty formViewProperty7 = new org.monet.metamodel.FormDefinition.FormViewProperty();
    formViewProperty7.setLabel("Plazas disponibles por nivel");
    formViewProperty7.setCode("mv1hfcw");
    org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty showProperty8 = new org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty();
    showProperty8.getField().add(new org.monet.metamodel.internal.Ref("SpecificPosition","ceip.Position","ceip.Position.SpecificPosition"));
    showProperty8.getField().add(new org.monet.metamodel.internal.Ref("AcademicYear","ceip.Position","ceip.Position.AcademicYear"));
    formViewProperty7.setShow(showProperty8);
    this.addView(formViewProperty7);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(ceip.position.$Definition$.class,"ceip.Position",null);
  }
  }
  
  public static String static_getName() {
    return "Position";
  }
  
  public Class<?> getBehaviourClass() {
    return ceip.Position.class;
  }
  
  public String getClientBehaviour() {
    return "var mb16loa = new Object();mb16loa.refresh = function (node) {if (!node.isEditable()) return;};mb16loa.onChangeField = function (node, field) {};";
  }
  
  public Class<?> getPropertiesClass() {
    return ceip.position.$Properties$.class;
  }
  
  public Class<?> getMappingClass(final String code) {
    switch(code.hashCode()) {
    case -541836497:
    return ceip.position.Mapping__0.class;
    }
    return super.getMappingClass(code);
  }
  
  private final AcademicYearProperty AcademicYear = new ceip.position.AcademicYearProperty();
  
  private final SpecificPositionProperty SpecificPosition = new ceip.position.SpecificPositionProperty();
}
