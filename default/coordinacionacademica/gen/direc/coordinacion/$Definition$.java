package direc.coordinacion;

import org.monet.metamodel.DesktopDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends DesktopDefinition implements HasBehaviour, HasClientBehaviour {
  public $Definition$() {
    super();this._code = "mbpaklg";
    this._name = "direc.Coordinacion";
    this._isAbstract = null;this._label = "Coordinación";
    this.setIsSingleton(true);
    org.monet.metamodel.DesktopDefinition.ForProperty forProperty2 = new org.monet.metamodel.DesktopDefinition.ForProperty();
    forProperty2.getRole().add(new org.monet.metamodel.internal.Ref("direc.shared.Administrador"));
    this.setFor(forProperty2);
    org.monet.metamodel.DesktopDefinition.ViewProperty viewProperty4 = new org.monet.metamodel.DesktopDefinition.ViewProperty();
    viewProperty4.setLabel("Planificación");
    viewProperty4.setCode("mzssrma");
    org.monet.metamodel.DesktopDefinition.ViewProperty.ShowProperty showProperty5 = new org.monet.metamodel.DesktopDefinition.ViewProperty.ShowProperty();
    showProperty5.getLink().add(new org.monet.metamodel.internal.Ref("direc.Activities"));
    showProperty5.getLink().add(new org.monet.metamodel.internal.Ref("direc.Schedules"));
    showProperty5.getLink().add(new org.monet.metamodel.internal.Ref("direc.Meetings"));
    viewProperty4.setShow(showProperty5);
    viewProperty4.setIsDefault(true);
    this.addView(viewProperty4);
    org.monet.metamodel.DesktopDefinition.ViewProperty viewProperty11 = new org.monet.metamodel.DesktopDefinition.ViewProperty();
    viewProperty11.setLabel("Aulas");
    viewProperty11.setCode("m7qxcnw");
    org.monet.metamodel.DesktopDefinition.ViewProperty.ShowProperty showProperty12 = new org.monet.metamodel.DesktopDefinition.ViewProperty.ShowProperty();
    showProperty12.getLink().add(new org.monet.metamodel.internal.Ref("direc.Rooms"));
    viewProperty11.setShow(showProperty12);
    this.addView(viewProperty11);
    org.monet.metamodel.DesktopDefinition.ViewProperty viewProperty15 = new org.monet.metamodel.DesktopDefinition.ViewProperty();
    viewProperty15.setLabel("Grupos y Alumnado");
    viewProperty15.setCode("t");
    org.monet.metamodel.DesktopDefinition.ViewProperty.ShowProperty showProperty16 = new org.monet.metamodel.DesktopDefinition.ViewProperty.ShowProperty();
    showProperty16.getLink().add(new org.monet.metamodel.internal.Ref("direc.Groups"));
    showProperty16.getLink().add(new org.monet.metamodel.internal.Ref("direc.Students"));
    viewProperty15.setShow(showProperty16);
    this.addView(viewProperty15);
    org.monet.metamodel.DesktopDefinition.ViewProperty viewProperty20 = new org.monet.metamodel.DesktopDefinition.ViewProperty();
    viewProperty20.setLabel("Docentes");
    viewProperty20.setCode("m4ruesg");
    org.monet.metamodel.DesktopDefinition.ViewProperty.ShowProperty showProperty21 = new org.monet.metamodel.DesktopDefinition.ViewProperty.ShowProperty();
    showProperty21.getLink().add(new org.monet.metamodel.internal.Ref("direc.Teachers"));
    viewProperty20.setShow(showProperty21);
    this.addView(viewProperty20);
    org.monet.metamodel.DesktopDefinition.ViewProperty viewProperty24 = new org.monet.metamodel.DesktopDefinition.ViewProperty();
    viewProperty24.setLabel("Gestión de Textos y Tarjetas");
    viewProperty24.setCode("mqbgbhg");
    org.monet.metamodel.DesktopDefinition.ViewProperty.ShowProperty showProperty25 = new org.monet.metamodel.DesktopDefinition.ViewProperty.ShowProperty();
    showProperty25.getLink().add(new org.monet.metamodel.internal.Ref("direc.CenterBooks"));
    showProperty25.getLink().add(new org.monet.metamodel.internal.Ref("direc.Ejemplares"));
    showProperty25.getLink().add(new org.monet.metamodel.internal.Ref("direc.Lotes"));
    showProperty25.getLink().add(new org.monet.metamodel.internal.Ref("direc.CreditCards"));
    showProperty25.getLink().add(new org.monet.metamodel.internal.Ref("direc.Asignations"));
    viewProperty24.setShow(showProperty25);
    this.addView(viewProperty24);
    org.monet.metamodel.DesktopDefinition.ViewProperty viewProperty32 = new org.monet.metamodel.DesktopDefinition.ViewProperty();
    viewProperty32.setLabel("Tareas y Roles");
    viewProperty32.setCode("mg0dnsg");
    org.monet.metamodel.DesktopDefinition.ViewProperty.ShowProperty showProperty33 = new org.monet.metamodel.DesktopDefinition.ViewProperty.ShowProperty();
    org.monet.metamodel.DesktopDefinition.ViewProperty.ShowProperty.LinkRolesProperty linkRolesProperty33 = new org.monet.metamodel.DesktopDefinition.ViewProperty.ShowProperty.LinkRolesProperty();
    showProperty33.setLinkRoles(linkRolesProperty33);
    org.monet.metamodel.DesktopDefinition.ViewProperty.ShowProperty.LinkTaskboardProperty linkTaskboardProperty34 = new org.monet.metamodel.DesktopDefinition.ViewProperty.ShowProperty.LinkTaskboardProperty();
    showProperty33.setLinkTaskboard(linkTaskboardProperty34);
    viewProperty32.setShow(showProperty33);
    this.addView(viewProperty32);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(direc.coordinacion.$Definition$.class,"direc.Coordinacion",null);
  }
  }
  
  public static String static_getName() {
    return "Coordinacion";
  }
  
  public Class<?> getBehaviourClass() {
    return direc.Coordinacion.class;
  }
  
  public String getClientBehaviour() {
    return "var mbpaklg = new Object();mbpaklg.refresh = function (node) {if (!node.isEditable()) return;};mbpaklg.onChangeField = function (node, field) {};";
  }
}
