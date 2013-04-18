package grades.controls.indice;

import grades.controls.indice.DateProperty;
import grades.controls.indice.GroupProperty;
import grades.controls.indice.SubjectProperty;
import grades.controls.indice.TeacherProperty;
import org.monet.metamodel.IndexDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;

public class $Definition$ extends IndexDefinition implements HasBehaviour, HasClientBehaviour {
  public $Definition$() {
    super();this._code = "imfeyeig";
    this._name = "grades.Controls.Indice";
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
    showProperty6.getLine().add(new org.monet.metamodel.internal.Ref("Subject","grades.Controls.Indice","grades.Controls.Indice.Subject"));
    showProperty6.getLine().add(new org.monet.metamodel.internal.Ref("Group","grades.Controls.Indice","grades.Controls.Indice.Group"));
    showProperty6.getLine().add(new org.monet.metamodel.internal.Ref("Teacher","grades.Controls.Indice","grades.Controls.Indice.Teacher"));
    showProperty6.getLine().add(new org.monet.metamodel.internal.Ref("Date","grades.Controls.Indice","grades.Controls.Indice.Date"));
    indexViewProperty6.setShow(showProperty6);
    this.addView(indexViewProperty6);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(grades.controls.indice.$Definition$.class,"grades.Controls.Indice",null);
  }
  }
  
  public static String static_getName() {
    return "Indice";
  }
  
  public Class<?> getBehaviourClass() {
    return grades.controls.Indice.class;
  }
  
  public String getClientBehaviour() {
    return "var imfeyeig = new Object();imfeyeig.refresh = function (node) {if (!node.isEditable()) return;};imfeyeig.onChangeField = function (node, field) {};";
  }
  
  private final SubjectProperty Subject = new grades.controls.indice.SubjectProperty();
  
  private final GroupProperty Group = new grades.controls.indice.GroupProperty();
  
  private final TeacherProperty Teacher = new grades.controls.indice.TeacherProperty();
  
  private final DateProperty Date = new grades.controls.indice.DateProperty();
}
