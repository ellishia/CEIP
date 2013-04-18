package ceip.serviceapplications.serviceapplication;

import ceip.serviceapplications.serviceapplication.AcademicYearProperty;
import ceip.serviceapplications.serviceapplication.DateProperty;
import ceip.serviceapplications.serviceapplication.StudentNameProperty;
import ceip.serviceapplications.serviceapplication.StudentSurnameProperty;
import org.monet.metamodel.FormDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;
import org.monet.metamodel.interfaces.HasMappings;

@SuppressWarnings("all")
public class $Definition$ extends FormDefinition implements HasBehaviour, HasClientBehaviour, HasMappings {
  public $Definition$() {
    super();this._code = "mxdc0hw";
    this._name = "ceip.ServiceApplications.ServiceApplication";
    this._isAbstract = new IsAbstract();this._label = "ServiceApplication";
    this.addTextFieldProperty(StudentName);
    this.addTextFieldProperty(StudentSurname);
    this.addSelectFieldProperty(AcademicYear);
    this.addDateFieldProperty(Date);
    org.monet.metamodel.FormDefinition.MappingProperty mappingProperty5 = new org.monet.metamodel.FormDefinition.MappingProperty();
    mappingProperty5.setIndex(new org.monet.metamodel.internal.Ref("ceip.ServiceApplications.Indice"));
    this.getMappingList().add(mappingProperty5);
    org.monet.metamodel.FormDefinition.FormViewProperty formViewProperty8 = new org.monet.metamodel.FormDefinition.FormViewProperty();
    formViewProperty8.setLabel("Solicitud de Servicio");
    formViewProperty8.setCode("m_03ymq");
    org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty showProperty9 = new org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty();
    showProperty9.getField().add(new org.monet.metamodel.internal.Ref("StudentName","ceip.ServiceApplications.ServiceApplication","ceip.ServiceApplications.ServiceApplication.StudentName"));
    showProperty9.getField().add(new org.monet.metamodel.internal.Ref("StudentSurname","ceip.ServiceApplications.ServiceApplication","ceip.ServiceApplications.ServiceApplication.StudentSurname"));
    showProperty9.getField().add(new org.monet.metamodel.internal.Ref("AcademicYear","ceip.ServiceApplications.ServiceApplication","ceip.ServiceApplications.ServiceApplication.AcademicYear"));
    showProperty9.getField().add(new org.monet.metamodel.internal.Ref("Date","ceip.ServiceApplications.ServiceApplication","ceip.ServiceApplications.ServiceApplication.Date"));
    formViewProperty8.setShow(showProperty9);
    this.addView(formViewProperty8);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(ceip.serviceapplications.serviceapplication.$Definition$.class,"ceip.ServiceApplications.ServiceApplication",null);
  }
  }
  
  public static String static_getName() {
    return "ServiceApplication";
  }
  
  public Class<?> getBehaviourClass() {
    return ceip.serviceapplications.ServiceApplication.class;
  }
  
  public String getClientBehaviour() {
    return "var mxdc0hw = new Object();mxdc0hw.refresh = function (node) {if (!node.isEditable()) return;};mxdc0hw.onChangeField = function (node, field) {};";
  }
  
  public Class<?> getMappingClass(final String code) {
    switch(code.hashCode()) {
    case -732236724:
    return ceip.serviceapplications.serviceapplication.Mapping__0.class;
    }
    return super.getMappingClass(code);
  }
  
  private final StudentNameProperty StudentName = new ceip.serviceapplications.serviceapplication.StudentNameProperty();
  
  private final StudentSurnameProperty StudentSurname = new ceip.serviceapplications.serviceapplication.StudentSurnameProperty();
  
  private final AcademicYearProperty AcademicYear = new ceip.serviceapplications.serviceapplication.AcademicYearProperty();
  
  private final DateProperty Date = new ceip.serviceapplications.serviceapplication.DateProperty();
}
