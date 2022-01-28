public class Counter {
  private final int id;
  private Customer customer;

  public Counter(int id) {
    this.id = id;
  }

  public int getId() {
    return id;
  }

  public boolean isAvailable() {
    return this.customer == null;
  }

  public void serve(Customer customer) {
    this.customer = customer;
  }

  public void endService() {
    customer = null;
  }
}
