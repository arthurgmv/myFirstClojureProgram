(ns myFirstClojureProgram.program)

(defn greet [name]
  (if (= name "Arthur")
    (println "Hello, Professor" name)
    (println "Hello," name)))

(greet "Arthur")
(greet "Student")