package doc.escritoriodocente;

import org.monet.metamodel.DesktopDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends DesktopDefinition implements HasBehaviour, HasClientBehaviour {
  public $Definition$() {
    super();this._code = "mxlt98a";
    this._name = "doc.EscritorioDocente";
    this._isAbstract = null;this._label = "Docencia";
    this.setIsSingleton(true);
    org.monet.metamodel.DesktopDefinition.ForProperty forProperty2 = new org.monet.metamodel.DesktopDefinition.ForProperty();
    forProperty2.getRole().add(new org.monet.metamodel.internal.Ref("doc.shared.Docente"));
    this.setFor(forProperty2);
    org.monet.metamodel.DesktopDefinition.ViewProperty viewProperty4 = new org.monet.metamodel.DesktopDefinition.ViewProperty();
    viewProperty4.setLabel("Alumnado");
    viewProperty4.setCode("mswnfta");
    org.monet.metamodel.DesktopDefinition.ViewProperty.ShowProperty showProperty5 = new org.monet.metamodel.DesktopDefinition.ViewProperty.ShowProperty();
    showProperty5.getLink().add(new org.monet.metamodel.internal.Ref("doc.Alumnado"));
    showProperty5.getLink().add(new org.monet.metamodel.internal.Ref("doc.Groups"));
    viewProperty4.setShow(showProperty5);
    viewProperty4.setIsDefault(true);
    this.addView(viewProperty4);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(doc.escritoriodocente.$Definition$.class,"doc.EscritorioDocente",null);
  }
  }
  
  public static String static_getName() {
    return "EscritorioDocente";
  }
  
  public Class<?> getBehaviourClass() {
    return doc.EscritorioDocente.class;
  }
  
  public String getClientBehaviour() {
    return "var mxlt98a = new Object();mxlt98a.refresh = function (node) {if (!node.isEditable()) return;};mxlt98a.onChangeField = function (node, field) {};";
  }
}
