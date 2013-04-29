package solicitud.serviceapplications.indice;

import org.monet.metamodel.IndexDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;
import solicitud.serviceapplications.indice.CialProperty;
import solicitud.serviceapplications.indice.DateProperty;
import solicitud.serviceapplications.indice.StudentNameProperty;
import solicitud.serviceapplications.indice.StudentSurnameProperty;

@SuppressWarnings("all")
public class $Definition$ extends IndexDefinition implements HasBehaviour, HasClientBehaviour {
  public $Definition$() {
    super();this._code = "img7bi6g";
    this._name = "solicitud.ServiceApplications.Indice";
    this._isAbstract = null;this._label = "Solicitudes de Servicio";
    org.monet.metamodel.IndexDefinition.ReferenceProperty referenceProperty1 = new org.monet.metamodel.IndexDefinition.ReferenceProperty();
    referenceProperty1.addAttributeProperty(Date);
    referenceProperty1.addAttributeProperty(StudentName);
    referenceProperty1.addAttributeProperty(StudentSurname);
    referenceProperty1.addAttributeProperty(Cial);
    this.setReference(referenceProperty1);
    org.monet.metamodel.IndexDefinition.IndexViewProperty indexViewProperty6 = new org.monet.metamodel.IndexDefinition.IndexViewProperty();
    indexViewProperty6.setCode("imhn1mbq");
    indexViewProperty6.setName("Normal");
    org.monet.metamodel.IndexDefinition.IndexViewProperty.ShowProperty showProperty6 = new org.monet.metamodel.IndexDefinition.IndexViewProperty.ShowProperty();
    showProperty6.getLine().add(new org.monet.metamodel.internal.Ref("Date","solicitud.ServiceApplications.Indice","solicitud.ServiceApplications.Indice.Date"));
    showProperty6.getLineBelow().add(new org.monet.metamodel.internal.Ref("StudentName","solicitud.ServiceApplications.Indice","solicitud.ServiceApplications.Indice.StudentName"));
    showProperty6.getLine().add(new org.monet.metamodel.internal.Ref("StudentSurname","solicitud.ServiceApplications.Indice","solicitud.ServiceApplications.Indice.StudentSurname"));
    indexViewProperty6.setShow(showProperty6);
    this.addView(indexViewProperty6);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(solicitud.serviceapplications.indice.$Definition$.class,"solicitud.ServiceApplications.Indice",null);
  }
  }
  
  public static String static_getName() {
    return "Indice";
  }
  
  public Class<?> getBehaviourClass() {
    return solicitud.serviceapplications.Indice.class;
  }
  
  public String getClientBehaviour() {
    return "var img7bi6g = new Object();img7bi6g.refresh = function (node) {if (!node.isEditable()) return;};img7bi6g.onChangeField = function (node, field) {};";
  }
  
  private final DateProperty Date = new solicitud.serviceapplications.indice.DateProperty();
  
  private final StudentNameProperty StudentName = new solicitud.serviceapplications.indice.StudentNameProperty();
  
  private final StudentSurnameProperty StudentSurname = new solicitud.serviceapplications.indice.StudentSurnameProperty();
  
  private final CialProperty Cial = new solicitud.serviceapplications.indice.CialProperty();
}
