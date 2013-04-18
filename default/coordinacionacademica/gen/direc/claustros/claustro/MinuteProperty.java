package direc.claustros.claustro;

import org.monet.metamodel.LinkFieldProperty;

@SuppressWarnings("all")
public class MinuteProperty extends LinkFieldProperty {
  public MinuteProperty() {
    super();this._code = "mkdxtta";
    this._name = "Minute";
    this._label = "Acta";
    this.setAllowAdd(true);
    org.monet.metamodel.LinkFieldProperty.SourceProperty sourceProperty2 = new org.monet.metamodel.LinkFieldProperty.SourceProperty();
    sourceProperty2.setIndex(new org.monet.metamodel.internal.Ref("direc.Minutes.Indice"));
    this.setSource(sourceProperty2);
    
  }
  
  public static String static_getName() {
    return "Minute";
  }
}
