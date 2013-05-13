package ceip.centerinformation;

import org.monet.metamodel.FileFieldProperty;

@SuppressWarnings("all")
public class RequiredDocsProperty extends FileFieldProperty {
  public RequiredDocsProperty() {
    super();this._code = "mfig1_w";
    this._name = "RequiredDocs";
    this.setIsMultiple(true);
    this._label = "Documentos requiridos";
    
  }
  
  public static String static_getName() {
    return "RequiredDocs";
  }
}
