package ceip.basicinfo;

import ceip.basicinfo.address.AppartamentProperty;
import ceip.basicinfo.address.CityProperty;
import ceip.basicinfo.address.DesignationProperty;
import ceip.basicinfo.address.NeigbourhoodProperty;
import ceip.basicinfo.address.NumberProperty;
import ceip.basicinfo.address.StreetNameProperty;
import ceip.basicinfo.address.ZipCodeProperty;
import org.monet.metamodel.SectionFieldProperty;
import org.monet.metamodel.interfaces.HasBehaviour;

@SuppressWarnings("all")
public class AddressProperty extends SectionFieldProperty implements HasBehaviour {
  public AddressProperty() {
    super();this._code = "mjsqa2q";
    this._name = "Address";
    this._label = "Dirección";
    this.addTextFieldProperty(Designation);
    this.addTextFieldProperty(StreetName);
    this.addNumberFieldProperty(Number);
    this.addNumberFieldProperty(Appartament);
    this.addTextFieldProperty(Neigbourhood);
    this.addTextFieldProperty(City);
    this.addNumberFieldProperty(ZipCode);
    org.monet.metamodel.SectionFieldProperty.ViewProperty viewProperty8 = new org.monet.metamodel.SectionFieldProperty.ViewProperty();
    viewProperty8.setMode(org.monet.metamodel.SectionFieldPropertyBase.ViewProperty.ModeEnumeration.EXPANDED);
    org.monet.metamodel.SectionFieldProperty.ViewProperty.ShowProperty showProperty9 = new org.monet.metamodel.SectionFieldProperty.ViewProperty.ShowProperty();
    showProperty9.getField().add(new org.monet.metamodel.internal.Ref("Designation","ceip.BasicInfo","ceip.BasicInfo.Address.Designation"));
    showProperty9.getField().add(new org.monet.metamodel.internal.Ref("StreetName","ceip.BasicInfo","ceip.BasicInfo.Address.StreetName"));
    showProperty9.getField().add(new org.monet.metamodel.internal.Ref("Number","ceip.BasicInfo","ceip.BasicInfo.Address.Number"));
    showProperty9.getField().add(new org.monet.metamodel.internal.Ref("Appartament","ceip.BasicInfo","ceip.BasicInfo.Address.Appartament"));
    showProperty9.getField().add(new org.monet.metamodel.internal.Ref("ZipCode","ceip.BasicInfo","ceip.BasicInfo.Address.ZipCode"));
    showProperty9.getField().add(new org.monet.metamodel.internal.Ref("Neigbourhood","ceip.BasicInfo","ceip.BasicInfo.Address.Neigbourhood"));
    showProperty9.getField().add(new org.monet.metamodel.internal.Ref("City","ceip.BasicInfo","ceip.BasicInfo.Address.City"));
    viewProperty8.setShow(showProperty9);
    this.setView(viewProperty8);
    
  }
  
  public Class<?> getBehaviourClass() {
    return ceip.basicinfo.Address.class;
  }
  
  public static String static_getName() {
    return "Address";
  }
  
  private final DesignationProperty Designation = new ceip.basicinfo.address.DesignationProperty();
  
  private final StreetNameProperty StreetName = new ceip.basicinfo.address.StreetNameProperty();
  
  private final NumberProperty Number = new ceip.basicinfo.address.NumberProperty();
  
  private final AppartamentProperty Appartament = new ceip.basicinfo.address.AppartamentProperty();
  
  private final NeigbourhoodProperty Neigbourhood = new ceip.basicinfo.address.NeigbourhoodProperty();
  
  private final CityProperty City = new ceip.basicinfo.address.CityProperty();
  
  private final ZipCodeProperty ZipCode = new ceip.basicinfo.address.ZipCodeProperty();
}
