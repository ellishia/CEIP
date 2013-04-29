package grades.controls.control;

import grades.controls.control.diarycontrol.GradeProperty;
import grades.controls.control.diarycontrol.StudentProperty;
import org.monet.metamodel.SectionFieldProperty;
import org.monet.metamodel.interfaces.HasBehaviour;

@SuppressWarnings("all")
public class DiaryControlProperty extends SectionFieldProperty implements HasBehaviour {
  public DiaryControlProperty() {
    super();this._code = "mh_i1bg";
    this._name = "DiaryControl";
    this._label = "Control Diario";
    this.setIsMultiple(true);
    this.addNumberFieldProperty(Grade);
    this.addLinkFieldProperty(Student);
    
  }
  
  public Class<?> getBehaviourClass() {
    return grades.controls.control.DiaryControl.class;
  }
  
  public static String static_getName() {
    return "DiaryControl";
  }
  
  private final GradeProperty Grade = new grades.controls.control.diarycontrol.GradeProperty();
  
  private final StudentProperty Student = new grades.controls.control.diarycontrol.StudentProperty();
}
