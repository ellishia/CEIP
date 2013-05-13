package nopackage.manifest;

import nopackage.manifest.Manifest;

@SuppressWarnings("all")
public class SetupUni extends Manifest {
  public SetupUni() {
    super();this._name = "administracion";
    this._title = "Administración del Centro";
    this._subtitle = "Administración de CEIP";
    org.monet.metamodel.Setup.SpaceProperty spaceProperty2 = new org.monet.metamodel.Setup.SpaceProperty();
    spaceProperty2.setDeployUri(java.net.URI.create("http://10.230.140.157:8090/administracion"));
    spaceProperty2.setName("administracion");
    this.setSpace(spaceProperty2);
    org.monet.metamodel.Setup.FederationProperty federationProperty4 = new org.monet.metamodel.Setup.FederationProperty();
    federationProperty4.setSocketUri(java.net.URI.create("socket://localhost:5346/"));
    federationProperty4.setSecret("1234");
    this.setFederation(federationProperty4);
    org.monet.metamodel.Setup.AssignRoleProperty assignRoleProperty7 = new org.monet.metamodel.Setup.AssignRoleProperty();
    assignRoleProperty7.setUser("Secretaria");
    assignRoleProperty7.getRole().add(new org.monet.metamodel.internal.Ref("ceip.shared.Administrador"));
    this.getAssignRoleList().add(assignRoleProperty7);
    org.monet.metamodel.Setup.PublishProperty publishProperty10 = new org.monet.metamodel.Setup.PublishProperty();
    publishProperty10.getService().add(new org.monet.metamodel.internal.Ref("ceip.procesos.RecibirSolicitudPlaza"));
    publishProperty10.getSource().add(new org.monet.metamodel.internal.Ref("ceip.shared.AcademicYears"));
    publishProperty10.getSource().add(new org.monet.metamodel.internal.Ref("ceip.shared.AcademicHours"));
    publishProperty10.getSource().add(new org.monet.metamodel.internal.Ref("ceip.shared.Levels"));
    publishProperty10.getSource().add(new org.monet.metamodel.internal.Ref("ceip.shared.Trimester"));
    publishProperty10.getSource().add(new org.monet.metamodel.internal.Ref("ceip.shared.CivilState"));
    publishProperty10.getSource().add(new org.monet.metamodel.internal.Ref("ceip.shared.PersonalRelation"));
    publishProperty10.getSource().add(new org.monet.metamodel.internal.Ref("ceip.shared.PhoneType"));
    publishProperty10.getSource().add(new org.monet.metamodel.internal.Ref("ceip.shared.WorkSituation"));
    publishProperty10.getSource().add(new org.monet.metamodel.internal.Ref("ceip.shared.StudiesLevel"));
    org.monet.metamodel.Setup.PublishProperty.FederationProperty federationProperty10 = new org.monet.metamodel.Setup.PublishProperty.FederationProperty();
    federationProperty10.setSetupUri(java.net.URI.create("http://10.230.140.157:8090/federation"));
    publishProperty10.setFederation(federationProperty10);
    this.getPublishList().add(publishProperty10);
    
  }
}
