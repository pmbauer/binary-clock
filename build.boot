#!/usr/bin/env boot

#tailrecursion.boot.core/version "2.3.1"

(set-env!
  :project 'binary-clock
  :version "0.1.0-SNAPSHOT"
  :dependencies '[[tailrecursion/boot.task "2.1.2"]
                  [tailrecursion/hoplon "5.5.1"]
                  [org.clojure/clojurescript "0.0-2156"]]
  :out-path "resources/public"
  :src-paths #{"src"})

(add-sync! (get-env :out-path) #{"resources/assets"})

(require
  ['tailrecursion.hoplon.boot :refer :all]
  ['tailrecursion.boot.task :refer :all])

(deftask dev
  "Build for development, implies watch"
  []
  (comp (watch)
        (hoplon {:prerender false
                 :pretty-print true})))

(deftask prod
  "Build for production"
  []
  (hoplon {:optimizations :advanced}))
