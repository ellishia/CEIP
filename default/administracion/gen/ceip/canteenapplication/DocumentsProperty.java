package ceip.canteenapplication;

import org.monet.metamodel.FileFieldProperty;

@SuppressWarnings("all")
public class DocumentsProperty extends FileFieldProperty {
  public DocumentsProperty() {
    super();this._code = "mybm40g";
    this._name = "Documents";
    this._label = "Documentación Adjunta";
    this.setIsMultiple(true);
    
  }
  
  public static String static_getName() {
    return "Documents";
  }
}
