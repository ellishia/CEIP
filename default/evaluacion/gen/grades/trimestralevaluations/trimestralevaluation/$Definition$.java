package grades.trimestralevaluations.trimestralevaluation;

import org.monet.metamodel.ContainerDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends ContainerDefinition implements HasBehaviour, HasClientBehaviour {
  public $Definition$() {
    super();this._code = "mzs3dcq";
    this._name = "grades.TrimestralEvaluations.TrimestralEvaluation";
    this._isAbstract = null;this._label = "TrimestralEvaluation";
    org.monet.metamodel.ContainerDefinition.ContainProperty containProperty1 = new org.monet.metamodel.ContainerDefinition.ContainProperty();
    containProperty1.getNode().add(new org.monet.metamodel.internal.Ref("grades.EvaluationForm"));
    containProperty1.getNode().add(new org.monet.metamodel.internal.Ref("grades.Califications"));
    this.setContain(containProperty1);
    org.monet.metamodel.ContainerDefinition.ViewProperty viewProperty4 = new org.monet.metamodel.ContainerDefinition.ViewProperty();
    viewProperty4.setLabel("Ficha");
    viewProperty4.setCode("ds");
    viewProperty4.setIsDefault(true);
    org.monet.metamodel.ContainerDefinition.ViewProperty.ShowProperty showProperty6 = new org.monet.metamodel.ContainerDefinition.ViewProperty.ShowProperty();
    showProperty6.getComponent().add(new org.monet.metamodel.internal.Ref("View","grades.EvaluationForm","grades.EvaluationForm.View"));
    viewProperty4.setShow(showProperty6);
    this.addView(viewProperty4);
    org.monet.metamodel.ContainerDefinition.ViewProperty viewProperty9 = new org.monet.metamodel.ContainerDefinition.ViewProperty();
    viewProperty9.setCode("mx1uw4a");
    viewProperty9.setName("CalificationsView");
    org.monet.metamodel.ContainerDefinition.ViewProperty.ShowProperty showProperty9 = new org.monet.metamodel.ContainerDefinition.ViewProperty.ShowProperty();
    showProperty9.getComponent().add(new org.monet.metamodel.internal.Ref("ViewAll","grades.Califications","grades.Califications.ViewAll"));
    viewProperty9.setShow(showProperty9);
    this.addView(viewProperty9);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(grades.trimestralevaluations.trimestralevaluation.$Definition$.class,"grades.TrimestralEvaluations.TrimestralEvaluation",null);
  }
  }
  
  public static String static_getName() {
    return "TrimestralEvaluation";
  }
  
  public Class<?> getBehaviourClass() {
    return grades.trimestralevaluations.TrimestralEvaluation.class;
  }
  
  public String getClientBehaviour() {
    return "var mzs3dcq = new Object();mzs3dcq.refresh = function (node) {if (!node.isEditable()) return;};mzs3dcq.onChangeField = function (node, field) {};";
  }
}
