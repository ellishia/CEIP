package solicitud.registrationperiod;

import org.monet.metamodel.FormDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;
import org.monet.metamodel.interfaces.HasMappings;
import solicitud.registrationperiod.FinalDateProperty;
import solicitud.registrationperiod.InitialDateProperty;

@SuppressWarnings("all")
public class $Definition$ extends FormDefinition implements HasBehaviour, HasClientBehaviour, HasMappings {
  public $Definition$() {
    super();this._code = "mx9hpwa";
    this._name = "solicitud.RegistrationPeriod";
    this._isAbstract = null;this._label = "Periodo de Preinscripcion";
    this.setIsReadonly(true);
    this.setIsSingleton(true);
    this.addDateFieldProperty(InitialDate);
    this.addDateFieldProperty(FinalDate);
    org.monet.metamodel.FormDefinition.FormViewProperty formViewProperty6 = new org.monet.metamodel.FormDefinition.FormViewProperty();
    formViewProperty6.setLabel("RegistrationPeriod");
    formViewProperty6.setCode("mihp_yw");
    org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty showProperty7 = new org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty();
    showProperty7.getField().add(new org.monet.metamodel.internal.Ref("InitialDate","solicitud.RegistrationPeriod","solicitud.RegistrationPeriod.InitialDate"));
    showProperty7.getField().add(new org.monet.metamodel.internal.Ref("FinalDate","solicitud.RegistrationPeriod","solicitud.RegistrationPeriod.FinalDate"));
    formViewProperty6.setShow(showProperty7);
    this.addView(formViewProperty6);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(solicitud.registrationperiod.$Definition$.class,"solicitud.RegistrationPeriod",null);
  }
  }
  
  public static String static_getName() {
    return "RegistrationPeriod";
  }
  
  public Class<?> getBehaviourClass() {
    return solicitud.RegistrationPeriod.class;
  }
  
  public String getClientBehaviour() {
    return "var mx9hpwa = new Object();mx9hpwa.refresh = function (node) {if (!node.isEditable()) return;};mx9hpwa.onChangeField = function (node, field) {};";
  }
  
  public Class<?> getMappingClass(final String code) {
    switch(code.hashCode()) {
    
    }
    return super.getMappingClass(code);
  }
  
  private final InitialDateProperty InitialDate = new solicitud.registrationperiod.InitialDateProperty();
  
  private final FinalDateProperty FinalDate = new solicitud.registrationperiod.FinalDateProperty();
}
