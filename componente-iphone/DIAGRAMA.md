# [DIO](www.dio.me) - Trilha Java Básico

## Aluno
- [Lucas Rocha](https://github.com/luscasrocha)

## POO - Desafio

### Modelagem e Diagramação de um Componente iPhone

Neste desafio, você será responsável por modelar e diagramar a representação UML do componente iPhone, abrangendo suas funcionalidades como Reprodutor Musical, Aparelho Telefônico e Navegador na Internet.

#### Contexto
Com base no vídeo de lançamento do iPhone de 2007 (link abaixo), você deve elaborar a diagramação das classes e interfaces utilizando uma ferramenta UML de sua preferência. Em seguida, implemente as classes e interfaces no formato de arquivos `.java`.

#### Funcionalidades a Modelar
1. **Reprodutor Musical**
   - Métodos: `tocar()`, `pausar()`, `selecionarMusica(String musica)`
2. **Aparelho Telefônico**
   - Métodos: `ligar(String numero)`, `atender()`, `iniciarCorreioVoz()`
3. **Navegador na Internet**
   - Métodos: `exibirPagina(String url)`, `adicionarNovaAba()`, `atualizarPagina()`

### Objetivo
1. Criar um diagrama UML que represente as funcionalidades descritas acima.
2. Implementar as classes e interfaces correspondentes em Java (Opcional).

### Diagrama UML (Mermaid)
```mermaid
classDiagram
    class ReprodutorMusical {
        +tocar() : void
        +pausar() : void
        +selecionarMusica() : void
    }

    class AparelhoTelefonico {
        +ligar() : void
        +atender() : void
        +iniciarCorreioVoz() : void
    }

    class NavegadorInternet {
        +exibirPagina() : void
        +adicionarNovaAba() : void
        +atualizarPagina() : void
    }

    class iPhone {
    }
    
    class Ipod {
    }
    
    class Telefone {
    }
    
    class Safari {
    }

    iPhone --> ReprodutorMusical
    iPhone --> AparelhoTelefonico
    iPhone --> NavegadorInternet
    Ipod --> ReprodutorMusical
    Telefone --> AparelhoTelefonico
    Safari --> NavegadorInternet
```