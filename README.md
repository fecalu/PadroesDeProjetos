# Projeto: Padrão Singleton

Este projeto implementa o **Padrão Singleton** em Java, usando uma classe `FabricaDeCarro`. O objetivo deste padrão é garantir que exista apenas uma instância de uma determinada classe em todo o sistema. Ele é frequentemente utilizado em cenários onde é importante controlar o acesso a um recurso compartilhado ou garantir que uma classe tenha uma única instância global.

## Descrição

O padrão Singleton é implementado na classe `FabricaDeCarro`. A classe possui um construtor privado e um método estático `getInstancia()`, que garante que apenas uma instância da fábrica seja criada e reutilizada.

### Principais classes:

- `FabricaDeCarro`: Implementa o padrão Singleton.
- `Teste`: Classe que contém o método `main` para testar o funcionamento do Singleton.

### Funcionamento:

1. A primeira chamada para `FabricaDeCarro.getInstancia()` cria uma nova instância da fábrica de carros.
2. As chamadas subsequentes para `getInstancia()` retornam a mesma instância, garantindo que apenas uma fábrica de carros esteja em operação.
3. O método `fabricarCarro()` simula a fabricação de um carro.

## Código

### FabricaDeCarro.java
```java
package PadraoSingleton;

class FabricaDeCarro {

    private static FabricaDeCarro instanciaUnica;

    private FabricaDeCarro() {

    }

    public static FabricaDeCarro getInstancia() {
        if (FabricaDeCarro.instanciaUnica == null) {
            FabricaDeCarro.instanciaUnica = new FabricaDeCarro();
        }
        return instanciaUnica;
    }

    public void fabricarCarro() {
        System.out.println("Carro fabricado!");
    }
}
