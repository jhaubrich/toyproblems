(ns toyproblems.bubble-sort-test
  (:require [clojure.test :refer :all]
            [toyproblems.bubble-sort :refer :all]))

(deftest bubble-sort-test
  (testing "should be a function"
    (is (function? bubble-sort)))
  
  (testing "should sort array numerically"
    (is (= [1 2 21 21 43 100 100] 
           (bubble-sort [1 2 43 100 100 21 21]))))
  
  (testing "should sort arrays with decimal numbers"
    (is (= (bubble-sort [24.7 24.3 23 9 3 3 100 25 100]) 
           [3 3 9 23 24.3 24.7 25 100 100])))
  
  (testing "should sort reverse sorted arrays"
    (is (= (bubble-sort [5 4 3 2 1])
           [1 2 3 4 5])))
  
  (testing "should handle presorted arrays"
    (is (= (bubble-sort [1 2 3 4 5])
           [1 2 3 4 5])))
  
  (testing "should sort arrays with negative numbers"
    (is (= (bubble-sort [20 -10 -10.1 2 4 299])
           [-10.1 -10 2 4 20 299])))
  )


