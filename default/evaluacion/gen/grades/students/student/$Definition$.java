package grades.students.student;

import grades.students.student.CityProperty;
import grades.students.student.Date_of_BirthProperty;
import grades.students.student.GenderProperty;
import grades.students.student.LevelProperty;
import grades.students.student.MotherAcademicLevelProperty;
import grades.students.student.NeigbourhoodProperty;
import grades.students.student.NombreProperty;
import grades.students.student.ParentAcademicLevelProperty;
import grades.students.student.SurnameProperty;
import org.monet.metamodel.FormDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;
import org.monet.metamodel.interfaces.HasMappings;

@SuppressWarnings("all")
public class $Definition$ extends FormDefinition implements HasBehaviour, HasClientBehaviour, HasMappings {
  public $Definition$() {
    super();this._code = "mtu9biq";
    this._name = "grades.Students.Student";
    this._isAbstract = null;this._label = "Alumno/a";
    org.monet.metamodel.FormDefinition.MappingProperty mappingProperty1 = new org.monet.metamodel.FormDefinition.MappingProperty();
    mappingProperty1.setIndex(new org.monet.metamodel.internal.Ref("grades.Students.Index"));
    this.getMappingList().add(mappingProperty1);
    this.addTextFieldProperty(Nombre);
    this.addTextFieldProperty(Surname);
    this.addSelectFieldProperty(Level);
    this.addTextFieldProperty(Gender);
    this.addDateFieldProperty(Date_of_Birth);
    this.addTextFieldProperty(Neigbourhood);
    this.addTextFieldProperty(City);
    this.addSelectFieldProperty(ParentAcademicLevel);
    this.addSelectFieldProperty(MotherAcademicLevel);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(grades.students.student.$Definition$.class,"grades.Students.Student",null);
  }
  }
  
  public static String static_getName() {
    return "Student";
  }
  
  public Class<?> getBehaviourClass() {
    return grades.students.Student.class;
  }
  
  public String getClientBehaviour() {
    return "var mtu9biq = new Object();mtu9biq.refresh = function (node) {if (!node.isEditable()) return;};mtu9biq.onChangeField = function (node, field) {};";
  }
  
  public Class<?> getMappingClass(final String code) {
    switch(code.hashCode()) {
    case -429295275:
    return grades.students.student.Mapping__0.class;
    }
    return super.getMappingClass(code);
  }
  
  private final NombreProperty Nombre = new grades.students.student.NombreProperty();
  
  private final SurnameProperty Surname = new grades.students.student.SurnameProperty();
  
  private final LevelProperty Level = new grades.students.student.LevelProperty();
  
  private final GenderProperty Gender = new grades.students.student.GenderProperty();
  
  private final Date_of_BirthProperty Date_of_Birth = new grades.students.student.Date_of_BirthProperty();
  
  private final NeigbourhoodProperty Neigbourhood = new grades.students.student.NeigbourhoodProperty();
  
  private final CityProperty City = new grades.students.student.CityProperty();
  
  private final ParentAcademicLevelProperty ParentAcademicLevel = new grades.students.student.ParentAcademicLevelProperty();
  
  private final MotherAcademicLevelProperty MotherAcademicLevel = new grades.students.student.MotherAcademicLevelProperty();
}
