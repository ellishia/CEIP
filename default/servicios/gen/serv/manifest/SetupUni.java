package serv.manifest;

import serv.manifest.Manifest;

@SuppressWarnings("all")
public class SetupUni extends Manifest {
  public SetupUni() {
    super();this._name = "servicios";
    this._title = "Gestión de Servicios";
    this._subtitle = "Gestión de Servicios";
    org.monet.metamodel.Setup.SpaceProperty spaceProperty2 = new org.monet.metamodel.Setup.SpaceProperty();
    spaceProperty2.setDeployUri(java.net.URI.create("http://10.230.140.157:8092/servicios"));
    spaceProperty2.setName("servicios");
    this.setSpace(spaceProperty2);
    org.monet.metamodel.Setup.FederationProperty federationProperty4 = new org.monet.metamodel.Setup.FederationProperty();
    federationProperty4.setSocketUri(java.net.URI.create("socket://localhost:5346/"));
    federationProperty4.setSecret("1234");
    this.setFederation(federationProperty4);
    org.monet.metamodel.Setup.AssignRoleProperty assignRoleProperty7 = new org.monet.metamodel.Setup.AssignRoleProperty();
    assignRoleProperty7.setUser("Secretaria");
    assignRoleProperty7.getRole().add(new org.monet.metamodel.internal.Ref("serv.shared.Manager"));
    this.getAssignRoleList().add(assignRoleProperty7);
    
  }
}
