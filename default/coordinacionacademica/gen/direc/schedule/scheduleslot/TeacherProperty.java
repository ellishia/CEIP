package direc.schedule.scheduleslot;

import org.monet.metamodel.LinkFieldProperty;

@SuppressWarnings("all")
public class TeacherProperty extends LinkFieldProperty {
  public TeacherProperty() {
    super();this._code = "mms5fba";
    this._name = "Teacher";
    this._label = "Asignación de Docente";
    org.monet.metamodel.LinkFieldProperty.SourceProperty sourceProperty1 = new org.monet.metamodel.LinkFieldProperty.SourceProperty();
    sourceProperty1.setIndex(new org.monet.metamodel.internal.Ref("direc.TeacherAsignations.Indice"));
    this.setSource(sourceProperty1);
    
  }
  
  public static String static_getName() {
    return "Teacher";
  }
}
