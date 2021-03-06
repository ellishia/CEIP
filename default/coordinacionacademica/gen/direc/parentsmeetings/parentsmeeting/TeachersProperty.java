package direc.parentsmeetings.parentsmeeting;

import org.monet.metamodel.LinkFieldProperty;

@SuppressWarnings("all")
public class TeachersProperty extends LinkFieldProperty {
  public TeachersProperty() {
    super();this._code = "mn87_ua";
    this._name = "Teachers";
    this.setIsMultiple(true);
    this._label = "Docentes";
    org.monet.metamodel.LinkFieldProperty.SourceProperty sourceProperty2 = new org.monet.metamodel.LinkFieldProperty.SourceProperty();
    sourceProperty2.setIndex(new org.monet.metamodel.internal.Ref("direc.Teachers.Indice"));
    this.setSource(sourceProperty2);
    
  }
  
  public static String static_getName() {
    return "Teachers";
  }
}
