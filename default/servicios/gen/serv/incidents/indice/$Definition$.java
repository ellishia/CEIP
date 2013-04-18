package serv.incidents.indice;

import org.monet.metamodel.IndexDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;
import serv.incidents.indice.BuslineProperty;
import serv.incidents.indice.DateProperty;

@SuppressWarnings("all")
public class $Definition$ extends IndexDefinition implements HasBehaviour, HasClientBehaviour {
  public $Definition$() {
    super();this._code = "imbeh6vw";
    this._name = "serv.Incidents.Indice";
    this._isAbstract = null;this._label = "Indice";
    org.monet.metamodel.IndexDefinition.ReferenceProperty referenceProperty1 = new org.monet.metamodel.IndexDefinition.ReferenceProperty();
    referenceProperty1.addAttributeProperty(Date);
    referenceProperty1.addAttributeProperty(Busline);
    this.setReference(referenceProperty1);
    org.monet.metamodel.IndexDefinition.IndexViewProperty indexViewProperty4 = new org.monet.metamodel.IndexDefinition.IndexViewProperty();
    indexViewProperty4.setCode("i");
    indexViewProperty4.setName("Normal");
    org.monet.metamodel.IndexDefinition.IndexViewProperty.ShowProperty showProperty4 = new org.monet.metamodel.IndexDefinition.IndexViewProperty.ShowProperty();
    showProperty4.setTitle(new org.monet.metamodel.internal.Ref("Date","serv.Incidents.Indice","serv.Incidents.Indice.Date"));
    showProperty4.getLine().add(new org.monet.metamodel.internal.Ref("Busline","serv.Incidents.Indice","serv.Incidents.Indice.Busline"));
    indexViewProperty4.setShow(showProperty4);
    this.addView(indexViewProperty4);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(serv.incidents.indice.$Definition$.class,"serv.Incidents.Indice",null);
  }
  }
  
  public static String static_getName() {
    return "Indice";
  }
  
  public Class<?> getBehaviourClass() {
    return serv.incidents.Indice.class;
  }
  
  public String getClientBehaviour() {
    return "var imbeh6vw = new Object();imbeh6vw.refresh = function (node) {if (!node.isEditable()) return;};imbeh6vw.onChangeField = function (node, field) {};";
  }
  
  private final DateProperty Date = new serv.incidents.indice.DateProperty();
  
  private final BuslineProperty Busline = new serv.incidents.indice.BuslineProperty();
}
