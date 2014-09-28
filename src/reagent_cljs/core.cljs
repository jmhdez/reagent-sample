(ns reagent-cljs.core
  (:require [reagent.core :as r]))

(enable-console-print!)

(def beers
  (r/atom
   {"Mahou 5 Estrellas" 0
    "Chimay triple" 0
    "Cibeles Imperial IPA" 0}))

(defn add-one! [beer]
  (swap! beers update-in [beer] inc))

(defn beer-item [beer count]
  [:li "[" count "] " beer
   [:button {:on-click #(add-one! beer)} "Otra más"]])

(defn beer-list []
  (let [total (reduce + (vals @beers))
        items (map (fn [[name count]] (beer-item name count)) @beers)]
    [:div
     [:p "Llevas " total  " cervezas"]
     [:ul items]]))

(r/render-component
 [beer-list]
 (.-body js/document))
