package serv.manifest;

@SuppressWarnings("all")
public class Manifest extends org.monet.metamodel.Manifest {
  public Manifest() {
    super();this._name = "servicios";
    this._title = "servicios";
    this._subtitle = "servicios";
    this._version = "1.0.0";
    this._type = org.monet.metamodel.ManifestBase.TypeEnumeration.BACK;
    this._author = "eowens";
    
  }
  
  public String getMetamodelVersion() {
    return "3.0";
  }
}
