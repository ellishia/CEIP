package doc.absences.absence;

import org.monet.metamodel.LinkFieldProperty;

@SuppressWarnings("all")
public class StudentProperty extends LinkFieldProperty {
  public StudentProperty() {
    super();this._code = "mqglzka";
    this._name = "Student";
    this._label = "Alumno/a";
    org.monet.metamodel.LinkFieldProperty.SourceProperty sourceProperty1 = new org.monet.metamodel.LinkFieldProperty.SourceProperty();
    sourceProperty1.setIndex(new org.monet.metamodel.internal.Ref("doc.Alumnado.Indice"));
    this.setSource(sourceProperty1);
    
  }
  
  public static String static_getName() {
    return "Student";
  }
}
