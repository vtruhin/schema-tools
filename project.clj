(defproject metosin/schema-tools "0.9.0"
  :description "Common utilities for Prismatic Schema"
  :url "https://github.com/metosin/schema-tools"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"
            :distribution :repo
            :comments "same as Clojure"}
  :dependencies [[prismatic/schema "1.1.3"]]
  :plugins [[funcool/codeina "0.4.0"]]

  :codeina {:target "doc"
            :src-uri "http://github.com/metosin/schema-tools/blob/master/"
            :src-uri-prefix "#L"}

  :profiles {:dev {:plugins [[jonase/eastwood "0.2.3"]]
                   :dependencies [[criterium "0.4.4"]
                                  [org.clojure/clojure "1.8.0"]
                                  [org.clojure/clojurescript "1.9.93"]]}
             :1.7 {:dependencies [[org.clojure/clojure "1.7.0"]]}}
  :aliases {"all" ["with-profile" "dev:dev,1.7"]
            "test-clj" ["all" "do" ["test"] ["check"]]})
