
(ns dom.head)

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn get-head-element
  ; @usage
  ; (get-head-element)
  ;
  ; @return (DOM-element)
  []
  (-> js/document (.getElementsByTagName "head")
                  (aget 0)))
