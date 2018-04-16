(ns session4.core
  (:gen-class)
  (require [clojure.java.io :as fileIO])                    ;;library to use file I/O
  )

(defn write-to-file
  [file text]
  (with-open [wrtr (fileIO/writer file)]                    ;;with-open function opens file, write text in the file and finally closes the file.
    (.write wrtr text)))

(defn read-from-file
  [file]
  (try
    (println (slurp file))                                ;;slurp is used to read text from the file.
    (catch Exception e (println "Error: "
                                (.getMessage e)))))

(defn append-to-file
  [file text]
  (with-open [wrtr (fileIO/writer file :append true)]       ;;   :append true is used to append text in existing file.
    (.write wrtr text)))

(defn read-line-from-file
  [file]
  (with-open [rdr (fileIO/reader file)]                     ;; used to read text one line at a time from file.
    (doseq [line (line-seq rdr)]
      (println line))))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!")

  (write-to-file "myFile.txt" "This is a sentence\n")
  (read-from-file "myFile.txt")
  (append-to-file "myFile.txt" "This is another sentence\n")
  (read-line-from-file "myFile.txt")

  )