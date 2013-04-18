package direc.evaluationsesions.evaluationsesion;

import org.monet.metamodel.LinkFieldProperty;

@SuppressWarnings("all")
public class TeachersProperty extends LinkFieldProperty {
  public TeachersProperty() {
    super();this._code = "m5pv79w";
    this._name = "Teachers";
    this._label = "Docentes";
    this.setIsMultiple(true);
    org.monet.metamodel.LinkFieldProperty.SourceProperty sourceProperty2 = new org.monet.metamodel.LinkFieldProperty.SourceProperty();
    sourceProperty2.setIndex(new org.monet.metamodel.internal.Ref("direc.Teachers.Indice"));
    this.setSource(sourceProperty2);
    
  }
  
  public static String static_getName() {
    return "Teachers";
  }
}
