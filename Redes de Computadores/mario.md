# Meios físicos de transmissão

Para definir os meios físicos é necessário entender o comportamento dos bits. Um bit viaja partir de um sistema através de uma série de links e roteadores até atingir o sistema de destino. Nesse caminho, o bit é transmitido diversas vezes. O sistema de origem transmite o bit, o primeiro roteador recebe o bit e o transmite e assim por diante. Enquanto viaja da origem para o destino, o bit passa por uma série de transmissores e receptores. Cada bit é enviado pela propagação de ondas eletromagnéticas ou pulsos ópticos através de um meio físico. Os meios físicos podem ter formas distintas e não precisam ser do mesmo tipo em todo o caminho. 

Exemplos de **meios físicos** incluem _par-trançado_, _cabo coaxial_, _cabo de fibra-óptica_, _espectro de rádio terrestre_, e, _espectro de rádio por satélite_. 

**Os meios físicos  dividem-se em duas categorias:**

* **Nos meios encapsulados**, as ondas percorrem um material sólido. Os exemplos desse tipo de meio são: _cabo de fibra-óptica_, _par-trançado_ e _cabo coaxial_. 

* **Nos meios não encapsulados**, as ondas propagam-se na atmosfera e no espaço. Exemplos: _LAN wireless_ e _canal digital de satélite_. 


# Par trançado

Em sua forma mais simples, o cabo de par trançado é constituído por dois filamentos isolados de cobre torcidos. Há dois tipos de cabos de par trançado: **par trançado não-blindado** (UTP, Unshielded Twisted-Pair) e **par trançado blindado** (STP, Shielded Twisted-Pair).

**Os UTPs são divididos em 5 categorias:**

* Categoria 1: sistema de telefonia;

* Categoria 2: UTP tipo 3 definido pela IBM. Baixa transmissão.

* Categoria 3: transmissão de até 16 Mhz. Utilização típica em até 10 Mbps.

* Categoria 4: transmissão de até 20 Mhz . Utilização típica em até 16Mbps.

* Categoria 5: transmissão de até 100 Mhz. Utilização típica em até 100Mbps. 

O **par trançado** utiliza o conector telefônico _RJ-45_ para conectar-se a um computador. Esse conector é semelhante ao conector telefônico _RJ-11_ (conector utilizado na telefonia)


# Fibra óptica
O cabo de fibra óptica é apropriado para transmissão de dados a grande velocidade e alta capacidade, devido à ausência de atenuação e à pureza do sinal.

#### Composição
Os cabos de **fibra óptica** são compostos por dois fios(um para a recepção e outro para a transmissão) formados por minúsculos cilindros de vidro. Possui duas camadas: Núcleo (vítreo) e Revestimento (Silicone).

#### Considerações sobre a fibra óptica:

* Utilize cabo de fibra óptica se:

Tiver que transmitir dados a velocidade muito altas, ao longo de grandes distâncias, em uma mídia extremamente segura.

* Não utilize cabo de fibra óptica se:

Estiver sujeito a um orçamento bastante limitado;
Não tiver o conhecimento especializado para a instalação e para a conexão correta dos dispositivos.

Para criarmos um sistema de comunicação através de **fibras ópticas**, precisamos de alguns elementos além da fibra tais como receptores e Transmissores, que transformam o sinal elétrico em luminoso, e vice versa.

###  A comunicação se estabelece da seguinte forma 

O equipamento, _hub_ ou estação de trabalho, envia uma mensagem codificada através de um pulso elétrico ao emissor que converte em pulso luminoso, este pulso luminoso percorre a fibra até atingir seu destino, onde encontra um receptor que recebe e converte novamente em pulso elétrico para que o outro equipamento possa interpretar a mensagem. Os emissores e receptores geralmente ficam alojados em equipamentos tais como _hubs ópticos_, _placas ópticas_ e _tranceivers_. 


# Cabo coaxial

O _cabo coaxial_ é formado por dois condutores separados e envoltos por um material isolante. O primeiro condutor, normalmente o cobre, é mais rígido e está envolto pelo segundo condutor, este em forma de malha e normalmente de alumínio. Este segundo condutor, além de ajudar na transmissão é também responsável por proteger o primeiro condutor contra interferências magnéticas. O _cabo coaxial_ pode ser classificado de duas formas dependendo do material do condutor em malha.

O núcleo de um _cabo coaxial_ transporta os sinais eletrônicos que constituem os dados. Esse núcleo do cabo pode ser **sólido** ou **trançado**. 

Se o núcleo for **sólido**, geralmente será de cobre. O núcleo é cercado por uma camada isolante que o separa da malha de fio. A malha de fio trançada funciona como um fio terra e protege o núcleo contra ruídos elétricos e diafonia. Diafonia é o transbordamento de sinal de um fio adjacente. O núcleo condutor e a malha de fio sempre devem estar separados entre si. Se entrarem em contato, o cabo estará sujeito a um curto-circuito e ruídos ou sinais dispersos da malha fluirão para o fio de cobre. Isso destruirá os dados.

