(defproject reagent-cljs "0.1.0-SNAPSHOT"
  :description "Sample project with reagent"
  :url "http://blog.koalite.com/2014/09/reagent-una-liberia-para-usar-reactjs-desde-clojurescript"

  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/clojurescript "0.0-2311"]
                 [reagent "0.4.2"]]

  :plugins [[lein-cljsbuild "1.0.4-SNAPSHOT"]]

  :source-paths ["src"]

  :cljsbuild {
    :builds [{:id "reagent-cljs"
              :source-paths ["src"]
              :compiler {
                :output-to "./dist/reagent_cljs.js"
                :output-dir "out"
                :optimizations :none
                :source-map true}}]})
