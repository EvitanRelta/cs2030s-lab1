public class Customer {
  private final int id;
  private final double arrivalTime;
  private final double serviceTime;
  
  public Customer(int id, double arrivalTime, double serviceTime) {
    this.arrivalTime = arrivalTime;
    this.serviceTime = serviceTime;
    this.id = id;
  }

  public int getId() {
    return id;
  }

  public double getArrivalTime() {
    return arrivalTime;
  }

  public double getServiceTime() {
    return serviceTime;
  }
}
