;; Copyright (c) 2024 Avicenna
;; This source code is licensed under the MIT license found in the
;; LICENSE.txt file in the root directory of this source tree. 

(ns com.mavbozo.scratch)

(defn data-fn
  "Example data-fn handler.

  Result is merged onto existing options data."
  [data]
  ;; returning nil means no changes to options data
  (println "data-fn returning nil")
  nil)

(defn template-fn
  "Example template-fn handler.

  Result is used as the EDN for the template."
  [edn data]
  ;; must return the whole EDN hash map
  (println "template-fn returning edn")
  edn)

(defn post-process-fn
  "Example post-process-fn handler.

  Can programmatically modify files in the generated project."
  [edn data]
  (println "post-process-fn not modifying" (:target-dir data)))
