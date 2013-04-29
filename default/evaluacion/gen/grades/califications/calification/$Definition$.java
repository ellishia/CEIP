package grades.califications.calification;

import grades.califications.calification.AcademicYearProperty;
import grades.califications.calification.GradeProperty;
import grades.califications.calification.StudentProperty;
import grades.califications.calification.SubjectProperty;
import grades.califications.calification.TrimesterProperty;
import org.monet.metamodel.FormDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;
import org.monet.metamodel.interfaces.HasMappings;

@SuppressWarnings("all")
public class $Definition$ extends FormDefinition implements HasBehaviour, HasClientBehaviour, HasMappings {
  public $Definition$() {
    super();this._code = "mf1x_iw";
    this._name = "grades.Califications.Calification";
    this._isAbstract = null;this._label = "Calificación";
    this.addSelectFieldProperty(AcademicYear);
    this.addSelectFieldProperty(Subject);
    this.addSelectFieldProperty(Trimester);
    this.addTextFieldProperty(Grade);
    this.addLinkFieldProperty(Student);
    org.monet.metamodel.FormDefinition.MappingProperty mappingProperty6 = new org.monet.metamodel.FormDefinition.MappingProperty();
    mappingProperty6.setIndex(new org.monet.metamodel.internal.Ref("grades.Califications.Indice"));
    this.getMappingList().add(mappingProperty6);
    org.monet.metamodel.FormDefinition.FormViewProperty formViewProperty8 = new org.monet.metamodel.FormDefinition.FormViewProperty();
    formViewProperty8.setLabel("Calificación");
    formViewProperty8.setCode("mveyj5w");
    org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty showProperty9 = new org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty();
    showProperty9.getField().add(new org.monet.metamodel.internal.Ref("AcademicYear","grades.Califications.Calification","grades.Califications.Calification.AcademicYear"));
    showProperty9.getField().add(new org.monet.metamodel.internal.Ref("Subject","grades.Califications.Calification","grades.Califications.Calification.Subject"));
    showProperty9.getField().add(new org.monet.metamodel.internal.Ref("Trimester","grades.Califications.Calification","grades.Califications.Calification.Trimester"));
    showProperty9.getField().add(new org.monet.metamodel.internal.Ref("Student","grades.Califications.Calification","grades.Califications.Calification.Student"));
    showProperty9.getField().add(new org.monet.metamodel.internal.Ref("Grade","grades.Califications.Calification","grades.Califications.Calification.Grade"));
    formViewProperty8.setShow(showProperty9);
    this.addView(formViewProperty8);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(grades.califications.calification.$Definition$.class,"grades.Califications.Calification",null);
  }
  }
  
  public static String static_getName() {
    return "Calification";
  }
  
  public Class<?> getBehaviourClass() {
    return grades.califications.Calification.class;
  }
  
  public String getClientBehaviour() {
    return "var mf1x_iw = new Object();mf1x_iw.refresh = function (node) {if (!node.isEditable()) return;};mf1x_iw.onChangeField = function (node, field) {};";
  }
  
  public Class<?> getMappingClass(final String code) {
    switch(code.hashCode()) {
    case -624182860:
    return grades.califications.calification.Mapping__0.class;
    }
    return super.getMappingClass(code);
  }
  
  private final AcademicYearProperty AcademicYear = new grades.califications.calification.AcademicYearProperty();
  
  private final SubjectProperty Subject = new grades.califications.calification.SubjectProperty();
  
  private final TrimesterProperty Trimester = new grades.califications.calification.TrimesterProperty();
  
  private final GradeProperty Grade = new grades.califications.calification.GradeProperty();
  
  private final StudentProperty Student = new grades.califications.calification.StudentProperty();
}
