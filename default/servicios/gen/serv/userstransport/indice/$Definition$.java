package serv.userstransport.indice;

import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;
import serv.userstransport.indice.BusProperty;
import serv.userstransport.indice.StopProperty;

@SuppressWarnings("all")
public class $Definition$ extends serv.users.indice.$Definition$ implements HasBehaviour, HasClientBehaviour {
  public $Definition$() {
    super();this._code = "imbeh6vw";
    this._name = "serv.UsersTransport.Indice";
    this._parent = "serv.Users.Indice";
    this._isAbstract = null;this._label = "Indice";
    org.monet.metamodel.IndexDefinition.ReferenceProperty referenceProperty1 = new org.monet.metamodel.IndexDefinition.ReferenceProperty();
    referenceProperty1.addAttributeProperty(Bus);
    referenceProperty1.addAttributeProperty(Stop);
    this.setReference(referenceProperty1);
    org.monet.metamodel.IndexDefinition.IndexViewProperty indexViewProperty4 = new org.monet.metamodel.IndexDefinition.IndexViewProperty();
    indexViewProperty4.setCode("i");
    indexViewProperty4.setName("Normal");
    org.monet.metamodel.IndexDefinition.IndexViewProperty.ShowProperty showProperty4 = new org.monet.metamodel.IndexDefinition.IndexViewProperty.ShowProperty();
    showProperty4.setTitle(new org.monet.metamodel.internal.Ref("Bus","serv.UsersTransport.Indice","serv.UsersTransport.Indice.Bus"));
    showProperty4.getLine().add(new org.monet.metamodel.internal.Ref("Stop","serv.UsersTransport.Indice","serv.UsersTransport.Indice.Stop"));
    indexViewProperty4.setShow(showProperty4);
    this.addView(indexViewProperty4);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(serv.userstransport.indice.$Definition$.class,"serv.UsersTransport.Indice","serv.Users.Indice");
  }
  }
  
  public static String static_getName() {
    return "Indice";
  }
  
  public Class<?> getBehaviourClass() {
    return serv.userstransport.Indice.class;
  }
  
  public String getClientBehaviour() {
    return "var imbeh6vw = new Object();imbeh6vw.refresh = function (node) {if (!node.isEditable()) return;};imbeh6vw.onChangeField = function (node, field) {};";
  }
  
  private final BusProperty Bus = new serv.userstransport.indice.BusProperty();
  
  private final StopProperty Stop = new serv.userstransport.indice.StopProperty();
}
