# Atividade06: Camada de rede


## Questionário

1. Sob o ponto de vista conceitual, a introdução do IPv6 implica em se redefinir o funcionamento do protocolo ARP, ou ele pode apresentar o mesmo comportamento do IPv4 ? **Justifique sua resposta**.

Ele não apresenta o mesmo comportamento, na verdade ele redefine, as tecnologias usadas são diferentes por exemplo no ARP, é necessário de broadcast (utilizados para enviar tráfego para todos os host de uma rede), onde o IPv6 não aplica. O IPv6 aplica outros tipos de tecnologia: Multicast, AnyCast e UniCast.

2. Uma máquina em uma rede TCP/IP é caracterizada pelo endereço IP **128.138.243.100** e máscara **255.255.255.192**. Determine o número da rede, o endereço de broadcast dessa rede, o primeiro e último endereços IPs válidos para máquinas nessa rede. **Considere sistema classfull**.

Ficou com um pouco confuso, mas vamos lá.

Cálculos:
----------------------------

Variáveis

+ Endereço IP ``128.138.243.100``;
+ Máscara ``255.255.255.192`` => o ``N=2``, pois é "192";
+ Total de bits, ``TB = 8``;

Número de bits deixado para o host.

+ ``M = Tb - N`` => ``8 - 2 = 6``
+ ``M = 6``;


Número de subredes, ``Ns = 2^N`` => ``2^2 => 4``

+ ``Ns = 4;``
+ Valor do último bit é 2^M, 2^6=> 64


Host por subredes  __VÁLIDOS__

``2^M -2``, este 2 é por que não conta o primeiro e último IP.

Host p/ subredes = 62;


__Resultado:__

Número de subredes, ``Ns = 2^N = 4;``

(1) 128.138.243.0 -- 128.138.243.63

__(2) 128.138.243.64 -- 128.138.243.127__

(3) 128.138.243.128 -- 128.138.243.191

(4) 128.138.243.192 -- 128.138.243.255


__Número da rede:__ ``128.138.243.64``

__O endereço de BroadCast:__ ``128.138.243.127``

__O primeiro número válido:__ ``128.138.243.65``

__O último número válido:__ ``128.138.243.126``

3. Escreva tudo o que você sabe sobre hubs, switchs e roteadores. Tópicos a serem abordados: tecnologia, princípio de operação, utilização da banda passante, domínios de broadcast, domínios de colisão, protocolo spanning tree, etc.

Os três equipamentos são dispositivos para conexão de rede.

_Hubs_

    Solução barata, ele apenas repassa as informações,;
    Tem várias portas (8, 16, 24 e 32);
    Caso o cabo for desconectado a rede não deixa de desconectar;
    Feitos para redes pequenas e domésticas.

_Switchs_

    Repassa as informações somente ao computador que fez o envio (Diferente do HUB);
    O desempenho da rede é maior, pois cria um canal exclusivo, já que a comunicação está sempre disponível;
    É possível ter várias portas também;
    Usado para redes com até 24 PCs.

_Roteadores_

    Utilizado em redes de maior porte;
    Existem basicamente 2 tipos de roteadores os estáticos e os dinâmicos;
    Consegue ser mais inteligente, pois seleciona a melhor rota.

4. Você está administrando uma faixa de endereços classes C utilizando CIDR. Uma faixa de endereços disponíveis corresponde a rede 200.61.00.00/18. Três entidades solicitam endereços IP, a entidade A precisa de 1800 endereços, a entidade B de 800 endereços, e a entidade C, de 600 endereços. Quais seriam os endereços de rede e as máscaras de sub-rede que você atribuiria a entidade A, a entidade B e a entidade C com o uso de CIDR ? Quais são, com as respectivas máscaras, as redes livres após essa alocação ? Fornecer a resposta na forma decimal, isto é, a.b.c.d.

Sendo o último broadcast.

    A: Recebe como endereço 200.61.00.1 -- 200.61.7.8
---
    B: Recebe como endereço 200.61.7.9 -- 200.61.10.40
---
    C: Recebe como endereço 200.61.10.41 -- 200.61.12.128
----
    Redes livres: 200.61.12.129 -- 200.61.63.255