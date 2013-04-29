package direc.manifest;

import direc.manifest.Manifest;

@SuppressWarnings("all")
public class SetupUni extends Manifest {
  public SetupUni() {
    super();this._name = "coordinacionacademica";
    this._title = "Coordinación Académica";
    this._subtitle = "Coordinación Académica";
    org.monet.metamodel.Setup.SpaceProperty spaceProperty2 = new org.monet.metamodel.Setup.SpaceProperty();
    spaceProperty2.setDeployUri(java.net.URI.create("http://10.230.140.157:8091/coordinacionacademica"));
    spaceProperty2.setName("coordinacionacademica");
    this.setSpace(spaceProperty2);
    org.monet.metamodel.Setup.FederationProperty federationProperty4 = new org.monet.metamodel.Setup.FederationProperty();
    federationProperty4.setSocketUri(java.net.URI.create("socket://localhost:5346/"));
    federationProperty4.setSecret("1234");
    this.setFederation(federationProperty4);
    org.monet.metamodel.Setup.AssignRoleProperty assignRoleProperty7 = new org.monet.metamodel.Setup.AssignRoleProperty();
    assignRoleProperty7.setUser("Secretaria");
    assignRoleProperty7.getRole().add(new org.monet.metamodel.internal.Ref("direc.shared.Administrador"));
    this.getAssignRoleList().add(assignRoleProperty7);
    org.monet.metamodel.Setup.PublishProperty publishProperty10 = new org.monet.metamodel.Setup.PublishProperty();
    publishProperty10.getService().add(new org.monet.metamodel.internal.Ref("direc.procesos.StudentTransfer"));
    publishProperty10.getSource().add(new org.monet.metamodel.internal.Ref("direc.shared.Teachers"));
    org.monet.metamodel.Setup.PublishProperty.FederationProperty federationProperty10 = new org.monet.metamodel.Setup.PublishProperty.FederationProperty();
    federationProperty10.setSetupUri(java.net.URI.create("http://10.230.140.157:8091/federation"));
    publishProperty10.setFederation(federationProperty10);
    this.getPublishList().add(publishProperty10);
    
  }
}
