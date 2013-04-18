package ceip.shared.academicyears;

import org.monet.metamodel.ThesaurusDefinition;
import org.monet.metamodel.interfaces.HasClientBehaviour;

@SuppressWarnings("all")
public class $Definition$ extends ThesaurusDefinition implements HasClientBehaviour {
  public $Definition$() {
    super();this._code = "mgfmwna";
    this._name = "ceip.shared.AcademicYears";
    this._isAbstract = null;this._label = "Años Académicos";
    this._ontology = "AñosAcademicosAdmin";
    org.monet.metamodel.ThesaurusDefinition.TermsProperty termsProperty2 = new org.monet.metamodel.ThesaurusDefinition.TermsProperty();
    org.monet.metamodel.TermProperty termProperty2 = new org.monet.metamodel.TermProperty();
    termProperty2.setLabel("2011/2012");
    termProperty2.setKey("001");
    termsProperty2.addTermProperty(termProperty2);
    org.monet.metamodel.TermProperty termProperty5 = new org.monet.metamodel.TermProperty();
    termProperty5.setLabel("2012/2013");
    termProperty5.setKey("002");
    termsProperty2.addTermProperty(termProperty5);
    org.monet.metamodel.TermProperty termProperty8 = new org.monet.metamodel.TermProperty();
    termProperty8.setLabel("2013/2014");
    termProperty8.setKey("003");
    termsProperty2.addTermProperty(termProperty8);
    org.monet.metamodel.TermProperty termProperty11 = new org.monet.metamodel.TermProperty();
    termProperty11.setLabel("2014/2015");
    termProperty11.setKey("004");
    termsProperty2.addTermProperty(termProperty11);
    org.monet.metamodel.TermProperty termProperty14 = new org.monet.metamodel.TermProperty();
    termProperty14.setLabel("2015/2016");
    termProperty14.setKey("005");
    termsProperty2.addTermProperty(termProperty14);
    this.setTerms(termsProperty2);
    
  }
  static {
  {
    org.monet.metamodel.Dictionary.getCurrentInstance().register(ceip.shared.academicyears.$Definition$.class,"ceip.shared.AcademicYears",null);
  }
  }
  
  public static String static_getName() {
    return "AcademicYears";
  }
  
  public String getClientBehaviour() {
    return "var mgfmwna = new Object();mgfmwna.refresh = function (node) {if (!node.isEditable()) return;};mgfmwna.onChangeField = function (node, field) {};";
  }
}
