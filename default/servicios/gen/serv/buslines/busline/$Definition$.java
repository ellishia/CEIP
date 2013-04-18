package serv.buslines.busline;

import org.monet.metamodel.FormDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;
import org.monet.metamodel.interfaces.HasMappings;
import serv.buslines.busline.AuxiliarProperty;
import serv.buslines.busline.DatesProperty;
import serv.buslines.busline.DirectionProperty;
import serv.buslines.busline.IdProperty;
import serv.buslines.busline.ManagerProperty;
import serv.buslines.busline.NameProperty;
import serv.buslines.busline.ScheduleProperty;
import serv.buslines.busline.StopsProperty;

@SuppressWarnings("all")
public class $Definition$ extends FormDefinition implements HasBehaviour, HasClientBehaviour, HasMappings {
  public $Definition$() {
    super();this._code = "ms3tapg";
    this._name = "serv.Buslines.Busline";
    this._isAbstract = null;this._label = "Ruta";
    this.addSerialFieldProperty(Id);
    this.addTextFieldProperty(Name);
    this.addSelectFieldProperty(Stops);
    this.addTextFieldProperty(Manager);
    this.addTextFieldProperty(Auxiliar);
    this.addSectionFieldProperty(Dates);
    this.addTextFieldProperty(Schedule);
    this.addTextFieldProperty(Direction);
    org.monet.metamodel.FormDefinition.MappingProperty mappingProperty9 = new org.monet.metamodel.FormDefinition.MappingProperty();
    mappingProperty9.setIndex(new org.monet.metamodel.internal.Ref("serv.Buslines.Indice"));
    this.getMappingList().add(mappingProperty9);
    org.monet.metamodel.FormDefinition.FormViewProperty formViewProperty11 = new org.monet.metamodel.FormDefinition.FormViewProperty();
    formViewProperty11.setLabel("Ficha");
    formViewProperty11.setCode("teaas");
    org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty showProperty12 = new org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty();
    showProperty12.getField().add(new org.monet.metamodel.internal.Ref("Name","serv.Buslines.Busline","serv.Buslines.Busline.Name"));
    showProperty12.getField().add(new org.monet.metamodel.internal.Ref("Stops","serv.Buslines.Busline","serv.Buslines.Busline.Stops"));
    showProperty12.getField().add(new org.monet.metamodel.internal.Ref("Manager","serv.Buslines.Busline","serv.Buslines.Busline.Manager"));
    showProperty12.getField().add(new org.monet.metamodel.internal.Ref("Auxiliar","serv.Buslines.Busline","serv.Buslines.Busline.Auxiliar"));
    showProperty12.getField().add(new org.monet.metamodel.internal.Ref("Dates","serv.Buslines.Busline","serv.Buslines.Busline.Dates"));
    showProperty12.getField().add(new org.monet.metamodel.internal.Ref("Schedule","serv.Buslines.Busline","serv.Buslines.Busline.Schedule"));
    showProperty12.getField().add(new org.monet.metamodel.internal.Ref("Direction","serv.Buslines.Busline","serv.Buslines.Busline.Direction"));
    formViewProperty11.setShow(showProperty12);
    this.addView(formViewProperty11);
    org.monet.metamodel.FormDefinition.FormViewProperty formViewProperty21 = new org.monet.metamodel.FormDefinition.FormViewProperty();
    formViewProperty21.setLabel("Incidencias de la Ruta");
    formViewProperty21.setCode("mepy_9w");
    formViewProperty21.setName("Incidents");
    org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty showProperty22 = new org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty();
    org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty.LinksInProperty linksInProperty22 = new org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty.LinksInProperty();
    linksInProperty22.getNode().add(new org.monet.metamodel.internal.Ref("serv.Incidents.Incident"));
    showProperty22.setLinksIn(linksInProperty22);
    formViewProperty21.setShow(showProperty22);
    this.addView(formViewProperty21);
    org.monet.metamodel.FormDefinition.FormViewProperty formViewProperty26 = new org.monet.metamodel.FormDefinition.FormViewProperty();
    formViewProperty26.setLabel("Registros");
    formViewProperty26.setCode("m6g_y_g");
    formViewProperty26.setName("DailyRecords");
    org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty showProperty27 = new org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty();
    org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty.LinksInProperty linksInProperty27 = new org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty.LinksInProperty();
    linksInProperty27.getNode().add(new org.monet.metamodel.internal.Ref("serv.DailyRecords.DailyRecord"));
    showProperty27.setLinksIn(linksInProperty27);
    formViewProperty26.setShow(showProperty27);
    this.addView(formViewProperty26);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(serv.buslines.busline.$Definition$.class,"serv.Buslines.Busline",null);
  }
  }
  
  public static String static_getName() {
    return "Busline";
  }
  
  public Class<?> getBehaviourClass() {
    return serv.buslines.Busline.class;
  }
  
  public String getClientBehaviour() {
    return "var ms3tapg = new Object();ms3tapg.refresh = function (node) {if (!node.isEditable()) return;};ms3tapg.onChangeField = function (node, field) {};";
  }
  
  public Class<?> getMappingClass(final String code) {
    switch(code.hashCode()) {
    case -832768778:
    return serv.buslines.busline.Mapping__0.class;
    }
    return super.getMappingClass(code);
  }
  
  private final IdProperty Id = new serv.buslines.busline.IdProperty();
  
  private final NameProperty Name = new serv.buslines.busline.NameProperty();
  
  private final StopsProperty Stops = new serv.buslines.busline.StopsProperty();
  
  private final ManagerProperty Manager = new serv.buslines.busline.ManagerProperty();
  
  private final AuxiliarProperty Auxiliar = new serv.buslines.busline.AuxiliarProperty();
  
  private final DatesProperty Dates = new serv.buslines.busline.DatesProperty();
  
  private final ScheduleProperty Schedule = new serv.buslines.busline.ScheduleProperty();
  
  private final DirectionProperty Direction = new serv.buslines.busline.DirectionProperty();
}
