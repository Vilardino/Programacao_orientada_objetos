// @author Guilherme Vilar Balduino 743546


public class ConversorMonetario {
    
    private double taxac, taxav, quantia;

    public ConversorMonetario(double taxac, double taxav, double quantia) {
        this.taxac = taxac;
        this.taxav = taxav;
        this.quantia = quantia;
    }
    
    public void imprimeTaxas(){
        System.out.println("A taxa de compra é:" + taxac + " A taxa de venda é:" + taxav);
    }
    
    public double vendeDolar(){
        return getQuantia()*taxav; 
    }
    
    public double compraDolar(){
        return getQuantia()*taxac;
    }

    public void setQuantia(double quantia) {
        this.quantia = quantia;
    }

    public double getQuantia() {
        return quantia;
    }

    public double getTaxac() {
        return taxac;
    }

    public double getTaxav() {
        return taxav;
    }

    public void setTaxav(double taxav) {
        this.taxav = taxav;
    }

    public void setTaxac(double taxac) {
        this.taxac = taxac;
    }

    
    
}
