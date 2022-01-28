class ArrivalEvent extends ShopEvent {
  public ArrivalEvent(Counter[] counters, Customer customer) {
    super(customer.getArrivalTime(), counters, customer);
  }

  @Override
  public Event[] simulate() {
    Counter counter = getAvailableCounter();

    if (counter != null)
      return new Event[] {
        new ServiceBeginEvent(getTime(), counters, customer, counter)
      };
    return new Event[] {
      new DepartureEvent(getTime(), counters, customer)
    };
  }

  @Override
  public String toString() {
    return super.toString()
      + String.format(": Customer %d arrives", customer.getId());
  }
}

