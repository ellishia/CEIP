package serv.buslines.busline;

import org.monet.metamodel.SectionFieldProperty;
import org.monet.metamodel.interfaces.HasBehaviour;
import serv.buslines.busline.dates.FromProperty;
import serv.buslines.busline.dates.ToProperty;

@SuppressWarnings("all")
public class DatesProperty extends SectionFieldProperty implements HasBehaviour {
  public DatesProperty() {
    super();this._code = "m0r0dbw";
    this._name = "Dates";
    this._label = "Fechas de Servicio";
    this.addDateFieldProperty(From);
    this.addDateFieldProperty(To);
    org.monet.metamodel.SectionFieldProperty.ViewProperty viewProperty3 = new org.monet.metamodel.SectionFieldProperty.ViewProperty();
    org.monet.metamodel.SectionFieldProperty.ViewProperty.ShowProperty showProperty3 = new org.monet.metamodel.SectionFieldProperty.ViewProperty.ShowProperty();
    showProperty3.getField().add(new org.monet.metamodel.internal.Ref("From","serv.Buslines.Busline","serv.Buslines.Busline.Dates.From"));
    showProperty3.getField().add(new org.monet.metamodel.internal.Ref("To","serv.Buslines.Busline","serv.Buslines.Busline.Dates.To"));
    viewProperty3.setShow(showProperty3);
    this.setView(viewProperty3);
    
  }
  
  public Class<?> getBehaviourClass() {
    return serv.buslines.busline.Dates.class;
  }
  
  public static String static_getName() {
    return "Dates";
  }
  
  private final FromProperty From = new serv.buslines.busline.dates.FromProperty();
  
  private final ToProperty To = new serv.buslines.busline.dates.ToProperty();
}
