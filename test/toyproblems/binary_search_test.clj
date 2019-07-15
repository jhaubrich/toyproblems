(ns toyproblems.binary-search-test
  (:require [clojure.test :refer :all]
            [toyproblems.binary-search :refer :all]))

(deftest binary-search-test
  (testing "binary search exists"
    (is (function? binary-search)))
  
  (testing "should return 0 for 5 in [5]"
    (is (= 0 (binary-search [5] 5))))
  
  (testing "should return null for 4 in [5]"
    (is (= nil (binary-search [5] 4))))
  
  (testing "should return 0 for 1 in [1 2 3 4 5]"
    (is (= 0 (binary-search [1 2 3 4 5] 1))))

  (testing "should return 1 for 2 in [1 2 3 4 5]"
    (is (= 1 (binary-search [1 2 3 4 5] 2))))

  (testing "should return 2 for 3 in [1 2 3 4 5]"
    (is (= 2 (binary-search [1 2 3 4 5] 3))))

  (testing "should return 3 for 4 in [1 2 3 4 5]"
    (is (= 3 (binary-search [1 2 3 4 5] 4))))

  (testing "should return 3 for 45 in [10 22 33 45 55 62]"
    (is (= 3 (binary-search [10 22 33 45 55] 45))))
  )

