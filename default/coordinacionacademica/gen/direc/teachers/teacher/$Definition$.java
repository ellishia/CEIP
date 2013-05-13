package direc.teachers.teacher;

import direc.teachers.teacher.IdentifierProperty;
import direc.teachers.teacher.LevelProperty;
import direc.teachers.teacher.NameProperty;
import direc.teachers.teacher.SpecialtyProperty;
import direc.teachers.teacher.SurnameProperty;
import direc.teachers.teacher.TeachingSinceProperty;
import org.monet.metamodel.FormDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;
import org.monet.metamodel.interfaces.HasMappings;
import org.monet.metamodel.interfaces.HasProperties;

@SuppressWarnings("all")
public class $Definition$ extends FormDefinition implements HasBehaviour, HasClientBehaviour, HasProperties, HasMappings {
  public $Definition$() {
    super();this._code = "mjrveww";
    this._name = "direc.Teachers.Teacher";
    this._isAbstract = null;this._label = "Docente";
    this.addTextFieldProperty(Name);
    this.addTextFieldProperty(Surname);
    this.addSerialFieldProperty(Identifier);
    this.addTextFieldProperty(Specialty);
    this.addDateFieldProperty(TeachingSince);
    this.addTextFieldProperty(Level);
    org.monet.metamodel.FormDefinition.MappingProperty mappingProperty7 = new org.monet.metamodel.FormDefinition.MappingProperty();
    mappingProperty7.setIndex(new org.monet.metamodel.internal.Ref("direc.Teachers.Indice"));
    this.getMappingList().add(mappingProperty7);
    org.monet.metamodel.FormDefinition.PropertiesProperty propertiesProperty9 = new org.monet.metamodel.FormDefinition.PropertiesProperty();
    this.setProperties(propertiesProperty9);
    org.monet.metamodel.FormDefinition.FormViewProperty formViewProperty11 = new org.monet.metamodel.FormDefinition.FormViewProperty();
    formViewProperty11.setLabel("Ficha");
    formViewProperty11.setCode("kald");
    org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty showProperty12 = new org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty();
    showProperty12.getField().add(new org.monet.metamodel.internal.Ref("Identifier","direc.Teachers.Teacher","direc.Teachers.Teacher.Identifier"));
    showProperty12.getField().add(new org.monet.metamodel.internal.Ref("Name","direc.Teachers.Teacher","direc.Teachers.Teacher.Name"));
    showProperty12.getField().add(new org.monet.metamodel.internal.Ref("Surname","direc.Teachers.Teacher","direc.Teachers.Teacher.Surname"));
    showProperty12.getField().add(new org.monet.metamodel.internal.Ref("Specialty","direc.Teachers.Teacher","direc.Teachers.Teacher.Specialty"));
    showProperty12.getField().add(new org.monet.metamodel.internal.Ref("TeachingSince","direc.Teachers.Teacher","direc.Teachers.Teacher.TeachingSince"));
    showProperty12.getField().add(new org.monet.metamodel.internal.Ref("Level","direc.Teachers.Teacher","direc.Teachers.Teacher.Level"));
    formViewProperty11.setShow(showProperty12);
    this.addView(formViewProperty11);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(direc.teachers.teacher.$Definition$.class,"direc.Teachers.Teacher",null);
  }
  }
  
  public static String static_getName() {
    return "Teacher";
  }
  
  public Class<?> getBehaviourClass() {
    return direc.teachers.Teacher.class;
  }
  
  public String getClientBehaviour() {
    return "var mjrveww = new Object();mjrveww.refresh = function (node) {if (!node.isEditable()) return;};mjrveww.onChangeField = function (node, field) {};";
  }
  
  public Class<?> getPropertiesClass() {
    return direc.teachers.teacher.$Properties$.class;
  }
  
  public Class<?> getMappingClass(final String code) {
    switch(code.hashCode()) {
    case -585746735:
    return direc.teachers.teacher.Mapping__0.class;
    }
    return super.getMappingClass(code);
  }
  
  private final NameProperty Name = new direc.teachers.teacher.NameProperty();
  
  private final SurnameProperty Surname = new direc.teachers.teacher.SurnameProperty();
  
  private final IdentifierProperty Identifier = new direc.teachers.teacher.IdentifierProperty();
  
  private final SpecialtyProperty Specialty = new direc.teachers.teacher.SpecialtyProperty();
  
  private final TeachingSinceProperty TeachingSince = new direc.teachers.teacher.TeachingSinceProperty();
  
  private final LevelProperty Level = new direc.teachers.teacher.LevelProperty();
}
