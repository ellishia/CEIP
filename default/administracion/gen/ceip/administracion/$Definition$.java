package ceip.administracion;

import org.monet.metamodel.DesktopDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends DesktopDefinition implements HasBehaviour, HasClientBehaviour {
  public $Definition$() {
    super();this._code = "mx_vlwg";
    this._name = "ceip.Administracion";
    this._isAbstract = null;this._label = "Administración";
    this.setIsSingleton(true);
    org.monet.metamodel.DesktopDefinition.ForProperty forProperty2 = new org.monet.metamodel.DesktopDefinition.ForProperty();
    forProperty2.setRole(new org.monet.metamodel.internal.Ref("ceip.shared.Administrador"));
    this.setFor(forProperty2);
    org.monet.metamodel.DesktopDefinition.ViewProperty viewProperty4 = new org.monet.metamodel.DesktopDefinition.ViewProperty();
    viewProperty4.setLabel("Gestion de Alumnos");
    viewProperty4.setCode("umympgha");
    org.monet.metamodel.DesktopDefinition.ViewProperty.ShowProperty showProperty5 = new org.monet.metamodel.DesktopDefinition.ViewProperty.ShowProperty();
    showProperty5.getLink().add(new org.monet.metamodel.internal.Ref("ceip.Students"));
    viewProperty4.setShow(showProperty5);
    viewProperty4.setIsDefault(true);
    this.addView(viewProperty4);
    org.monet.metamodel.DesktopDefinition.ViewProperty viewProperty9 = new org.monet.metamodel.DesktopDefinition.ViewProperty();
    viewProperty9.setLabel("Calificaciones");
    viewProperty9.setCode("amympgha");
    org.monet.metamodel.DesktopDefinition.ViewProperty.ShowProperty showProperty10 = new org.monet.metamodel.DesktopDefinition.ViewProperty.ShowProperty();
    showProperty10.getLink().add(new org.monet.metamodel.internal.Ref("ceip.Califications"));
    showProperty10.getLink().add(new org.monet.metamodel.internal.Ref("ceip.Boletines"));
    viewProperty9.setShow(showProperty10);
    this.addView(viewProperty9);
    org.monet.metamodel.DesktopDefinition.ViewProperty viewProperty14 = new org.monet.metamodel.DesktopDefinition.ViewProperty();
    viewProperty14.setLabel("Solicitudes");
    viewProperty14.setCode("pmympgha");
    org.monet.metamodel.DesktopDefinition.ViewProperty.ShowProperty showProperty15 = new org.monet.metamodel.DesktopDefinition.ViewProperty.ShowProperty();
    showProperty15.getLink().add(new org.monet.metamodel.internal.Ref("ceip.Applications"));
    showProperty15.getLink().add(new org.monet.metamodel.internal.Ref("ceip.ServiceApplications"));
    viewProperty14.setShow(showProperty15);
    this.addView(viewProperty14);
    org.monet.metamodel.DesktopDefinition.ViewProperty viewProperty19 = new org.monet.metamodel.DesktopDefinition.ViewProperty();
    viewProperty19.setLabel("Información del Centro");
    viewProperty19.setCode("m4iqy8w");
    org.monet.metamodel.DesktopDefinition.ViewProperty.ShowProperty showProperty20 = new org.monet.metamodel.DesktopDefinition.ViewProperty.ShowProperty();
    showProperty20.getLink().add(new org.monet.metamodel.internal.Ref("ceip.CentroInfo"));
    showProperty20.getLink().add(new org.monet.metamodel.internal.Ref("ceip.AcademicCalendars"));
    viewProperty19.setShow(showProperty20);
    this.addView(viewProperty19);
    org.monet.metamodel.DesktopDefinition.ViewProperty viewProperty24 = new org.monet.metamodel.DesktopDefinition.ViewProperty();
    viewProperty24.setLabel("Tareas y Roles");
    viewProperty24.setCode("lmympgha");
    org.monet.metamodel.DesktopDefinition.ViewProperty.ShowProperty showProperty25 = new org.monet.metamodel.DesktopDefinition.ViewProperty.ShowProperty();
    org.monet.metamodel.DesktopDefinition.ViewProperty.ShowProperty.LinkRolesProperty linkRolesProperty25 = new org.monet.metamodel.DesktopDefinition.ViewProperty.ShowProperty.LinkRolesProperty();
    showProperty25.setLinkRoles(linkRolesProperty25);
    org.monet.metamodel.DesktopDefinition.ViewProperty.ShowProperty.LinkTaskboardProperty linkTaskboardProperty26 = new org.monet.metamodel.DesktopDefinition.ViewProperty.ShowProperty.LinkTaskboardProperty();
    showProperty25.setLinkTaskboard(linkTaskboardProperty26);
    viewProperty24.setShow(showProperty25);
    this.addView(viewProperty24);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(ceip.administracion.$Definition$.class,"ceip.Administracion",null);
  }
  }
  
  public static String static_getName() {
    return "Administracion";
  }
  
  public Class<?> getBehaviourClass() {
    return ceip.Administracion.class;
  }
  
  public String getClientBehaviour() {
    return "var mx_vlwg = new Object();mx_vlwg.refresh = function (node) {if (!node.isEditable()) return;};mx_vlwg.onChangeField = function (node, field) {};";
  }
}
