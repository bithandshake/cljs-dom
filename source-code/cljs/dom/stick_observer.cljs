
(ns dom.stick-observer)

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; TEMP
; https://css-tricks.com/how-to-detect-when-a-sticky-element-gets-pinned/
(defn stick-observer
  [element]
  (letfn [(f0 [entries] (doseq [e entries]
                               (if (< (.-intersectionRatio e) 1)
                                   (.setAttribute    element "data-sticky" true)
                                   (.removeAttribute element "data-sticky"))))]
         (let [observer (js/IntersectionObserver. f0 (clj->js {:threshold [1]}))]
              (-> observer (.observe observed-element))
              (-> element))))
; TEMP
 
