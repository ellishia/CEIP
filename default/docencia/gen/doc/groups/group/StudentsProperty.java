package doc.groups.group;

import org.monet.metamodel.LinkFieldProperty;

@SuppressWarnings("all")
public class StudentsProperty extends LinkFieldProperty {
  public StudentsProperty() {
    super();this._code = "myockva";
    this._name = "Students";
    this._label = "Alumno/as";
    this.setIsMultiple(true);
    org.monet.metamodel.LinkFieldProperty.SourceProperty sourceProperty2 = new org.monet.metamodel.LinkFieldProperty.SourceProperty();
    sourceProperty2.setIndex(new org.monet.metamodel.internal.Ref("doc.Alumnado.Indice"));
    this.setSource(sourceProperty2);
    
  }
  
  public static String static_getName() {
    return "Students";
  }
}
