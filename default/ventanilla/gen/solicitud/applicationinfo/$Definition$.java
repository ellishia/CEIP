package solicitud.applicationinfo;

import org.monet.metamodel.FormDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;
import org.monet.metamodel.interfaces.HasMappings;
import solicitud.applicationinfo.AcademicYearProperty;
import solicitud.applicationinfo.AddressProperty;
import solicitud.applicationinfo.AppliedCentersProperty;
import solicitud.applicationinfo.BirthdateProperty;
import solicitud.applicationinfo.CialProperty;
import solicitud.applicationinfo.DateProperty;
import solicitud.applicationinfo.DocumentsProperty;
import solicitud.applicationinfo.GenderProperty;
import solicitud.applicationinfo.IdentifierProperty;
import solicitud.applicationinfo.LevelProperty;
import solicitud.applicationinfo.MatriculableProperty;
import solicitud.applicationinfo.NationalityProperty;
import solicitud.applicationinfo.ParentsInCenterProperty;
import solicitud.applicationinfo.SiblingsProperty;
import solicitud.applicationinfo.StudentNameProperty;
import solicitud.applicationinfo.StudentSurnameProperty;

@SuppressWarnings("all")
public class $Definition$ extends FormDefinition implements HasBehaviour, HasClientBehaviour, HasMappings {
  public $Definition$() {
    super();this._code = "mug0jug";
    this._name = "solicitud.ApplicationInfo";
    this._isAbstract = null;this.setIsComponent(true);
    this._label = "Información de la Solicitud";
    this.addBooleanFieldProperty(Matriculable);
    this.addSerialFieldProperty(Identifier);
    this.addDateFieldProperty(Date);
    this.addTextFieldProperty(StudentName);
    this.addTextFieldProperty(StudentSurname);
    this.addTextFieldProperty(Cial);
    this.addDateFieldProperty(Birthdate);
    this.addTextFieldProperty(Nationality);
    this.addSelectFieldProperty(Gender);
    this.addSectionFieldProperty(Address);
    this.addSectionFieldProperty(AppliedCenters);
    this.addSelectFieldProperty(Level);
    this.addSelectFieldProperty(AcademicYear);
    this.addTextFieldProperty(Siblings);
    this.addTextFieldProperty(ParentsInCenter);
    this.addFileFieldProperty(Documents);
    org.monet.metamodel.FormDefinition.MappingProperty mappingProperty18 = new org.monet.metamodel.FormDefinition.MappingProperty();
    mappingProperty18.setIndex(new org.monet.metamodel.internal.Ref("solicitud.Applications.Indice"));
    this.getMappingList().add(mappingProperty18);
    org.monet.metamodel.FormDefinition.OperationProperty operationProperty20 = new org.monet.metamodel.FormDefinition.OperationProperty();
    operationProperty20.setLabel("Publicar Preinscripción");
    operationProperty20.setCode("metkf3a");
    operationProperty20.setName("Preinscripcion");
    this.addOperation(operationProperty20);
    org.monet.metamodel.FormDefinition.FormViewProperty formViewProperty23 = new org.monet.metamodel.FormDefinition.FormViewProperty();
    formViewProperty23.setLabel("Preinscripción");
    formViewProperty23.setCode("m4ud4za");
    formViewProperty23.setName("View");
    org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty showProperty24 = new org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty();
    showProperty24.getField().add(new org.monet.metamodel.internal.Ref("Identifier","solicitud.ApplicationInfo","solicitud.ApplicationInfo.Identifier"));
    showProperty24.getField().add(new org.monet.metamodel.internal.Ref("Date","solicitud.ApplicationInfo","solicitud.ApplicationInfo.Date"));
    showProperty24.getField().add(new org.monet.metamodel.internal.Ref("AcademicYear","solicitud.ApplicationInfo","solicitud.ApplicationInfo.AcademicYear"));
    showProperty24.getField().add(new org.monet.metamodel.internal.Ref("StudentName","solicitud.ApplicationInfo","solicitud.ApplicationInfo.StudentName"));
    showProperty24.getField().add(new org.monet.metamodel.internal.Ref("StudentSurname","solicitud.ApplicationInfo","solicitud.ApplicationInfo.StudentSurname"));
    showProperty24.getField().add(new org.monet.metamodel.internal.Ref("Cial","solicitud.ApplicationInfo","solicitud.ApplicationInfo.Cial"));
    showProperty24.getField().add(new org.monet.metamodel.internal.Ref("Birthdate","solicitud.ApplicationInfo","solicitud.ApplicationInfo.Birthdate"));
    showProperty24.getField().add(new org.monet.metamodel.internal.Ref("Nationality","solicitud.ApplicationInfo","solicitud.ApplicationInfo.Nationality"));
    showProperty24.getField().add(new org.monet.metamodel.internal.Ref("Gender","solicitud.ApplicationInfo","solicitud.ApplicationInfo.Gender"));
    showProperty24.getField().add(new org.monet.metamodel.internal.Ref("Level","solicitud.ApplicationInfo","solicitud.ApplicationInfo.Level"));
    formViewProperty23.setShow(showProperty24);
    this.addView(formViewProperty23);
    org.monet.metamodel.FormDefinition.FormViewProperty formViewProperty36 = new org.monet.metamodel.FormDefinition.FormViewProperty();
    formViewProperty36.setLabel("Domicilio");
    formViewProperty36.setCode("m43nayw");
    formViewProperty36.setName("HomeAdd");
    org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty showProperty37 = new org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty();
    showProperty37.getField().add(new org.monet.metamodel.internal.Ref("Address","solicitud.ApplicationInfo","solicitud.ApplicationInfo.Address"));
    formViewProperty36.setShow(showProperty37);
    this.addView(formViewProperty36);
    org.monet.metamodel.FormDefinition.FormViewProperty formViewProperty40 = new org.monet.metamodel.FormDefinition.FormViewProperty();
    formViewProperty40.setLabel("Datos de baremación");
    formViewProperty40.setCode("mrja83w");
    formViewProperty40.setName("Criteria");
    org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty showProperty41 = new org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty();
    showProperty41.getField().add(new org.monet.metamodel.internal.Ref("Siblings","solicitud.ApplicationInfo","solicitud.ApplicationInfo.Siblings"));
    showProperty41.getField().add(new org.monet.metamodel.internal.Ref("ParentsInCenter","solicitud.ApplicationInfo","solicitud.ApplicationInfo.ParentsInCenter"));
    showProperty41.getField().add(new org.monet.metamodel.internal.Ref("Documents","solicitud.ApplicationInfo","solicitud.ApplicationInfo.Documents"));
    showProperty41.getField().add(new org.monet.metamodel.internal.Ref("AppliedCenters","solicitud.ApplicationInfo","solicitud.ApplicationInfo.AppliedCenters"));
    formViewProperty40.setShow(showProperty41);
    this.addView(formViewProperty40);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(solicitud.applicationinfo.$Definition$.class,"solicitud.ApplicationInfo",null);
  }
  }
  
  public static String static_getName() {
    return "ApplicationInfo";
  }
  
  public Class<?> getBehaviourClass() {
    return solicitud.ApplicationInfo.class;
  }
  
  public String getClientBehaviour() {
    return "var mug0jug = new Object();mug0jug.refresh = function (node) {if (!node.isEditable()) return;};mug0jug.onChangeField = function (node, field) {};";
  }
  
  public Class<?> getMappingClass(final String code) {
    switch(code.hashCode()) {
    case -461621646:
    return solicitud.applicationinfo.Mapping__0.class;
    }
    return super.getMappingClass(code);
  }
  
  private final MatriculableProperty Matriculable = new solicitud.applicationinfo.MatriculableProperty();
  
  private final IdentifierProperty Identifier = new solicitud.applicationinfo.IdentifierProperty();
  
  private final DateProperty Date = new solicitud.applicationinfo.DateProperty();
  
  private final StudentNameProperty StudentName = new solicitud.applicationinfo.StudentNameProperty();
  
  private final StudentSurnameProperty StudentSurname = new solicitud.applicationinfo.StudentSurnameProperty();
  
  private final CialProperty Cial = new solicitud.applicationinfo.CialProperty();
  
  private final BirthdateProperty Birthdate = new solicitud.applicationinfo.BirthdateProperty();
  
  private final NationalityProperty Nationality = new solicitud.applicationinfo.NationalityProperty();
  
  private final GenderProperty Gender = new solicitud.applicationinfo.GenderProperty();
  
  private final AddressProperty Address = new solicitud.applicationinfo.AddressProperty();
  
  private final AppliedCentersProperty AppliedCenters = new solicitud.applicationinfo.AppliedCentersProperty();
  
  private final LevelProperty Level = new solicitud.applicationinfo.LevelProperty();
  
  private final AcademicYearProperty AcademicYear = new solicitud.applicationinfo.AcademicYearProperty();
  
  private final SiblingsProperty Siblings = new solicitud.applicationinfo.SiblingsProperty();
  
  private final ParentsInCenterProperty ParentsInCenter = new solicitud.applicationinfo.ParentsInCenterProperty();
  
  private final DocumentsProperty Documents = new solicitud.applicationinfo.DocumentsProperty();
}
