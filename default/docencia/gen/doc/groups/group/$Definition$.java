package doc.groups.group;

import doc.groups.group.AcademicYearProperty;
import doc.groups.group.AreaProperty;
import doc.groups.group.GradeProperty;
import doc.groups.group.LevelProperty;
import doc.groups.group.NameProperty;
import doc.groups.group.StudentsProperty;
import org.monet.metamodel.FormDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;
import org.monet.metamodel.interfaces.HasMappings;

@SuppressWarnings("all")
public class $Definition$ extends FormDefinition implements HasBehaviour, HasClientBehaviour, HasMappings {
  public $Definition$() {
    super();this._code = "mtkzxnw";
    this._name = "doc.Groups.Group";
    this._isAbstract = null;this._label = "Grupo";
    this.addTextFieldProperty(Name);
    this.addSelectFieldProperty(Grade);
    this.addSelectFieldProperty(AcademicYear);
    this.addLinkFieldProperty(Students);
    this.addSelectFieldProperty(Level);
    this.addSelectFieldProperty(Area);
    org.monet.metamodel.FormDefinition.MappingProperty mappingProperty7 = new org.monet.metamodel.FormDefinition.MappingProperty();
    mappingProperty7.setIndex(new org.monet.metamodel.internal.Ref("doc.Groups.Indice"));
    this.getMappingList().add(mappingProperty7);
    org.monet.metamodel.FormDefinition.FormViewProperty formViewProperty9 = new org.monet.metamodel.FormDefinition.FormViewProperty();
    formViewProperty9.setLabel("Ficha");
    formViewProperty9.setCode("m0wimlg");
    formViewProperty9.setIsDefault(true);
    org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty showProperty11 = new org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty();
    showProperty11.getField().add(new org.monet.metamodel.internal.Ref("Name","doc.Groups.Group","doc.Groups.Group.Name"));
    showProperty11.getField().add(new org.monet.metamodel.internal.Ref("AcademicYear","doc.Groups.Group","doc.Groups.Group.AcademicYear"));
    showProperty11.getField().add(new org.monet.metamodel.internal.Ref("Grade","doc.Groups.Group","doc.Groups.Group.Grade"));
    showProperty11.getField().add(new org.monet.metamodel.internal.Ref("Level","doc.Groups.Group","doc.Groups.Group.Level"));
    showProperty11.getField().add(new org.monet.metamodel.internal.Ref("Area","doc.Groups.Group","doc.Groups.Group.Area"));
    showProperty11.getField().add(new org.monet.metamodel.internal.Ref("Students","doc.Groups.Group","doc.Groups.Group.Students"));
    formViewProperty9.setShow(showProperty11);
    this.addView(formViewProperty9);
    org.monet.metamodel.FormDefinition.FormViewProperty formViewProperty19 = new org.monet.metamodel.FormDefinition.FormViewProperty();
    formViewProperty19.setCode("m373rfg");
    formViewProperty19.setName("View");
    formViewProperty19.setIsWidget(true);
    org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty showProperty20 = new org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty();
    showProperty20.getField().add(new org.monet.metamodel.internal.Ref("Name","doc.Groups.Group","doc.Groups.Group.Name"));
    showProperty20.getField().add(new org.monet.metamodel.internal.Ref("Grade","doc.Groups.Group","doc.Groups.Group.Grade"));
    showProperty20.getField().add(new org.monet.metamodel.internal.Ref("AcademicYear","doc.Groups.Group","doc.Groups.Group.AcademicYear"));
    formViewProperty19.setShow(showProperty20);
    this.addView(formViewProperty19);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(doc.groups.group.$Definition$.class,"doc.Groups.Group",null);
  }
  }
  
  public static String static_getName() {
    return "Group";
  }
  
  public Class<?> getBehaviourClass() {
    return doc.groups.Group.class;
  }
  
  public String getClientBehaviour() {
    return "var mtkzxnw = new Object();mtkzxnw.refresh = function (node) {if (!node.isEditable()) return;};mtkzxnw.onChangeField = function (node, field) {};";
  }
  
  public Class<?> getMappingClass(final String code) {
    switch(code.hashCode()) {
    case 1281702901:
    return doc.groups.group.Mapping__0.class;
    }
    return super.getMappingClass(code);
  }
  
  private final NameProperty Name = new doc.groups.group.NameProperty();
  
  private final GradeProperty Grade = new doc.groups.group.GradeProperty();
  
  private final AcademicYearProperty AcademicYear = new doc.groups.group.AcademicYearProperty();
  
  private final StudentsProperty Students = new doc.groups.group.StudentsProperty();
  
  private final LevelProperty Level = new doc.groups.group.LevelProperty();
  
  private final AreaProperty Area = new doc.groups.group.AreaProperty();
}
