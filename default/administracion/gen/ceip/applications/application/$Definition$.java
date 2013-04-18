package ceip.applications.application;

import ceip.applications.application.AcademicYearProperty;
import ceip.applications.application.AddressProperty;
import ceip.applications.application.AdmitidoProperty;
import ceip.applications.application.BirthDateProperty;
import ceip.applications.application.CialProperty;
import ceip.applications.application.DocumentsProperty;
import ceip.applications.application.GenderProperty;
import ceip.applications.application.IdentifierProperty;
import ceip.applications.application.LevelProperty;
import ceip.applications.application.NationalityProperty;
import ceip.applications.application.ParentsInCenterProperty;
import ceip.applications.application.SiblingsProperty;
import ceip.applications.application.StudentNameProperty;
import ceip.applications.application.StudentSurnameProperty;
import org.monet.metamodel.FormDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;
import org.monet.metamodel.interfaces.HasMappings;
import org.monet.metamodel.interfaces.HasProperties;

@SuppressWarnings("all")
public class $Definition$ extends FormDefinition implements HasBehaviour, HasClientBehaviour, HasProperties, HasMappings {
  public $Definition$() {
    super();this._code = "mug0jug";
    this._name = "ceip.Applications.Application";
    this._isAbstract = null;this._label = "Solicitud";
    this.addTextFieldProperty(Identifier);
    this.addTextFieldProperty(Cial);
    this.addTextFieldProperty(StudentName);
    this.addTextFieldProperty(StudentSurname);
    this.addDateFieldProperty(BirthDate);
    this.addTextFieldProperty(Nationality);
    this.addSelectFieldProperty(Level);
    this.addSelectFieldProperty(Gender);
    this.addSelectFieldProperty(AcademicYear);
    this.addTextFieldProperty(Siblings);
    this.addTextFieldProperty(ParentsInCenter);
    this.addFileFieldProperty(Documents);
    this.addSectionFieldProperty(Address);
    this.addBooleanFieldProperty(Admitido);
    org.monet.metamodel.FormDefinition.MappingProperty mappingProperty15 = new org.monet.metamodel.FormDefinition.MappingProperty();
    mappingProperty15.setIndex(new org.monet.metamodel.internal.Ref("ceip.Applications.Indice"));
    this.getMappingList().add(mappingProperty15);
    org.monet.metamodel.FormDefinition.PropertiesProperty propertiesProperty17 = new org.monet.metamodel.FormDefinition.PropertiesProperty();
    this.setProperties(propertiesProperty17);
    org.monet.metamodel.FormDefinition.FormViewProperty formViewProperty20 = new org.monet.metamodel.FormDefinition.FormViewProperty();
    formViewProperty20.setLabel("Preinscripción");
    formViewProperty20.setCode("m4ud4za");
    org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty showProperty21 = new org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty();
    showProperty21.getField().add(new org.monet.metamodel.internal.Ref("Identifier","ceip.Applications.Application","ceip.Applications.Application.Identifier"));
    showProperty21.getField().add(new org.monet.metamodel.internal.Ref("Admitido","ceip.Applications.Application","ceip.Applications.Application.Admitido"));
    showProperty21.getField().add(new org.monet.metamodel.internal.Ref("StudentName","ceip.Applications.Application","ceip.Applications.Application.StudentName"));
    showProperty21.getField().add(new org.monet.metamodel.internal.Ref("StudentSurname","ceip.Applications.Application","ceip.Applications.Application.StudentSurname"));
    showProperty21.getField().add(new org.monet.metamodel.internal.Ref("Cial","ceip.Applications.Application","ceip.Applications.Application.Cial"));
    showProperty21.getField().add(new org.monet.metamodel.internal.Ref("Level","ceip.Applications.Application","ceip.Applications.Application.Level"));
    showProperty21.getField().add(new org.monet.metamodel.internal.Ref("AcademicYear","ceip.Applications.Application","ceip.Applications.Application.AcademicYear"));
    formViewProperty20.setShow(showProperty21);
    this.addView(formViewProperty20);
    org.monet.metamodel.FormDefinition.FormViewProperty formViewProperty30 = new org.monet.metamodel.FormDefinition.FormViewProperty();
    formViewProperty30.setLabel("Domicilio");
    formViewProperty30.setCode("mmy1wyg");
    org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty showProperty31 = new org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty();
    showProperty31.getField().add(new org.monet.metamodel.internal.Ref("Address","ceip.Applications.Application","ceip.Applications.Application.Address"));
    formViewProperty30.setShow(showProperty31);
    this.addView(formViewProperty30);
    org.monet.metamodel.FormDefinition.FormViewProperty formViewProperty34 = new org.monet.metamodel.FormDefinition.FormViewProperty();
    formViewProperty34.setLabel("Criterios de Baremación");
    formViewProperty34.setCode("mt6h4xa");
    org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty showProperty35 = new org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty();
    showProperty35.getField().add(new org.monet.metamodel.internal.Ref("Siblings","ceip.Applications.Application","ceip.Applications.Application.Siblings"));
    showProperty35.getField().add(new org.monet.metamodel.internal.Ref("ParentsInCenter","ceip.Applications.Application","ceip.Applications.Application.ParentsInCenter"));
    showProperty35.getField().add(new org.monet.metamodel.internal.Ref("Documents","ceip.Applications.Application","ceip.Applications.Application.Documents"));
    formViewProperty34.setShow(showProperty35);
    this.addView(formViewProperty34);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(ceip.applications.application.$Definition$.class,"ceip.Applications.Application",null);
  }
  }
  
  public static String static_getName() {
    return "Application";
  }
  
  public Class<?> getBehaviourClass() {
    return ceip.applications.Application.class;
  }
  
  public String getClientBehaviour() {
    return "var mug0jug = new Object();mug0jug.refresh = function (node) {if (!node.isEditable()) return;};mug0jug.onChangeField = function (node, field) {};";
  }
  
  public Class<?> getPropertiesClass() {
    return ceip.applications.application.$Properties$.class;
  }
  
  public Class<?> getMappingClass(final String code) {
    switch(code.hashCode()) {
    case 1340053023:
    return ceip.applications.application.Mapping__0.class;
    }
    return super.getMappingClass(code);
  }
  
  private final IdentifierProperty Identifier = new ceip.applications.application.IdentifierProperty();
  
  private final CialProperty Cial = new ceip.applications.application.CialProperty();
  
  private final StudentNameProperty StudentName = new ceip.applications.application.StudentNameProperty();
  
  private final StudentSurnameProperty StudentSurname = new ceip.applications.application.StudentSurnameProperty();
  
  private final BirthDateProperty BirthDate = new ceip.applications.application.BirthDateProperty();
  
  private final NationalityProperty Nationality = new ceip.applications.application.NationalityProperty();
  
  private final LevelProperty Level = new ceip.applications.application.LevelProperty();
  
  private final GenderProperty Gender = new ceip.applications.application.GenderProperty();
  
  private final AcademicYearProperty AcademicYear = new ceip.applications.application.AcademicYearProperty();
  
  private final SiblingsProperty Siblings = new ceip.applications.application.SiblingsProperty();
  
  private final ParentsInCenterProperty ParentsInCenter = new ceip.applications.application.ParentsInCenterProperty();
  
  private final DocumentsProperty Documents = new ceip.applications.application.DocumentsProperty();
  
  private final AddressProperty Address = new ceip.applications.application.AddressProperty();
  
  private final AdmitidoProperty Admitido = new ceip.applications.application.AdmitidoProperty();
}
