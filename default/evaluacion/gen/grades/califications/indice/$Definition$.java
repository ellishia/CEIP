package grades.califications.indice;

import grades.califications.indice.AcademicYearProperty;
import grades.califications.indice.CialProperty;
import grades.califications.indice.GradeProperty;
import grades.califications.indice.LevelProperty;
import grades.califications.indice.StudentProperty;
import grades.califications.indice.SubjectProperty;
import grades.califications.indice.TrimesterProperty;
import org.monet.metamodel.IndexDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends IndexDefinition implements HasBehaviour, HasClientBehaviour {
  public $Definition$() {
    super();this._code = "iminbk5w";
    this._name = "grades.Califications.Indice";
    this._isAbstract = null;this._label = "Indice";
    org.monet.metamodel.IndexDefinition.ReferenceProperty referenceProperty1 = new org.monet.metamodel.IndexDefinition.ReferenceProperty();
    referenceProperty1.addAttributeProperty(Subject);
    referenceProperty1.addAttributeProperty(Level);
    referenceProperty1.addAttributeProperty(Grade);
    referenceProperty1.addAttributeProperty(Trimester);
    referenceProperty1.addAttributeProperty(AcademicYear);
    referenceProperty1.addAttributeProperty(Student);
    referenceProperty1.addAttributeProperty(Cial);
    this.setReference(referenceProperty1);
    org.monet.metamodel.IndexDefinition.IndexViewProperty indexViewProperty9 = new org.monet.metamodel.IndexDefinition.IndexViewProperty();
    indexViewProperty9.setCode("imuf9cnq");
    indexViewProperty9.setName("Normal");
    org.monet.metamodel.IndexDefinition.IndexViewProperty.ShowProperty showProperty9 = new org.monet.metamodel.IndexDefinition.IndexViewProperty.ShowProperty();
    showProperty9.setTitle(new org.monet.metamodel.internal.Ref("Subject","grades.Califications.Indice","grades.Califications.Indice.Subject"));
    showProperty9.getLine().add(new org.monet.metamodel.internal.Ref("Level","grades.Califications.Indice","grades.Califications.Indice.Level"));
    showProperty9.getLine().add(new org.monet.metamodel.internal.Ref("Trimester","grades.Califications.Indice","grades.Califications.Indice.Trimester"));
    showProperty9.getLine().add(new org.monet.metamodel.internal.Ref("AcademicYear","grades.Califications.Indice","grades.Califications.Indice.AcademicYear"));
    showProperty9.getLine().add(new org.monet.metamodel.internal.Ref("Grade","grades.Califications.Indice","grades.Califications.Indice.Grade"));
    indexViewProperty9.setShow(showProperty9);
    this.addView(indexViewProperty9);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(grades.califications.indice.$Definition$.class,"grades.Califications.Indice",null);
  }
  }
  
  public static String static_getName() {
    return "Indice";
  }
  
  public Class<?> getBehaviourClass() {
    return grades.califications.Indice.class;
  }
  
  public String getClientBehaviour() {
    return "var iminbk5w = new Object();iminbk5w.refresh = function (node) {if (!node.isEditable()) return;};iminbk5w.onChangeField = function (node, field) {};";
  }
  
  private final SubjectProperty Subject = new grades.califications.indice.SubjectProperty();
  
  private final LevelProperty Level = new grades.califications.indice.LevelProperty();
  
  private final GradeProperty Grade = new grades.califications.indice.GradeProperty();
  
  private final TrimesterProperty Trimester = new grades.califications.indice.TrimesterProperty();
  
  private final AcademicYearProperty AcademicYear = new grades.califications.indice.AcademicYearProperty();
  
  private final StudentProperty Student = new grades.califications.indice.StudentProperty();
  
  private final CialProperty Cial = new grades.califications.indice.CialProperty();
}
