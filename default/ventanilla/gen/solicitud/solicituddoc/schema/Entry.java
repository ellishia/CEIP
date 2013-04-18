package solicitud.solicituddoc.schema;

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
  private String Order;
  
  public String getOrder() {
    return this.Order;
  }
  
  public void setOrder(final String Order) {
    this.Order = Order;
  }
}
