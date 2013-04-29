package direc.schedule.scheduleslot;

import org.monet.metamodel.LinkFieldProperty;

@SuppressWarnings("all")
public class TeacherProperty extends LinkFieldProperty {
  public TeacherProperty() {
    super();this._code = "mms5fba";
    this._name = "Teacher";
    this._label = "Asignación de Docente";
    this.setAllowAdd(true);
    org.monet.metamodel.LinkFieldProperty.SourceProperty sourceProperty2 = new org.monet.metamodel.LinkFieldProperty.SourceProperty();
    sourceProperty2.setIndex(new org.monet.metamodel.internal.Ref("direc.TeacherAsignations.Indice"));
    sourceProperty2.setCollection(new org.monet.metamodel.internal.Ref("direc.TeacherAsignations"));
    this.setSource(sourceProperty2);
    
  }
  
  public static String static_getName() {
    return "Teacher";
  }
}
