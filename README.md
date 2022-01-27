# Banco Digital 💰💻
Banco digital aplicando conceitos básicos de orientação a Objetos em Java.

Aplicação de um banco digital criada em Java utilizando os conceitos dos pilares da orientação a objetos: 

+ Abstração
+ Encapsulamento
+ Herança
+ Polimorfismo.

### Abstração
<div>
    <p>A abstração é utlizada para simplificar os objetos de maneira que apenas suas características (atributos) e comportamentos (métodos) que são relevantes ao sistema são representados.</p>
    <p> Na aplicação em questão temos o exemplo da Conta bancária, uma conta bancária do mundo real tem várias características, mas apenas as características: agencia, número e saldo são relevantes ao sistema. </p>
</div>

### Encapsulamento
<div>
     <p>O encapsulamento foi utilizado na aplicação de forma que atributos por exemplo não podem ser acessados publicamente. </p>
     <p>A classe Conta por exemplo: implementa a interface IConta recebendo todos os métodos abstratos da mesma. Sendo assim, não podemos acessar os métodos da interface IConta diretamente, apenas através da classe Conta. </p>
</div>

### Herança
<div>
    <p>As classes ContaCorrente e ContaPoupanca herdam características da classe Conta.</p>
    <p>O conceito de herança foi aplicado de forma que a classe filha ContaCorrente possui um método imprimirInfosComuns e utiliza o super para imprimir informações
    comuns a qualquer tipo de conta dentro do método imprimirExtrato.</p>
</div>

### Polimorfismo
<div>
    <p></p>
</div>
