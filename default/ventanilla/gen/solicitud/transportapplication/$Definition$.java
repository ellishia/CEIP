package solicitud.transportapplication;

import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;
import org.monet.metamodel.interfaces.HasMappings;
import solicitud.transportapplication.AddressProperty;
import solicitud.transportapplication.DistanceProperty;
import solicitud.transportapplication.IdentifierProperty;
import solicitud.transportapplication.LeaveAtProperty;
import solicitud.transportapplication.StopProperty;
import solicitud.transportapplication.TripProperty;

@SuppressWarnings("all")
public class $Definition$ extends solicitud.serviceapplications.serviceapplication.$Definition$ implements HasBehaviour, HasClientBehaviour, HasMappings {
  public $Definition$() {
    super();this._code = "mqs6x8q";
    this._name = "solicitud.TransportApplication";
    this._parent = "solicitud.ServiceApplications.ServiceApplication";
    this._isAbstract = null;this._label = "Solicitud de Transportes";
    this.addSerialFieldProperty(Identifier);
    this.addTextFieldProperty(Address);
    this.addNumberFieldProperty(Distance);
    this.addTextFieldProperty(Trip);
    this.addTextFieldProperty(Stop);
    this.addTextFieldProperty(LeaveAt);
    org.monet.metamodel.FormDefinition.FormViewProperty formViewProperty7 = new org.monet.metamodel.FormDefinition.FormViewProperty();
    formViewProperty7.setLabel("Datos de Transporte");
    formViewProperty7.setCode("mcrttmq");
    formViewProperty7.setName("Vista");
    org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty showProperty8 = new org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty();
    showProperty8.getField().add(new org.monet.metamodel.internal.Ref("Address","solicitud.TransportApplication","solicitud.TransportApplication.Address"));
    showProperty8.getField().add(new org.monet.metamodel.internal.Ref("Distance","solicitud.TransportApplication","solicitud.TransportApplication.Distance"));
    showProperty8.getField().add(new org.monet.metamodel.internal.Ref("Trip","solicitud.TransportApplication","solicitud.TransportApplication.Trip"));
    showProperty8.getField().add(new org.monet.metamodel.internal.Ref("Stop","solicitud.TransportApplication","solicitud.TransportApplication.Stop"));
    showProperty8.getField().add(new org.monet.metamodel.internal.Ref("LeaveAt","solicitud.TransportApplication","solicitud.TransportApplication.LeaveAt"));
    formViewProperty7.setShow(showProperty8);
    this.addView(formViewProperty7);
    org.monet.metamodel.FormDefinition.FormViewProperty formViewProperty15 = new org.monet.metamodel.FormDefinition.FormViewProperty();
    formViewProperty15.setLabel("Datos de Transporte");
    formViewProperty15.setCode("mcrttmq");
    formViewProperty15.setName("VistaWidget");
    formViewProperty15.setIsWidget(true);
    org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty showProperty17 = new org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty();
    showProperty17.getField().add(new org.monet.metamodel.internal.Ref("Address","solicitud.TransportApplication","solicitud.TransportApplication.Address"));
    showProperty17.getField().add(new org.monet.metamodel.internal.Ref("Distance","solicitud.TransportApplication","solicitud.TransportApplication.Distance"));
    showProperty17.getField().add(new org.monet.metamodel.internal.Ref("Trip","solicitud.TransportApplication","solicitud.TransportApplication.Trip"));
    showProperty17.getField().add(new org.monet.metamodel.internal.Ref("Stop","solicitud.TransportApplication","solicitud.TransportApplication.Stop"));
    showProperty17.getField().add(new org.monet.metamodel.internal.Ref("LeaveAt","solicitud.TransportApplication","solicitud.TransportApplication.LeaveAt"));
    formViewProperty15.setShow(showProperty17);
    this.addView(formViewProperty15);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(solicitud.transportapplication.$Definition$.class,"solicitud.TransportApplication","solicitud.ServiceApplications.ServiceApplication");
  }
  }
  
  public static String static_getName() {
    return "TransportApplication";
  }
  
  public Class<?> getBehaviourClass() {
    return solicitud.TransportApplication.class;
  }
  
  public String getClientBehaviour() {
    return "var mqs6x8q = new Object();mqs6x8q.refresh = function (node) {if (!node.isEditable()) return;};mqs6x8q.onChangeField = function (node, field) {};";
  }
  
  public Class<?> getMappingClass(final String code) {
    switch(code.hashCode()) {
    
    }
    return super.getMappingClass(code);
  }
  
  private final IdentifierProperty Identifier = new solicitud.transportapplication.IdentifierProperty();
  
  private final AddressProperty Address = new solicitud.transportapplication.AddressProperty();
  
  private final DistanceProperty Distance = new solicitud.transportapplication.DistanceProperty();
  
  private final TripProperty Trip = new solicitud.transportapplication.TripProperty();
  
  private final StopProperty Stop = new solicitud.transportapplication.StopProperty();
  
  private final LeaveAtProperty LeaveAt = new solicitud.transportapplication.LeaveAtProperty();
}
