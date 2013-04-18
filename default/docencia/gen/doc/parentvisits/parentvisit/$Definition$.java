package doc.parentvisits.parentvisit;

import doc.parentvisits.parentvisit.AreasProperty;
import doc.parentvisits.parentvisit.DateProperty;
import doc.parentvisits.parentvisit.IdentifierProperty;
import doc.parentvisits.parentvisit.ObservationsProperty;
import doc.parentvisits.parentvisit.StudentProperty;
import doc.parentvisits.parentvisit.TeacherProperty;
import doc.parentvisits.parentvisit.TitleProperty;
import doc.parentvisits.parentvisit.TopicsProperty;
import org.monet.metamodel.FormDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;
import org.monet.metamodel.interfaces.HasMappings;

@SuppressWarnings("all")
public class $Definition$ extends FormDefinition implements HasBehaviour, HasClientBehaviour, HasMappings {
  public $Definition$() {
    super();this._code = "m51calg";
    this._name = "doc.ParentVisits.ParentVisit";
    this._isAbstract = null;this._label = "Visita de Padres";
    this.addSerialFieldProperty(Identifier);
    this.addTextFieldProperty(Title);
    this.addDateFieldProperty(Date);
    this.addSelectFieldProperty(Areas);
    this.addLinkFieldProperty(Student);
    this.addSelectFieldProperty(Teacher);
    this.addTextFieldProperty(Topics);
    this.addTextFieldProperty(Observations);
    org.monet.metamodel.FormDefinition.MappingProperty mappingProperty9 = new org.monet.metamodel.FormDefinition.MappingProperty();
    mappingProperty9.setIndex(new org.monet.metamodel.internal.Ref("doc.ParentVisits.Indice"));
    this.getMappingList().add(mappingProperty9);
    org.monet.metamodel.FormDefinition.FormViewProperty formViewProperty11 = new org.monet.metamodel.FormDefinition.FormViewProperty();
    formViewProperty11.setLabel("Especificación de Asignatura");
    formViewProperty11.setCode("asfda");
    org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty showProperty12 = new org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty();
    showProperty12.getField().add(new org.monet.metamodel.internal.Ref("Title","doc.ParentVisits.ParentVisit","doc.ParentVisits.ParentVisit.Title"));
    showProperty12.getField().add(new org.monet.metamodel.internal.Ref("Date","doc.ParentVisits.ParentVisit","doc.ParentVisits.ParentVisit.Date"));
    showProperty12.getField().add(new org.monet.metamodel.internal.Ref("Identifier","doc.ParentVisits.ParentVisit","doc.ParentVisits.ParentVisit.Identifier"));
    showProperty12.getField().add(new org.monet.metamodel.internal.Ref("Areas","doc.ParentVisits.ParentVisit","doc.ParentVisits.ParentVisit.Areas"));
    showProperty12.getField().add(new org.monet.metamodel.internal.Ref("Teacher","doc.ParentVisits.ParentVisit","doc.ParentVisits.ParentVisit.Teacher"));
    showProperty12.getField().add(new org.monet.metamodel.internal.Ref("Student","doc.ParentVisits.ParentVisit","doc.ParentVisits.ParentVisit.Student"));
    showProperty12.getField().add(new org.monet.metamodel.internal.Ref("Topics","doc.ParentVisits.ParentVisit","doc.ParentVisits.ParentVisit.Topics"));
    showProperty12.getField().add(new org.monet.metamodel.internal.Ref("Observations","doc.ParentVisits.ParentVisit","doc.ParentVisits.ParentVisit.Observations"));
    formViewProperty11.setShow(showProperty12);
    this.addView(formViewProperty11);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(doc.parentvisits.parentvisit.$Definition$.class,"doc.ParentVisits.ParentVisit",null);
  }
  }
  
  public static String static_getName() {
    return "ParentVisit";
  }
  
  public Class<?> getBehaviourClass() {
    return doc.parentvisits.ParentVisit.class;
  }
  
  public String getClientBehaviour() {
    return "var m51calg = new Object();m51calg.refresh = function (node) {if (!node.isEditable()) return;};m51calg.onChangeField = function (node, field) {};";
  }
  
  public Class<?> getMappingClass(final String code) {
    switch(code.hashCode()) {
    case 1059097744:
    return doc.parentvisits.parentvisit.Mapping__0.class;
    }
    return super.getMappingClass(code);
  }
  
  private final IdentifierProperty Identifier = new doc.parentvisits.parentvisit.IdentifierProperty();
  
  private final TitleProperty Title = new doc.parentvisits.parentvisit.TitleProperty();
  
  private final DateProperty Date = new doc.parentvisits.parentvisit.DateProperty();
  
  private final AreasProperty Areas = new doc.parentvisits.parentvisit.AreasProperty();
  
  private final StudentProperty Student = new doc.parentvisits.parentvisit.StudentProperty();
  
  private final TeacherProperty Teacher = new doc.parentvisits.parentvisit.TeacherProperty();
  
  private final TopicsProperty Topics = new doc.parentvisits.parentvisit.TopicsProperty();
  
  private final ObservationsProperty Observations = new doc.parentvisits.parentvisit.ObservationsProperty();
}
