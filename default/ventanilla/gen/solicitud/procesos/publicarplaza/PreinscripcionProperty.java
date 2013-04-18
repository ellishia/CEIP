package solicitud.procesos.publicarplaza;

import org.monet.metamodel.TaskProviderProperty;

@SuppressWarnings("all")
public class PreinscripcionProperty extends TaskProviderProperty {
  public PreinscripcionProperty() {
    super();this._code = "mss03rg";
    this._name = "Preinscripcion";
    this._role = new org.monet.metamodel.internal.Ref("solicitud.shared.Padre");
    org.monet.metamodel.TaskProviderProperty.ExternalProperty externalProperty1 = new org.monet.metamodel.TaskProviderProperty.ExternalProperty();
    org.monet.metamodel.TaskProviderProperty.ExternalProperty.RequestProperty requestProperty1 = new org.monet.metamodel.TaskProviderProperty.ExternalProperty.RequestProperty();
    requestProperty1.setCode("Premat");
    requestProperty1.setName("Alumno");
    externalProperty1.addRequest(requestProperty1);
    org.monet.metamodel.TaskProviderProperty.ExternalProperty.ResponseProperty responseProperty4 = new org.monet.metamodel.TaskProviderProperty.ExternalProperty.ResponseProperty();
    responseProperty4.setCode("PrematCorrecta");
    responseProperty4.setName("Procesada");
    externalProperty1.addResponse(responseProperty4);
    this.setExternal(externalProperty1);
    
  }
  
  public static String static_getName() {
    return "Preinscripcion";
  }
}
