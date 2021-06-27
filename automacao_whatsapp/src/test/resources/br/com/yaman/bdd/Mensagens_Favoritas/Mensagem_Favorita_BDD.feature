#language: pt-br
#encoding: UTF-8
#date: 20/06/2021
#author: Rafael Leonardo de Lima
#version: 1.0

Funcionalidade: <Mensagens favoritas>

    Como usuário do aplicativo WhatsApp
    Eu quero marcar minhas mensagens favoritas
    Para organizar e marcar informações importantes

Contexto:
    Dado que tenho o aplicativo WhatsApp instalado no celular
    E tenho uma conta registrada
    E estou na aba Conversas
    E tenho ao menos uma conversa

CT-0007
Cenário: Validar marcação mensagem favorita
    Quando seleciono uma conversa
    E seleciono uma "mensagem" da conversa
    E seleciono a opção Favoritar Mensagem
    Então a "mensagem" ficará marcada como favorita

CT-0008
Cenário: Validar desmarcar mensagem favorita
    Quando pressiono o botão de submenu (...)
    E escolho a opção Mensagens favoritas
    E seleciono uma "mensagem"
    E seleciono a opção Desfavoritar mensagem
    Então a "mensagem" será removida das mensagens favoritas

CT-0009
Cenário: Validar exclusão mensagem favorita
    Quando pressiono o botão do submenu (...)
    E escolho a opção Mensagens favoritas
    E pressiono uma "mensagem" da lista
    E excluo a mensagem da conversa
    Então a "mensagem" é removida da conversa e das Mensagens Favoritas