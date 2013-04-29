package grades.examresults.examresult;

import org.monet.metamodel.TextFieldProperty;

@SuppressWarnings("all")
public class ExamProperty extends TextFieldProperty {
  public ExamProperty() {
    super();this._code = "mq89svg";
    this._name = "Exam";
    this._label = "Examen";
    
  }
  
  public static String static_getName() {
    return "Exam";
  }
}
