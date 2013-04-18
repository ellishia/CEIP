package nopackage.manifest;

import nopackage.manifest.Manifest;

@SuppressWarnings("all")
public class SetupLocal extends Manifest {
  public SetupLocal() {
    super();this._name = "ventanilla";
    this._title = "Ventanilla Administrativa del Centro";
    this._subtitle = "Ventanilla";
    org.monet.metamodel.Setup.SpaceProperty spaceProperty2 = new org.monet.metamodel.Setup.SpaceProperty();
    spaceProperty2.setDeployUri(java.net.URI.create("http://192.168.1.33:8090/ventanilla"));
    spaceProperty2.setName("ventanilla");
    this.setSpace(spaceProperty2);
    org.monet.metamodel.Setup.FederationProperty federationProperty4 = new org.monet.metamodel.Setup.FederationProperty();
    federationProperty4.setSocketUri(java.net.URI.create("socket://localhost:5346/"));
    federationProperty4.setSecret("1234");
    this.setFederation(federationProperty4);
    org.monet.metamodel.Setup.AssignRoleProperty assignRoleProperty7 = new org.monet.metamodel.Setup.AssignRoleProperty();
    assignRoleProperty7.setUser("Padre/Madre");
    assignRoleProperty7.getRole().add(new org.monet.metamodel.internal.Ref("solicitud.shared.Padre"));
    this.getAssignRoleList().add(assignRoleProperty7);
    
  }
}
