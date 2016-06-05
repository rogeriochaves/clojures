(ns exemplos
  (:require [portugues :refer :all]))

(escreva "Olá Mundo")


(definição contagem-regressiva
  (função [valor]
    (se (= 0 valor)
      (escreva 0)
      (faça (escreva valor)
            (contagem-regressiva (- valor 1))))))

(contagem-regressiva 10)


(escreva "Quantas aulas por semana você tem?")
(definição aulas-semanais (leia))
(escreva "Você tem" (* 4 aulas-semanais) "aulas por mês")


(definição escrever-alunos
  (função [nomes]
    (se (= [] nomes)
      (escreva "Fim")
      (faça (escreva (primeiro nomes))
            (escrever-alunos (resto nomes))))))

(escrever-alunos ["Fulano" "Siclano" "Beltrano"])


(definição caracteres-especiais ["!" "@" "#" "$" "%" "^" "&" "*" "(" ")" "{" "}" "[" "]" "|" "\\" "?" "~" "<" ">" "+" "="])

(escreva "Aquiles" (item-aleatório caracteres-especiais))
