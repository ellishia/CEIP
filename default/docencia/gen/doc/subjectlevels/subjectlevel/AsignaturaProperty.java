package doc.subjectlevels.subjectlevel;

import org.monet.metamodel.LinkFieldProperty;

@SuppressWarnings("all")
public class AsignaturaProperty extends LinkFieldProperty {
  public AsignaturaProperty() {
    super();this._code = "msczy7g";
    this._name = "Asignatura";
    this._label = "Asignatura";
    this.setAllowAdd(true);
    org.monet.metamodel.LinkFieldProperty.SourceProperty sourceProperty2 = new org.monet.metamodel.LinkFieldProperty.SourceProperty();
    sourceProperty2.setIndex(new org.monet.metamodel.internal.Ref("doc.Subjects.Indice"));
    sourceProperty2.setCollection(new org.monet.metamodel.internal.Ref("doc.Subjects"));
    this.setSource(sourceProperty2);
    
  }
  
  public static String static_getName() {
    return "Asignatura";
  }
}