Se for **trançado** é inteiro cercado por uma blindagem externa não condutora, geralmente de borracha, Teflon ou plástico. O _cabo coaxial_ é mais resistente à interferência e atenuação que o cabo de par trançado. Atenuação é a perda de intensidade de sinal que começa a ocorrer conforme o sinal viaja ao longo de um cabo de cobre.


* Alumínio
  * Dito Cabo Coaxial Grosso (Resistência de 75 ohms, transmissão numa velocidade de até 10 mbps a uma freqüência de 10 Ghz). 


* Cobre
  * Dito Cabo Coaxial Fino (Resistência de 50 ohms, transmissão numa velocidade de até 10 mbps a uma freqüência de 2 Ghz)


* Frequencia
  * 10 gigahertz.

* Capacidade máxima
  * 20 Mb/s.


# Rádio

As ondas de rádio, ou radiação magnéticas também são utilizados para transmitir dados de computador.

A sua utilização implica a instalação de antenas ou dispositivos de emissão e recepção mas estão sujeitas a interferências. As tecnologias que utilizam a frequência de rádio são o _Bluetooth_ e _Wi-fi_.

* Frequências Muito Baixas
  * VLF 3MHz~30MHz, 

* Frequências Altas
  * HF 30MHz~300 MHz, V

* Frequências Ultra Altas
  * UHF 300MHz~3GHz.


# Satélite

A televisão por satélite é semelhante à televisão terrestre. Em ambos os sistemas a emissão do sinal de TV é feita usando ondas de rádio. Mas as emissões terrestres têm uma grande limitação: o receptor tem de “ver ” a antena emissora, e mesmo quando isso acontece não há garantia de se receber o sinal em boas condições. A curvatura da terra torna-se assim um grande obstáculo no sentido em que limita a distância entre o emissor e o receptor.

  ![O uso do satélite resolveu o problema da curvatura da terra](http://www.img.lx.it.pt/~mpq/st04/ano2002_03/trabalhos_pesquisa/T_12/files/Images/sat1.jpg)


**A solução da TV por satélite**

A televisão por satélite soluciona os problemas de alcance e distorção por meio da transmissão de sinais a partir de satélites que orbitam a Terra. Como os satélites estão altos no céu, há muito mais clientes na linha de visada. Os sistemas de televisão por satélite transmitem e recebem sinais de rádio utilizando antenas especializadas chamadas parabólicas de satélite.

**Canal**
Inicialmente, a televisão por satélite era transmitida na banda C de rádio, uma faixa de freqüência entre 3,4 GHz e 7 GHz. O satélite de transmissão digital envia a programação na faixa de freqüência K (12 GHz a 14 GHz).

O codificador _MPEG_ analisa cada quadro e decide como codificá-lo. O codificador elimina dados redundantes ou irrelevantes e extrapola a informação proveniente de outros quadros para reduzir o tamanho total do arquivo. Cada quadro pode ser codificado em uma de **três** maneiras:

* **Como um intraquadro**, um intraquadro contém os dados da imagem completa para todo o quadro. Este método de codificação proporciona a menor compressão.

* **Como um quadro predito**, um quadro predito contém apenas a informação suficiente para informar o satélite sobre como exibir o quadro com base no intraquadro ou quadro predito exibido mais recentemente. Isso significa que o quadro contém somente os dados que relacionam como a imagem foi alterada a partir do quadro anterior.

* **Como um quadro bidirecional**, para exibir um quadro bidirecional, o receptor deve ter a informação proveniente do intraquadro ou quadros preditos circundantes. Utilizando os dados dos quadros circundantes mais próximos, o receptor interpola a posição e a cor de cada pixel.


# Infravermelho

As ondas infravermelhas são largamente utilizadas em controles remotos. Uma característica importante desta onda é que ela não pode atravessar objetos sólidos. Assim pode-se construir _LAN's_ mais seguras contra espionagem eletrônica. Contudo, essas transmissões estão limitadas a cerca de 30 metros, e possui largura de banda de até cerca de 30Mbps.





# Celular

**Difusão celular**

**Difusão Celular** é um serviço disponibilizado por inúmeras operadoras de telecomunicações móveis, baseado numa tecnologia que permite que mensagens possam ser difundidas a todos os equipamentos móveis e dispositivos semelhantes dentro de uma área geográfica designada.

A **Difusão Celular** permite que as mensagens possam ser comunicadas a vários telemóveis que estão localizados dentro de uma determinada área de cobertura da rede, na altura que a mensagem é emitida.

Através do acesso aos diversos canais do serviço podem obter-se informações úteis como: nome da localidade, trânsito local, informação meteorológica, as farmácias de serviço, os hospitais mais próximos, promoções da operadora, publicidade, entre outras.

* Comunicação sem fio
_Wireless Personal Area Network_ - **WPAN** (Rede Pessoal Sem Fio) 

As _WPAN’s_ não possuem um alcance muito grande, e são usadas em sua maioria em celulares. Esse tipo de rede não necessita de uma grande taxa de velocidade, em sua maioria, principalmente pelos celulares.

As _WPAN’s_ são empregadas através do _Bluetooth_, e em celulares mais antigos era usado o _infravermelho_ como tecnologia de transmissão.