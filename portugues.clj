(ns portugues
  (:require [clojure.test :refer :all]))

(def verdadeiro true)
(def falso false)
(def não not)

(def texto str)

(def parcial partial)

(def mapa map)
(def redução reduce)
(def filtro filter)

(def escreva println)
(def leia read)
(defn faça [& args] (apply 'do args))

(def aleatório rand)
(def item-aleatório rand-nth)

(def primeiro first)
(def resto rest)

(defmacro função [params* exprs*] `(fn ~params* ~exprs*))
(defmacro definição [symbol init?] `(def ~symbol ~init?))
(defmacro se [test then else?] `(if ~test ~then ~else?))

; tests

(defmacro teste [n & body] (apply list 'clojure.test/deftest n body))

(defn é
  ([form] (is form))
  ([form msg] (is form msg)))

(def rodar-testes run-tests)
