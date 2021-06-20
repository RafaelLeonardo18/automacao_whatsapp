Feature: Chamada

   Scenario: Validar chamada por voz - individual

   CT-0001

      Given que estou no Menu Principal
      And possuo pelo menos um contato salvo
      And pressiono a aba Chamadas

      When pressiono pressiono o botão "Nova Chamada"
      And escolho um "contato"
      And pressiono o botão de "Chamada de voz"
      Then inicia a chamada de voz com o contato selecionado
