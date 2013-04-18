package grades.trimestralevaluations.indice;

import grades.trimestralevaluations.indice.AcademicYearProperty;
import grades.trimestralevaluations.indice.GroupProperty;
import grades.trimestralevaluations.indice.TeacherProperty;
import org.monet.metamodel.IndexDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;

public class $Definition$ extends IndexDefinition implements HasBehaviour, HasClientBehaviour {
  public $Definition$() {
    super();this._code = "imfeyeig";
    this._name = "grades.TrimestralEvaluations.Indice";
    this._isAbstract = null;this._label = "Indice";
    org.monet.metamodel.IndexDefinition.ReferenceProperty referenceProperty1 = new org.monet.metamodel.IndexDefinition.ReferenceProperty();
    referenceProperty1.addAttributeProperty(AcademicYear);
    referenceProperty1.addAttributeProperty(Group);
    referenceProperty1.addAttributeProperty(Teacher);
    this.setReference(referenceProperty1);
    org.monet.metamodel.IndexDefinition.IndexViewProperty indexViewProperty5 = new org.monet.metamodel.IndexDefinition.IndexViewProperty();
    indexViewProperty5.setCode("m5b7kcq");
    indexViewProperty5.setName("Normal");
    org.monet.metamodel.IndexDefinition.IndexViewProperty.ShowProperty showProperty5 = new org.monet.metamodel.IndexDefinition.IndexViewProperty.ShowProperty();
    showProperty5.getLine().add(new org.monet.metamodel.internal.Ref("AcademicYear","grades.TrimestralEvaluations.Indice","grades.TrimestralEvaluations.Indice.AcademicYear"));
    showProperty5.getLine().add(new org.monet.metamodel.internal.Ref("Group","grades.TrimestralEvaluations.Indice","grades.TrimestralEvaluations.Indice.Group"));
    showProperty5.getLine().add(new org.monet.metamodel.internal.Ref("Teacher","grades.TrimestralEvaluations.Indice","grades.TrimestralEvaluations.Indice.Teacher"));
    indexViewProperty5.setShow(showProperty5);
    this.addView(indexViewProperty5);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(grades.trimestralevaluations.indice.$Definition$.class,"grades.TrimestralEvaluations.Indice",null);
  }
  }
  
  public static String static_getName() {
    return "Indice";
  }
  
  public Class<?> getBehaviourClass() {
    return grades.trimestralevaluations.Indice.class;
  }
  
  public String getClientBehaviour() {
    return "var imfeyeig = new Object();imfeyeig.refresh = function (node) {if (!node.isEditable()) return;};imfeyeig.onChangeField = function (node, field) {};";
  }
  
  private final AcademicYearProperty AcademicYear = new grades.trimestralevaluations.indice.AcademicYearProperty();
  
  private final GroupProperty Group = new grades.trimestralevaluations.indice.GroupProperty();
  
  private final TeacherProperty Teacher = new grades.trimestralevaluations.indice.TeacherProperty();
}
