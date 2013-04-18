package serv.stops.stop;

import org.monet.metamodel.FormDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;
import org.monet.metamodel.interfaces.HasMappings;
import serv.stops.stop.AddressProperty;
import serv.stops.stop.IdProperty;
import serv.stops.stop.KmProperty;
import serv.stops.stop.NameProperty;

@SuppressWarnings("all")
public class $Definition$ extends FormDefinition implements HasBehaviour, HasClientBehaviour, HasMappings {
  public $Definition$() {
    super();this._code = "ms3tapg";
    this._name = "serv.Stops.Stop";
    this._isAbstract = new IsAbstract();this._label = "Parada";
    this.addSerialFieldProperty(Id);
    this.addTextFieldProperty(Name);
    this.addTextFieldProperty(Address);
    this.addTextFieldProperty(Km);
    org.monet.metamodel.FormDefinition.MappingProperty mappingProperty5 = new org.monet.metamodel.FormDefinition.MappingProperty();
    mappingProperty5.setIndex(new org.monet.metamodel.internal.Ref("serv.Stops.Indice"));
    this.getMappingList().add(mappingProperty5);
    org.monet.metamodel.FormDefinition.FormViewProperty formViewProperty7 = new org.monet.metamodel.FormDefinition.FormViewProperty();
    formViewProperty7.setLabel("Ficha");
    formViewProperty7.setCode("teaas");
    org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty showProperty8 = new org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty();
    showProperty8.getField().add(new org.monet.metamodel.internal.Ref("Name","serv.Stops.Stop","serv.Stops.Stop.Name"));
    showProperty8.getField().add(new org.monet.metamodel.internal.Ref("Address","serv.Stops.Stop","serv.Stops.Stop.Address"));
    showProperty8.getField().add(new org.monet.metamodel.internal.Ref("Km","serv.Stops.Stop","serv.Stops.Stop.Km"));
    formViewProperty7.setShow(showProperty8);
    this.addView(formViewProperty7);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(serv.stops.stop.$Definition$.class,"serv.Stops.Stop",null);
  }
  }
  
  public static String static_getName() {
    return "Stop";
  }
  
  public Class<?> getBehaviourClass() {
    return serv.stops.Stop.class;
  }
  
  public String getClientBehaviour() {
    return "var ms3tapg = new Object();ms3tapg.refresh = function (node) {if (!node.isEditable()) return;};ms3tapg.onChangeField = function (node, field) {};";
  }
  
  public Class<?> getMappingClass(final String code) {
    switch(code.hashCode()) {
    case -832768778:
    return serv.stops.stop.Mapping__0.class;
    }
    return super.getMappingClass(code);
  }
  
  private final IdProperty Id = new serv.stops.stop.IdProperty();
  
  private final NameProperty Name = new serv.stops.stop.NameProperty();
  
  private final AddressProperty Address = new serv.stops.stop.AddressProperty();
  
  private final KmProperty Km = new serv.stops.stop.KmProperty();
}
