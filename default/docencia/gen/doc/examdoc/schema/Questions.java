package doc.examdoc.schema;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "Questions", strict = false)
@SuppressWarnings("all")
public class Questions {
  @Element(name = "Number", required = false)
  private String Number;
  
  public String getNumber() {
    return this.Number;
  }
  
  public void setNumber(final String Number) {
    this.Number = Number;
  }
  
  @Element(name = "Question", required = false)
  private String Question;
  
  public String getQuestion() {
    return this.Question;
  }
  
  public void setQuestion(final String Question) {
    this.Question = Question;
  }
}
