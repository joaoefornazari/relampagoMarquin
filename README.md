# Catchau - Sistema de Locação de Veículos
Sistema de locação de carros para a disciplina de Programação de Aplicativos, 2021.

# Lista de itens para desenvolver:

## Tela Inicial [FEITO]

## Tela Cadastro de Veículos [FEITO]

## Tela Cadastro de Clientes [FEITO]

## Tela Cadastro de Motorista

•	Condutor – dados:

◦	Número e tipo da carteira de Habilitação do condutor;

◦	Contatos, telefones e E-mail;


## Tela Cadastro de Locação

### Locação [FEITO]

### Seleção do condutor [FEITO]

### Seleção do veículo [FEITO]

### Tela de exibição da locação escolhida

Então, tela com os dados da locação é apresentada com os seguintes dados:

◦	Código da locação;

◦	Renavan;

◦	Placa;

◦	Modelo;

◦	Marca;

◦	Ano;

◦	Última quilometragem;

◦	Tipo da locação (D, S, Q ou M);

◦	Quantidade de diárias ou 1 para semana, quinzena ou mês;

◦	Data da locação;

◦	Data prevista para devolução;

◦	Valor unitário da locação;

◦	Valor do seguro;

▪	Os valores do seguro são obtidos da tabela de preço dos veículos e servem como referência mas podem ser alterados.

◦	Valor total;

•	É possível ainda incluir um texto e um valor de acréscimo, como por exemplo seguro extra, e este valor será cobrado uma única vez no primeiro faturamento.


### Impressão do comprovante de entrega do veículo
▪	Placa;

▪	Modelo/marca do veículo

▪	Nome do cliente;

▪	Data da entrega;

▪	Valor da locação.


## Renovação de Locação:
◦	Digitar o número do contrato e clicar no botão BUSCAR: os itens locados no contrato serão apresentados e o usuário poderá escolher renovar por igual período ou renovar por período diferente;


## Devolução de veículo:
◦	Buscar o contrato que terá o veículo devolvido pelo nome do cliente ou pelo número do contrato;

◦	Após selecionar o veículo a ser devolvido, o usuário deve checar a data e a hora da devolução.

▪	Itens já faturados e devolvidos depois do prazo terão nova fatura a ser feita por ter excedido o período contratado. Este atraso ou não deverá ser assinalado no cadastro.

◦	Anotar a nova quilometragem do veículo.

◦	Se todos os itens deste contrato estiverem devolvidos e faturados e não existir fatura extra, o contrato será fechado.

◦	imprimir o comprovante de devolução dos bens:

▪	Dados do comprovante de entrega;

▪	Data de devolução;

▪	KM final;
