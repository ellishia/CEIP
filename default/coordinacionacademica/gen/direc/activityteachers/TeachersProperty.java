package direc.activityteachers;

import org.monet.metamodel.LinkFieldProperty;

@SuppressWarnings("all")
public class TeachersProperty extends LinkFieldProperty {
  public TeachersProperty() {
    super();this._code = "mil2x0a";
    this._name = "Teachers";
    this._label = "Docente";
    this.setIsMultiple(true);
    org.monet.metamodel.LinkFieldProperty.SourceProperty sourceProperty2 = new org.monet.metamodel.LinkFieldProperty.SourceProperty();
    sourceProperty2.setIndex(new org.monet.metamodel.internal.Ref("direc.Teachers.Indice"));
    this.setSource(sourceProperty2);
    
  }
  
  public static String static_getName() {
    return "Teachers";
  }
}
