package grades.examresults.indice;

import grades.examresults.indice.DateProperty;
import grades.examresults.indice.GroupProperty;
import grades.examresults.indice.SubjectProperty;
import grades.examresults.indice.TeacherProperty;
import org.monet.metamodel.IndexDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends IndexDefinition implements HasBehaviour, HasClientBehaviour {
  public $Definition$() {
    super();this._code = "imfeyeig";
    this._name = "grades.ExamResults.Indice";
    this._isAbstract = null;this._label = "Indice";
    org.monet.metamodel.IndexDefinition.ReferenceProperty referenceProperty1 = new org.monet.metamodel.IndexDefinition.ReferenceProperty();
    referenceProperty1.addAttributeProperty(Subject);
    referenceProperty1.addAttributeProperty(Group);
    referenceProperty1.addAttributeProperty(Teacher);
    referenceProperty1.addAttributeProperty(Date);
    this.setReference(referenceProperty1);
    org.monet.metamodel.IndexDefinition.IndexViewProperty indexViewProperty6 = new org.monet.metamodel.IndexDefinition.IndexViewProperty();
    indexViewProperty6.setCode("i");
    indexViewProperty6.setName("Normal");
    org.monet.metamodel.IndexDefinition.IndexViewProperty.ShowProperty showProperty6 = new org.monet.metamodel.IndexDefinition.IndexViewProperty.ShowProperty();
    showProperty6.getLine().add(new org.monet.metamodel.internal.Ref("Subject","grades.ExamResults.Indice","grades.ExamResults.Indice.Subject"));
    showProperty6.getLine().add(new org.monet.metamodel.internal.Ref("Group","grades.ExamResults.Indice","grades.ExamResults.Indice.Group"));
    showProperty6.getLine().add(new org.monet.metamodel.internal.Ref("Teacher","grades.ExamResults.Indice","grades.ExamResults.Indice.Teacher"));
    showProperty6.getLine().add(new org.monet.metamodel.internal.Ref("Date","grades.ExamResults.Indice","grades.ExamResults.Indice.Date"));
    indexViewProperty6.setShow(showProperty6);
    this.addView(indexViewProperty6);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(grades.examresults.indice.$Definition$.class,"grades.ExamResults.Indice",null);
  }
  }
  
  public static String static_getName() {
    return "Indice";
  }
  
  public Class<?> getBehaviourClass() {
    return grades.examresults.Indice.class;
  }
  
  public String getClientBehaviour() {
    return "var imfeyeig = new Object();imfeyeig.refresh = function (node) {if (!node.isEditable()) return;};imfeyeig.onChangeField = function (node, field) {};";
  }
  
  private final SubjectProperty Subject = new grades.examresults.indice.SubjectProperty();
  
  private final GroupProperty Group = new grades.examresults.indice.GroupProperty();
  
  private final TeacherProperty Teacher = new grades.examresults.indice.TeacherProperty();
  
  private final DateProperty Date = new grades.examresults.indice.DateProperty();
}
