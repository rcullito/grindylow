(ns cfj.core
  (:import [cfj Event]))

(defrecord EventImpl [name]
  Event
  (getName [_] name)
  (isPositive [_ angle] (pos? angle)))

(def rivendell (EventImpl. "rob"))

(.getName rivendell)

(.isPositive rivendell -1.92)

