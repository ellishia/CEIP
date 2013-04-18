package grades.examresults.examresult;

import org.monet.metamodel.LinkFieldProperty;

public class StudentProperty extends LinkFieldProperty {
  public StudentProperty() {
    super();this._code = "msrpifa";
    this._name = "Student";
    this._label = "Alumno/a";
    org.monet.metamodel.LinkFieldProperty.SourceProperty sourceProperty1 = new org.monet.metamodel.LinkFieldProperty.SourceProperty();
    sourceProperty1.setIndex(new org.monet.metamodel.internal.Ref("grades.Students.Index"));
    this.setSource(sourceProperty1);
    
  }
  
  public static String static_getName() {
    return "Student";
  }
}
