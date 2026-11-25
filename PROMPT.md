# Registro de Prompts

## Entrada 1
- **Data da solicitação:** 2026-11-22 13:22
- **Usuário solicitante:** Daniel Paulo Silva de Oliveira
- **Prompt utilizado:**
  > Faz o seguinte, me ajude com o passo a passo de cada arquivo do projeto.
- **Origem dos requisitos:**
  - **Descritos pelo usuário no prompt:** Solicitação do guia passo a passo detalhado de cada arquivo do projeto.
  - **Extraídos exclusivamente do PDF (`DSWB-Atividade-SpringBoot-Videogame.pdf`):** Estrutura de projeto Spring Boot 4.0.x+ via TADS Spring Initializr, banco H2 em memória com console habilitado, entidade e repositório JPA para jogos (sem tabela separada de plataformas pois a dupla cursa PI3), validações no backend (`@NotBlank`, `@NotNull`, `@Min(1950)`), endpoints REST CRUD em `/jogos`, telas estáticas em `/static` usando Fetch API, rodapé obrigatório em todas as telas e regras do Anexo 2 para `PROMPT.md` e `PromptController.java`.

  ## Entrada 2
- **Data da solicitação:** 2026-11-22 13:43
- **Usuário solicitante:** Daniel Paulo Silva de Oliveira
- **Prompt utilizado:**
  > como ficaria a estrutura final do projeto?
- **Origem dos requisitos:**
  - **Descritos pelo usuário no prompt:** Pedido de visualização da árvore de diretórios e arquivos da estrutura final do projeto.
  - **Extraídos exclusivamente do PDF (`DSWB-Atividade-SpringBoot-Videogame.pdf`):** Organização padrão baseada no projeto `dados-pessoais` (Spring Boot 4.0.x+, pacotes de entidade e repositório, webservice REST, arquivos estáticos em `/static`, `PROMPT.md` e `PromptController.java` no pacote base) sem tabela separada de plataformas por estarem cursando PI3.

## Entrada 3
- **Data da solicitação:** 2026-11-22 14:09
- **Usuário solicitante:** Matheus Medeiros Barbosa Novaes
- **Prompt utilizado:**
  > Na configuração do h2, eu preciso substituir todo o arquivo por esse?
- **Origem dos requisitos:**
  - **Descritos pelo usuário no prompt:** Dúvida sobre substituir integralmente ou parcialmente o arquivo `application.properties` gerado pelo TADS Spring Initializr para configurar o H2.
  - **Extraídos exclusivamente do PDF (`DSWB-Atividade-SpringBoot-Videogame.pdf`):** Obrigatoriedade de preservar as identificações geradas pelo TADS Spring Initializr nos arquivos do projeto para evitar desconto de nota (slide 13) e uso do banco de dados H2 (slide 13).

  ## Entrada 4
- **Data da solicitação:** 2026-11-22 14:18
- **Usuário solicitante:** Matheus Medeiros Barbosa Novaes
- **Prompt utilizado:**
  > Eu teria que substituir isso [imagem do bloco Datasource (h2) do application.properties] por isso? [bloco completo de application.properties sugerido anteriormente]
- **Origem dos requisitos:**
  - **Descritos pelo usuário no prompt:** Comparação visual entre o trecho de configuração do H2 já gerado pelo TADS Spring Initializr (`spring.datasource.url=jdbc:h2:mem:gerenciador-jogos`) e a sugestão anterior de `application.properties`.
  - **Extraídos exclusivamente do PDF (`DSWB-Atividade-SpringBoot-Videogame.pdf`):** Uso obrigatório do banco de dados H2 (slide 13) e abertura do console do H2 durante a apresentação (slide 19).

  ## Entrada 5
- **Data da solicitação:** 2026-11-22 14:24
- **Usuário solicitante:** Matheus Medeiros Barbosa Novaes
- **Prompt utilizado:**
  > desta maneira, certo? [captura de tela mostrando a estrutura de pastas e o código de JogoEntity.java no VS Code]
