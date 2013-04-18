package solicitud.applications.indice;

import org.monet.metamodel.IndexDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;
import solicitud.applications.indice.CialProperty;
import solicitud.applications.indice.IdentifierProperty;
import solicitud.applications.indice.StudentNameProperty;
import solicitud.applications.indice.StudentSurnameProperty;

@SuppressWarnings("all")
public class $Definition$ extends IndexDefinition implements HasBehaviour, HasClientBehaviour {
  public $Definition$() {
    super();this._code = "m4f9qfa";
    this._name = "solicitud.Applications.Indice";
    this._isAbstract = null;this._label = "Solicitudes";
    org.monet.metamodel.IndexDefinition.ReferenceProperty referenceProperty1 = new org.monet.metamodel.IndexDefinition.ReferenceProperty();
    referenceProperty1.addAttributeProperty(Identifier);
    referenceProperty1.addAttributeProperty(StudentName);
    referenceProperty1.addAttributeProperty(StudentSurname);
    referenceProperty1.addAttributeProperty(Cial);
    this.setReference(referenceProperty1);
    org.monet.metamodel.IndexDefinition.IndexViewProperty indexViewProperty6 = new org.monet.metamodel.IndexDefinition.IndexViewProperty();
    indexViewProperty6.setCode("imtoc7dg");
    indexViewProperty6.setName("Normal");
    org.monet.metamodel.IndexDefinition.IndexViewProperty.ShowProperty showProperty6 = new org.monet.metamodel.IndexDefinition.IndexViewProperty.ShowProperty();
    showProperty6.setTitle(new org.monet.metamodel.internal.Ref("Identifier","solicitud.Applications.Indice","solicitud.Applications.Indice.Identifier"));
    showProperty6.getLine().add(new org.monet.metamodel.internal.Ref("StudentName","solicitud.Applications.Indice","solicitud.Applications.Indice.StudentName"));
    showProperty6.getLine().add(new org.monet.metamodel.internal.Ref("StudentSurname","solicitud.Applications.Indice","solicitud.Applications.Indice.StudentSurname"));
    showProperty6.getLine().add(new org.monet.metamodel.internal.Ref("Cial","solicitud.Applications.Indice","solicitud.Applications.Indice.Cial"));
    indexViewProperty6.setShow(showProperty6);
    this.addView(indexViewProperty6);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(solicitud.applications.indice.$Definition$.class,"solicitud.Applications.Indice",null);
  }
  }
  
  public static String static_getName() {
    return "Indice";
  }
  
  public Class<?> getBehaviourClass() {
    return solicitud.applications.Indice.class;
  }
  
  public String getClientBehaviour() {
    return "var m4f9qfa = new Object();m4f9qfa.refresh = function (node) {if (!node.isEditable()) return;};m4f9qfa.onChangeField = function (node, field) {};";
  }
  
  private final IdentifierProperty Identifier = new solicitud.applications.indice.IdentifierProperty();
  
  private final StudentNameProperty StudentName = new solicitud.applications.indice.StudentNameProperty();
  
  private final StudentSurnameProperty StudentSurname = new solicitud.applications.indice.StudentSurnameProperty();
  
  private final CialProperty Cial = new solicitud.applications.indice.CialProperty();
}
