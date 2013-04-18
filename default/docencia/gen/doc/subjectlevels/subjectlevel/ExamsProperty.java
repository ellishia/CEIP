package doc.subjectlevels.subjectlevel;

import org.monet.metamodel.LinkFieldProperty;

@SuppressWarnings("all")
public class ExamsProperty extends LinkFieldProperty {
  public ExamsProperty() {
    super();this._code = "mj11zra";
    this._name = "Exams";
    this._label = "Exámenes";
    this.setIsMultiple(true);
    org.monet.metamodel.LinkFieldProperty.SourceProperty sourceProperty2 = new org.monet.metamodel.LinkFieldProperty.SourceProperty();
    sourceProperty2.setIndex(new org.monet.metamodel.internal.Ref("doc.Exams.Indice"));
    this.setSource(sourceProperty2);
    
  }
  
  public static String static_getName() {
    return "Exams";
  }
}
