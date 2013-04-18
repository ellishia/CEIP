package direc.lotes.index;

import direc.lotes.index.AcademicYearProperty;
import direc.lotes.index.IdentifierProperty;
import direc.lotes.index.LevelProperty;
import org.monet.metamodel.IndexDefinition;
import org.monet.metamodel.interfaces.HasBehaviour;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends IndexDefinition implements HasBehaviour, HasClientBehaviour {
  public $Definition$() {
    super();this._code = "mnzsekq";
    this._name = "direc.Lotes.Index";
    this._isAbstract = null;this._label = "Lotes";
    org.monet.metamodel.IndexDefinition.ReferenceProperty referenceProperty1 = new org.monet.metamodel.IndexDefinition.ReferenceProperty();
    referenceProperty1.addAttributeProperty(Identifier);
    referenceProperty1.addAttributeProperty(AcademicYear);
    referenceProperty1.addAttributeProperty(Level);
    this.setReference(referenceProperty1);
    org.monet.metamodel.IndexDefinition.IndexViewProperty indexViewProperty5 = new org.monet.metamodel.IndexDefinition.IndexViewProperty();
    indexViewProperty5.setCode("msbrxha");
    indexViewProperty5.setName("LoteView");
    org.monet.metamodel.IndexDefinition.IndexViewProperty.ShowProperty showProperty5 = new org.monet.metamodel.IndexDefinition.IndexViewProperty.ShowProperty();
    showProperty5.setTitle(new org.monet.metamodel.internal.Ref("Identifier","direc.Lotes.Index","direc.Lotes.Index.Identifier"));
    showProperty5.getLine().add(new org.monet.metamodel.internal.Ref("AcademicYear","direc.Lotes.Index","direc.Lotes.Index.AcademicYear"));
    showProperty5.getLine().add(new org.monet.metamodel.internal.Ref("Level","direc.Lotes.Index","direc.Lotes.Index.Level"));
    indexViewProperty5.setShow(showProperty5);
    this.addView(indexViewProperty5);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(direc.lotes.index.$Definition$.class,"direc.Lotes.Index",null);
  }
  }
  
  public static String static_getName() {
    return "Index";
  }
  
  public Class<?> getBehaviourClass() {
    return direc.lotes.Index.class;
  }
  
  public String getClientBehaviour() {
    return "var mnzsekq = new Object();mnzsekq.refresh = function (node) {if (!node.isEditable()) return;};mnzsekq.onChangeField = function (node, field) {};";
  }
  
  private final IdentifierProperty Identifier = new direc.lotes.index.IdentifierProperty();
  
  private final AcademicYearProperty AcademicYear = new direc.lotes.index.AcademicYearProperty();
  
  private final LevelProperty Level = new direc.lotes.index.LevelProperty();
}
