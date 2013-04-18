package ceip.applications.indice;

import ceip.applications.indice.IdentifierProperty;
import ceip.applications.indice.LevelProperty;
import ceip.applications.indice.StudentNameProperty;
import ceip.applications.indice.StudentSurnameProperty;
import org.monet.metamodel.IndexDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends IndexDefinition implements HasBehaviour, HasClientBehaviour {
  public $Definition$() {
    super();this._code = "msbsuvw";
    this._name = "ceip.Applications.Indice";
    this._isAbstract = null;this._label = "Solicitudes";
    org.monet.metamodel.IndexDefinition.ReferenceProperty referenceProperty1 = new org.monet.metamodel.IndexDefinition.ReferenceProperty();
    referenceProperty1.addAttributeProperty(Identifier);
    referenceProperty1.addAttributeProperty(StudentName);
    referenceProperty1.addAttributeProperty(StudentSurname);
    referenceProperty1.addAttributeProperty(Level);
    this.setReference(referenceProperty1);
    org.monet.metamodel.IndexDefinition.IndexViewProperty indexViewProperty6 = new org.monet.metamodel.IndexDefinition.IndexViewProperty();
    indexViewProperty6.setCode("imtoc7dg");
    indexViewProperty6.setName("Normal");
    org.monet.metamodel.IndexDefinition.IndexViewProperty.ShowProperty showProperty6 = new org.monet.metamodel.IndexDefinition.IndexViewProperty.ShowProperty();
    showProperty6.setTitle(new org.monet.metamodel.internal.Ref("Identifier","ceip.Applications.Indice","ceip.Applications.Indice.Identifier"));
    showProperty6.getLine().add(new org.monet.metamodel.internal.Ref("StudentName","ceip.Applications.Indice","ceip.Applications.Indice.StudentName"));
    showProperty6.getLine().add(new org.monet.metamodel.internal.Ref("StudentSurname","ceip.Applications.Indice","ceip.Applications.Indice.StudentSurname"));
    indexViewProperty6.setShow(showProperty6);
    this.addView(indexViewProperty6);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(ceip.applications.indice.$Definition$.class,"ceip.Applications.Indice",null);
  }
  }
  
  public static String static_getName() {
    return "Indice";
  }
  
  public Class<?> getBehaviourClass() {
    return ceip.applications.Indice.class;
  }
  
  public String getClientBehaviour() {
    return "var msbsuvw = new Object();msbsuvw.refresh = function (node) {if (!node.isEditable()) return;};msbsuvw.onChangeField = function (node, field) {};";
  }
  
  private final IdentifierProperty Identifier = new ceip.applications.indice.IdentifierProperty();
  
  private final StudentNameProperty StudentName = new ceip.applications.indice.StudentNameProperty();
  
  private final StudentSurnameProperty StudentSurname = new ceip.applications.indice.StudentSurnameProperty();
  
  private final LevelProperty Level = new ceip.applications.indice.LevelProperty();
}
