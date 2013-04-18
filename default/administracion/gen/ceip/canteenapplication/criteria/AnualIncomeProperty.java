package ceip.canteenapplication.criteria;

import org.monet.metamodel.BooleanFieldProperty;

@SuppressWarnings("all")
public class AnualIncomeProperty extends BooleanFieldProperty {
  public AnualIncomeProperty() {
    super();this._code = "mn3jung";
    this._name = "AnualIncome";
    this._label = "Renta Anual";
    
  }
  
  public static String static_getName() {
    return "AnualIncome";
  }
}
