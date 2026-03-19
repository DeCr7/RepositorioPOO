class CuentaBancaria(private var numeroCuenta: Int, private var saldo: Double)
{
    fun depositar(monto: Double) {
        saldo += monto
    }

    fun retirar(monto: Double) {
        saldo -= monto
    }

    fun consultarSaldo(): Double {
        return saldo
    }
}

fun main()
{
    val cuenta1 = CuentaBancaria(numeroCuenta=1, saldo=0.0)

    cuenta1.depositar(25.5)
    println(cuenta1.consultarSaldo())

    cuenta1.retirar(15.5)
    println(cuenta1.consultarSaldo())
}