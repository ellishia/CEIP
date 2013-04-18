package ceip.califications.calification;

import org.monet.metamodel.LinkFieldProperty;

@SuppressWarnings("all")
public class StudentProperty extends LinkFieldProperty {
  public StudentProperty() {
    super();this._code = "mqlc1xq";
    this._name = "Student";
    this._label = "Alumno";
    org.monet.metamodel.LinkFieldProperty.SourceProperty sourceProperty1 = new org.monet.metamodel.LinkFieldProperty.SourceProperty();
    sourceProperty1.setIndex(new org.monet.metamodel.internal.Ref("ceip.Students.Index"));
    this.setSource(sourceProperty1);
    
  }
  
  public static String static_getName() {
    return "Student";
  }
}
