package grades.evaluationform;

import grades.evaluationform.AcademicYearProperty;
import grades.evaluationform.DateProperty;
import grades.evaluationform.GroupProperty;
import grades.evaluationform.TrimesterProperty;
import grades.evaluationform.TutorProperty;
import org.monet.metamodel.FormDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;
import org.monet.metamodel.interfaces.HasMappings;

@SuppressWarnings("all")
public class $Definition$ extends FormDefinition implements HasBehaviour, HasClientBehaviour, HasMappings {
  public $Definition$() {
    super();this._code = "m7_jvra";
    this._name = "grades.EvaluationForm";
    this._isAbstract = null;this._label = "EvaluationForm";
    this.addSelectFieldProperty(Group);
    this.addSelectFieldProperty(Tutor);
    this.addDateFieldProperty(Date);
    this.addSelectFieldProperty(AcademicYear);
    this.addSelectFieldProperty(Trimester);
    org.monet.metamodel.FormDefinition.MappingProperty mappingProperty6 = new org.monet.metamodel.FormDefinition.MappingProperty();
    mappingProperty6.setIndex(new org.monet.metamodel.internal.Ref("grades.TrimestralEvaluations.Indice"));
    this.getMappingList().add(mappingProperty6);
    org.monet.metamodel.FormDefinition.FormViewProperty formViewProperty8 = new org.monet.metamodel.FormDefinition.FormViewProperty();
    formViewProperty8.setLabel("Ficha");
    formViewProperty8.setCode("fadfa");
    formViewProperty8.setName("View");
    org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty showProperty9 = new org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty();
    showProperty9.getField().add(new org.monet.metamodel.internal.Ref("Group","grades.EvaluationForm","grades.EvaluationForm.Group"));
    showProperty9.getField().add(new org.monet.metamodel.internal.Ref("Tutor","grades.EvaluationForm","grades.EvaluationForm.Tutor"));
    showProperty9.getField().add(new org.monet.metamodel.internal.Ref("AcademicYear","grades.EvaluationForm","grades.EvaluationForm.AcademicYear"));
    showProperty9.getField().add(new org.monet.metamodel.internal.Ref("Date","grades.EvaluationForm","grades.EvaluationForm.Date"));
    showProperty9.getField().add(new org.monet.metamodel.internal.Ref("Trimester","grades.EvaluationForm","grades.EvaluationForm.Trimester"));
    formViewProperty8.setShow(showProperty9);
    this.addView(formViewProperty8);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(grades.evaluationform.$Definition$.class,"grades.EvaluationForm",null);
  }
  }
  
  public static String static_getName() {
    return "EvaluationForm";
  }
  
  public Class<?> getBehaviourClass() {
    return grades.EvaluationForm.class;
  }
  
  public String getClientBehaviour() {
    return "var m7_jvra = new Object();m7_jvra.refresh = function (node) {if (!node.isEditable()) return;};m7_jvra.onChangeField = function (node, field) {};";
  }
  
  public Class<?> getMappingClass(final String code) {
    switch(code.hashCode()) {
    case -717700979:
    return grades.evaluationform.Mapping__0.class;
    }
    return super.getMappingClass(code);
  }
  
  private final GroupProperty Group = new grades.evaluationform.GroupProperty();
  
  private final TutorProperty Tutor = new grades.evaluationform.TutorProperty();
  
  private final DateProperty Date = new grades.evaluationform.DateProperty();
  
  private final AcademicYearProperty AcademicYear = new grades.evaluationform.AcademicYearProperty();
  
  private final TrimesterProperty Trimester = new grades.evaluationform.TrimesterProperty();
}
