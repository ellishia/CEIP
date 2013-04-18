package doc.subjectlevels.indice;

import doc.subjectlevels.indice.AsignaturaCompletaProperty;
import doc.subjectlevels.indice.AsignaturaProperty;
import doc.subjectlevels.indice.GradeProperty;
import doc.subjectlevels.indice.IdentifierProperty;
import org.monet.metamodel.IndexDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends IndexDefinition implements HasBehaviour, HasClientBehaviour {
  public $Definition$() {
    super();this._code = "imohdvqa";
    this._name = "doc.SubjectLevels.Indice";
    this._isAbstract = null;this._label = "Indice";
    org.monet.metamodel.IndexDefinition.ReferenceProperty referenceProperty1 = new org.monet.metamodel.IndexDefinition.ReferenceProperty();
    referenceProperty1.addAttributeProperty(AsignaturaCompleta);
    referenceProperty1.addAttributeProperty(Asignatura);
    referenceProperty1.addAttributeProperty(Grade);
    referenceProperty1.addAttributeProperty(Identifier);
    this.setReference(referenceProperty1);
    org.monet.metamodel.IndexDefinition.IndexViewProperty indexViewProperty6 = new org.monet.metamodel.IndexDefinition.IndexViewProperty();
    indexViewProperty6.setCode("i");
    indexViewProperty6.setName("Normal");
    org.monet.metamodel.IndexDefinition.IndexViewProperty.ShowProperty showProperty6 = new org.monet.metamodel.IndexDefinition.IndexViewProperty.ShowProperty();
    showProperty6.getLine().add(new org.monet.metamodel.internal.Ref("Asignatura","doc.SubjectLevels.Indice","doc.SubjectLevels.Indice.Asignatura"));
    showProperty6.getLine().add(new org.monet.metamodel.internal.Ref("Grade","doc.SubjectLevels.Indice","doc.SubjectLevels.Indice.Grade"));
    indexViewProperty6.setShow(showProperty6);
    this.addView(indexViewProperty6);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(doc.subjectlevels.indice.$Definition$.class,"doc.SubjectLevels.Indice",null);
  }
  }
  
  public static String static_getName() {
    return "Indice";
  }
  
  public Class<?> getBehaviourClass() {
    return doc.subjectlevels.Indice.class;
  }
  
  public String getClientBehaviour() {
    return "var imohdvqa = new Object();imohdvqa.refresh = function (node) {if (!node.isEditable()) return;};imohdvqa.onChangeField = function (node, field) {};";
  }
  
  private final AsignaturaCompletaProperty AsignaturaCompleta = new doc.subjectlevels.indice.AsignaturaCompletaProperty();
  
  private final AsignaturaProperty Asignatura = new doc.subjectlevels.indice.AsignaturaProperty();
  
  private final GradeProperty Grade = new doc.subjectlevels.indice.GradeProperty();
  
  private final IdentifierProperty Identifier = new doc.subjectlevels.indice.IdentifierProperty();
}
