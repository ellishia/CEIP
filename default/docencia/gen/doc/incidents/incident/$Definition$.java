package doc.incidents.incident;

import doc.incidents.incident.DateProperty;
import doc.incidents.incident.DescriptionProperty;
import doc.incidents.incident.PlaceProperty;
import doc.incidents.incident.RatingProperty;
import doc.incidents.incident.StudentProperty;
import org.monet.metamodel.FormDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;
import org.monet.metamodel.interfaces.HasMappings;

@SuppressWarnings("all")
public class $Definition$ extends FormDefinition implements HasBehaviour, HasClientBehaviour, HasMappings {
  public $Definition$() {
    super();this._code = "m5jz_vw";
    this._name = "doc.Incidents.Incident";
    this._isAbstract = null;this._label = "Incidencia";
    this.addTextFieldProperty(Place);
    this.addDateFieldProperty(Date);
    this.addLinkFieldProperty(Student);
    this.addTextFieldProperty(Description);
    this.addTextFieldProperty(Rating);
    org.monet.metamodel.FormDefinition.FormViewProperty formViewProperty6 = new org.monet.metamodel.FormDefinition.FormViewProperty();
    formViewProperty6.setLabel("Ficha");
    formViewProperty6.setCode("mq2zo5g");
    org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty showProperty7 = new org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty();
    showProperty7.getField().add(new org.monet.metamodel.internal.Ref("Date","doc.Incidents.Incident","doc.Incidents.Incident.Date"));
    showProperty7.getField().add(new org.monet.metamodel.internal.Ref("Student","doc.Incidents.Incident","doc.Incidents.Incident.Student"));
    showProperty7.getField().add(new org.monet.metamodel.internal.Ref("Place","doc.Incidents.Incident","doc.Incidents.Incident.Place"));
    showProperty7.getField().add(new org.monet.metamodel.internal.Ref("Description","doc.Incidents.Incident","doc.Incidents.Incident.Description"));
    showProperty7.getField().add(new org.monet.metamodel.internal.Ref("Rating","doc.Incidents.Incident","doc.Incidents.Incident.Rating"));
    formViewProperty6.setShow(showProperty7);
    this.addView(formViewProperty6);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(doc.incidents.incident.$Definition$.class,"doc.Incidents.Incident",null);
  }
  }
  
  public static String static_getName() {
    return "Incident";
  }
  
  public Class<?> getBehaviourClass() {
    return doc.incidents.Incident.class;
  }
  
  public String getClientBehaviour() {
    return "var m5jz_vw = new Object();m5jz_vw.refresh = function (node) {if (!node.isEditable()) return;};m5jz_vw.onChangeField = function (node, field) {};";
  }
  
  public Class<?> getMappingClass(final String code) {
    switch(code.hashCode()) {
    
    }
    return super.getMappingClass(code);
  }
  
  private final PlaceProperty Place = new doc.incidents.incident.PlaceProperty();
  
  private final DateProperty Date = new doc.incidents.incident.DateProperty();
  
  private final StudentProperty Student = new doc.incidents.incident.StudentProperty();
  
  private final DescriptionProperty Description = new doc.incidents.incident.DescriptionProperty();
  
  private final RatingProperty Rating = new doc.incidents.incident.RatingProperty();
}
