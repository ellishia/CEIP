package direc.evaluationsesions.evaluationsesion;

import direc.evaluationsesions.evaluationsesion.DateProperty;
import direc.evaluationsesions.evaluationsesion.EvaluationDocProperty;
import direc.evaluationsesions.evaluationsesion.GroupProperty;
import direc.evaluationsesions.evaluationsesion.RoomProperty;
import direc.evaluationsesions.evaluationsesion.TeachersProperty;
import direc.evaluationsesions.evaluationsesion.TitleProperty;
import direc.evaluationsesions.evaluationsesion.TrimesterProperty;
import org.monet.metamodel.FormDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;
import org.monet.metamodel.interfaces.HasMappings;

@SuppressWarnings("all")
public class $Definition$ extends FormDefinition implements HasBehaviour, HasClientBehaviour, HasMappings {
  public $Definition$() {
    super();this._code = "mdvasla";
    this._name = "direc.EvaluationSesions.EvaluationSesion";
    this._isAbstract = null;this._label = "Convocatoria de Evaluación";
    this.addTextFieldProperty(Title);
    this.addDateFieldProperty(Date);
    this.addSelectFieldProperty(Trimester);
    this.addLinkFieldProperty(Room);
    this.addLinkFieldProperty(Group);
    this.addLinkFieldProperty(Teachers);
    this.addNodeFieldProperty(EvaluationDoc);
    org.monet.metamodel.FormDefinition.MappingProperty mappingProperty8 = new org.monet.metamodel.FormDefinition.MappingProperty();
    mappingProperty8.setIndex(new org.monet.metamodel.internal.Ref("direc.EvaluationSesions.Indice"));
    this.getMappingList().add(mappingProperty8);
    org.monet.metamodel.FormDefinition.OperationProperty operationProperty10 = new org.monet.metamodel.FormDefinition.OperationProperty();
    operationProperty10.setLabel("crear documento de convocatoria");
    operationProperty10.setCode("mqedryg");
    operationProperty10.setName("OperationName");
    this.addOperation(operationProperty10);
    org.monet.metamodel.FormDefinition.FormViewProperty formViewProperty13 = new org.monet.metamodel.FormDefinition.FormViewProperty();
    formViewProperty13.setLabel("Convocatoria");
    formViewProperty13.setCode("madfzww");
    org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty showProperty14 = new org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty();
    showProperty14.getField().add(new org.monet.metamodel.internal.Ref("Title","direc.EvaluationSesions.EvaluationSesion","direc.EvaluationSesions.EvaluationSesion.Title"));
    showProperty14.getField().add(new org.monet.metamodel.internal.Ref("Date","direc.EvaluationSesions.EvaluationSesion","direc.EvaluationSesions.EvaluationSesion.Date"));
    showProperty14.getField().add(new org.monet.metamodel.internal.Ref("Trimester","direc.EvaluationSesions.EvaluationSesion","direc.EvaluationSesions.EvaluationSesion.Trimester"));
    showProperty14.getField().add(new org.monet.metamodel.internal.Ref("Room","direc.EvaluationSesions.EvaluationSesion","direc.EvaluationSesions.EvaluationSesion.Room"));
    showProperty14.getField().add(new org.monet.metamodel.internal.Ref("Group","direc.EvaluationSesions.EvaluationSesion","direc.EvaluationSesions.EvaluationSesion.Group"));
    showProperty14.getField().add(new org.monet.metamodel.internal.Ref("Teachers","direc.EvaluationSesions.EvaluationSesion","direc.EvaluationSesions.EvaluationSesion.Teachers"));
    formViewProperty13.setShow(showProperty14);
    this.addView(formViewProperty13);
    org.monet.metamodel.FormDefinition.FormViewProperty formViewProperty22 = new org.monet.metamodel.FormDefinition.FormViewProperty();
    formViewProperty22.setCode("mgv3zfw");
    formViewProperty22.setName("ConvocatoriaView");
    org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty showProperty22 = new org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty();
    org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty.AttachmentsProperty attachmentsProperty22 = new org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty.AttachmentsProperty();
    attachmentsProperty22.getFieldNode().add(new org.monet.metamodel.internal.Ref("EvaluationDoc","direc.EvaluationSesions.EvaluationSesion","direc.EvaluationSesions.EvaluationSesion.EvaluationDoc"));
    showProperty22.setAttachments(attachmentsProperty22);
    formViewProperty22.setShow(showProperty22);
    this.addView(formViewProperty22);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(direc.evaluationsesions.evaluationsesion.$Definition$.class,"direc.EvaluationSesions.EvaluationSesion",null);
  }
  }
  
  public static String static_getName() {
    return "EvaluationSesion";
  }
  
  public Class<?> getBehaviourClass() {
    return direc.evaluationsesions.EvaluationSesion.class;
  }
  
  public String getClientBehaviour() {
    return "var mdvasla = new Object();mdvasla.refresh = function (node) {if (!node.isEditable()) return;};mdvasla.onChangeField = function (node, field) {};";
  }
  
  public Class<?> getMappingClass(final String code) {
    switch(code.hashCode()) {
    case 1057183457:
    return direc.evaluationsesions.evaluationsesion.Mapping__0.class;
    }
    return super.getMappingClass(code);
  }
  
  private final TitleProperty Title = new direc.evaluationsesions.evaluationsesion.TitleProperty();
  
  private final DateProperty Date = new direc.evaluationsesions.evaluationsesion.DateProperty();
  
  private final TrimesterProperty Trimester = new direc.evaluationsesions.evaluationsesion.TrimesterProperty();
  
  private final RoomProperty Room = new direc.evaluationsesions.evaluationsesion.RoomProperty();
  
  private final GroupProperty Group = new direc.evaluationsesions.evaluationsesion.GroupProperty();
  
  private final TeachersProperty Teachers = new direc.evaluationsesions.evaluationsesion.TeachersProperty();
  
  private final EvaluationDocProperty EvaluationDoc = new direc.evaluationsesions.evaluationsesion.EvaluationDocProperty();
}
