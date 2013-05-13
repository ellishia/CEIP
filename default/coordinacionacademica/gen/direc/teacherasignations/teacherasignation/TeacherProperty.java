package direc.teacherasignations.teacherasignation;

import org.monet.metamodel.LinkFieldProperty;

@SuppressWarnings("all")
public class TeacherProperty extends LinkFieldProperty {
  public TeacherProperty() {
    super();this._code = "mmf1h9w";
    this._name = "Teacher";
    this._label = "Docente";
    org.monet.metamodel.LinkFieldProperty.SourceProperty sourceProperty1 = new org.monet.metamodel.LinkFieldProperty.SourceProperty();
    sourceProperty1.setIndex(new org.monet.metamodel.internal.Ref("direc.Teachers.Indice"));
    sourceProperty1.setCollection(new org.monet.metamodel.internal.Ref("direc.Teachers"));
    this.setSource(sourceProperty1);
    
  }
  
  public static String static_getName() {
    return "Teacher";
  }
}
