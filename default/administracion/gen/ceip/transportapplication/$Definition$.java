package ceip.transportapplication;

import ceip.transportapplication.AddressProperty;
import ceip.transportapplication.DistanceProperty;
import ceip.transportapplication.LeaveAtProperty;
import ceip.transportapplication.StopProperty;
import ceip.transportapplication.TripProperty;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;
import org.monet.metamodel.interfaces.HasMappings;

@SuppressWarnings("all")
public class $Definition$ extends ceip.serviceapplications.serviceapplication.$Definition$ implements HasBehaviour, HasClientBehaviour, HasMappings {
  public $Definition$() {
    super();this._code = "mqs6x8q";
    this._name = "ceip.TransportApplication";
    this._parent = "ceip.ServiceApplications.ServiceApplication";
    this._isAbstract = null;this._label = "Solicitud de Transporte";
    this.addTextFieldProperty(Address);
    this.addNumberFieldProperty(Distance);
    this.addTextFieldProperty(Trip);
    this.addTextFieldProperty(Stop);
    this.addTextFieldProperty(LeaveAt);
    org.monet.metamodel.FormDefinition.FormViewProperty formViewProperty6 = new org.monet.metamodel.FormDefinition.FormViewProperty();
    formViewProperty6.setLabel("Ficha");
    formViewProperty6.setCode("mcrttmq");
    org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty showProperty7 = new org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty();
    showProperty7.getField().add(new org.monet.metamodel.internal.Ref("Address","ceip.TransportApplication","ceip.TransportApplication.Address"));
    showProperty7.getField().add(new org.monet.metamodel.internal.Ref("Distance","ceip.TransportApplication","ceip.TransportApplication.Distance"));
    showProperty7.getField().add(new org.monet.metamodel.internal.Ref("Trip","ceip.TransportApplication","ceip.TransportApplication.Trip"));
    showProperty7.getField().add(new org.monet.metamodel.internal.Ref("Stop","ceip.TransportApplication","ceip.TransportApplication.Stop"));
    showProperty7.getField().add(new org.monet.metamodel.internal.Ref("LeaveAt","ceip.TransportApplication","ceip.TransportApplication.LeaveAt"));
    formViewProperty6.setShow(showProperty7);
    this.addView(formViewProperty6);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(ceip.transportapplication.$Definition$.class,"ceip.TransportApplication","ceip.ServiceApplications.ServiceApplication");
  }
  }
  
  public static String static_getName() {
    return "TransportApplication";
  }
  
  public Class<?> getBehaviourClass() {
    return ceip.TransportApplication.class;
  }
  
  public String getClientBehaviour() {
    return "var mqs6x8q = new Object();mqs6x8q.refresh = function (node) {if (!node.isEditable()) return;};mqs6x8q.onChangeField = function (node, field) {};";
  }
  
  public Class<?> getMappingClass(final String code) {
    switch(code.hashCode()) {
    
    }
    return super.getMappingClass(code);
  }
  
  private final AddressProperty Address = new ceip.transportapplication.AddressProperty();
  
  private final DistanceProperty Distance = new ceip.transportapplication.DistanceProperty();
  
  private final TripProperty Trip = new ceip.transportapplication.TripProperty();
  
  private final StopProperty Stop = new ceip.transportapplication.StopProperty();
  
  private final LeaveAtProperty LeaveAt = new ceip.transportapplication.LeaveAtProperty();
}
