(ns teste
  (:require [portugues :refer :all]
            [clojure.test :refer :all]))

(teste funcao-se
  (é (= verdadeiro
      (se (= (+ 2 2) 4) verdadeiro falso))))

(teste funcao-nao
  (é (= verdadeiro
    (não falso))))

(rodar-testes)
