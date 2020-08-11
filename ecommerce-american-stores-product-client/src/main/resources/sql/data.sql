insert into manufacturer (manufacturer_id, fantasy_name, company_name, cnpj, created_at) 
SELECT * FROM (SELECT 1, 'Continental', 'Continental Brasil Ltda', '25.546.548/0001-45',SYSDATE()) AS tmp
WHERE NOT EXISTS (
    SELECT manufacturer_id FROM manufacturer WHERE manufacturer_id = 1
) LIMIT 1;

insert into product (product_id, description, price, stock, technical_specification, dimension, characteristic, manufacturer_id,created_at)
values ( 1, 
'Fogão Continental 5 Bocas Automático FC5CB com Mesa Compartimentada Bivolt – Branco',
1999.99, 
8,
'CorBranco
Capacidade do forno (litros)91
Tensão/Voltagembivolt
Consumo de EnergiaA (menos 25% de consumo)
Garantia12 meses
Observações
- Este modelo sai de fábrica sem lâmpada por ser bivolt. Adquira uma lâmpada com rosca do tipo E14 própria para fogões na tensão adequada com a disponível em sua residência, 127 V ou 220 V e com potência máxima de 25 W.
Entrega do ProdutoNão nos responsabilizamos pelo transporte por escadas/elevadores, guincho ou içamento deste produto.
orientamos que este produto seja montado por um técnico de sua confiança, após a sua entrega
Todas as instruções, manuais e peças necessárias para a montagem são fornecidas junto com o produto
não nos responsabilizamos pela instalação/montagem',
'Altura 96,30 Centimetros 
Largura 77,50 Centimetros 
Profundidade 59,20 Centimetros 
Peso 32,00 Quilos',
'AcendimentoAutomático
Número de bocas5
Características Gerais
Acabamento Frontal Preto
- Design diferenciado, moderno e robusto para a sua cozinha.

Pés altos, vidro interno removível e botões removíveis
- Facilita a limpeza no dia a dia.

Grades duplas
- Com mesa compartimentada, impede o derramamento de líquidos pela mesa do produto e facilita a limpeza.

5 Queimadores
- Mais potência no momento da cocção. Conta com 3 queimadores semirrápidos e 2 queimadores rápidos.

Forno de 91L
- Mais espaço e comodidade no preparo dos seus maiores pratos.

Acendimento automático – mesa e forno
- Ignição rápida, fácil e segura.
TimerNão
Botões removíveisSim
Forno autolimpanteNão
Luz no fornoSim
Prateleiras do forno1
Grill no fornoNão
EstufaNão
Cozimento a vapor no fornoNão
Acompanha LâmpadaNão',
1,SYSDATE());


insert into manufacturer (manufacturer_id, fantasy_name, company_name, cnpj, created_at) 
SELECT * FROM (SELECT 2, 'Samsung', 'Samsung Brasil Ltda', '40.456.645/0001-88',SYSDATE()) AS tmp
WHERE NOT EXISTS (
    SELECT manufacturer_id FROM manufacturer WHERE manufacturer_id = 2
) LIMIT 1;

