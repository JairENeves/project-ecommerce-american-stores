# Microsserviço
  Microsserviço baseado na arquitetura Eureka Spring Cloud

# Sumário
* [Introdução](#introducao)
* [Objetivo](#objetivo)
* [Evolução](#evolucao)
* [Instalação](#instalacao)
* [Pré-requisitos](#pre-requisitos)
* [Contratos de APIs](#contratos-de-apis)
* [Execução pelo Postman](#execucao-pelo-postman)
* [Equipe](#equipe)
* [Licença](#licenca)

## Introdução <a name="introducao"></a>
  O projeto Ecommerce American Stores tem como motivo atender o Case do Itaú.

## Objetivo <a name="objetivo"></a>
  O objetivo do projeto é mostrar os produtos no ecommerce.

## Evolução <a name="evolucao"></a>
  Não .

## Instalação <a name="instalacao"></a>
  Baixe o código-fonte desse repositório usando `git clone` ou de forma manual (.zip).
  Para prosseguir com a instação deste projeto é necessário atender a tabela de pré-requisitos com componentes na versão especificada ou superior.

## Pré-requisitos <a name="pre-requisitos"></a>
  Componente	          Versão	            Descrição

  OpenJDK	              1.8 (LTS) 	          Plataforma Java

  Apache Maven	        3.6.1	                Build e Gestão de Dependências
               
  MySql                 runtime               MySql Database

## Contratos de APIs <a name="contratos-de-apis"></a>
  Este projeto utiliza a especificação OpenAPI para documentação e catálogo de APIs. Depois de executar a aplicação, é possível consultar todas operações fornecidas pelo serviço e testá-las respectivamente acessando o endereço `http://localhost:{port}/swagger-ui.html`.

## Execução pelo Postman <a name="execucao-pelo-postman"></a>

EndPoint Get: http://localhost:9001/oauth/token

Request:
Header:
    client-id: ecommerce
    client-secret: $2a$10$p9Pk0fQNAQSesI4vuvKA0OZanDD2
```json
{
  "grant_type": "password",
  "username": "admin",
  "password": "123456"
}
```

Response

```json
{
    "access_token": "09ad753a-1844-4838-9599-5c35e99b41bc",
    "token_type": "bearer",
    "refresh_token": "84669a1d-26fa-4e56-b6e2-e1e8e54b0bed",
    "expires_in": 1781,
    "scope": "read write"
}
```
EndPoint Get: http://localhost:9003/product/findAll

Request:
Header:
    Authorization: Bearer 09ad753a-1844-4838-9599-5c35e99b41bc

Response

```json
{
    "headers": {},
    "body": [
        {
            "productId": 1,
            "description": "Fogão Continental 5 Bocas Automático FC5CB com Mesa Compartimentada Bivolt – Branco",
            "price": 1999.99,
            "stock": 8,
            "technicalSpecification": "CorBranco\nCapacidade do forno (litros)91\nTensão/Voltagembivolt\nConsumo de EnergiaA (menos 25% de consumo)\nGarantia12 meses\nObservações\n- Este modelo sai de fábrica sem lâmpada por ser bivolt. Adquira uma lâmpada com rosca do tipo E14 própria para fogões na tensão adequada com a disponível em sua residência, 127 V ou 220 V e com potência máxima de 25 W.\nEntrega do ProdutoNão nos responsabilizamos pelo transporte por escadas/elevadores, guincho ou içamento deste produto.\norientamos que este produto seja montado por um técnico de sua confiança, após a sua entrega\nTodas as instruções, manuais e peças necessárias para a montagem são fornecidas junto com o produto\nnão nos responsabilizamos pela instalação/montagem",
            "dimension": "Altura 96,30 Centimetros \nLargura 77,50 Centimetros \nProfundidade 59,20 Centimetros \nPeso 32,00 Quilos",
            "characteristic": "AcendimentoAutomático\nNúmero de bocas5\nCaracterísticas Gerais\nAcabamento Frontal Preto\n- Design diferenciado, moderno e robusto para a sua cozinha.\n\nPés altos, vidro interno removível e botões removíveis\n- Facilita a limpeza no dia a dia.\n\nGrades duplas\n- Com mesa compartimentada, impede o derramamento de líquidos pela mesa do produto e facilita a limpeza.\n\n5 Queimadores\n- Mais potência no momento da cocção. Conta com 3 queimadores semirrápidos e 2 queimadores rápidos.\n\nForno de 91L\n- Mais espaço e comodidade no preparo dos seus maiores pratos.\n\nAcendimento automático – mesa e forno\n- Ignição rápida, fácil e segura.\nTimerNão\nBotões removíveisSim\nForno autolimpanteNão\nLuz no fornoSim\nPrateleiras do forno1\nGrill no fornoNão\nEstufaNão\nCozimento a vapor no fornoNão\nAcompanha LâmpadaNão",
            "productPicture": []
        },
        {
            "productId": 2,
            "description": "Tablet Samsung Galaxy Tab A 8\" T290 Wi-Fi, 32GB, 2GB RAM, Tela de 8\", Câmera Traseira 8MP, Câmera Frontal de 2MP e Android 9.0 - Preto",
            "price": 849.50,
            "stock": 60,
            "technicalSpecification": "Tensão/Voltagembivolt\nGarantia12 meses\nConexão Wireless802.11 a/b/g/n\nFrequência GSMNão possui\nObservações\n1. A capacidade total disponível da memória interna é menor que a capacidade especificada (32GB), devido ao sistema operacional e às aplicações padrões que já vem instaladas no aparelho, ocupando parte da memória.\n\n2. Os tempos de operação da bateria são estimados apenas e dependem de uma variedade de condições do uso.\n\n3. Este tablet não possui entrada para um chip.\n\n(**) Tela medida diagonalmente como um retângulo, sem contar a área ocupada pela câmera e os cantos arredondados.\nFrequência de dados Não possui\nBateria 5100mAh\nConteúdo da embalagem- Tablet Samsung Galaxy Tab A 8\" Wi-Fi (SM-T290)\n- Carregador\n- Cabo USB\n- Manual do usuário\nPortas USBNão possui\nPorta Micro-USB1\nSaída HDMINão possui\nBluetoothSim\nOutras conexõesFone de ouvido\nCartão de memória\nCorPreto\n",
            "dimension": "Tablet Samsung Galaxy Tab A 8\" T290 Wi-Fi, 32GB, 2GB RAM, Tela de 8\", Câmera Traseira 8MP, Câmera Frontal de 2MP e Android 9.0 - Preto\nAltura 21,00 Centimetros\nLargura 12,44 Centimetros \nProfundidade 8,00 Milimetros \nPeso 345,00 Gramas",
            "characteristic": "Características Gerais\n- Tela Infinita de 8.0\" (**)\n- Câmera Traseira de 8MP\n- Câmera frontal de 2MP\n- 32GB de Memória Interna e 2GB RAM\n- Bateria de 5.100mAh\n- Auto-Falantes duplos\n- Suporte ao Cartão de Memória MicroSD de até 512GB\n- Sensores: Acelerômetro, Sensor de Luz\nProcessadorQuad-Core de 2,0 GHz\nSistema operacionalAndroid 9.0 (Pie)\nTamanho da tela8\"\nTecnologiaWi-Fi\nResolução da câmeraTraseira 8MP e Frontal 2MP\nRotação automática da telaSim\nTV DigitalNão\nGPSSim\nGrava vídeosSim\nCâmera traseiraSim\nCâmera frontalSim\nMemória Flash32 GB\nFunciona como celularNão\nTipo de telaCapacitiva\nMemória RAM2 GB",
            "productPicture": []
        },
        {
            "productId": 3,
            "description": "Forno de Micro-ondas Electrolux MTO30 - 20L - Branco",
            "price": 250.99,
            "stock": 25,
            "technicalSpecification": "Potência (W)1000w\nTensão/Voltagem110V\n220V\nCorBranco\nConsumo de EnergiaA (menos 25% de consumo)\nDiâmetro do prato315mm\nGarantia12 Meses\nEntrega do ProdutoNão nos responsabilizamos pelo transporte por escadas/elevadores, guincho ou içamento deste produto.\nnão nos responsabilizamos pela instalação/montagem",
            "dimension": "Forno de Micro-ondas Electrolux MTO30 - 20L - Branco 110V \nAltura 26,50 Centimetros \nLargura 45,50 Centimetros \nProfundidade 36,00 Centimetros",
            "characteristic": "Características Gerais\n- Tira Odor\n- QR CODE\n- Menu Kids\n- Função Manter Aquecido\n\nEspecificações técnicas\n\n-Altura (mm) 265\n-Largura (mm) 455\n-Profundidade (mm) 360\n-Altura do produto embalado (mm) 290\n-Largura do produto embalado (mm) 490\n-Profundidade do produto embalado (mm) 385\n-Tensão elétrica (V) 127V / 220V\n-Frequência (Hz) 60\n-Cor Branco\n-Peso líquido (kg) 9,83\n-Peso bruto (kg) 11,83\n-Volume (L) 20\nFunção GrillNão\nCapacidade (litros)20",
            "productPicture": []
        }
    ],
    "statusCode": "OK",
    "statusCodeValue": 200
}
```


## Equipe <a name="equipe"></a>
  Responsáveis pelo projeto:

  | Nome          | Email                         |
  |---------------|------------------------------ |
  | Jair Neves    | jair.e.neves@gmail.com        |

## Licença <a name="licenca"></a>
  Direitos reservados do Jair Neves.

