(ns teste
  (:require [portugues :refer :all]))

(teste função-não
  (é (= verdadeiro
    (não falso))))

(teste função-texto
  (é (= "foobar"
    (texto "foo" "bar"))))

(teste função-parcial
  (é (= 2
    ((parcial + 1) 1))))

(teste função-mapa
  (é (= [2 3 4]
    (mapa (parcial + 1) [1 2 3]))))

(teste função-filtro
  (é (= [2 3]
  (filtro (parcial < 1) [1 2 3]))))

(teste função-redução
  (é (= 6
    (redução (parcial +) [1 2 3]))))

(teste função-faça
  (é (= 4
    (faça (+ 1 1) (+ 2 2)))))

(teste função-primeiro
  (é (= 1
    (primeiro [1 2 3 4]))))

(teste função-resto
  (é (= [2 3 4]
    (resto [1 2 3 4]))))

(teste função-função
  (é (= 3
    ((função [x] (+ x 1)) 2))))

(definição x 1)
(teste função-definição
  (é (= 1 x)))

(teste função-se
  (é (= verdadeiro
      (se (= (+ 2 2) 4) verdadeiro falso))))

(rodar-testes)
