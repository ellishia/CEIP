package grades.students.student;

import org.monet.metamodel.SelectFieldProperty;

public class LevelProperty extends SelectFieldProperty {
  public LevelProperty() {
    super();this._code = "mygtntq";
    this._name = "Level";
    this._label = "Curso";
    
  }
  
  public static String static_getName() {
    return "Level";
  }
}
