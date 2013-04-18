package direc.minutes.acta;

import direc.minutes.acta.AuthorProperty;
import direc.minutes.acta.DateProperty;
import direc.minutes.acta.DescriptionProperty;
import direc.minutes.acta.MinuteDocProperty;
import direc.minutes.acta.RoomProperty;
import direc.minutes.acta.TeachersProperty;
import direc.minutes.acta.TitleProperty;
import org.monet.metamodel.FormDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;
import org.monet.metamodel.interfaces.HasMappings;

@SuppressWarnings("all")
public class $Definition$ extends FormDefinition implements HasBehaviour, HasClientBehaviour, HasMappings {
  public $Definition$() {
    super();this._code = "mkxzkhq";
    this._name = "direc.Minutes.Acta";
    this._isAbstract = null;this._label = "Acta";
    this.addTextFieldProperty(Title);
    this.addDateFieldProperty(Date);
    this.addLinkFieldProperty(Room);
    this.addLinkFieldProperty(Teachers);
    this.addTextFieldProperty(Description);
    this.addTextFieldProperty(Author);
    this.addNodeFieldProperty(MinuteDoc);
    org.monet.metamodel.FormDefinition.MappingProperty mappingProperty8 = new org.monet.metamodel.FormDefinition.MappingProperty();
    mappingProperty8.setIndex(new org.monet.metamodel.internal.Ref("direc.Minutes.Indice"));
    this.getMappingList().add(mappingProperty8);
    org.monet.metamodel.FormDefinition.OperationProperty operationProperty10 = new org.monet.metamodel.FormDefinition.OperationProperty();
    operationProperty10.setLabel("crear acta de reunión");
    operationProperty10.setCode("mfh1znw");
    operationProperty10.setName("CreateMinute");
    this.addOperation(operationProperty10);
    org.monet.metamodel.FormDefinition.FormViewProperty formViewProperty13 = new org.monet.metamodel.FormDefinition.FormViewProperty();
    formViewProperty13.setLabel("Ficha de Acta");
    formViewProperty13.setCode("mgrca1q");
    org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty showProperty14 = new org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty();
    showProperty14.getField().add(new org.monet.metamodel.internal.Ref("Title","direc.Minutes.Acta","direc.Minutes.Acta.Title"));
    showProperty14.getField().add(new org.monet.metamodel.internal.Ref("Date","direc.Minutes.Acta","direc.Minutes.Acta.Date"));
    showProperty14.getField().add(new org.monet.metamodel.internal.Ref("Room","direc.Minutes.Acta","direc.Minutes.Acta.Room"));
    formViewProperty13.setShow(showProperty14);
    this.addView(formViewProperty13);
    org.monet.metamodel.FormDefinition.FormViewProperty formViewProperty19 = new org.monet.metamodel.FormDefinition.FormViewProperty();
    formViewProperty19.setCode("moluugw");
    formViewProperty19.setName("MinuteView");
    org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty showProperty19 = new org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty();
    org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty.AttachmentsProperty attachmentsProperty19 = new org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty.AttachmentsProperty();
    attachmentsProperty19.getFieldNode().add(new org.monet.metamodel.internal.Ref("MinuteDoc","direc.Minutes.Acta","direc.Minutes.Acta.MinuteDoc"));
    showProperty19.setAttachments(attachmentsProperty19);
    formViewProperty19.setShow(showProperty19);
    this.addView(formViewProperty19);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(direc.minutes.acta.$Definition$.class,"direc.Minutes.Acta",null);
  }
  }
  
  public static String static_getName() {
    return "Acta";
  }
  
  public Class<?> getBehaviourClass() {
    return direc.minutes.Acta.class;
  }
  
  public String getClientBehaviour() {
    return "var mkxzkhq = new Object();mkxzkhq.refresh = function (node) {if (!node.isEditable()) return;};mkxzkhq.onChangeField = function (node, field) {};";
  }
  
  public Class<?> getMappingClass(final String code) {
    switch(code.hashCode()) {
    case 914010422:
    return direc.minutes.acta.Mapping__0.class;
    }
    return super.getMappingClass(code);
  }
  
  private final TitleProperty Title = new direc.minutes.acta.TitleProperty();
  
  private final DateProperty Date = new direc.minutes.acta.DateProperty();
  
  private final RoomProperty Room = new direc.minutes.acta.RoomProperty();
  
  private final TeachersProperty Teachers = new direc.minutes.acta.TeachersProperty();
  
  private final DescriptionProperty Description = new direc.minutes.acta.DescriptionProperty();
  
  private final AuthorProperty Author = new direc.minutes.acta.AuthorProperty();
  
  private final MinuteDocProperty MinuteDoc = new direc.minutes.acta.MinuteDocProperty();
}
