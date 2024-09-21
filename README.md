Projeto: Padrão Singleton
Este projeto implementa o Padrão Singleton em Java, usando uma classe FabricaDeCarro. O objetivo deste padrão é garantir que exista apenas uma instância de uma determinada classe em todo o sistema. Ele é frequentemente utilizado em cenários onde é importante controlar o acesso a um recurso compartilhado ou garantir que uma classe tenha uma única instância global.

Descrição
O padrão Singleton é implementado na classe FabricaDeCarro. A classe possui um construtor privado e um método estático getInstancia(), que garante que apenas uma instância da fábrica seja criada e reutilizada.

Principais classes:
FabricaDeCarro: Implementa o padrão Singleton.
Teste: Classe que contém o método main para testar o funcionamento do Singleton.
Funcionamento:
A primeira chamada para FabricaDeCarro.getInstancia() cria uma nova instância da fábrica de carros.
As chamadas subsequentes para getInstancia() retornam a mesma instância, garantindo que apenas uma fábrica de carros esteja em operação.
O método fabricarCarro() simula a fabricação de um carro.
