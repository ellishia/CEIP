package direc.groups.group;

import org.monet.metamodel.LinkFieldProperty;

@SuppressWarnings("all")
public class StudentsProperty extends LinkFieldProperty {
  public StudentsProperty() {
    super();this._code = "myockva";
    this._name = "Students";
    this._label = "Alumno/as";
    this.setIsMultiple(true);
    org.monet.metamodel.LinkFieldProperty.SourceProperty sourceProperty2 = new org.monet.metamodel.LinkFieldProperty.SourceProperty();
    sourceProperty2.setIndex(new org.monet.metamodel.internal.Ref("direc.Students.Index"));
    org.monet.metamodel.LinkFieldProperty.SourceProperty.FilterProperty filterProperty3 = new org.monet.metamodel.LinkFieldProperty.SourceProperty.FilterProperty();
    filterProperty3.setAttribute(new org.monet.metamodel.internal.Ref("Level","direc.Students.Index","direc.Students.Index.Level"));
    filterProperty3.setValue(new org.monet.metamodel.internal.Ref("EducationalLevel","direc.Groups.Group","direc.Groups.Group.EducationalLevel"));
    sourceProperty2.getFilterList().add(filterProperty3);
    this.setSource(sourceProperty2);
    
  }
  
  public static String static_getName() {
    return "Students";
  }
}
