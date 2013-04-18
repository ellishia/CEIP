package ceip.basicinfo;

import ceip.basicinfo.AddressProperty;
import ceip.basicinfo.BoletinProperty;
import ceip.basicinfo.CialProperty;
import ceip.basicinfo.Date_of_BirthProperty;
import ceip.basicinfo.LevelProperty;
import ceip.basicinfo.NameProperty;
import ceip.basicinfo.SurnameProperty;
import org.monet.metamodel.FormDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;
import org.monet.metamodel.interfaces.HasMappings;
import org.monet.metamodel.interfaces.HasProperties;

@SuppressWarnings("all")
public class $Definition$ extends FormDefinition implements HasBehaviour, HasClientBehaviour, HasProperties, HasMappings {
  public $Definition$() {
    super();this._code = "mw0lesw";
    this._name = "ceip.BasicInfo";
    this._isAbstract = null;this._label = "Alumno/a";
    this.setIsComponent(true);
    org.monet.metamodel.FormDefinition.MappingProperty mappingProperty2 = new org.monet.metamodel.FormDefinition.MappingProperty();
    mappingProperty2.setIndex(new org.monet.metamodel.internal.Ref("ceip.Students.Index"));
    this.getMappingList().add(mappingProperty2);
    org.monet.metamodel.FormDefinition.PropertiesProperty propertiesProperty4 = new org.monet.metamodel.FormDefinition.PropertiesProperty();
    this.setProperties(propertiesProperty4);
    this.addTextFieldProperty(Name);
    this.addTextFieldProperty(Surname);
    this.addSelectFieldProperty(Level);
    this.addTextFieldProperty(Cial);
    this.addDateFieldProperty(Date_of_Birth);
    this.addSectionFieldProperty(Address);
    this.addNodeFieldProperty(Boletin);
    org.monet.metamodel.FormDefinition.FormViewProperty formViewProperty13 = new org.monet.metamodel.FormDefinition.FormViewProperty();
    formViewProperty13.setLabel("Ficha de Alumno");
    formViewProperty13.setCode("mh_lw3g");
    formViewProperty13.setIsDefault(true);
    org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty showProperty15 = new org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty();
    showProperty15.getField().add(new org.monet.metamodel.internal.Ref("Name","ceip.BasicInfo","ceip.BasicInfo.Name"));
    showProperty15.getField().add(new org.monet.metamodel.internal.Ref("Surname","ceip.BasicInfo","ceip.BasicInfo.Surname"));
    showProperty15.getField().add(new org.monet.metamodel.internal.Ref("Cial","ceip.BasicInfo","ceip.BasicInfo.Cial"));
    showProperty15.getField().add(new org.monet.metamodel.internal.Ref("Date_of_Birth","ceip.BasicInfo","ceip.BasicInfo.Date_of_Birth"));
    showProperty15.getField().add(new org.monet.metamodel.internal.Ref("Address","ceip.BasicInfo","ceip.BasicInfo.Address"));
    showProperty15.getField().add(new org.monet.metamodel.internal.Ref("Boletin","ceip.BasicInfo","ceip.BasicInfo.Boletin"));
    formViewProperty13.setShow(showProperty15);
    this.addView(formViewProperty13);
    org.monet.metamodel.FormDefinition.FormViewProperty formViewProperty23 = new org.monet.metamodel.FormDefinition.FormViewProperty();
    formViewProperty23.setLabel("Datos del Alumno");
    formViewProperty23.setCode("mkix_vg");
    formViewProperty23.setName("Vista");
    formViewProperty23.setIsWidget(true);
    org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty showProperty25 = new org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty();
    showProperty25.getField().add(new org.monet.metamodel.internal.Ref("Name","ceip.BasicInfo","ceip.BasicInfo.Name"));
    showProperty25.getField().add(new org.monet.metamodel.internal.Ref("Surname","ceip.BasicInfo","ceip.BasicInfo.Surname"));
    showProperty25.getField().add(new org.monet.metamodel.internal.Ref("Cial","ceip.BasicInfo","ceip.BasicInfo.Cial"));
    showProperty25.getField().add(new org.monet.metamodel.internal.Ref("Date_of_Birth","ceip.BasicInfo","ceip.BasicInfo.Date_of_Birth"));
    showProperty25.getField().add(new org.monet.metamodel.internal.Ref("Address","ceip.BasicInfo","ceip.BasicInfo.Address"));
    showProperty25.getField().add(new org.monet.metamodel.internal.Ref("Boletin","ceip.BasicInfo","ceip.BasicInfo.Boletin"));
    formViewProperty23.setShow(showProperty25);
    this.addView(formViewProperty23);
    org.monet.metamodel.FormDefinition.FormViewProperty formViewProperty33 = new org.monet.metamodel.FormDefinition.FormViewProperty();
    formViewProperty33.setCode("m6tw42w");
    formViewProperty33.setName("VistaBoletin");
    formViewProperty33.setIsWidget(true);
    org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty showProperty34 = new org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty();
    org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty.AttachmentsProperty attachmentsProperty34 = new org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty.AttachmentsProperty();
    attachmentsProperty34.getFieldNode().add(new org.monet.metamodel.internal.Ref("Boletin","ceip.BasicInfo","ceip.BasicInfo.Boletin"));
    showProperty34.setAttachments(attachmentsProperty34);
    formViewProperty33.setShow(showProperty34);
    this.addView(formViewProperty33);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(ceip.basicinfo.$Definition$.class,"ceip.BasicInfo",null);
  }
  }
  
  public static String static_getName() {
    return "BasicInfo";
  }
  
  public Class<?> getBehaviourClass() {
    return ceip.BasicInfo.class;
  }
  
  public String getClientBehaviour() {
    return "var mw0lesw = new Object();mw0lesw.refresh = function (node) {if (!node.isEditable()) return;};mw0lesw.onChangeField = function (node, field) {};";
  }
  
  public Class<?> getPropertiesClass() {
    return ceip.basicinfo.$Properties$.class;
  }
  
  public Class<?> getMappingClass(final String code) {
    switch(code.hashCode()) {
    case -330478409:
    return ceip.basicinfo.Mapping__0.class;
    }
    return super.getMappingClass(code);
  }
  
  private final NameProperty Name = new ceip.basicinfo.NameProperty();
  
  private final SurnameProperty Surname = new ceip.basicinfo.SurnameProperty();
  
  private final LevelProperty Level = new ceip.basicinfo.LevelProperty();
  
  private final CialProperty Cial = new ceip.basicinfo.CialProperty();
  
  private final Date_of_BirthProperty Date_of_Birth = new ceip.basicinfo.Date_of_BirthProperty();
  
  private final AddressProperty Address = new ceip.basicinfo.AddressProperty();
  
  private final BoletinProperty Boletin = new ceip.basicinfo.BoletinProperty();
}
