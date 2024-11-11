package programas;
public class CuentaBancaria {
    private String titular;
    private String numeroCuenta;
    private double saldo;
    private String tipoCuenta;
    
    // Constructor
    public CuentaBancaria(String titular, String numeroCuenta, double saldo, String tipoCuenta) {
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
    }
    // Métodos get y set para el titular
    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
    // Métodos get y set para el número de cuenta
    public String getNumeroCuenta() {
        return numeroCuenta;
    }
    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
    // Métodos get y set para el saldo
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    // Métodos get y set para el tipo de cuenta
    public String getTipoCuenta() {
        return tipoCuenta;
    }
    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }
}
