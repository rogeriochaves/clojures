(ns portugues
  (:require [clojure.test :refer :all]))

(defn se [test then else?] (if test then else?))

(def verdadeiro true)
(def falso false)

(def juntar str)

(def não not)

; tests

(defmacro teste [n & body] (apply list 'clojure.test/deftest n body))

(defn é
  ([form] (is form))
  ([form msg] (is form msg)))

(def rodar-testes run-tests)
