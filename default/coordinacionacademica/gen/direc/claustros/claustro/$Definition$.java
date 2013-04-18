package direc.claustros.claustro;

import direc.claustros.claustro.ClaustroDocProperty;
import direc.claustros.claustro.DateProperty;
import direc.claustros.claustro.DayOrderProperty;
import direc.claustros.claustro.MinuteProperty;
import direc.claustros.claustro.RoomProperty;
import direc.claustros.claustro.TeachersProperty;
import direc.claustros.claustro.TitleProperty;
import direc.claustros.claustro.TrimesterProperty;
import org.monet.metamodel.FormDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;
import org.monet.metamodel.interfaces.HasMappings;

@SuppressWarnings("all")
public class $Definition$ extends FormDefinition implements HasBehaviour, HasClientBehaviour, HasMappings {
  public $Definition$() {
    super();this._code = "mqfzaya";
    this._name = "direc.Claustros.Claustro";
    this._isAbstract = null;this._label = "Claustro de profesores";
    this.addTextFieldProperty(Title);
    this.addDateFieldProperty(Date);
    this.addSelectFieldProperty(Trimester);
    this.addLinkFieldProperty(Room);
    this.addLinkFieldProperty(DayOrder);
    this.addLinkFieldProperty(Minute);
    this.addLinkFieldProperty(Teachers);
    this.addNodeFieldProperty(ClaustroDoc);
    org.monet.metamodel.FormDefinition.MappingProperty mappingProperty9 = new org.monet.metamodel.FormDefinition.MappingProperty();
    mappingProperty9.setIndex(new org.monet.metamodel.internal.Ref("direc.Claustros.Indice"));
    this.getMappingList().add(mappingProperty9);
    org.monet.metamodel.FormDefinition.OperationProperty operationProperty11 = new org.monet.metamodel.FormDefinition.OperationProperty();
    operationProperty11.setLabel("crear documento de convocatoria");
    operationProperty11.setCode("mxvaviq");
    operationProperty11.setName("OperationName");
    this.addOperation(operationProperty11);
    org.monet.metamodel.FormDefinition.FormViewProperty formViewProperty14 = new org.monet.metamodel.FormDefinition.FormViewProperty();
    formViewProperty14.setLabel("Convocatoria");
    formViewProperty14.setCode("mvp5lza");
    org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty showProperty15 = new org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty();
    showProperty15.getField().add(new org.monet.metamodel.internal.Ref("Title","direc.Claustros.Claustro","direc.Claustros.Claustro.Title"));
    showProperty15.getField().add(new org.monet.metamodel.internal.Ref("Date","direc.Claustros.Claustro","direc.Claustros.Claustro.Date"));
    showProperty15.getField().add(new org.monet.metamodel.internal.Ref("Trimester","direc.Claustros.Claustro","direc.Claustros.Claustro.Trimester"));
    showProperty15.getField().add(new org.monet.metamodel.internal.Ref("Room","direc.Claustros.Claustro","direc.Claustros.Claustro.Room"));
    showProperty15.getField().add(new org.monet.metamodel.internal.Ref("DayOrder","direc.Claustros.Claustro","direc.Claustros.Claustro.DayOrder"));
    formViewProperty14.setShow(showProperty15);
    this.addView(formViewProperty14);
    org.monet.metamodel.FormDefinition.FormViewProperty formViewProperty22 = new org.monet.metamodel.FormDefinition.FormViewProperty();
    formViewProperty22.setCode("mhwuvew");
    formViewProperty22.setName("ClaustroView");
    org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty showProperty22 = new org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty();
    org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty.AttachmentsProperty attachmentsProperty22 = new org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty.AttachmentsProperty();
    attachmentsProperty22.getFieldNode().add(new org.monet.metamodel.internal.Ref("ClaustroDoc","direc.Claustros.Claustro","direc.Claustros.Claustro.ClaustroDoc"));
    showProperty22.setAttachments(attachmentsProperty22);
    formViewProperty22.setShow(showProperty22);
    this.addView(formViewProperty22);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(direc.claustros.claustro.$Definition$.class,"direc.Claustros.Claustro",null);
  }
  }
  
  public static String static_getName() {
    return "Claustro";
  }
  
  public Class<?> getBehaviourClass() {
    return direc.claustros.Claustro.class;
  }
  
  public String getClientBehaviour() {
    return "var mqfzaya = new Object();mqfzaya.refresh = function (node) {if (!node.isEditable()) return;};mqfzaya.onChangeField = function (node, field) {};";
  }
  
  public Class<?> getMappingClass(final String code) {
    switch(code.hashCode()) {
    case 949270101:
    return direc.claustros.claustro.Mapping__0.class;
    }
    return super.getMappingClass(code);
  }
  
  private final TitleProperty Title = new direc.claustros.claustro.TitleProperty();
  
  private final DateProperty Date = new direc.claustros.claustro.DateProperty();
  
  private final TrimesterProperty Trimester = new direc.claustros.claustro.TrimesterProperty();
  
  private final RoomProperty Room = new direc.claustros.claustro.RoomProperty();
  
  private final DayOrderProperty DayOrder = new direc.claustros.claustro.DayOrderProperty();
  
  private final MinuteProperty Minute = new direc.claustros.claustro.MinuteProperty();
  
  private final TeachersProperty Teachers = new direc.claustros.claustro.TeachersProperty();
  
  private final ClaustroDocProperty ClaustroDoc = new direc.claustros.claustro.ClaustroDocProperty();
}
