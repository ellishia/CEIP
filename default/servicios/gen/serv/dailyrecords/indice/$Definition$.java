package serv.dailyrecords.indice;

import org.monet.metamodel.IndexDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;
import serv.dailyrecords.indice.BuslineProperty;
import serv.dailyrecords.indice.DateProperty;

@SuppressWarnings("all")
public class $Definition$ extends IndexDefinition implements HasBehaviour, HasClientBehaviour {
  public $Definition$() {
    super();this._code = "imbeh6vw";
    this._name = "serv.DailyRecords.Indice";
    this._isAbstract = null;this._label = "Indice";
    org.monet.metamodel.IndexDefinition.ReferenceProperty referenceProperty1 = new org.monet.metamodel.IndexDefinition.ReferenceProperty();
    referenceProperty1.addAttributeProperty(Date);
    referenceProperty1.addAttributeProperty(Busline);
    this.setReference(referenceProperty1);
    org.monet.metamodel.IndexDefinition.IndexViewProperty indexViewProperty4 = new org.monet.metamodel.IndexDefinition.IndexViewProperty();
    indexViewProperty4.setCode("i");
    indexViewProperty4.setName("Normal");
    org.monet.metamodel.IndexDefinition.IndexViewProperty.ShowProperty showProperty4 = new org.monet.metamodel.IndexDefinition.IndexViewProperty.ShowProperty();
    showProperty4.setTitle(new org.monet.metamodel.internal.Ref("Date","serv.DailyRecords.Indice","serv.DailyRecords.Indice.Date"));
    indexViewProperty4.setShow(showProperty4);
    this.addView(indexViewProperty4);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(serv.dailyrecords.indice.$Definition$.class,"serv.DailyRecords.Indice",null);
  }
  }
  
  public static String static_getName() {
    return "Indice";
  }
  
  public Class<?> getBehaviourClass() {
    return serv.dailyrecords.Indice.class;
  }
  
  public String getClientBehaviour() {
    return "var imbeh6vw = new Object();imbeh6vw.refresh = function (node) {if (!node.isEditable()) return;};imbeh6vw.onChangeField = function (node, field) {};";
  }
  
  private final DateProperty Date = new serv.dailyrecords.indice.DateProperty();
  
  private final BuslineProperty Busline = new serv.dailyrecords.indice.BuslineProperty();
}
