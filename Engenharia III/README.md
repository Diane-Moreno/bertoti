<h1>Tabela</h1>

| nome do padrão | anti-padrão | definição do padrão | problema que ele resolve | exemplo |
|----------------|-------------|---------------------|--------------------------|---------|
| Strategy | Herança | Encapsula uma familia de algoritmos usando composição e os torna intercambiaveis usando polimorfismo | Encapsulamento | Aplicativo de processamento de pagamentos que permite que os usuários escolham entre diferentes estratégias de pagamento, como cartão de crédito ou transferência bancária |
| Obsever | Alto Acoplamento | Notificar múltiplos objetos sobre quaisquer eventos que aconteçam com o objeto  | Utilizamos o polimorfismo mas sem ocorrer o alto-acoplamento | Aplicativo de previsão do tempo, onde várias partes do aplicativo precisam ser atualizadas quando há uma mudança nas condições meteorológicas |
| Composite | Herança & alto-acoplamento | Utilizamos o polimorfismo mas sem ocorrer o alto-acoplamento | Tratar objetos individuais e grupos de objetos de forma uniforme | Uma estrutura hierárquica de arquivos e diretórios, onde um diretório pode conter subdiretórios e arquivos |
| Facade | Acoplamento excessivo | Quando se busca simplificar a interação com sistemas complexos, o objetivo é torná-los mais fáceis e reduzir sua dependência na relação com os clientes | Torna sistemas complexos mais fáceis de usar e compreender, diminuindo o acoplamento entre os componentes | Uma aplicação que carrega vídeos curtos engraçados com gatos para redes sociais poderia potencialmente usar uma biblioteca de conversão de vídeo profissional. |
| Singleton |  |  |  |  |
