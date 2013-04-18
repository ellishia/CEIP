package grades.continuosevaluation.index;

import grades.continuosevaluation.index.DateProperty;
import grades.continuosevaluation.index.GroupProperty;
import grades.continuosevaluation.index.SubjectProperty;
import grades.continuosevaluation.index.TeacherProperty;
import org.monet.metamodel.IndexDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;

public class $Definition$ extends IndexDefinition implements HasBehaviour, HasClientBehaviour {
  public $Definition$() {
    super();this._code = "imfeyeig";
    this._name = "grades.ContinuosEvaluation.Index";
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
    showProperty6.getLine().add(new org.monet.metamodel.internal.Ref("Subject","grades.ContinuosEvaluation.Index","grades.ContinuosEvaluation.Index.Subject"));
    showProperty6.getLine().add(new org.monet.metamodel.internal.Ref("Group","grades.ContinuosEvaluation.Index","grades.ContinuosEvaluation.Index.Group"));
    showProperty6.getLine().add(new org.monet.metamodel.internal.Ref("Teacher","grades.ContinuosEvaluation.Index","grades.ContinuosEvaluation.Index.Teacher"));
    showProperty6.getLine().add(new org.monet.metamodel.internal.Ref("Date","grades.ContinuosEvaluation.Index","grades.ContinuosEvaluation.Index.Date"));
    indexViewProperty6.setShow(showProperty6);
    this.addView(indexViewProperty6);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(grades.continuosevaluation.index.$Definition$.class,"grades.ContinuosEvaluation.Index",null);
  }
  }
  
  public static String static_getName() {
    return "Index";
  }
  
  public Class<?> getBehaviourClass() {
    return grades.continuosevaluation.Index.class;
  }
  
  public String getClientBehaviour() {
    return "var imfeyeig = new Object();imfeyeig.refresh = function (node) {if (!node.isEditable()) return;};imfeyeig.onChangeField = function (node, field) {};";
  }
  
  private final SubjectProperty Subject = new grades.continuosevaluation.index.SubjectProperty();
  
  private final GroupProperty Group = new grades.continuosevaluation.index.GroupProperty();
  
  private final TeacherProperty Teacher = new grades.continuosevaluation.index.TeacherProperty();
  
  private final DateProperty Date = new grades.continuosevaluation.index.DateProperty();
}
