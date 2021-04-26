Catchau - Sistema de Locação de Veículos
Sistema de locação de carros para a disciplina de Programação de Aplicativos, 2021.

Lista de itens para desenvolver:
Tela Inicial [FEITO]
• 4 botões que levam para cada uma das telas: • Cadastro de veículos;

• Cadastro de clientes;

• Cadastro de locação;

• Relatórios;

Tela Cadastro de Veículos [FEITO]
• Campos de texto para os dados

◦ Número do RENAVAN;

◦ Número da placa;

◦ Modelo;

◦ Marca;

◦ Ano de fabricação;

◦ Valor de indenização do seguro;

◦ tempo para realização da manutenção preventiva;

◦ Km atual;

◦ Preço da diária, semanal, quinzenal, mensal, por hora e por hora excedente

◦ Informações técnicas;

• Imagem do veículo;

Tela Cadastro de Clientes [FEITO]
• Opção para escolher se é cliente físico ou jurídico;

• Tipo do cliente:

◦ Físico – dados:

▪ Nome;

▪ Data de nascimento;

▪ Status (ativo, inativo ou bloqueado);

• Motivo do bloqueio (inadimplência, cobrança extrajudicial, cobrança judicial ou problemas cadastrais);

▪ CPF;

▪ RG;

▪ Endereço completo;

▪ Observação;

◦ Jurídico – dados:

▪ Nome fantasia;

▪ Status (ativo, inativo ou bloqueado);

• Motivo do bloqueio (inadimplência, cobrança extrajudicial, cobrança judicial ou problemas cadastrais);

▪ CNPJ;

▪ Inscrição Estadual;

▪ Endereço completo;

▪ Observação;

• Botão que leva a tela de cadastro de condutor;

Tela Cadastro de Motorista
• Condutor – dados:

◦ Número e tipo da carteira de Habilitação do condutor;

◦ Contatos, telefones e E-mail;

Tela Cadastro de Locação
Locação:
◦ Seleção do cliente;

• Buscar um cliente já cadastrado OU

• Incluir um cliente novo OU

• Atualizar os dados de um cliente selecionado;

▪ Quando o cliente possui status Inativo, o sistema deve avisar o atendente, forçando que seus dados cadastrais sejam conferidos.

▪ Quando o cliente está bloqueado um aviso é mostrado.

Seleção do condutor;
• Possível buscar os diversos condutores já cadastrados para o cliente OU

• Incluir novos condutores;

▪ Opção padrão = primeiro condutor cadastrado junto com os dados do cliente.

Seleção do veículo;
• Buscar os veículos por Renavan ou por placa;

◦ Veículo com manutenção vencida = um aviso será mostrado, mas a seleção não será impedida.

• Em seguida, a janela de seleção do tipo de locação (D – Locação por Diária; S – Locação por Semana; Q – Locação por Quinzena ou M – Locação por Mês) é apresentada;

• Então, tela com os dados da locação é apresentada com os seguintes dados:

◦ Código da locação;

◦ Renavan;

◦ Placa;

◦ Modelo;

◦ Marca;

◦ Ano;

◦ Última quilometragem;

◦ Tipo da locação (D, S, Q ou M);

◦ Quantidade de diárias ou 1 para semana, quinzena ou mês;

◦ Data da locação;

◦ Data prevista para devolução;

◦ Valor unitário da locação;

◦ Valor do seguro;

▪ Os valores do seguro são obtidos da tabela de preço dos veículos e servem como referência mas podem ser alterados.

◦ Valor total;

• É possível ainda incluir um texto e um valor de acréscimo, como por exemplo seguro extra, e este valor será cobrado uma única vez no primeiro faturamento.

Impressão do comprovante de entrega do veículo
▪ Placa;

▪ Modelo/marca do veículo

▪ Nome do cliente;

▪ Data da entrega;

▪ Valor da locação.

Renovação de Locação:
◦ Digitar o número do contrato e clicar no botão BUSCAR: os itens locados no contrato serão apresentados e o usuário poderá escolher renovar por igual período ou renovar por período diferente;

Devolução de veículo:
◦ Buscar o contrato que terá o veículo devolvido pelo nome do cliente ou pelo número do contrato;

◦ Após selecionar o veículo a ser devolvido, o usuário deve checar a data e a hora da devolução.

▪ Itens já faturados e devolvidos depois do prazo terão nova fatura a ser feita por ter excedido o período contratado. Este atraso ou não deverá ser assinalado no cadastro.

◦ Anotar a nova quilometragem do veículo.

◦ Se todos os itens deste contrato estiverem devolvidos e faturados e não existir fatura extra, o contrato será fechado.

◦ imprimir o comprovante de devolução dos bens:

▪ Dados do comprovante de entrega;

▪ Data de devolução;

▪ KM final;
