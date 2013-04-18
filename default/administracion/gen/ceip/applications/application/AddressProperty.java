package ceip.applications.application;

import ceip.applications.application.address.AppartamentProperty;
import ceip.applications.application.address.CityProperty;
import ceip.applications.application.address.DesignationProperty;
import ceip.applications.application.address.NeigbourhoodProperty;
import ceip.applications.application.address.NumberProperty;
import ceip.applications.application.address.Street_nameProperty;
import ceip.applications.application.address.Zip_codeProperty;
import org.monet.metamodel.SectionFieldProperty;
import org.monet.metamodel.interfaces.HasBehaviour;

@SuppressWarnings("all")
public class AddressProperty extends SectionFieldProperty implements HasBehaviour {
  public AddressProperty() {
    super();this._code = "myvpduq";
    this._name = "Address";
    this._label = "Dirección";
    this.addTextFieldProperty(Designation);
    this.addTextFieldProperty(Street_name);
    this.addNumberFieldProperty(Number);
    this.addTextFieldProperty(Appartament);
    this.addTextFieldProperty(Neigbourhood);
    this.addTextFieldProperty(City);
    this.addNumberFieldProperty(Zip_code);
    org.monet.metamodel.SectionFieldProperty.ViewProperty viewProperty8 = new org.monet.metamodel.SectionFieldProperty.ViewProperty();
    viewProperty8.setMode(org.monet.metamodel.SectionFieldPropertyBase.ViewProperty.ModeEnumeration.EXPANDED);
    org.monet.metamodel.SectionFieldProperty.ViewProperty.ShowProperty showProperty9 = new org.monet.metamodel.SectionFieldProperty.ViewProperty.ShowProperty();
    showProperty9.getField().add(new org.monet.metamodel.internal.Ref("Designation","ceip.Applications.Application","ceip.Applications.Application.Address.Designation"));
    showProperty9.getField().add(new org.monet.metamodel.internal.Ref("Street_name","ceip.Applications.Application","ceip.Applications.Application.Address.Street_name"));
    showProperty9.getField().add(new org.monet.metamodel.internal.Ref("Number","ceip.Applications.Application","ceip.Applications.Application.Address.Number"));
    showProperty9.getField().add(new org.monet.metamodel.internal.Ref("Appartament","ceip.Applications.Application","ceip.Applications.Application.Address.Appartament"));
    showProperty9.getField().add(new org.monet.metamodel.internal.Ref("Zip_code","ceip.Applications.Application","ceip.Applications.Application.Address.Zip_code"));
    showProperty9.getField().add(new org.monet.metamodel.internal.Ref("Neigbourhood","ceip.Applications.Application","ceip.Applications.Application.Address.Neigbourhood"));
    showProperty9.getField().add(new org.monet.metamodel.internal.Ref("City","ceip.Applications.Application","ceip.Applications.Application.Address.City"));
    viewProperty8.setShow(showProperty9);
    this.setView(viewProperty8);
    
  }
  
  public Class<?> getBehaviourClass() {
    return ceip.applications.application.Address.class;
  }
  
  public static String static_getName() {
    return "Address";
  }
  
  private final DesignationProperty Designation = new ceip.applications.application.address.DesignationProperty();
  
  private final Street_nameProperty Street_name = new ceip.applications.application.address.Street_nameProperty();
  
  private final NumberProperty Number = new ceip.applications.application.address.NumberProperty();
  
  private final AppartamentProperty Appartament = new ceip.applications.application.address.AppartamentProperty();
  
  private final NeigbourhoodProperty Neigbourhood = new ceip.applications.application.address.NeigbourhoodProperty();
  
  private final CityProperty City = new ceip.applications.application.address.CityProperty();
  
  private final Zip_codeProperty Zip_code = new ceip.applications.application.address.Zip_codeProperty();
}
