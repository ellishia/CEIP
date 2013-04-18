package direc.groups.group;

import direc.groups.group.AcademicYearProperty;
import direc.groups.group.EducationalLevelProperty;
import direc.groups.group.IdentifierProperty;
import direc.groups.group.NameProperty;
import direc.groups.group.StudentsProperty;
import org.monet.metamodel.FormDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;
import org.monet.metamodel.interfaces.HasMappings;
import org.monet.metamodel.interfaces.HasProperties;

@SuppressWarnings("all")
public class $Definition$ extends FormDefinition implements HasBehaviour, HasClientBehaviour, HasProperties, HasMappings {
  public $Definition$() {
    super();this._code = "mpqipva";
    this._name = "direc.Groups.Group";
    this._isAbstract = null;this._label = "Grupo";
    this.addTextFieldProperty(Name);
    this.addSelectFieldProperty(EducationalLevel);
    this.addSelectFieldProperty(AcademicYear);
    this.addLinkFieldProperty(Students);
    this.addSerialFieldProperty(Identifier);
    org.monet.metamodel.FormDefinition.MappingProperty mappingProperty6 = new org.monet.metamodel.FormDefinition.MappingProperty();
    mappingProperty6.setIndex(new org.monet.metamodel.internal.Ref("direc.Groups.Indice"));
    this.getMappingList().add(mappingProperty6);
    org.monet.metamodel.FormDefinition.PropertiesProperty propertiesProperty8 = new org.monet.metamodel.FormDefinition.PropertiesProperty();
    this.setProperties(propertiesProperty8);
    org.monet.metamodel.FormDefinition.FormViewProperty formViewProperty10 = new org.monet.metamodel.FormDefinition.FormViewProperty();
    formViewProperty10.setLabel("Ficha");
    formViewProperty10.setCode("pi");
    formViewProperty10.setIsDefault(true);
    org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty showProperty12 = new org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty();
    showProperty12.getField().add(new org.monet.metamodel.internal.Ref("Name","direc.Groups.Group","direc.Groups.Group.Name"));
    showProperty12.getField().add(new org.monet.metamodel.internal.Ref("EducationalLevel","direc.Groups.Group","direc.Groups.Group.EducationalLevel"));
    showProperty12.getField().add(new org.monet.metamodel.internal.Ref("AcademicYear","direc.Groups.Group","direc.Groups.Group.AcademicYear"));
    showProperty12.getField().add(new org.monet.metamodel.internal.Ref("Students","direc.Groups.Group","direc.Groups.Group.Students"));
    formViewProperty10.setShow(showProperty12);
    this.addView(formViewProperty10);
    org.monet.metamodel.FormDefinition.FormViewProperty formViewProperty18 = new org.monet.metamodel.FormDefinition.FormViewProperty();
    formViewProperty18.setCode("m373rfg");
    formViewProperty18.setName("View");
    formViewProperty18.setIsWidget(true);
    org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty showProperty19 = new org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty();
    showProperty19.getField().add(new org.monet.metamodel.internal.Ref("Name","direc.Groups.Group","direc.Groups.Group.Name"));
    showProperty19.getField().add(new org.monet.metamodel.internal.Ref("EducationalLevel","direc.Groups.Group","direc.Groups.Group.EducationalLevel"));
    showProperty19.getField().add(new org.monet.metamodel.internal.Ref("AcademicYear","direc.Groups.Group","direc.Groups.Group.AcademicYear"));
    showProperty19.getField().add(new org.monet.metamodel.internal.Ref("Students","direc.Groups.Group","direc.Groups.Group.Students"));
    showProperty19.getField().add(new org.monet.metamodel.internal.Ref("Identifier","direc.Groups.Group","direc.Groups.Group.Identifier"));
    formViewProperty18.setShow(showProperty19);
    this.addView(formViewProperty18);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(direc.groups.group.$Definition$.class,"direc.Groups.Group",null);
  }
  }
  
  public static String static_getName() {
    return "Group";
  }
  
  public Class<?> getBehaviourClass() {
    return direc.groups.Group.class;
  }
  
  public String getClientBehaviour() {
    return "var mpqipva = new Object();mpqipva.refresh = function (node) {if (!node.isEditable()) return;};mpqipva.onChangeField = function (node, field) {};";
  }
  
  public Class<?> getPropertiesClass() {
    return direc.groups.group.$Properties$.class;
  }
  
  public Class<?> getMappingClass(final String code) {
    switch(code.hashCode()) {
    case -2080241954:
    return direc.groups.group.Mapping__0.class;
    }
    return super.getMappingClass(code);
  }
  
  private final NameProperty Name = new direc.groups.group.NameProperty();
  
  private final EducationalLevelProperty EducationalLevel = new direc.groups.group.EducationalLevelProperty();
  
  private final AcademicYearProperty AcademicYear = new direc.groups.group.AcademicYearProperty();
  
  private final StudentsProperty Students = new direc.groups.group.StudentsProperty();
  
  private final IdentifierProperty Identifier = new direc.groups.group.IdentifierProperty();
}
