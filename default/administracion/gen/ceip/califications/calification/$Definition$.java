package ceip.califications.calification;

import ceip.califications.calification.AcademicYearProperty;
import ceip.califications.calification.GradeProperty;
import ceip.califications.calification.LevelProperty;
import ceip.califications.calification.StudentProperty;
import ceip.califications.calification.SubjectProperty;
import ceip.califications.calification.TrimesterProperty;
import org.monet.metamodel.FormDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;
import org.monet.metamodel.interfaces.HasMappings;

@SuppressWarnings("all")
public class $Definition$ extends FormDefinition implements HasBehaviour, HasClientBehaviour, HasMappings {
  public $Definition$() {
    super();this._code = "mf1x_iw";
    this._name = "ceip.Califications.Calification";
    this._isAbstract = null;this._label = "Calificación";
    this.addSelectFieldProperty(AcademicYear);
    this.addSelectFieldProperty(Subject);
    this.addSelectFieldProperty(Level);
    this.addSelectFieldProperty(Trimester);
    this.addTextFieldProperty(Grade);
    this.addLinkFieldProperty(Student);
    org.monet.metamodel.FormDefinition.MappingProperty mappingProperty7 = new org.monet.metamodel.FormDefinition.MappingProperty();
    mappingProperty7.setIndex(new org.monet.metamodel.internal.Ref("ceip.Califications.Indice"));
    this.getMappingList().add(mappingProperty7);
    org.monet.metamodel.FormDefinition.FormViewProperty formViewProperty10 = new org.monet.metamodel.FormDefinition.FormViewProperty();
    formViewProperty10.setLabel("Calificación");
    formViewProperty10.setCode("mveyj5w");
    org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty showProperty11 = new org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty();
    showProperty11.getField().add(new org.monet.metamodel.internal.Ref("AcademicYear","ceip.Califications.Calification","ceip.Califications.Calification.AcademicYear"));
    showProperty11.getField().add(new org.monet.metamodel.internal.Ref("Subject","ceip.Califications.Calification","ceip.Califications.Calification.Subject"));
    showProperty11.getField().add(new org.monet.metamodel.internal.Ref("Level","ceip.Califications.Calification","ceip.Califications.Calification.Level"));
    showProperty11.getField().add(new org.monet.metamodel.internal.Ref("Trimester","ceip.Califications.Calification","ceip.Califications.Calification.Trimester"));
    showProperty11.getField().add(new org.monet.metamodel.internal.Ref("Student","ceip.Califications.Calification","ceip.Califications.Calification.Student"));
    showProperty11.getField().add(new org.monet.metamodel.internal.Ref("Grade","ceip.Califications.Calification","ceip.Califications.Calification.Grade"));
    formViewProperty10.setShow(showProperty11);
    this.addView(formViewProperty10);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(ceip.califications.calification.$Definition$.class,"ceip.Califications.Calification",null);
  }
  }
  
  public static String static_getName() {
    return "Calification";
  }
  
  public Class<?> getBehaviourClass() {
    return ceip.califications.Calification.class;
  }
  
  public String getClientBehaviour() {
    return "var mf1x_iw = new Object();mf1x_iw.refresh = function (node) {if (!node.isEditable()) return;};mf1x_iw.onChangeField = function (node, field) {};";
  }
  
  public Class<?> getMappingClass(final String code) {
    switch(code.hashCode()) {
    case -624182860:
    return ceip.califications.calification.Mapping__0.class;
    }
    return super.getMappingClass(code);
  }
  
  private final AcademicYearProperty AcademicYear = new ceip.califications.calification.AcademicYearProperty();
  
  private final SubjectProperty Subject = new ceip.califications.calification.SubjectProperty();
  
  private final LevelProperty Level = new ceip.califications.calification.LevelProperty();
  
  private final TrimesterProperty Trimester = new ceip.califications.calification.TrimesterProperty();
  
  private final GradeProperty Grade = new ceip.califications.calification.GradeProperty();
  
  private final StudentProperty Student = new ceip.califications.calification.StudentProperty();
}
