package ceip.serviceapplications.indice;

import ceip.serviceapplications.indice.CialProperty;
import ceip.serviceapplications.indice.DateProperty;
import ceip.serviceapplications.indice.IdentifierProperty;
import ceip.serviceapplications.indice.StudentNameProperty;
import ceip.serviceapplications.indice.StudentSurnameProperty;
import org.monet.metamodel.IndexDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends IndexDefinition implements HasBehaviour, HasClientBehaviour {
  public $Definition$() {
    super();this._code = "img7bi6g";
    this._name = "ceip.ServiceApplications.Indice";
    this._isAbstract = null;this._label = "Solicitudes de Servicio";
    org.monet.metamodel.IndexDefinition.ReferenceProperty referenceProperty1 = new org.monet.metamodel.IndexDefinition.ReferenceProperty();
    referenceProperty1.addAttributeProperty(Date);
    referenceProperty1.addAttributeProperty(StudentName);
    referenceProperty1.addAttributeProperty(StudentSurname);
    referenceProperty1.addAttributeProperty(Cial);
    referenceProperty1.addAttributeProperty(Identifier);
    this.setReference(referenceProperty1);
    org.monet.metamodel.IndexDefinition.IndexViewProperty indexViewProperty7 = new org.monet.metamodel.IndexDefinition.IndexViewProperty();
    indexViewProperty7.setCode("imhn1mbq");
    indexViewProperty7.setName("Normal");
    org.monet.metamodel.IndexDefinition.IndexViewProperty.ShowProperty showProperty7 = new org.monet.metamodel.IndexDefinition.IndexViewProperty.ShowProperty();
    showProperty7.getLine().add(new org.monet.metamodel.internal.Ref("Date","ceip.ServiceApplications.Indice","ceip.ServiceApplications.Indice.Date"));
    showProperty7.getLineBelow().add(new org.monet.metamodel.internal.Ref("StudentName","ceip.ServiceApplications.Indice","ceip.ServiceApplications.Indice.StudentName"));
    showProperty7.getLine().add(new org.monet.metamodel.internal.Ref("StudentSurname","ceip.ServiceApplications.Indice","ceip.ServiceApplications.Indice.StudentSurname"));
    indexViewProperty7.setShow(showProperty7);
    this.addView(indexViewProperty7);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(ceip.serviceapplications.indice.$Definition$.class,"ceip.ServiceApplications.Indice",null);
  }
  }
  
  public static String static_getName() {
    return "Indice";
  }
  
  public Class<?> getBehaviourClass() {
    return ceip.serviceapplications.Indice.class;
  }
  
  public String getClientBehaviour() {
    return "var img7bi6g = new Object();img7bi6g.refresh = function (node) {if (!node.isEditable()) return;};img7bi6g.onChangeField = function (node, field) {};";
  }
  
  private final DateProperty Date = new ceip.serviceapplications.indice.DateProperty();
  
  private final StudentNameProperty StudentName = new ceip.serviceapplications.indice.StudentNameProperty();
  
  private final StudentSurnameProperty StudentSurname = new ceip.serviceapplications.indice.StudentSurnameProperty();
  
  private final CialProperty Cial = new ceip.serviceapplications.indice.CialProperty();
  
  private final IdentifierProperty Identifier = new ceip.serviceapplications.indice.IdentifierProperty();
}
