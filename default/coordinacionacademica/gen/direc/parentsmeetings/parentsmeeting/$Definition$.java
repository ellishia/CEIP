package direc.parentsmeetings.parentsmeeting;

import direc.parentsmeetings.parentsmeeting.DateProperty;
import direc.parentsmeetings.parentsmeeting.DescriptionProperty;
import direc.parentsmeetings.parentsmeeting.GroupProperty;
import direc.parentsmeetings.parentsmeeting.ObservationsProperty;
import direc.parentsmeetings.parentsmeeting.ReunionDocProperty;
import direc.parentsmeetings.parentsmeeting.RoomProperty;
import direc.parentsmeetings.parentsmeeting.TeachersProperty;
import direc.parentsmeetings.parentsmeeting.TitleProperty;
import org.monet.metamodel.FormDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;
import org.monet.metamodel.interfaces.HasMappings;

@SuppressWarnings("all")
public class $Definition$ extends FormDefinition implements HasBehaviour, HasClientBehaviour, HasMappings {
  public $Definition$() {
    super();this._code = "mbpafyq";
    this._name = "direc.ParentsMeetings.ParentsMeeting";
    this._isAbstract = null;this._label = "Reunión de Padres";
    this.addTextFieldProperty(Title);
    this.addDateFieldProperty(Date);
    this.addLinkFieldProperty(Group);
    this.addLinkFieldProperty(Room);
    this.addLinkFieldProperty(Teachers);
    this.addTextFieldProperty(Description);
    this.addTextFieldProperty(Observations);
    this.addNodeFieldProperty(ReunionDoc);
    org.monet.metamodel.FormDefinition.MappingProperty mappingProperty9 = new org.monet.metamodel.FormDefinition.MappingProperty();
    mappingProperty9.setIndex(new org.monet.metamodel.internal.Ref("direc.ParentsMeetings.Indice"));
    this.getMappingList().add(mappingProperty9);
    org.monet.metamodel.FormDefinition.OperationProperty operationProperty11 = new org.monet.metamodel.FormDefinition.OperationProperty();
    operationProperty11.setLabel("crear documento de reunión");
    operationProperty11.setCode("m4ec3hg");
    operationProperty11.setName("OperationName");
    this.addOperation(operationProperty11);
    org.monet.metamodel.FormDefinition.FormViewProperty formViewProperty14 = new org.monet.metamodel.FormDefinition.FormViewProperty();
    formViewProperty14.setLabel("Convocatoria");
    formViewProperty14.setCode("m5ldg8g");
    org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty showProperty15 = new org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty();
    showProperty15.getField().add(new org.monet.metamodel.internal.Ref("Title","direc.ParentsMeetings.ParentsMeeting","direc.ParentsMeetings.ParentsMeeting.Title"));
    showProperty15.getField().add(new org.monet.metamodel.internal.Ref("Date","direc.ParentsMeetings.ParentsMeeting","direc.ParentsMeetings.ParentsMeeting.Date"));
    showProperty15.getField().add(new org.monet.metamodel.internal.Ref("Group","direc.ParentsMeetings.ParentsMeeting","direc.ParentsMeetings.ParentsMeeting.Group"));
    showProperty15.getField().add(new org.monet.metamodel.internal.Ref("Room","direc.ParentsMeetings.ParentsMeeting","direc.ParentsMeetings.ParentsMeeting.Room"));
    showProperty15.getField().add(new org.monet.metamodel.internal.Ref("Teachers","direc.ParentsMeetings.ParentsMeeting","direc.ParentsMeetings.ParentsMeeting.Teachers"));
    showProperty15.getField().add(new org.monet.metamodel.internal.Ref("Description","direc.ParentsMeetings.ParentsMeeting","direc.ParentsMeetings.ParentsMeeting.Description"));
    showProperty15.getField().add(new org.monet.metamodel.internal.Ref("Observations","direc.ParentsMeetings.ParentsMeeting","direc.ParentsMeetings.ParentsMeeting.Observations"));
    formViewProperty14.setShow(showProperty15);
    this.addView(formViewProperty14);
    org.monet.metamodel.FormDefinition.FormViewProperty formViewProperty24 = new org.monet.metamodel.FormDefinition.FormViewProperty();
    formViewProperty24.setCode("marntdg");
    formViewProperty24.setName("ReunionView");
    org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty showProperty24 = new org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty();
    org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty.AttachmentsProperty attachmentsProperty24 = new org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty.AttachmentsProperty();
    attachmentsProperty24.getFieldNode().add(new org.monet.metamodel.internal.Ref("ReunionDoc","direc.ParentsMeetings.ParentsMeeting","direc.ParentsMeetings.ParentsMeeting.ReunionDoc"));
    showProperty24.setAttachments(attachmentsProperty24);
    formViewProperty24.setShow(showProperty24);
    this.addView(formViewProperty24);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(direc.parentsmeetings.parentsmeeting.$Definition$.class,"direc.ParentsMeetings.ParentsMeeting",null);
  }
  }
  
  public static String static_getName() {
    return "ParentsMeeting";
  }
  
  public Class<?> getBehaviourClass() {
    return direc.parentsmeetings.ParentsMeeting.class;
  }
  
  public String getClientBehaviour() {
    return "var mbpafyq = new Object();mbpafyq.refresh = function (node) {if (!node.isEditable()) return;};mbpafyq.onChangeField = function (node, field) {};";
  }
  
  public Class<?> getMappingClass(final String code) {
    switch(code.hashCode()) {
    case -360354136:
    return direc.parentsmeetings.parentsmeeting.Mapping__0.class;
    }
    return super.getMappingClass(code);
  }
  
  private final TitleProperty Title = new direc.parentsmeetings.parentsmeeting.TitleProperty();
  
  private final DateProperty Date = new direc.parentsmeetings.parentsmeeting.DateProperty();
  
  private final GroupProperty Group = new direc.parentsmeetings.parentsmeeting.GroupProperty();
  
  private final RoomProperty Room = new direc.parentsmeetings.parentsmeeting.RoomProperty();
  
  private final TeachersProperty Teachers = new direc.parentsmeetings.parentsmeeting.TeachersProperty();
  
  private final DescriptionProperty Description = new direc.parentsmeetings.parentsmeeting.DescriptionProperty();
  
  private final ObservationsProperty Observations = new direc.parentsmeetings.parentsmeeting.ObservationsProperty();
  
  private final ReunionDocProperty ReunionDoc = new direc.parentsmeetings.parentsmeeting.ReunionDocProperty();
}
