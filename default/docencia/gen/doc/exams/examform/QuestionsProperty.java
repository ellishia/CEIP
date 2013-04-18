package doc.exams.examform;

import org.monet.metamodel.TextFieldProperty;

@SuppressWarnings("all")
public class QuestionsProperty extends TextFieldProperty {
  public QuestionsProperty() {
    super();this._code = "mb_7wiq";
    this._name = "Questions";
    this._label = "Preguntas";
    this.setIsMultiple(true);
    
  }
  
  public static String static_getName() {
    return "Questions";
  }
}
