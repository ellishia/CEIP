package direc.students.student;

import direc.students.student.CialProperty;
import direc.students.student.Date_of_BirthProperty;
import direc.students.student.LevelProperty;
import direc.students.student.NameProperty;
import direc.students.student.SurnameProperty;
import org.monet.metamodel.FormDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;
import org.monet.metamodel.interfaces.HasMappings;
import org.monet.metamodel.interfaces.HasProperties;

@SuppressWarnings("all")
public class $Definition$ extends FormDefinition implements HasBehaviour, HasClientBehaviour, HasProperties, HasMappings {
  public $Definition$() {
    super();this._code = "mw0lesw";
    this._name = "direc.Students.Student";
    this._isAbstract = null;this._label = "Alumno/a";
    org.monet.metamodel.FormDefinition.MappingProperty mappingProperty1 = new org.monet.metamodel.FormDefinition.MappingProperty();
    mappingProperty1.setIndex(new org.monet.metamodel.internal.Ref("direc.Students.Index"));
    this.getMappingList().add(mappingProperty1);
    org.monet.metamodel.FormDefinition.PropertiesProperty propertiesProperty3 = new org.monet.metamodel.FormDefinition.PropertiesProperty();
    this.setProperties(propertiesProperty3);
    this.addTextFieldProperty(Name);
    this.addTextFieldProperty(Surname);
    this.addSelectFieldProperty(Level);
    this.addTextFieldProperty(Cial);
    this.addDateFieldProperty(Date_of_Birth);
    org.monet.metamodel.FormDefinition.FormViewProperty formViewProperty10 = new org.monet.metamodel.FormDefinition.FormViewProperty();
    formViewProperty10.setLabel("Ficha");
    formViewProperty10.setCode("m1ni4ea");
    formViewProperty10.setIsDefault(true);
    org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty showProperty12 = new org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty();
    showProperty12.getField().add(new org.monet.metamodel.internal.Ref("Name","direc.Students.Student","direc.Students.Student.Name"));
    showProperty12.getField().add(new org.monet.metamodel.internal.Ref("Surname","direc.Students.Student","direc.Students.Student.Surname"));
    showProperty12.getField().add(new org.monet.metamodel.internal.Ref("Level","direc.Students.Student","direc.Students.Student.Level"));
    showProperty12.getField().add(new org.monet.metamodel.internal.Ref("Cial","direc.Students.Student","direc.Students.Student.Cial"));
    showProperty12.getField().add(new org.monet.metamodel.internal.Ref("Date_of_Birth","direc.Students.Student","direc.Students.Student.Date_of_Birth"));
    formViewProperty10.setShow(showProperty12);
    this.addView(formViewProperty10);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(direc.students.student.$Definition$.class,"direc.Students.Student",null);
  }
  }
  
  public static String static_getName() {
    return "Student";
  }
  
  public Class<?> getBehaviourClass() {
    return direc.students.Student.class;
  }
  
  public String getClientBehaviour() {
    return "var mw0lesw = new Object();mw0lesw.refresh = function (node) {if (!node.isEditable()) return;};mw0lesw.onChangeField = function (node, field) {};";
  }
  
  public Class<?> getPropertiesClass() {
    return direc.students.student.$Properties$.class;
  }
  
  public Class<?> getMappingClass(final String code) {
    switch(code.hashCode()) {
    case -429295275:
    return direc.students.student.Mapping__0.class;
    }
    return super.getMappingClass(code);
  }
  
  private final NameProperty Name = new direc.students.student.NameProperty();
  
  private final SurnameProperty Surname = new direc.students.student.SurnameProperty();
  
  private final LevelProperty Level = new direc.students.student.LevelProperty();
  
  private final CialProperty Cial = new direc.students.student.CialProperty();
  
  private final Date_of_BirthProperty Date_of_Birth = new direc.students.student.Date_of_BirthProperty();
}
