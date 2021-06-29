#language: pt-br
#encoding: UTF-8
#date: 20/06/2021
#author: Rafael Leonardo de Lima
#version: 1.0

Funcionalidade: <Chamada>

    Como usuário do aplicativo WhatsApp
    Eu quero realizar chamadas
    Para comunicar-se com meus contatos

Contexto:
    Dado que tenho o aplicativo WhatsApp instalado no celular
    E tenho uma conta registrada
    E tenho contato salvo que possui WhatsApp
    E estou na aba Chamadas
    E pressiono o botão com ícone de telefone com sinal de + 

CT-0001
Cenário: Validar chamada por voz - individual
    Quando escolho um "contato"
    E pressiono o botão com ícone de telefone
    Então inicia uma nova chamada de voz com o "contato" escolhido

CT-0002
Cenário: Validar chamada por voz - grupo existente
    Quando navego para a aba Conversas
    E seleciono um "Grupo"
    E pressiono o botão com ícone de telefone
    E pressiono a opção Chamar
    Então inicia uma nova chamada de voz em grupo com o grupo selecionado

CT-0003
Cenário: Validar chamada por voz - novo grupo
    Quando seleciono a opção Nova chamada em grupo
    E seleciono um ou mais "contatos" da lista
    E pressiono o botão com ícone de telefone
    Então inicia uma nova chamada de voz em grupo com os contatos escolhidos

CT-0004
Cenário: Validar chamada de vídeo - individual
    Quando escolho um "contato"
    E pressiono o botão com ícone de câmera
    Então inicia uma chamada de vídeo com o contato escolhido

CT-0005
Cenário: Validar chamada de vídeo - grupo existente
    Quando navego para a aba Conversas
    E seleciono um "Grupo"
    E pressiono o botão com ícone de telefone com sinal de +
    E seleciono os "contatos" que desejo chamar
    E pressiono o botão com ícone de câmera
    Então inicia uma chamada de vídeo em grupo com os contatos escolhidos

CT-0006
Cenário: Validar chamada de vídeo - novo grupo
    Quando seleciono a opção Nova chamada em grupo
    E seleciono um ou mais "contatos" da lista
    E pressiono o botão com ícone de câmera
    Então inicia uma chamada de vídeo em grupo com os contatos escolhidos