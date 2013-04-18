package doc.exams.examform;

import doc.exams.examform.AreaProperty;
import doc.exams.examform.GradeProperty;
import doc.exams.examform.InstructionsProperty;
import doc.exams.examform.LevelProperty;
import doc.exams.examform.QuestionsProperty;
import doc.exams.examform.TitleProperty;
import org.monet.metamodel.FormDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;
import org.monet.metamodel.interfaces.HasMappings;

@SuppressWarnings("all")
public class $Definition$ extends FormDefinition implements HasBehaviour, HasClientBehaviour, HasMappings {
  public $Definition$() {
    super();this._code = "mpqipva";
    this._name = "doc.Exams.ExamForm";
    this._isAbstract = null;this._label = "Examen";
    this.setIsComponent(true);
    this.addTextFieldProperty(Title);
    this.addSelectFieldProperty(Area);
    this.addSelectFieldProperty(Grade);
    this.addSelectFieldProperty(Level);
    this.addTextFieldProperty(Questions);
    this.addTextFieldProperty(Instructions);
    org.monet.metamodel.FormDefinition.MappingProperty mappingProperty8 = new org.monet.metamodel.FormDefinition.MappingProperty();
    mappingProperty8.setIndex(new org.monet.metamodel.internal.Ref("doc.Exams.Indice"));
    this.getMappingList().add(mappingProperty8);
    org.monet.metamodel.FormDefinition.OperationProperty operationProperty10 = new org.monet.metamodel.FormDefinition.OperationProperty();
    operationProperty10.setLabel("Generar Documento de Examen");
    operationProperty10.setCode("me8pzoa");
    operationProperty10.setName("ExamDoc");
    this.addOperation(operationProperty10);
    org.monet.metamodel.FormDefinition.FormViewProperty formViewProperty12 = new org.monet.metamodel.FormDefinition.FormViewProperty();
    formViewProperty12.setLabel("Ficha");
    formViewProperty12.setCode("pi");
    formViewProperty12.setIsDefault(true);
    org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty showProperty14 = new org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty();
    showProperty14.getField().add(new org.monet.metamodel.internal.Ref("Title","doc.Exams.ExamForm","doc.Exams.ExamForm.Title"));
    showProperty14.getField().add(new org.monet.metamodel.internal.Ref("Grade","doc.Exams.ExamForm","doc.Exams.ExamForm.Grade"));
    showProperty14.getField().add(new org.monet.metamodel.internal.Ref("Level","doc.Exams.ExamForm","doc.Exams.ExamForm.Level"));
    showProperty14.getField().add(new org.monet.metamodel.internal.Ref("Questions","doc.Exams.ExamForm","doc.Exams.ExamForm.Questions"));
    showProperty14.getField().add(new org.monet.metamodel.internal.Ref("Instructions","doc.Exams.ExamForm","doc.Exams.ExamForm.Instructions"));
    formViewProperty12.setShow(showProperty14);
    this.addView(formViewProperty12);
    org.monet.metamodel.FormDefinition.FormViewProperty formViewProperty21 = new org.monet.metamodel.FormDefinition.FormViewProperty();
    formViewProperty21.setCode("m373rfg");
    formViewProperty21.setName("View");
    formViewProperty21.setIsWidget(true);
    org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty showProperty22 = new org.monet.metamodel.FormDefinition.FormViewProperty.ShowProperty();
    showProperty22.getField().add(new org.monet.metamodel.internal.Ref("Title","doc.Exams.ExamForm","doc.Exams.ExamForm.Title"));
    showProperty22.getField().add(new org.monet.metamodel.internal.Ref("Grade","doc.Exams.ExamForm","doc.Exams.ExamForm.Grade"));
    formViewProperty21.setShow(showProperty22);
    this.addView(formViewProperty21);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(doc.exams.examform.$Definition$.class,"doc.Exams.ExamForm",null);
  }
  }
  
  public static String static_getName() {
    return "ExamForm";
  }
  
  public Class<?> getBehaviourClass() {
    return doc.exams.ExamForm.class;
  }
  
  public String getClientBehaviour() {
    return "var mpqipva = new Object();mpqipva.refresh = function (node) {if (!node.isEditable()) return;};mpqipva.onChangeField = function (node, field) {};";
  }
  
  public Class<?> getMappingClass(final String code) {
    switch(code.hashCode()) {
    case -2080241954:
    return doc.exams.examform.Mapping__0.class;
    }
    return super.getMappingClass(code);
  }
  
  private final TitleProperty Title = new doc.exams.examform.TitleProperty();
  
  private final AreaProperty Area = new doc.exams.examform.AreaProperty();
  
  private final GradeProperty Grade = new doc.exams.examform.GradeProperty();
  
  private final LevelProperty Level = new doc.exams.examform.LevelProperty();
  
  private final QuestionsProperty Questions = new doc.exams.examform.QuestionsProperty();
  
  private final InstructionsProperty Instructions = new doc.exams.examform.InstructionsProperty();
}
