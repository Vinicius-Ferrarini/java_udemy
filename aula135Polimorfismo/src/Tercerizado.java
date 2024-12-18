public class Tercerizado extends Employee{
    private Double adicional;

    public Tercerizado(String name, Integer hours, Double valuePerHour, Double adicional) {
        super(name, hours, valuePerHour);
        this.adicional = adicional;
    }

    public Double getAdicional() {
        return adicional;
    }

    public void setAdicional(Double adicional) {
        this.adicional = adicional;
    }

    @Override
    public Double payment(){
        return super.payment() + adicional * 1.1;
     }
}
