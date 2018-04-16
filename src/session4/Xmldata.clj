(ns session4.Xmldata
  (require [clojure.xml :as xml]) )

(defn xml []
(println (clojure.xml/parse (clojure.java.io/file "/Users/nithin/Desktop/clojurework/session4/src/session4/studentxml.xml") )) )

