package serv.servicios;

import org.monet.metamodel.DesktopDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends DesktopDefinition implements HasBehaviour, HasClientBehaviour {
  public $Definition$() {
    super();this._code = "mrpqggq";
    this._name = "serv.Servicios";
    this._isAbstract = null;this._label = "Servicios";
    this.setIsSingleton(true);
    org.monet.metamodel.DesktopDefinition.ForProperty forProperty2 = new org.monet.metamodel.DesktopDefinition.ForProperty();
    forProperty2.getRole().add(new org.monet.metamodel.internal.Ref("serv.shared.Manager"));
    this.setFor(forProperty2);
    org.monet.metamodel.DesktopDefinition.ViewProperty viewProperty4 = new org.monet.metamodel.DesktopDefinition.ViewProperty();
    viewProperty4.setLabel("Comedor");
    viewProperty4.setCode("u");
    org.monet.metamodel.DesktopDefinition.ViewProperty.ShowProperty showProperty5 = new org.monet.metamodel.DesktopDefinition.ViewProperty.ShowProperty();
    showProperty5.getLink().add(new org.monet.metamodel.internal.Ref("serv.UsersCanteen"));
    showProperty5.getLink().add(new org.monet.metamodel.internal.Ref("serv.SpecialMenus"));
    viewProperty4.setShow(showProperty5);
    viewProperty4.setIsDefault(true);
    this.addView(viewProperty4);
    org.monet.metamodel.DesktopDefinition.ViewProperty viewProperty10 = new org.monet.metamodel.DesktopDefinition.ViewProperty();
    viewProperty10.setLabel("Transportes");
    viewProperty10.setCode("t");
    org.monet.metamodel.DesktopDefinition.ViewProperty.ShowProperty showProperty11 = new org.monet.metamodel.DesktopDefinition.ViewProperty.ShowProperty();
    showProperty11.getLink().add(new org.monet.metamodel.internal.Ref("serv.UsersTransport"));
    showProperty11.getLink().add(new org.monet.metamodel.internal.Ref("serv.Buslines"));
    showProperty11.getLink().add(new org.monet.metamodel.internal.Ref("serv.DailyRecords"));
    showProperty11.getLink().add(new org.monet.metamodel.internal.Ref("serv.Incidents"));
    viewProperty10.setShow(showProperty11);
    this.addView(viewProperty10);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(serv.servicios.$Definition$.class,"serv.Servicios",null);
  }
  }
  
  public static String static_getName() {
    return "Servicios";
  }
  
  public Class<?> getBehaviourClass() {
    return serv.Servicios.class;
  }
  
  public String getClientBehaviour() {
    return "var mrpqggq = new Object();mrpqggq.refresh = function (node) {if (!node.isEditable()) return;};mrpqggq.onChangeField = function (node, field) {};";
  }
}
