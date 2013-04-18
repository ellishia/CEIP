package doc.exams.exam;

import org.monet.metamodel.ContainerDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends ContainerDefinition implements HasBehaviour, HasClientBehaviour {
  public $Definition$() {
    super();this._code = "mb_mlew";
    this._name = "doc.Exams.Exam";
    this._isAbstract = null;this._label = "Exam";
    org.monet.metamodel.ContainerDefinition.ContainProperty containProperty1 = new org.monet.metamodel.ContainerDefinition.ContainProperty();
    containProperty1.getNode().add(new org.monet.metamodel.internal.Ref("doc.Exams.ExamForm"));
    containProperty1.getNode().add(new org.monet.metamodel.internal.Ref("doc.ExamDocs"));
    this.setContain(containProperty1);
    org.monet.metamodel.ContainerDefinition.ViewProperty viewProperty4 = new org.monet.metamodel.ContainerDefinition.ViewProperty();
    viewProperty4.setLabel("Ficha");
    viewProperty4.setCode("dasdf");
    viewProperty4.setIsDefault(true);
    org.monet.metamodel.ContainerDefinition.ViewProperty.ShowProperty showProperty6 = new org.monet.metamodel.ContainerDefinition.ViewProperty.ShowProperty();
    showProperty6.getComponent().add(new org.monet.metamodel.internal.Ref("View","doc.Exams.ExamForm","doc.Exams.ExamForm.View"));
    viewProperty4.setShow(showProperty6);
    this.addView(viewProperty4);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(doc.exams.exam.$Definition$.class,"doc.Exams.Exam",null);
  }
  }
  
  public static String static_getName() {
    return "Exam";
  }
  
  public Class<?> getBehaviourClass() {
    return doc.exams.Exam.class;
  }
  
  public String getClientBehaviour() {
    return "var mb_mlew = new Object();mb_mlew.refresh = function (node) {if (!node.isEditable()) return;};mb_mlew.onChangeField = function (node, field) {};";
  }
}
