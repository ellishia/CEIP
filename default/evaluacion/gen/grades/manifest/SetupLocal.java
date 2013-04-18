package grades.manifest;

import grades.manifest.Manifest;

public class SetupLocal extends Manifest {
  public SetupLocal() {
    super();this._name = "evaluacion";
    this._title = "Gestión de Evaluación";
    this._subtitle = "Gestión de Evaluación";
    this._deployUri = java.net.URI.create("http://10.230.140.157:8090/evaluacion");
    org.monet.metamodel.Setup.FederationProperty federationProperty3 = new org.monet.metamodel.Setup.FederationProperty();
    federationProperty3.setSocketUri(java.net.URI.create("socket://localhost:5346/"));
    federationProperty3.setSecret("1234");
    this.setFederation(federationProperty3);
    org.monet.metamodel.Setup.CreateUserRoleProperty createUserRoleProperty6 = new org.monet.metamodel.Setup.CreateUserRoleProperty();
    createUserRoleProperty6.setUsername("Tutor");
    createUserRoleProperty6.getRole().add(new org.monet.metamodel.internal.Ref("grades.shared.Tutors"));
    this.getCreateUserRoleList().add(createUserRoleProperty6);
    org.monet.metamodel.Setup.CreateUserRoleProperty createUserRoleProperty9 = new org.monet.metamodel.Setup.CreateUserRoleProperty();
    createUserRoleProperty9.setUsername("Docente");
    createUserRoleProperty9.getRole().add(new org.monet.metamodel.internal.Ref("grades.shared.Teacher"));
    this.getCreateUserRoleList().add(createUserRoleProperty9);
    
  }
}
