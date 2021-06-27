#language: pt-br
#encoding: UTF-8
#date: 20/06/2021
#author: Rafael Leonardo de Lima
#version: 1.0

Funcionalidade: <WhatsApp Web>

    Como usuário do aplicativo WhatsApp
    Eu quero utilizar o aplicativo pela web
    Para usar em diferentes aparelhos

Contexto:
    Dado que tenho o aplicativo WhatsApp instalado no celular
    E tenho uma conta registrada
    E estou na aba Conversas
    E a página inicial do WhatsApp Web está aberta em outro dispositivo

CT-0015
Cenário: Validar conexão whatsapp web
    Quando pressiono o botão de submenu (...)
    E seleciono a opção WhatsApp Web
    E seleciono a opção Conectar um aparelho
    Então a câmera é iniciada para escanear o QR Code

CT-0016
Cenário: Validar desconexão whatsapp web
    Quando pressiono o botão de submenu (...)
    E seleciono a opção WhatsApp Web
    E seleciono um "dispositivo" conectado
    E seleciono a opção Desconectar
    Então a sessão do WhatsApp Web será encerrada neste dispositivo
