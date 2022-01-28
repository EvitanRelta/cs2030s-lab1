abstract class ShopEvent extends Event {
  protected final Counter[] counters;
  protected final Customer customer;

  public ShopEvent(double time, Counter[] counters, Customer customer) {
    super(time);
    this.counters = counters;
    this.customer = customer;
  }

  protected Counter getAvailableCounter() {
    for (Counter counter : counters)
      if (counter.isAvailable())
        return counter;
    return null;
  }
}
