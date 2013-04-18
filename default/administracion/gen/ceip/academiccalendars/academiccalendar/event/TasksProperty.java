package ceip.academiccalendars.academiccalendar.event;

import org.monet.metamodel.TextFieldProperty;

@SuppressWarnings("all")
public class TasksProperty extends TextFieldProperty {
  public TasksProperty() {
    super();this._code = "mynxnug";
    this._name = "Tasks";
    this._label = "Tareas";
    
  }
  
  public static String static_getName() {
    return "Tasks";
  }
}
