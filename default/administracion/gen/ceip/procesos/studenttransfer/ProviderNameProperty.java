package ceip.procesos.studenttransfer;

import org.monet.metamodel.TaskProviderProperty;

@SuppressWarnings("all")
public class ProviderNameProperty extends TaskProviderProperty {
  public ProviderNameProperty() {
    super();this._code = "mkfjovw";
    this._name = "ProviderName";
    this._role = new org.monet.metamodel.internal.Ref("ceip.shared.Administrador");
    org.monet.metamodel.TaskProviderProperty.ExternalProperty externalProperty1 = new org.monet.metamodel.TaskProviderProperty.ExternalProperty();
    org.monet.metamodel.TaskProviderProperty.ExternalProperty.RequestProperty requestProperty1 = new org.monet.metamodel.TaskProviderProperty.ExternalProperty.RequestProperty();
    requestProperty1.setCode("Alumnado");
    requestProperty1.setName("Alumnado");
    externalProperty1.addRequest(requestProperty1);
    this.setExternal(externalProperty1);
    
  }
  
  public static String static_getName() {
    return "ProviderName";
  }
}
