package ceip.canteenapplication;

import ceip.canteenapplication.ActualPositionProperty;
import ceip.canteenapplication.CriteriaProperty;
import ceip.canteenapplication.DocumentsProperty;
import ceip.canteenapplication.ObservationsProperty;
import ceip.canteenapplication.ScheduleProperty;
import ceip.canteenapplication.SubsidizedProperty;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;
import org.monet.metamodel.interfaces.HasMappings;

@SuppressWarnings("all")
public class $Definition$ extends ceip.serviceapplications.serviceapplication.$Definition$ implements HasBehaviour, HasClientBehaviour, HasMappings {
  public $Definition$() {
    super();this._code = "mgm7voa";
    this._name = "ceip.CanteenApplication";
    this._parent = "ceip.ServiceApplications.ServiceApplication";
    this._isAbstract = null;this._label = "Comedor";
    this.addTextFieldProperty(Schedule);
    this.addBooleanFieldProperty(ActualPosition);
    this.addBooleanFieldProperty(Subsidized);
    this.addSectionFieldProperty(Criteria);
    this.addTextFieldProperty(Observations);
    this.addFileFieldProperty(Documents);
    org.monet.metamodel.FormDefinition.FormViewProperty formViewProperty7 = new org.monet.metamodel.FormDefinition.FormViewProperty();
    formViewProperty7.setLabel("Datos de comedor");
    formViewProperty7.setCode("m2dketw");
    org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty showProperty8 = new org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty();
    showProperty8.getField().add(new org.monet.metamodel.internal.Ref("Schedule","ceip.CanteenApplication","ceip.CanteenApplication.Schedule"));
    showProperty8.getField().add(new org.monet.metamodel.internal.Ref("ActualPosition","ceip.CanteenApplication","ceip.CanteenApplication.ActualPosition"));
    showProperty8.getField().add(new org.monet.metamodel.internal.Ref("Subsidized","ceip.CanteenApplication","ceip.CanteenApplication.Subsidized"));
    showProperty8.getField().add(new org.monet.metamodel.internal.Ref("Criteria","ceip.CanteenApplication","ceip.CanteenApplication.Criteria"));
    showProperty8.getField().add(new org.monet.metamodel.internal.Ref("Observations","ceip.CanteenApplication","ceip.CanteenApplication.Observations"));
    formViewProperty7.setShow(showProperty8);
    this.addView(formViewProperty7);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(ceip.canteenapplication.$Definition$.class,"ceip.CanteenApplication","ceip.ServiceApplications.ServiceApplication");
  }
  }
  
  public static String static_getName() {
    return "CanteenApplication";
  }
  
  public Class<?> getBehaviourClass() {
    return ceip.CanteenApplication.class;
  }
  
  public String getClientBehaviour() {
    return "var mgm7voa = new Object();mgm7voa.refresh = function (node) {if (!node.isEditable()) return;};mgm7voa.onChangeField = function (node, field) {};";
  }
  
  public Class<?> getMappingClass(final String code) {
    switch(code.hashCode()) {
    
    }
    return super.getMappingClass(code);
  }
  
  private final ScheduleProperty Schedule = new ceip.canteenapplication.ScheduleProperty();
  
  private final ActualPositionProperty ActualPosition = new ceip.canteenapplication.ActualPositionProperty();
  
  private final SubsidizedProperty Subsidized = new ceip.canteenapplication.SubsidizedProperty();
  
  private final CriteriaProperty Criteria = new ceip.canteenapplication.CriteriaProperty();
  
  private final ObservationsProperty Observations = new ceip.canteenapplication.ObservationsProperty();
  
  private final DocumentsProperty Documents = new ceip.canteenapplication.DocumentsProperty();
}