insert into product (product_id, description, price, stock, technical_specification, dimension, characteristic, manufacturer_id,created_at)
values ( 2, 
'Tablet Samsung Galaxy Tab A 8" T290 Wi-Fi, 32GB, 2GB RAM, Tela de 8", Câmera Traseira 8MP, Câmera Frontal de 2MP e Android 9.0 - Preto',
849.50, 
60,
'Tensão/Voltagembivolt
Garantia12 meses
Conexão Wireless802.11 a/b/g/n
Frequência GSMNão possui
Observações
1. A capacidade total disponível da memória interna é menor que a capacidade especificada (32GB), devido ao sistema operacional e às aplicações padrões que já vem instaladas no aparelho, ocupando parte da memória.

2. Os tempos de operação da bateria são estimados apenas e dependem de uma variedade de condições do uso.

3. Este tablet não possui entrada para um chip.

(**) Tela medida diagonalmente como um retângulo, sem contar a área ocupada pela câmera e os cantos arredondados.
Frequência de dados Não possui
Bateria 5100mAh
Conteúdo da embalagem- Tablet Samsung Galaxy Tab A 8" Wi-Fi (SM-T290)
- Carregador
- Cabo USB
- Manual do usuário
Portas USBNão possui
Porta Micro-USB1
Saída HDMINão possui
BluetoothSim
Outras conexõesFone de ouvido
Cartão de memória
CorPreto
',
'Tablet Samsung Galaxy Tab A 8" T290 Wi-Fi, 32GB, 2GB RAM, Tela de 8", Câmera Traseira 8MP, Câmera Frontal de 2MP e Android 9.0 - Preto
Altura 21,00 Centimetros
Largura 12,44 Centimetros 
Profundidade 8,00 Milimetros 
Peso 345,00 Gramas',
'Características Gerais
- Tela Infinita de 8.0" (**)
- Câmera Traseira de 8MP
- Câmera frontal de 2MP
- 32GB de Memória Interna e 2GB RAM
- Bateria de 5.100mAh
- Auto-Falantes duplos
- Suporte ao Cartão de Memória MicroSD de até 512GB
- Sensores: Acelerômetro, Sensor de Luz
ProcessadorQuad-Core de 2,0 GHz
Sistema operacionalAndroid 9.0 (Pie)
Tamanho da tela8"
TecnologiaWi-Fi
Resolução da câmeraTraseira 8MP e Frontal 2MP
Rotação automática da telaSim
TV DigitalNão
GPSSim
Grava vídeosSim
Câmera traseiraSim
Câmera frontalSim
Memória Flash32 GB
Funciona como celularNão
Tipo de telaCapacitiva
Memória RAM2 GB',
2,SYSDATE());




insert into manufacturer (manufacturer_id, fantasy_name, company_name, cnpj, created_at) 
SELECT * FROM (SELECT 3, 'Eletrolux', 'Eletrolux Brasil Ltda', '20.321.123/0001-77',SYSDATE()) AS tmp
WHERE NOT EXISTS (
    SELECT manufacturer_id FROM manufacturer WHERE manufacturer_id = 3
) LIMIT 1;

insert into product (product_id, description, price, stock, technical_specification, dimension, characteristic, manufacturer_id,created_at)
values ( 3, 
'Forno de Micro-ondas Electrolux MTO30 - 20L - Branco',
250.99, 
25,
'Potência (W)1000w
Tensão/Voltagem110V
220V
CorBranco
Consumo de EnergiaA (menos 25% de consumo)
Diâmetro do prato315mm
Garantia12 Meses
Entrega do ProdutoNão nos responsabilizamos pelo transporte por escadas/elevadores, guincho ou içamento deste produto.
não nos responsabilizamos pela instalação/montagem',
'Forno de Micro-ondas Electrolux MTO30 - 20L - Branco 110V 
Altura 26,50 Centimetros 
Largura 45,50 Centimetros 
Profundidade 36,00 Centimetros',
'Características Gerais
- Tira Odor
- QR CODE
- Menu Kids
- Função Manter Aquecido

Especificações técnicas

-Altura (mm) 265
-Largura (mm) 455
-Profundidade (mm) 360
-Altura do produto embalado (mm) 290
-Largura do produto embalado (mm) 490
-Profundidade do produto embalado (mm) 385
-Tensão elétrica (V) 127V / 220V
-Frequência (Hz) 60
-Cor Branco
-Peso líquido (kg) 9,83
-Peso bruto (kg) 11,83
-Volume (L) 20
Função GrillNão
Capacidade (litros)20',
3,SYSDATE());



--INSERT INTO product_picture (product_picture_id,name,image, main_image, product_id) VALUES (2,'TabletSamsung',LOAD_FILE('../imagens/TabletSamsung.jpg'),'S',2);

commit;