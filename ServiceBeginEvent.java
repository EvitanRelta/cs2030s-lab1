class ServiceBeginEvent extends ShopEvent {
  private Counter counter;

  public ServiceBeginEvent(double time, Counter[] counters,
      Customer customer, Counter counter) {
    super(time, counters, customer);
    this.counter = counter;
    counter.serve(customer);
  }

  @Override
  public Event[] simulate() {
    double endTime = getTime() + customer.getServiceTime();
    return new Event[] {
      new ServiceEndEvent(endTime, counters, customer, counter)
    };
  }

  @Override
  public String toString() {
    return super.toString()
      + String.format(": Customer %d service begin (by Counter %d)",
          customer.getId(), counter.getId());
  }
}
