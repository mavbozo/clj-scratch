;; Copyright (c) 2024 Avicenna
;; This source code is licensed under the MIT license found in the
;; LICENSE.txt file in the root directory of this source tree. 

(ns com.mavbozo.clj-scratch-test
  (:require [clojure.edn :as edn]
            [clojure.java.io :as io]
            [clojure.spec.alpha :as s]
            [clojure.test :refer :all]
            [org.corfield.new] ; for the Specs
            [com.mavbozo.clj-scratch :refer :all]))

(deftest valid-template-test
  (testing "template.edn is valid."
    (let [template (edn/read-string (slurp (io/resource "com/mavbozo/clj_scratch/template.edn")))]
      (is (s/valid? :org.corfield.new/template template)
          (s/explain-str :org.corfield.new/template template)))))
