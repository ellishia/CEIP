package doc.incidents.incident;

import org.monet.metamodel.LinkFieldProperty;

@SuppressWarnings("all")
public class StudentProperty extends LinkFieldProperty {
  public StudentProperty() {
    super();this._code = "mrzfemw";
    this._name = "Student";
    this._label = "Alumno/a";
    this.setIsMultiple(true);
    org.monet.metamodel.LinkFieldProperty.SourceProperty sourceProperty2 = new org.monet.metamodel.LinkFieldProperty.SourceProperty();
    sourceProperty2.setIndex(new org.monet.metamodel.internal.Ref("doc.Alumnado.Indice"));
    this.setSource(sourceProperty2);
    
  }
  
  public static String static_getName() {
    return "Student";
  }
}
