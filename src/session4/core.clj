(ns session4.core
  (:gen-class)
  (require [clojure.data.csv]
           [session4.CSVfiles]
           [clj-commons-exec :as exec]
           [session4.Xmldata]
           [clojure.xml :as xml]))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!")
  ;
  ;(def p (exec/sh ["date"]))
  ;(println  (deref p) )
  ;(session4.CSVfiles/csv)
  ;(session4.Xmldata/xml)

  ;(session4.jsonfiles/jsonfilesReadWrite)



  )