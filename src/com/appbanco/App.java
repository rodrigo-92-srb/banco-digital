package com.appbanco;

public class App{

    public static void main(String[] args) {
          Conta cc = new ContaCorrente();
          cc.depositar(100);
          cc.imprimirExtrato();

          Conta cp = new ContaPoupanca();
          cc.tranferir(100, cp);

          cc.imprimirExtrato();
          cp.imprimirExtrato();
    }
}
