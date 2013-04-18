package solicitud.applicationinfo;

import org.monet.metamodel.FileFieldProperty;

@SuppressWarnings("all")
public class DocumentsProperty extends FileFieldProperty {
  public DocumentsProperty() {
    super();this._code = "mqtnfka";
    this._name = "Documents";
    this.setIsMultiple(true);
    this._label = "Adjuntos";
    
  }
  
  public static String static_getName() {
    return "Documents";
  }
}
