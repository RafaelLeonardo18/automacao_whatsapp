Feature: Chamada

    Scenario: Validar chamada por voz - grupo

    CT-0002

      Given que estou no Menu Principal
      And possuo pelo menos um contado salvo
      And pressiono a aba Chamadas

      When pressiono pressiono o botão "Nova Chamada"
      And pressiono o botão "Nova chamada em grupo"
      And seleciono os "contatos"
      And pressiono o botão de chamada de voz
      Then inicia a chamada de voz com o grupo de contatos 