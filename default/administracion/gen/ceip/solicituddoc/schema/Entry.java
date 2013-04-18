package ceip.solicituddoc.schema;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "entry", strict = false)
@SuppressWarnings("all")
public class Entry {
  @Element(name = "Centers", required = false)
  private String Centers;
  
  public String getCenters() {
    return this.Centers;
  }
  
  public void setCenters(final String Centers) {
    this.Centers = Centers;
  }
  
  @Element(name = "Order", required = false)
  private org.monet.bpi.types.Number Order;
  
  public org.monet.bpi.types.Number getOrder() {
    return this.Order;
  }
  
  public void setOrder(final org.monet.bpi.types.Number Order) {
    this.Order = Order;
  }
}
