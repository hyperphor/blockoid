(defproject blockoid-example "1.0.0"
  :dependencies [
                 [org.candelbio/blockoid "1.0.1"]
                 [thheller/shadow-cljs  "3.2.1"]
                 [org.clojure/clojure "1.12.0"]
                 [org.clojure/clojurescript "1.12.42"]
                 [com.google.javascript/closure-compiler-unshaded "LATEST"]
                 ]

  :min-lein-version "2.5.3"

  :source-paths [ "src/cljs"]
  :test-paths [ "test/cljs"]

  :profiles
  {:dev
   {:dependencies [[binaryage/devtools "0.9.10"]
                   [mock-clj "0.2.1"]
                   ]
    :plugins      []}
   }
  )