- **Origem dos requisitos:**
  - **Descritos pelo usuário no prompt:** Validação visual da criação do pacote `entidade` e da classe `JogoEntity.java` no VS Code.
  - **Extraídos exclusivamente do PDF (`DSWB-Atividade-SpringBoot-Videogame.pdf`):** Conformidade com a estrutura de entidade JPA e execução do projeto pela IDE (slides 13 e 19).

  ## Entrada 6
- **Data da solicitação:** 2026-11-22 14:28
- **Usuário solicitante:** Daniel Paulo Silva de Oliveira
- **Prompt utilizado:**
  > O arquivo jogorepository é somente esse código?
- **Origem dos requisitos:**
  - **Descritos pelo usuário no prompt:** Confirmação se a interface `JogoRepository.java` contém apenas a extensão de `JpaRepository` sem métodos adicionais.
  - **Extraídos exclusivamente do PDF (`DSWB-Atividade-SpringBoot-Videogame.pdf`):** Escopo do CRUD completo de jogos (slide 4) e confirmação de que buscas e filtros adicionais do slide 12 não precisam ser implementados.


  ## Entrada 7
- **Data da solicitação:** 2026-11-22 14:50
- **Usuário solicitante:** Daniel Paulo Silva de Oliveira e Matheus Medeiros Barbosa Novaes
- **Prompt utilizado:**
  > Preciso de ajuda na parte do front-end. Também não sei muito bem como deixar esse rodapé informando se utilizei IA ou não
- **Origem dos requisitos:**
  - **Descritos pelo usuário no prompt:** Pedido de auxílio para construir o front-end e dúvida sobre como estruturar o rodapé declarando o uso de IA.
  - **Extraídos exclusivamente do PDF (`DSWB-Atividade-SpringBoot-Videogame.pdf`):** Hospedagem dos arquivos HTML/CSS/JS em `/static` na mesma URL do backend (slide 13), consumo via Fetch API (slide 13), destaque visual para jogos indisponíveis (slide 5), modal de confirmação de exclusão (slide 8), tratamento de mensagens de erro/sucesso nos formulários de inclusão e alteração (slides 6 e 7) e obrigatoriedade do rodapé em todas as telas com identificação da dupla, turma e declaração de uso de IA (slides 5 e 16).

    ## Entrada 8
- **Data da solicitação:** 2026-11-22 15:05
- **Usuário solicitante:** Daniel Paulo Silva de Oliveira
- **Prompt utilizado:**
  > Está sendo seguido esses passos? [captura de tela do Anexo 1: Roteiro de validação/correção funcional da aplicação]
- **Origem dos requisitos:**
  - **Descritos pelo usuário no prompt:** Verificação de conformidade do projeto com todos os passos do Anexo 1 enviados na imagem.
  - **Extraídos exclusivamente do PDF (`DSWB-Atividade-SpringBoot-Videogame.pdf`):** Todos os itens do roteiro de validação funcional do Anexo 1 (slide 19 / imagem anexada): execução pela IDE, console H2, listagem inicial vazia, bloqueio de campos em branco e dados inválidos, inclusão de jogo disponível e indisponível com destaque, alteração pré-preenchida e exclusão com confirmação.

  ## Entrada 9

**Data da solicitação:** 2026-11-23 21:07

**Usuário solicitante:** Daniel Paulo Silva de Oliveira

**Prompt utilizado:**


> Preciso deixar o html e css do meu site igual as imagens, o design do site, me ajude!


Origem dos requisitos:

Descritos pelo usuário no prompt: Ajustar o HTML e o CSS do site para que o design fique igual ao das imagens enviadas.

Obtidos das imagens enviadas: Aparência da listagem de jogos, dos formulários de inclusão e alteração e da caixa de confirmação de exclusão.

Extraídos exclusivamente do PDF (DSWB-Atividade-SpringBoot-Videogame.pdf): Rodapé em todas as telas com identificação dos integrantes, turma e declaração de uso de IA; funcionamento das telas com acesso aos endpoints REST e mensagens de sucesso ou erro.

Obtidos do projeto enviado: Nomes e turma já presentes no rodapé, campos, rotas e estrutura dos arquivos existentes.
