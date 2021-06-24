#language: pt-br
#encoding: UTF-8
#date: 20/06/2021
#author: Rafael Leonardo de Lima
#version: 1.0

Funcionalidade: <Status>

    Como usuário do aplicativo WhatsApp
    Eu quero publicar mensagens de Status
    Para que eu possa passar um recado aos contatos

Contexto:
    Dado que tenho o aplicativo WhatsApp instalado no celular
    E tenho uma conta registrada
    E estou na aba Status

CT-0010
Cenário: Validar criação de status - texto
    Quando pressiono o botão com ícone de lápis
    E escrevo um "texto"
    E pressiono o botão enviar do teclado virtual
    Então o status de texto será adicionado

CT-0011
Cenário: Validar criação de status - imagem
    Quando pressiono o botão com ícone de câmera
    E seleciono uma "imagem" da galeria
    E pressiono o botão enviar
    Então o status com imagem será adicionado

CT-0012
Cenário: Validar criação de status - vídeo
    Quando pressiono o botão com ícone de câmera
    E seleciono um "vídeo" da galeria
    E pressiono o botão enviar
    Então o status com imagem será adicionado

CT-0013
Cenário: Validar remoção de status
    Quando pressiono na opção Meu Status
    E seleciono um "Status" publicado por mim
    E pressiono o botão excluir
    Então o "Status" será excluído
    
CT-0014
Cenário: Validar visualização de status
    Quando seleciono um "Status" de um contatos
    Então o "Status" selecionado será exibido na tela
