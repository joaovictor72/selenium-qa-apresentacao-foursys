# REQUISITOS

## Java 11, Maven configurados nas variaveis de ambiente,  Chrome WebDriver com a mesma versão do seu navegador

Acesse o site da Oracle ou do OpenJDK para baixar o JDK 11 de acordo com seu sistema operacional.
https://www.oracle.com/br/java/technologies/javase/jdk11-archive-downloads.html

 # Configure a variável de ambiente JAVA_HOME:

Abra o Painel de Controle do Windows
Pesquise por "Variáveis de Ambiente" e clique em "Editar as variáveis de ambiente do sistema".
Na janela "Propriedades do Sistema", clique em "Variáveis de Ambiente".
Em "Variáveis do sistema", clique em "Novo".
Digite "JAVA_HOME" como nome da variável.
No valor da variável, digite o caminho para o diretório de instalação do JDK 11. Por exemplo, "C:\Program Files\Java\jdk-11".
Clique em "OK" para salvar a variável.
Adicione o diretório bin do JDK ao PATH:

Na mesma janela "Variáveis de Ambiente", localize a variável "Path" em "Variáveis do sistema" e clique em "Editar".
Clique em "Novo" e adicione o caminho para o diretório bin do JDK 11. Por exemplo, "%JAVA_HOME%\bin".
Clique em "OK" para salvar a variável.
Verifique a instalação do Java:

Abra um novo terminal (ou prompt de comando) e digite o comando "java -version". Deve exibir a versão do Java instalada.

----------------------------------------------------------------------------------------------------------------------------------
# Configure a variável de ambiente M2_HOME:

Acesse o site do Apache Maven para baixar a versão mais recente do Maven em formato de arquivo binário:
https://maven.apache.org/download.cgi

Abra o Painel de Controle do Windows.
Pesquise por "Variáveis de Ambiente" e clique em "Editar as variáveis de ambiente do sistema".
Na janela "Propriedades do Sistema", clique em "Variáveis de Ambiente".
Em "Variáveis do sistema", clique em "Novo".
Defina o nome da variável como "M2_HOME".
No valor da variável, digite o caminho completo para o diretório do Maven (por exemplo, "C:\Program Files\Apache\maven").
Clique em "OK" para salvar a variável.
Adicione o diretório bin do Maven ao PATH:

Na mesma janela "Variáveis de Ambiente", localize a variável "Path" em "Variáveis do sistema" e clique em "Editar".
Clique em "Novo" e adicione "%M2_HOME%\bin" como valor.
Clique em "OK" para salvar a variável.
Verifique a instalação do Maven:

Feche todos os terminais ou prompts de comando que estejam abertos.
Abra um novo prompt de comando.
Digite o seguinte comando:
mvn -version

Deve exibir a versão do Maven instalada e outras informações relacionadas.

----------------------------------------------------------------------------------------------------------------------------------

# Configure o SELENIUM WEB DRIVER

https://chromedriver.chromium.org/downloads

Baixe o Chrome Driver: https://chromedriver.chromium.org/downloads

Baixe de acordo com a versão do seu chrome, o arquivo será baixado zipado, extraia em uma pasta a sua escolha, copie o arquivo chromedriver.exe e arraste para a raiz principal do seu projeto (seleniumqa-apresentacao-foursys)

----------------------------------------------------------------------------------------------------------------------------------

## ESTRUTURA DO PROJETO

# Features: 
No Cucumber, os recursos são arquivos de especificação escritos em uma linguagem chamada Gherkin. Eles descrevem o comportamento do sistema em termos de cenários e etapas. Um recurso é composto por cenários, que representam casos de teste específicos.

Funcionalidade: Formulario wc aquino

  @wcaquino
  Esquema do Cenário: Testes do site wc aquino
    Dado acessei o site do wc aquino
    Entao preencho o formulario com nome <nome> e sobrenome <sobrenome>
    Exemplos:
      | nome    | sobrenome   |
      | Joao | Victor |

# RunCucumberTest: 
A execução dos testes do Cucumber envolve a execução dos cenários descritos nos arquivos de recursos. Isso é feito por meio da definição dos passos correspondentes a cada etapa em um arquivo de passos (steps).

@RunWith(Cucumber.class): Essa anotação indica que a classe RunCucumberTest será executada como um teste de Cucumber. Ela define a classe de execução do Cucumber.

@CucumberOptions(...): Essa anotação define as opções de configuração para a execução do Cucumber.

plugin = {"json:target/reports/cucumberReport.json", "html:target/reports/"}: Configuração dos plugins utilizados para geração de relatórios. Nesse caso, os relatórios serão gerados em formato JSON e HTML.

features = "src/test/resources/features": Define o diretório onde estão localizados os arquivos de recursos (features) que serão executados. Nesse caso, os arquivos estão localizados em src/test/resources/features.

tags = {"~@ignore"}: Especifica as tags que serão utilizadas para filtrar quais cenários serão executados. Nesse caso, os cenários com a tag @ignore serão excluídos da execução.

glue = {"steps"}: Define o pacote onde estão localizadas as classes de passos (steps). Nesse caso, as classes estão no pacote steps.

@BeforeClass: Anotação que indica que o método start() será executado antes de todos os testes.

driver = new ChromeDriver(): Cria uma instância do ChromeDriver, que será utilizado para automatizar as interações com o navegador.
@AfterClass: Anotação que indica que o método stop() será executado após a execução de todos os testes.

driver.quit(): Encerra a instância do ChromeDriver e fecha o navegador.

# Steps: 
Os steps são as implementações das etapas definidas nos cenários dos arquivos de recursos. Eles são responsáveis por interagir com o sistema em teste e realizar as ações necessárias. Os passos são escritos em uma linguagem de programação e mapeados aos cenários por meio de expressões regulares ou anotações.

# Pages: 
Classes que representam as páginas ou componentes de uma aplicação web em testes automatizados. Elas encapsulam os elementos da interface do usuário e fornecem métodos para interagir com eles.

# DTO (Data Transfer Object): 
O DTO é um padrão de design usado para transferir dados entre diferentes camadas de um sistema. No contexto do Cucumber, os DTOs são objetos utilizados para representar os dados de entrada ou saída em um cenário de teste. Eles são tipicamente estruturas simples com atributos que correspondem aos dados manipulados pelo sistema em teste.

