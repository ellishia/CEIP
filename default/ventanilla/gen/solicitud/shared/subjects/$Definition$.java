package solicitud.shared.subjects;

import org.monet.metamodel.ThesaurusDefinition;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends ThesaurusDefinition implements HasClientBehaviour {
  public $Definition$() {
    super();this._code = "mxumwbq";
    this._name = "solicitud.shared.Subjects";
    this._isAbstract = null;this._label = "Asignaturas";
    this._ontology = "f0c013b4-4074-48a4-86b4-2992619c1da4";
    org.monet.metamodel.ThesaurusDefinition.TermsProperty termsProperty2 = new org.monet.metamodel.ThesaurusDefinition.TermsProperty();
    org.monet.metamodel.TermProperty termProperty2 = new org.monet.metamodel.TermProperty();
    termProperty2.setLabel("Lengua y Lituratura");
    termProperty2.setKey("001");
    termsProperty2.addTermProperty(termProperty2);
    org.monet.metamodel.TermProperty termProperty5 = new org.monet.metamodel.TermProperty();
    termProperty5.setLabel("Matemáticas");
    termProperty5.setKey("002");
    termsProperty2.addTermProperty(termProperty5);
    org.monet.metamodel.TermProperty termProperty8 = new org.monet.metamodel.TermProperty();
    termProperty8.setLabel("Inglés");
    termProperty8.setKey("003");
    termsProperty2.addTermProperty(termProperty8);
    org.monet.metamodel.TermProperty termProperty11 = new org.monet.metamodel.TermProperty();
    termProperty11.setLabel("Conocimiento del Medio");
    termProperty11.setKey("004");
    termsProperty2.addTermProperty(termProperty11);
    org.monet.metamodel.TermProperty termProperty14 = new org.monet.metamodel.TermProperty();
    termProperty14.setLabel("Educación Física");
    termProperty14.setKey("005");
    termsProperty2.addTermProperty(termProperty14);
    org.monet.metamodel.TermProperty termProperty17 = new org.monet.metamodel.TermProperty();
    termProperty17.setLabel("Plástica");
    termProperty17.setKey("006");
    termsProperty2.addTermProperty(termProperty17);
    org.monet.metamodel.TermProperty termProperty20 = new org.monet.metamodel.TermProperty();
    termProperty20.setLabel("Música");
    termProperty20.setKey("007");
    termsProperty2.addTermProperty(termProperty20);
    org.monet.metamodel.TermProperty termProperty23 = new org.monet.metamodel.TermProperty();
    termProperty23.setLabel("Religión");
    termProperty23.setKey("008");
    termsProperty2.addTermProperty(termProperty23);
    org.monet.metamodel.TermProperty termProperty26 = new org.monet.metamodel.TermProperty();
    termProperty26.setLabel("Alternativa");
    termProperty26.setKey("009");
    termsProperty2.addTermProperty(termProperty26);
    this.setTerms(termsProperty2);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(solicitud.shared.subjects.$Definition$.class,"solicitud.shared.Subjects",null);
  }
  }
  
  public static String static_getName() {
    return "Subjects";
  }
  
  public String getClientBehaviour() {
    return "var mxumwbq = new Object();mxumwbq.refresh = function (node) {if (!node.isEditable()) return;};mxumwbq.onChangeField = function (node, field) {};";
  }
}
