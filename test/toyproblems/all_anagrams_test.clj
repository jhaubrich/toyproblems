(ns toyproblems.all-anagrams-test
  (:require [clojure.test :refer :all]
            [toyproblems.all-anagrams :refer :all]))



(deftest all-anagrams-test
  (testing "Should be a function"
    (is (function? all-anagrams)))
  
  (testing "Should return a list"
    (is (seq? (all-anagrams "abc"))))
  
  (testing "Single char returns a list with one value?"
    (is (= ["a"] (all-anagrams "a")))
    (is (seq? (all-anagrams "a"))))
  
  (testing "(all-anagrams \"lives\") contains \"elvis\"?"
    (is (some #{"lives"} (all-anagrams "elvis"))))
  
  (testing "should return an array of anagrams that contains `badcredit` for input `debitcard`"
    (is (some #{"badcredit"} (all-anagrams "debitcard"))))
  
  (testing "should return all anagrams for 'ab'" 
    (is (= (set '("ab" "ba"))
           (set (all-anagrams "ab")))))
  
  (testing "should return all anagrams for 'abc'"
    (is (= (set '("abc" "acb" "bac" "bca" "cab" "cba"))
           (set (all-anagrams "abc")))))
  
  (testing "should return all anagrams for 'apps'"
    (is (= (set '("apps" "apsp" "aspp" "paps" "pasp" "ppas" "ppsa" "psap" "pspa" "sapp" "spap" "sppa"))
           (set (all-anagrams "apps")))))
  
  ; (testing "should return all __unique__ anagrams for 'apps'"
  
  ; (testing "should not use underscore's `uniq`")
  )
