package grades.examresults.examresult;

import grades.examresults.examresult.AcademicGradeProperty;
import grades.examresults.examresult.CalificationProperty;
import grades.examresults.examresult.CorrectionsProperty;
import grades.examresults.examresult.DateProperty;
import grades.examresults.examresult.ExamProperty;
import grades.examresults.examresult.MistakesProperty;
import grades.examresults.examresult.ObservationsProperty;
import grades.examresults.examresult.StudentProperty;
import grades.examresults.examresult.SubjectProperty;
import grades.examresults.examresult.TeacherProperty;
import org.monet.metamodel.FormDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;
import org.monet.metamodel.interfaces.HasMappings;

@SuppressWarnings("all")
public class $Definition$ extends FormDefinition implements HasBehaviour, HasClientBehaviour, HasMappings {
  public $Definition$() {
    super();this._code = "m2sdlba";
    this._name = "grades.ExamResults.ExamResult";
    this._isAbstract = null;this._label = "Examen";
    this.addLinkFieldProperty(Student);
    this.addSelectFieldProperty(AcademicGrade);
    this.addSelectFieldProperty(Subject);
    this.addSelectFieldProperty(Teacher);
    this.addTextFieldProperty(Exam);
    this.addNumberFieldProperty(Calification);
    this.addDateFieldProperty(Date);
    this.addTextFieldProperty(Mistakes);
    this.addTextFieldProperty(Corrections);
    this.addTextFieldProperty(Observations);
    org.monet.metamodel.FormDefinition.MappingProperty mappingProperty11 = new org.monet.metamodel.FormDefinition.MappingProperty();
    mappingProperty11.setIndex(new org.monet.metamodel.internal.Ref("grades.ExamResults.Indice"));
    this.getMappingList().add(mappingProperty11);
    org.monet.metamodel.FormDefinition.MappingProperty mappingProperty13 = new org.monet.metamodel.FormDefinition.MappingProperty();
    mappingProperty13.setIndex(new org.monet.metamodel.internal.Ref("grades.ContinuosEvaluation.Index"));
    this.getMappingList().add(mappingProperty13);
    org.monet.metamodel.FormDefinition.FormViewProperty formViewProperty15 = new org.monet.metamodel.FormDefinition.FormViewProperty();
    formViewProperty15.setLabel("Ficha");
    formViewProperty15.setCode("adfa");
    org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty showProperty16 = new org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty();
    showProperty16.getField().add(new org.monet.metamodel.internal.Ref("Date","grades.ExamResults.ExamResult","grades.ExamResults.ExamResult.Date"));
    showProperty16.getField().add(new org.monet.metamodel.internal.Ref("Exam","grades.ExamResults.ExamResult","grades.ExamResults.ExamResult.Exam"));
    showProperty16.getField().add(new org.monet.metamodel.internal.Ref("Student","grades.ExamResults.ExamResult","grades.ExamResults.ExamResult.Student"));
    showProperty16.getField().add(new org.monet.metamodel.internal.Ref("AcademicGrade","grades.ExamResults.ExamResult","grades.ExamResults.ExamResult.AcademicGrade"));
    showProperty16.getField().add(new org.monet.metamodel.internal.Ref("Subject","grades.ExamResults.ExamResult","grades.ExamResults.ExamResult.Subject"));
    showProperty16.getField().add(new org.monet.metamodel.internal.Ref("Calification","grades.ExamResults.ExamResult","grades.ExamResults.ExamResult.Calification"));
    showProperty16.getField().add(new org.monet.metamodel.internal.Ref("Teacher","grades.ExamResults.ExamResult","grades.ExamResults.ExamResult.Teacher"));
    showProperty16.getField().add(new org.monet.metamodel.internal.Ref("Mistakes","grades.ExamResults.ExamResult","grades.ExamResults.ExamResult.Mistakes"));
    showProperty16.getField().add(new org.monet.metamodel.internal.Ref("Corrections","grades.ExamResults.ExamResult","grades.ExamResults.ExamResult.Corrections"));
    showProperty16.getField().add(new org.monet.metamodel.internal.Ref("Observations","grades.ExamResults.ExamResult","grades.ExamResults.ExamResult.Observations"));
    formViewProperty15.setShow(showProperty16);
    this.addView(formViewProperty15);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(grades.examresults.examresult.$Definition$.class,"grades.ExamResults.ExamResult",null);
  }
  }
  
  public static String static_getName() {
    return "ExamResult";
  }
  
  public Class<?> getBehaviourClass() {
    return grades.examresults.ExamResult.class;
  }
  
  public String getClientBehaviour() {
    return "var m2sdlba = new Object();m2sdlba.refresh = function (node) {if (!node.isEditable()) return;};m2sdlba.onChangeField = function (node, field) {};";
  }
  
  public Class<?> getMappingClass(final String code) {
    switch(code.hashCode()) {
    case -717700979:
    return grades.examresults.examresult.Mapping__0.class;case -717700979:
    return grades.examresults.examresult.Mapping__1.class;
    }
    return super.getMappingClass(code);
  }
  
  private final StudentProperty Student = new grades.examresults.examresult.StudentProperty();
  
  private final AcademicGradeProperty AcademicGrade = new grades.examresults.examresult.AcademicGradeProperty();
  
  private final SubjectProperty Subject = new grades.examresults.examresult.SubjectProperty();
  
  private final TeacherProperty Teacher = new grades.examresults.examresult.TeacherProperty();
  
  private final ExamProperty Exam = new grades.examresults.examresult.ExamProperty();
  
  private final CalificationProperty Calification = new grades.examresults.examresult.CalificationProperty();
  
  private final DateProperty Date = new grades.examresults.examresult.DateProperty();
  
  private final MistakesProperty Mistakes = new grades.examresults.examresult.MistakesProperty();
  
  private final CorrectionsProperty Corrections = new grades.examresults.examresult.CorrectionsProperty();
  
  private final ObservationsProperty Observations = new grades.examresults.examresult.ObservationsProperty();
}
