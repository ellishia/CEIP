package direc.creditcards;

import direc.creditcards.Indice;
import org.monet.bpi.FieldNumber;
import org.monet.bpi.FieldSelect;
import org.monet.bpi.FieldText;
import org.monet.bpi.Node;
import org.monet.bpi.java.NodeFormImpl;
import org.monet.bpi.types.Term;

@SuppressWarnings("all")
public class CreditCard extends NodeFormImpl {
  public FieldNumber getCardNumberField() {
    return ((org.monet.bpi.FieldNumber)this.getField("CreditCard", "CardNumber"));
  }
  
  public org.monet.bpi.types.Number getCardNumber() {
    return ((org.monet.bpi.FieldNumber)this.getField("CreditCard", "CardNumber")).get();
  }
  
  public void setCardNumber(final org.monet.bpi.types.Number value) {
    this.getCardNumberField().set(value);
  }
  
  public void setCardNumber(final double value) {
    this.getCardNumberField().set(new org.monet.bpi.types.Number(value));
  }
  
  public FieldText getBankField() {
    return ((org.monet.bpi.FieldText)this.getField("CreditCard", "Bank"));
  }
  
  public String getBank() {
    return ((org.monet.bpi.FieldText)this.getField("CreditCard", "Bank")).get();
  }
  
  public void setBank(final String value) {
    this.getBankField().set(value);
  }
  
  public FieldNumber getMoneyCreditField() {
    return ((org.monet.bpi.FieldNumber)this.getField("CreditCard", "MoneyCredit"));
  }
  
  public org.monet.bpi.types.Number getMoneyCredit() {
    return ((org.monet.bpi.FieldNumber)this.getField("CreditCard", "MoneyCredit")).get();
  }
  
  public void setMoneyCredit(final org.monet.bpi.types.Number value) {
    this.getMoneyCreditField().set(value);
  }
  
  public void setMoneyCredit(final double value) {
    this.getMoneyCreditField().set(new org.monet.bpi.types.Number(value));
  }
  
  public FieldSelect getAcademicYearField() {
    return ((org.monet.bpi.FieldSelect)this.getField("CreditCard", "AcademicYear"));
  }
  
  public Term getAcademicYear() {
    return ((org.monet.bpi.FieldSelect)this.getField("CreditCard", "AcademicYear")).get();
  }
  
  public void setAcademicYear(final Term value) {
    this.getAcademicYearField().set(value);
  }
  
  public Indice getIndice() {
    return (direc.creditcards.Indice)this.getIndexEntry("direc.CreditCards.Indice");
  }
  
  public void executeCommand(final String operation) {
    super.executeCommand(operation);
  }
  
  public static CreditCard createNew(final Node parent) {
    return (direc.creditcards.CreditCard)org.monet.bpi.NodeService.create(direc.creditcards.CreditCard.class, parent);
  }
}
