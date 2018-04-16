(ns session4.CSVfiles
(require [clojure.data.csv]) )

(defn csv []

  (println (clojure.data.csv/read-csv "this,is\na,test"))

  (with-open [out-file (clojure.java.io/writer "/Users/nithin/Desktop/clojurework/session4/src/session4/abc.csv")]
    (println (clojure.data.csv/write-csv out-file [["this" "is"] ["a" "test"]])))

  (with-open [in-file (clojure.java.io/reader "/Users/nithin/Desktop/clojurework/session4/src/session4/abc.csv")]
    (println (doall
               (clojure.data.csv/read-csv in-file))))




  )


