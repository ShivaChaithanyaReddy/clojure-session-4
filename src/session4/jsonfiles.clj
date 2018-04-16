(ns session4.jsonfiles
  (require [clojure.data.json])
  )

(def jsonfilesReadWrite []

  (println (clojure.data.json/read-str "[{\"name\":\"Stefan\",\"age\":32}]"))


  (with-open [writer (clojure.java.io/writer "foo.json")]
     (println (json/write [{:foo "bar"}] writer)) )

  (with-open [reader (clojure.java.io/reader "foo.json")]
    (println  (json/read reader)))


  )