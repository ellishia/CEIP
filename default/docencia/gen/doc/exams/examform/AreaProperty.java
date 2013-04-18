package doc.exams.examform;

import org.monet.metamodel.SelectFieldProperty;

@SuppressWarnings("all")
public class AreaProperty extends SelectFieldProperty {
  public AreaProperty() {
    super();this._code = "msckojq";
    this._name = "Area";
    this._label = "Área de Conocimiento";
    org.monet.metamodel.SelectFieldProperty.UseProperty useProperty1 = new org.monet.metamodel.SelectFieldProperty.UseProperty();
    useProperty1.setSource(new org.monet.metamodel.internal.Ref("doc.shared.Areas"));
    this.setUse(useProperty1);
    
  }
  
  public static String static_getName() {
    return "Area";
  }
}
