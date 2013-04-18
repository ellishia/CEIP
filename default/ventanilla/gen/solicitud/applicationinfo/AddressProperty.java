package solicitud.applicationinfo;

import org.monet.metamodel.SectionFieldProperty;
import org.monet.metamodel.interfaces.HasBehaviour;
import solicitud.applicationinfo.address.AppartamentProperty;
import solicitud.applicationinfo.address.CityProperty;
import solicitud.applicationinfo.address.DesignationProperty;
import solicitud.applicationinfo.address.NeigbourhoodProperty;
import solicitud.applicationinfo.address.NumberProperty;
import solicitud.applicationinfo.address.Street_nameProperty;
import solicitud.applicationinfo.address.Zip_codeProperty;

@SuppressWarnings("all")
public class AddressProperty extends SectionFieldProperty implements HasBehaviour {
  public AddressProperty() {
    super();this._code = "mkprqza";
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
    showProperty9.getField().add(new org.monet.metamodel.internal.Ref("Designation","solicitud.ApplicationInfo","solicitud.ApplicationInfo.Address.Designation"));
    showProperty9.getField().add(new org.monet.metamodel.internal.Ref("Street_name","solicitud.ApplicationInfo","solicitud.ApplicationInfo.Address.Street_name"));
    showProperty9.getField().add(new org.monet.metamodel.internal.Ref("Number","solicitud.ApplicationInfo","solicitud.ApplicationInfo.Address.Number"));
    showProperty9.getField().add(new org.monet.metamodel.internal.Ref("Appartament","solicitud.ApplicationInfo","solicitud.ApplicationInfo.Address.Appartament"));
    showProperty9.getField().add(new org.monet.metamodel.internal.Ref("Zip_code","solicitud.ApplicationInfo","solicitud.ApplicationInfo.Address.Zip_code"));
    showProperty9.getField().add(new org.monet.metamodel.internal.Ref("Neigbourhood","solicitud.ApplicationInfo","solicitud.ApplicationInfo.Address.Neigbourhood"));
    showProperty9.getField().add(new org.monet.metamodel.internal.Ref("City","solicitud.ApplicationInfo","solicitud.ApplicationInfo.Address.City"));
    viewProperty8.setShow(showProperty9);
    this.setView(viewProperty8);
    
  }
  
  public Class<?> getBehaviourClass() {
    return solicitud.applicationinfo.Address.class;
  }
  
  public static String static_getName() {
    return "Address";
  }
  
  private final DesignationProperty Designation = new solicitud.applicationinfo.address.DesignationProperty();
  
  private final Street_nameProperty Street_name = new solicitud.applicationinfo.address.Street_nameProperty();
  
  private final NumberProperty Number = new solicitud.applicationinfo.address.NumberProperty();
  
  private final AppartamentProperty Appartament = new solicitud.applicationinfo.address.AppartamentProperty();
  
  private final NeigbourhoodProperty Neigbourhood = new solicitud.applicationinfo.address.NeigbourhoodProperty();
  
  private final CityProperty City = new solicitud.applicationinfo.address.CityProperty();
  
  private final Zip_codeProperty Zip_code = new solicitud.applicationinfo.address.Zip_codeProperty();
}
