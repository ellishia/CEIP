package ceip.shared.levels;

import org.monet.metamodel.ThesaurusDefinition;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends ThesaurusDefinition implements HasClientBehaviour {
  public $Definition$() {
    super();this._code = "mfyh_va";
    this._name = "ceip.shared.Levels";
    this._isAbstract = null;this._label = "Levels";
    this._ontology = "LevelsDeAdministracion";
    org.monet.metamodel.ThesaurusDefinition.TermsProperty termsProperty2 = new org.monet.metamodel.ThesaurusDefinition.TermsProperty();
    org.monet.metamodel.TermProperty termProperty2 = new org.monet.metamodel.TermProperty();
    termProperty2.setLabel("Infantil 3 años");
    termProperty2.setKey("001");
    termsProperty2.addTermProperty(termProperty2);
    org.monet.metamodel.TermProperty termProperty5 = new org.monet.metamodel.TermProperty();
    termProperty5.setLabel("Infantil 4 años");
    termProperty5.setKey("002");
    termsProperty2.addTermProperty(termProperty5);
    org.monet.metamodel.TermProperty termProperty8 = new org.monet.metamodel.TermProperty();
    termProperty8.setLabel("Infantil 5 años");
    termProperty8.setKey("003");
    termsProperty2.addTermProperty(termProperty8);
    org.monet.metamodel.TermProperty termProperty11 = new org.monet.metamodel.TermProperty();
    termProperty11.setLabel("Primero Primaria");
    termProperty11.setKey("004");
    termsProperty2.addTermProperty(termProperty11);
    org.monet.metamodel.TermProperty termProperty14 = new org.monet.metamodel.TermProperty();
    termProperty14.setLabel("Segundo Primaria");
    termProperty14.setKey("005");
    termsProperty2.addTermProperty(termProperty14);
    org.monet.metamodel.TermProperty termProperty17 = new org.monet.metamodel.TermProperty();
    termProperty17.setLabel("Tercero Primaria");
    termProperty17.setKey("006");
    termsProperty2.addTermProperty(termProperty17);
    org.monet.metamodel.TermProperty termProperty20 = new org.monet.metamodel.TermProperty();
    termProperty20.setLabel("Cuarto Primaria");
    termProperty20.setKey("007");
    termsProperty2.addTermProperty(termProperty20);
    org.monet.metamodel.TermProperty termProperty23 = new org.monet.metamodel.TermProperty();
    termProperty23.setLabel("Quinto Primaria");
    termProperty23.setKey("008");
    termsProperty2.addTermProperty(termProperty23);
    org.monet.metamodel.TermProperty termProperty26 = new org.monet.metamodel.TermProperty();
    termProperty26.setLabel("Sexto Primaria");
    termProperty26.setKey("009");
    termsProperty2.addTermProperty(termProperty26);
    this.setTerms(termsProperty2);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(ceip.shared.levels.$Definition$.class,"ceip.shared.Levels",null);
  }
  }
  
  public static String static_getName() {
    return "Levels";
  }
  
  public String getClientBehaviour() {
    return "var mfyh_va = new Object();mfyh_va.refresh = function (node) {if (!node.isEditable()) return;};mfyh_va.onChangeField = function (node, field) {};";
  }
}
