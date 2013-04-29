package ceip.manifest;

@SuppressWarnings("all")
public class Manifest extends org.monet.metamodel.Manifest {
  public Manifest() {
    super();this._name = "administracion";
    this._title = "administracion";
    this._subtitle = "Description";
    this._version = "1.0.0";
    this._type = org.monet.metamodel.ManifestBase.TypeEnumeration.BACK;
    this._author = "askerosi";
    
  }
  
  public String getMetamodelVersion() {
    return "3.0";
  }
}
