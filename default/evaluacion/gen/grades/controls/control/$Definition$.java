package grades.controls.control;

import grades.controls.control.AcademicGradeProperty;
import grades.controls.control.DateProperty;
import grades.controls.control.DiaryControlProperty;
import grades.controls.control.SubjectProperty;
import grades.controls.control.TeacherProperty;
import org.monet.metamodel.FormDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;
import org.monet.metamodel.interfaces.HasMappings;

@SuppressWarnings("all")
public class $Definition$ extends FormDefinition implements HasBehaviour, HasClientBehaviour, HasMappings {
  public $Definition$() {
    super();this._code = "m2sdlba";
    this._name = "grades.Controls.Control";
    this._isAbstract = null;this._label = "Control";
    this.addSectionFieldProperty(DiaryControl);
    this.addSelectFieldProperty(Subject);
    this.addSelectFieldProperty(AcademicGrade);
    this.addSelectFieldProperty(Teacher);
    this.addDateFieldProperty(Date);
    org.monet.metamodel.FormDefinition.MappingProperty mappingProperty6 = new org.monet.metamodel.FormDefinition.MappingProperty();
    mappingProperty6.setIndex(new org.monet.metamodel.internal.Ref("grades.Controls.Indice"));
    this.getMappingList().add(mappingProperty6);
    org.monet.metamodel.FormDefinition.MappingProperty mappingProperty8 = new org.monet.metamodel.FormDefinition.MappingProperty();
    mappingProperty8.setIndex(new org.monet.metamodel.internal.Ref("grades.ContinuosEvaluation.Index"));
    this.getMappingList().add(mappingProperty8);
    org.monet.metamodel.FormDefinition.FormViewProperty formViewProperty10 = new org.monet.metamodel.FormDefinition.FormViewProperty();
    formViewProperty10.setLabel("Ficha");
    formViewProperty10.setCode("adfa");
    org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty showProperty11 = new org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty();
    showProperty11.getField().add(new org.monet.metamodel.internal.Ref("Subject","grades.Controls.Control","grades.Controls.Control.Subject"));
    showProperty11.getField().add(new org.monet.metamodel.internal.Ref("Teacher","grades.Controls.Control","grades.Controls.Control.Teacher"));
    showProperty11.getField().add(new org.monet.metamodel.internal.Ref("AcademicGrade","grades.Controls.Control","grades.Controls.Control.AcademicGrade"));
    showProperty11.getField().add(new org.monet.metamodel.internal.Ref("Date","grades.Controls.Control","grades.Controls.Control.Date"));
    showProperty11.getField().add(new org.monet.metamodel.internal.Ref("DiaryControl","grades.Controls.Control","grades.Controls.Control.DiaryControl"));
    formViewProperty10.setShow(showProperty11);
    this.addView(formViewProperty10);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(grades.controls.control.$Definition$.class,"grades.Controls.Control",null);
  }
  }
  
  public static String static_getName() {
    return "Control";
  }
  
  public Class<?> getBehaviourClass() {
    return grades.controls.Control.class;
  }
  
  public String getClientBehaviour() {
    return "var m2sdlba = new Object();m2sdlba.refresh = function (node) {if (!node.isEditable()) return;};m2sdlba.onChangeField = function (node, field) {};";
  }
  
  public Class<?> getMappingClass(final String code) {
    switch(code.hashCode()) {
    case -717700979:
    return grades.controls.control.Mapping__0.class;case -717700979:
    return grades.controls.control.Mapping__1.class;
    }
    return super.getMappingClass(code);
  }
  
  private final DiaryControlProperty DiaryControl = new grades.controls.control.DiaryControlProperty();
  
  private final SubjectProperty Subject = new grades.controls.control.SubjectProperty();
  
  private final AcademicGradeProperty AcademicGrade = new grades.controls.control.AcademicGradeProperty();
  
  private final TeacherProperty Teacher = new grades.controls.control.TeacherProperty();
  
  private final DateProperty Date = new grades.controls.control.DateProperty();
}
