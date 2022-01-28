class ServiceEndEvent extends ShopEvent {
  private Counter counter;

  public ServiceEndEvent(double time, Counter[] counters, Customer customer,
      Counter counter) {
    super(time, counters, customer);
    this.counter = counter;
  }

  @Override
  public Event[] simulate() {
    counter.endService();
    return new Event[] {
      new DepartureEvent(getTime(), counters, customer)
    };
  }

  @Override
  public String toString() {
    return super.toString()
      + String.format(": Customer %d service done (by Counter %d)",
          customer.getId(), counter.getId());
  }
}
