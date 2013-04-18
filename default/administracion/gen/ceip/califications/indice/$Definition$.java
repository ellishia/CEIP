package ceip.califications.indice;

import ceip.califications.indice.AcademicYearProperty;
import ceip.califications.indice.CialProperty;
import ceip.califications.indice.GradeProperty;
import ceip.califications.indice.LevelProperty;
import ceip.califications.indice.StudentProperty;
import ceip.califications.indice.SubjectProperty;
import ceip.califications.indice.TrimesterProperty;
import org.monet.metamodel.IndexDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends IndexDefinition implements HasBehaviour, HasClientBehaviour {
  public $Definition$() {
    super();this._code = "iminbk5w";
    this._name = "ceip.Califications.Indice";
    this._isAbstract = null;this._label = "Indice";
    org.monet.metamodel.IndexDefinition.ReferenceProperty referenceProperty1 = new org.monet.metamodel.IndexDefinition.ReferenceProperty();
    referenceProperty1.addAttributeProperty(Student);
    referenceProperty1.addAttributeProperty(Subject);
    referenceProperty1.addAttributeProperty(Level);
    referenceProperty1.addAttributeProperty(Grade);
    referenceProperty1.addAttributeProperty(Trimester);
    referenceProperty1.addAttributeProperty(AcademicYear);
    referenceProperty1.addAttributeProperty(Cial);
    this.setReference(referenceProperty1);
    org.monet.metamodel.IndexDefinition.IndexViewProperty indexViewProperty9 = new org.monet.metamodel.IndexDefinition.IndexViewProperty();
    indexViewProperty9.setCode("imuf9cnq");
    indexViewProperty9.setName("Normal");
    org.monet.metamodel.IndexDefinition.IndexViewProperty.ShowProperty showProperty9 = new org.monet.metamodel.IndexDefinition.IndexViewProperty.ShowProperty();
    showProperty9.setTitle(new org.monet.metamodel.internal.Ref("Subject","ceip.Califications.Indice","ceip.Califications.Indice.Subject"));
    showProperty9.getLine().add(new org.monet.metamodel.internal.Ref("Level","ceip.Califications.Indice","ceip.Califications.Indice.Level"));
    showProperty9.getLine().add(new org.monet.metamodel.internal.Ref("Trimester","ceip.Califications.Indice","ceip.Califications.Indice.Trimester"));
    showProperty9.getLine().add(new org.monet.metamodel.internal.Ref("AcademicYear","ceip.Califications.Indice","ceip.Califications.Indice.AcademicYear"));
    showProperty9.getLine().add(new org.monet.metamodel.internal.Ref("Grade","ceip.Califications.Indice","ceip.Califications.Indice.Grade"));
    indexViewProperty9.setShow(showProperty9);
    this.addView(indexViewProperty9);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(ceip.califications.indice.$Definition$.class,"ceip.Califications.Indice",null);
  }
  }
  
  public static String static_getName() {
    return "Indice";
  }
  
  public Class<?> getBehaviourClass() {
    return ceip.califications.Indice.class;
  }
  
  public String getClientBehaviour() {
    return "var iminbk5w = new Object();iminbk5w.refresh = function (node) {if (!node.isEditable()) return;};iminbk5w.onChangeField = function (node, field) {};";
  }
  
  private final StudentProperty Student = new ceip.califications.indice.StudentProperty();
  
  private final SubjectProperty Subject = new ceip.califications.indice.SubjectProperty();
  
  private final LevelProperty Level = new ceip.califications.indice.LevelProperty();
  
  private final GradeProperty Grade = new ceip.califications.indice.GradeProperty();
  
  private final TrimesterProperty Trimester = new ceip.califications.indice.TrimesterProperty();
  
  private final AcademicYearProperty AcademicYear = new ceip.califications.indice.AcademicYearProperty();
  
  private final CialProperty Cial = new ceip.califications.indice.CialProperty();
}
