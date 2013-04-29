package solicitud.serviceapplications.serviceapplication;

import org.monet.metamodel.FormDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;
import org.monet.metamodel.interfaces.HasMappings;
import solicitud.serviceapplications.serviceapplication.AcademicYearProperty;
import solicitud.serviceapplications.serviceapplication.CialProperty;
import solicitud.serviceapplications.serviceapplication.DateProperty;
import solicitud.serviceapplications.serviceapplication.StudentNameProperty;
import solicitud.serviceapplications.serviceapplication.StudentSurnameProperty;

@SuppressWarnings("all")
public class $Definition$ extends FormDefinition implements HasBehaviour, HasClientBehaviour, HasMappings {
  public $Definition$() {
    super();this._code = "mxdc0hw";
    this._name = "solicitud.ServiceApplications.ServiceApplication";
    this._isAbstract = new IsAbstract();this._label = "Solicitud de Servicio";
    this.addTextFieldProperty(StudentName);
    this.addTextFieldProperty(StudentSurname);
    this.addTextFieldProperty(Cial);
    this.addSelectFieldProperty(AcademicYear);
    this.addDateFieldProperty(Date);
    org.monet.metamodel.FormDefinition.MappingProperty mappingProperty6 = new org.monet.metamodel.FormDefinition.MappingProperty();
    mappingProperty6.setIndex(new org.monet.metamodel.internal.Ref("solicitud.ServiceApplications.Indice"));
    this.getMappingList().add(mappingProperty6);
    org.monet.metamodel.FormDefinition.FormViewProperty formViewProperty9 = new org.monet.metamodel.FormDefinition.FormViewProperty();
    formViewProperty9.setLabel("Solicitud de Servicio");
    formViewProperty9.setCode("m_03ymq");
    org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty showProperty10 = new org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty();
    showProperty10.getField().add(new org.monet.metamodel.internal.Ref("StudentName","solicitud.ServiceApplications.ServiceApplication","solicitud.ServiceApplications.ServiceApplication.StudentName"));
    showProperty10.getField().add(new org.monet.metamodel.internal.Ref("StudentSurname","solicitud.ServiceApplications.ServiceApplication","solicitud.ServiceApplications.ServiceApplication.StudentSurname"));
    showProperty10.getField().add(new org.monet.metamodel.internal.Ref("Cial","solicitud.ServiceApplications.ServiceApplication","solicitud.ServiceApplications.ServiceApplication.Cial"));
    showProperty10.getField().add(new org.monet.metamodel.internal.Ref("AcademicYear","solicitud.ServiceApplications.ServiceApplication","solicitud.ServiceApplications.ServiceApplication.AcademicYear"));
    showProperty10.getField().add(new org.monet.metamodel.internal.Ref("Date","solicitud.ServiceApplications.ServiceApplication","solicitud.ServiceApplications.ServiceApplication.Date"));
    formViewProperty9.setShow(showProperty10);
    this.addView(formViewProperty9);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(solicitud.serviceapplications.serviceapplication.$Definition$.class,"solicitud.ServiceApplications.ServiceApplication",null);
  }
  }
  
  public static String static_getName() {
    return "ServiceApplication";
  }
  
  public Class<?> getBehaviourClass() {
    return solicitud.serviceapplications.ServiceApplication.class;
  }
  
  public String getClientBehaviour() {
    return "var mxdc0hw = new Object();mxdc0hw.refresh = function (node) {if (!node.isEditable()) return;};mxdc0hw.onChangeField = function (node, field) {};";
  }
  
  public Class<?> getMappingClass(final String code) {
    switch(code.hashCode()) {
    case -732236724:
    return solicitud.serviceapplications.serviceapplication.Mapping__0.class;
    }
    return super.getMappingClass(code);
  }
  
  private final StudentNameProperty StudentName = new solicitud.serviceapplications.serviceapplication.StudentNameProperty();
  
  private final StudentSurnameProperty StudentSurname = new solicitud.serviceapplications.serviceapplication.StudentSurnameProperty();
  
  private final CialProperty Cial = new solicitud.serviceapplications.serviceapplication.CialProperty();
  
  private final AcademicYearProperty AcademicYear = new solicitud.serviceapplications.serviceapplication.AcademicYearProperty();
  
  private final DateProperty Date = new solicitud.serviceapplications.serviceapplication.DateProperty();
}
