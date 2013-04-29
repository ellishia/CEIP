package grades.evaluation;

import org.monet.metamodel.DesktopDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends DesktopDefinition implements HasBehaviour, HasClientBehaviour {
  public $Definition$() {
    super();this._code = "mzwpt3g";
    this._name = "grades.Evaluation";
    this._isAbstract = null;this._label = "Evaluación";
    this.setIsSingleton(true);
    org.monet.metamodel.DesktopDefinition.ForProperty forProperty2 = new org.monet.metamodel.DesktopDefinition.ForProperty();
    forProperty2.setRole(new org.monet.metamodel.internal.Ref("grades.shared.Tutors"));
    this.setFor(forProperty2);
    org.monet.metamodel.DesktopDefinition.ViewProperty viewProperty4 = new org.monet.metamodel.DesktopDefinition.ViewProperty();
    viewProperty4.setCode("mxb3xiq");
    viewProperty4.setIsDefault(true);
    org.monet.metamodel.DesktopDefinition.ViewProperty.ShowProperty showProperty5 = new org.monet.metamodel.DesktopDefinition.ViewProperty.ShowProperty();
    showProperty5.getLink().add(new org.monet.metamodel.internal.Ref("grades.ContinuosEvaluation"));
    viewProperty4.setShow(showProperty5);
    this.addView(viewProperty4);
    org.monet.metamodel.DesktopDefinition.ViewProperty viewProperty8 = new org.monet.metamodel.DesktopDefinition.ViewProperty();
    viewProperty8.setCode("mdoioxa");
    org.monet.metamodel.DesktopDefinition.ViewProperty.ShowProperty showProperty8 = new org.monet.metamodel.DesktopDefinition.ViewProperty.ShowProperty();
    showProperty8.getLink().add(new org.monet.metamodel.internal.Ref("grades.TrimestralEvaluations"));
    viewProperty8.setShow(showProperty8);
    this.addView(viewProperty8);
    org.monet.metamodel.DesktopDefinition.ViewProperty viewProperty11 = new org.monet.metamodel.DesktopDefinition.ViewProperty();
    viewProperty11.setCode("mtdi0va");
    org.monet.metamodel.DesktopDefinition.ViewProperty.ShowProperty showProperty11 = new org.monet.metamodel.DesktopDefinition.ViewProperty.ShowProperty();
    showProperty11.getLink().add(new org.monet.metamodel.internal.Ref("grades.analytics.Estadistics"));
    viewProperty11.setShow(showProperty11);
    this.addView(viewProperty11);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(grades.evaluation.$Definition$.class,"grades.Evaluation",null);
  }
  }
  
  public static String static_getName() {
    return "Evaluation";
  }
  
  public Class<?> getBehaviourClass() {
    return grades.Evaluation.class;
  }
  
  public String getClientBehaviour() {
    return "var mzwpt3g = new Object();mzwpt3g.refresh = function (node) {if (!node.isEditable()) return;};mzwpt3g.onChangeField = function (node, field) {};";
  }
}
