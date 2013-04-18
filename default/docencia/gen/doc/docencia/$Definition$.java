package doc.docencia;

import org.monet.metamodel.DesktopDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends DesktopDefinition implements HasBehaviour, HasClientBehaviour {
  public $Definition$() {
    super();this._code = "mmecnqq";
    this._name = "doc.Docencia";
    this._isAbstract = null;this._label = "Docencia";
    this.setIsSingleton(true);
    org.monet.metamodel.DesktopDefinition.ForProperty forProperty2 = new org.monet.metamodel.DesktopDefinition.ForProperty();
    forProperty2.setRole(new org.monet.metamodel.internal.Ref("doc.shared.Administrador"));
    this.setFor(forProperty2);
    org.monet.metamodel.DesktopDefinition.ViewProperty viewProperty4 = new org.monet.metamodel.DesktopDefinition.ViewProperty();
    viewProperty4.setLabel("Alumnado");
    viewProperty4.setCode("u");
    org.monet.metamodel.DesktopDefinition.ViewProperty.ShowProperty showProperty5 = new org.monet.metamodel.DesktopDefinition.ViewProperty.ShowProperty();
    showProperty5.getLink().add(new org.monet.metamodel.internal.Ref("doc.Alumnado"));
    showProperty5.getLink().add(new org.monet.metamodel.internal.Ref("doc.Groups"));
    showProperty5.getLink().add(new org.monet.metamodel.internal.Ref("doc.Absences"));
    showProperty5.getLink().add(new org.monet.metamodel.internal.Ref("doc.Incidents"));
    showProperty5.getLink().add(new org.monet.metamodel.internal.Ref("doc.ParentVisits"));
    viewProperty4.setShow(showProperty5);
    viewProperty4.setIsDefault(true);
    this.addView(viewProperty4);
    org.monet.metamodel.DesktopDefinition.ViewProperty viewProperty13 = new org.monet.metamodel.DesktopDefinition.ViewProperty();
    viewProperty13.setLabel("Área de conocimientos");
    viewProperty13.setCode("taasf");
    org.monet.metamodel.DesktopDefinition.ViewProperty.ShowProperty showProperty14 = new org.monet.metamodel.DesktopDefinition.ViewProperty.ShowProperty();
    showProperty14.getLink().add(new org.monet.metamodel.internal.Ref("doc.SubjectLevels"));
    showProperty14.getLink().add(new org.monet.metamodel.internal.Ref("doc.Subjects"));
    viewProperty13.setShow(showProperty14);
    this.addView(viewProperty13);
    org.monet.metamodel.DesktopDefinition.ViewProperty viewProperty18 = new org.monet.metamodel.DesktopDefinition.ViewProperty();
    viewProperty18.setLabel("Tareas y Roles");
    viewProperty18.setCode("mf0bqqq");
    org.monet.metamodel.DesktopDefinition.ViewProperty.ShowProperty showProperty19 = new org.monet.metamodel.DesktopDefinition.ViewProperty.ShowProperty();
    org.monet.metamodel.DesktopDefinition.ViewProperty.ShowProperty.LinkRolesProperty linkRolesProperty19 = new org.monet.metamodel.DesktopDefinition.ViewProperty.ShowProperty.LinkRolesProperty();
    showProperty19.setLinkRoles(linkRolesProperty19);
    org.monet.metamodel.DesktopDefinition.ViewProperty.ShowProperty.LinkTaskboardProperty linkTaskboardProperty20 = new org.monet.metamodel.DesktopDefinition.ViewProperty.ShowProperty.LinkTaskboardProperty();
    showProperty19.setLinkTaskboard(linkTaskboardProperty20);
    viewProperty18.setShow(showProperty19);
    this.addView(viewProperty18);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(doc.docencia.$Definition$.class,"doc.Docencia",null);
  }
  }
  
  public static String static_getName() {
    return "Docencia";
  }
  
  public Class<?> getBehaviourClass() {
    return doc.Docencia.class;
  }
  
  public String getClientBehaviour() {
    return "var mmecnqq = new Object();mmecnqq.refresh = function (node) {if (!node.isEditable()) return;};mmecnqq.onChangeField = function (node, field) {};";
  }
}
