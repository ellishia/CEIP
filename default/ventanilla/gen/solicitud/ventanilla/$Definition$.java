package solicitud.ventanilla;

import org.monet.metamodel.DesktopDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends DesktopDefinition implements HasBehaviour, HasClientBehaviour {
  public $Definition$() {
    super();this._code = "mpwmfyg";
    this._name = "solicitud.Ventanilla";
    this._isAbstract = null;this._label = "Ventanilla";
    this.setIsSingleton(true);
    org.monet.metamodel.DesktopDefinition.ForProperty forProperty2 = new org.monet.metamodel.DesktopDefinition.ForProperty();
    forProperty2.setRole(new org.monet.metamodel.internal.Ref("solicitud.shared.Padre"));
    this.setFor(forProperty2);
    org.monet.metamodel.DesktopDefinition.ViewProperty viewProperty4 = new org.monet.metamodel.DesktopDefinition.ViewProperty();
    viewProperty4.setLabel("Solicitudes de Plaza");
    viewProperty4.setCode("u");
    org.monet.metamodel.DesktopDefinition.ViewProperty.ShowProperty showProperty5 = new org.monet.metamodel.DesktopDefinition.ViewProperty.ShowProperty();
    showProperty5.getLink().add(new org.monet.metamodel.internal.Ref("solicitud.Applications"));
    viewProperty4.setShow(showProperty5);
    viewProperty4.setIsDefault(true);
    this.addView(viewProperty4);
    org.monet.metamodel.DesktopDefinition.ViewProperty viewProperty9 = new org.monet.metamodel.DesktopDefinition.ViewProperty();
    viewProperty9.setLabel("Solicitudes de Servicios");
    viewProperty9.setCode("t");
    org.monet.metamodel.DesktopDefinition.ViewProperty.ShowProperty showProperty10 = new org.monet.metamodel.DesktopDefinition.ViewProperty.ShowProperty();
    showProperty10.getLink().add(new org.monet.metamodel.internal.Ref("solicitud.ServiceApplications"));
    viewProperty9.setShow(showProperty10);
    this.addView(viewProperty9);
    org.monet.metamodel.DesktopDefinition.ViewProperty viewProperty13 = new org.monet.metamodel.DesktopDefinition.ViewProperty();
    viewProperty13.setLabel("Periodos y Fechas Importantes");
    viewProperty13.setCode("m_3nypg");
    org.monet.metamodel.DesktopDefinition.ViewProperty.ShowProperty showProperty14 = new org.monet.metamodel.DesktopDefinition.ViewProperty.ShowProperty();
    showProperty14.getLink().add(new org.monet.metamodel.internal.Ref("solicitud.RegistrationPeriod"));
    viewProperty13.setShow(showProperty14);
    this.addView(viewProperty13);
    org.monet.metamodel.DesktopDefinition.ViewProperty viewProperty17 = new org.monet.metamodel.DesktopDefinition.ViewProperty();
    viewProperty17.setLabel("Tareas y Roles");
    viewProperty17.setCode("mmwxj3q");
    org.monet.metamodel.DesktopDefinition.ViewProperty.ShowProperty showProperty18 = new org.monet.metamodel.DesktopDefinition.ViewProperty.ShowProperty();
    org.monet.metamodel.DesktopDefinition.ViewProperty.ShowProperty.LinkRolesProperty linkRolesProperty18 = new org.monet.metamodel.DesktopDefinition.ViewProperty.ShowProperty.LinkRolesProperty();
    showProperty18.setLinkRoles(linkRolesProperty18);
    org.monet.metamodel.DesktopDefinition.ViewProperty.ShowProperty.LinkTaskboardProperty linkTaskboardProperty19 = new org.monet.metamodel.DesktopDefinition.ViewProperty.ShowProperty.LinkTaskboardProperty();
    showProperty18.setLinkTaskboard(linkTaskboardProperty19);
    viewProperty17.setShow(showProperty18);
    this.addView(viewProperty17);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(solicitud.ventanilla.$Definition$.class,"solicitud.Ventanilla",null);
  }
  }
  
  public static String static_getName() {
    return "Ventanilla";
  }
  
  public Class<?> getBehaviourClass() {
    return solicitud.Ventanilla.class;
  }
  
  public String getClientBehaviour() {
    return "var mpwmfyg = new Object();mpwmfyg.refresh = function (node) {if (!node.isEditable()) return;};mpwmfyg.onChangeField = function (node, field) {};";
  }
}
