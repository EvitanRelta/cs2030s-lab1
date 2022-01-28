class DepartureEvent extends ShopEvent {
  public DepartureEvent(double time, Counter[] counters, Customer customer) {
    super(time, counters, customer);
  }

  @Override
  public Event[] simulate() {
    return new Event[] {};
  }

  @Override
  public String toString() {
    return super.toString()
      + String.format(": Customer %d departed", customer.getId());
  }
}
