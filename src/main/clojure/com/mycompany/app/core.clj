(ns com.mycompany.app.core
  (:gen-class)
  )

(defn -main [& args]
  (println "Hello Clojure!")
  (println "Java main called clojure function with args: "
           (apply str (interpose " " args))))

