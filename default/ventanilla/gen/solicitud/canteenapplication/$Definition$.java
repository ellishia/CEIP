package solicitud.canteenapplication;

import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;
import org.monet.metamodel.interfaces.HasMappings;
import solicitud.canteenapplication.ActualPositionProperty;
import solicitud.canteenapplication.CriteriaProperty;
import solicitud.canteenapplication.DocumentsProperty;
import solicitud.canteenapplication.IdentifierProperty;
import solicitud.canteenapplication.ObservationsProperty;
import solicitud.canteenapplication.ScheduleProperty;
import solicitud.canteenapplication.SubsidizedProperty;

@SuppressWarnings("all")
public class $Definition$ extends solicitud.serviceapplications.serviceapplication.$Definition$ implements HasBehaviour, HasClientBehaviour, HasMappings {
  public $Definition$() {
    super();this._code = "mlgnu5g";
    this._name = "solicitud.CanteenApplication";
    this._parent = "solicitud.ServiceApplications.ServiceApplication";
    this._isAbstract = null;this._label = "Comedor";
    this.addSerialFieldProperty(Identifier);
    this.addTextFieldProperty(Schedule);
    this.addBooleanFieldProperty(ActualPosition);
    this.addBooleanFieldProperty(Subsidized);
    this.addSectionFieldProperty(Criteria);
    this.addTextFieldProperty(Observations);
    this.addFileFieldProperty(Documents);
    org.monet.metamodel.FormDefinition.FormViewProperty formViewProperty8 = new org.monet.metamodel.FormDefinition.FormViewProperty();
    formViewProperty8.setLabel("Datos de comedor");
    formViewProperty8.setCode("m2dketw");
    formViewProperty8.setName("Vista");
    org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty showProperty9 = new org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty();
    showProperty9.getField().add(new org.monet.metamodel.internal.Ref("Schedule","solicitud.CanteenApplication","solicitud.CanteenApplication.Schedule"));
    showProperty9.getField().add(new org.monet.metamodel.internal.Ref("ActualPosition","solicitud.CanteenApplication","solicitud.CanteenApplication.ActualPosition"));
    showProperty9.getField().add(new org.monet.metamodel.internal.Ref("Subsidized","solicitud.CanteenApplication","solicitud.CanteenApplication.Subsidized"));
    showProperty9.getField().add(new org.monet.metamodel.internal.Ref("Criteria","solicitud.CanteenApplication","solicitud.CanteenApplication.Criteria"));
    showProperty9.getField().add(new org.monet.metamodel.internal.Ref("Observations","solicitud.CanteenApplication","solicitud.CanteenApplication.Observations"));
    showProperty9.getField().add(new org.monet.metamodel.internal.Ref("Documents","solicitud.CanteenApplication","solicitud.CanteenApplication.Documents"));
    showProperty9.getField().add(new org.monet.metamodel.internal.Ref("Identifier","solicitud.CanteenApplication","solicitud.CanteenApplication.Identifier"));
    formViewProperty8.setShow(showProperty9);
    this.addView(formViewProperty8);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(solicitud.canteenapplication.$Definition$.class,"solicitud.CanteenApplication","solicitud.ServiceApplications.ServiceApplication");
  }
  }
  
  public static String static_getName() {
    return "CanteenApplication";
  }
  
  public Class<?> getBehaviourClass() {
    return solicitud.CanteenApplication.class;
  }
  
  public String getClientBehaviour() {
    return "var mlgnu5g = new Object();mlgnu5g.refresh = function (node) {if (!node.isEditable()) return;};mlgnu5g.onChangeField = function (node, field) {};";
  }
  
  public Class<?> getMappingClass(final String code) {
    switch(code.hashCode()) {
    
    }
    return super.getMappingClass(code);
  }
  
  private final IdentifierProperty Identifier = new solicitud.canteenapplication.IdentifierProperty();
  
  private final ScheduleProperty Schedule = new solicitud.canteenapplication.ScheduleProperty();
  
  private final ActualPositionProperty ActualPosition = new solicitud.canteenapplication.ActualPositionProperty();
  
  private final SubsidizedProperty Subsidized = new solicitud.canteenapplication.SubsidizedProperty();
  
  private final CriteriaProperty Criteria = new solicitud.canteenapplication.CriteriaProperty();
  
  private final ObservationsProperty Observations = new solicitud.canteenapplication.ObservationsProperty();
  
  private final DocumentsProperty Documents = new solicitud.canteenapplication.DocumentsProperty();
}
