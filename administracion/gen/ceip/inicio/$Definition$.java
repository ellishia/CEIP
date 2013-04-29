package ceip.inicio;

import org.monet.metamodel.DesktopDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends DesktopDefinition implements HasBehaviour, HasClientBehaviour {
  public $Definition$() {
    super();this._code = "msbcllw";
    this._name = "ceip.Inicio";
    this._isAbstract = null;this._label = "Inicio";
    org.monet.metamodel.DesktopDefinition.ForProperty forProperty1 = new org.monet.metamodel.DesktopDefinition.ForProperty();
    forProperty1.setRole(new org.monet.metamodel.internal.Ref("ceip.comun.Usuario"));
    this.setFor(forProperty1);
    org.monet.metamodel.DesktopDefinition.ViewProperty viewProperty3 = new org.monet.metamodel.DesktopDefinition.ViewProperty();
    viewProperty3.setLabel("Últimas noticias");
    viewProperty3.setCode("m1esjsq");
    viewProperty3.setIsDefault(true);
    org.monet.metamodel.DesktopDefinition.ViewProperty.ShowProperty showProperty5 = new org.monet.metamodel.DesktopDefinition.ViewProperty.ShowProperty();
    org.monet.metamodel.DesktopDefinition.ViewProperty.ShowProperty.NewsProperty newsProperty5 = new org.monet.metamodel.DesktopDefinition.ViewProperty.ShowProperty.NewsProperty();
    showProperty5.setNews(newsProperty5);
    viewProperty3.setShow(showProperty5);
    this.addView(viewProperty3);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(ceip.inicio.$Definition$.class,"ceip.Inicio",null);
  }
  }
  
  public static String static_getName() {
    return "Inicio";
  }
  
  public Class<?> getBehaviourClass() {
    return ceip.Inicio.class;
  }
  
  public String getClientBehaviour() {
    return "var msbcllw = new Object();msbcllw.refresh = function (node) {if (!node.isEditable()) return;};msbcllw.onChangeField = function (node, field) {};";
  }
}
