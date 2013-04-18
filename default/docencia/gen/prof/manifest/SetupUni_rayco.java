package prof.manifest;

import prof.manifest.Manifest;

@SuppressWarnings("all")
public class SetupUni_rayco extends Manifest {
  public SetupUni_rayco() {
    super();this._name = "docencia";
    this._title = "Gestión Docente";
    this._subtitle = "Gestión Docente";
    org.monet.metamodel.Setup.SpaceProperty spaceProperty2 = new org.monet.metamodel.Setup.SpaceProperty();
    spaceProperty2.setDeployUri(java.net.URI.create("http://10.13.13.191:8091/docencia"));
    spaceProperty2.setName("docencia");
    this.setSpace(spaceProperty2);
    org.monet.metamodel.Setup.FederationProperty federationProperty4 = new org.monet.metamodel.Setup.FederationProperty();
    federationProperty4.setSocketUri(java.net.URI.create("socket://localhost:5346/"));
    federationProperty4.setSecret("1234");
    this.setFederation(federationProperty4);
    org.monet.metamodel.Setup.AssignRoleProperty assignRoleProperty7 = new org.monet.metamodel.Setup.AssignRoleProperty();
    assignRoleProperty7.setUser("Secretaria");
    assignRoleProperty7.getRole().add(new org.monet.metamodel.internal.Ref("doc.shared.Administrador"));
    this.getAssignRoleList().add(assignRoleProperty7);
    org.monet.metamodel.Setup.AssignRoleProperty assignRoleProperty10 = new org.monet.metamodel.Setup.AssignRoleProperty();
    assignRoleProperty10.setUser("Docente");
    assignRoleProperty10.getRole().add(new org.monet.metamodel.internal.Ref("doc.shared.Docente"));
    this.getAssignRoleList().add(assignRoleProperty10);
    org.monet.metamodel.Setup.PublishProperty publishProperty13 = new org.monet.metamodel.Setup.PublishProperty();
    publishProperty13.getService().add(new org.monet.metamodel.internal.Ref("doc.procesos.StudentTransfer"));
    publishProperty13.getSource().add(new org.monet.metamodel.internal.Ref("doc.shared.Areas"));
    org.monet.metamodel.Setup.PublishProperty.FederationProperty federationProperty13 = new org.monet.metamodel.Setup.PublishProperty.FederationProperty();
    federationProperty13.setSetupUri(java.net.URI.create("http://10.13.13.191:8091/empresa"));
    publishProperty13.setFederation(federationProperty13);
    this.getPublishList().add(publishProperty13);
    
  }
}
