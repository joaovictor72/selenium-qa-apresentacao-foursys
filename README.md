# selenium-qa-apresentacao-foursys

# REQUISITOS

# Java 11, Maven configurados nas variaveis de ambiente
# Chrome WebDriver com a mesma versão do seu navegador

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
