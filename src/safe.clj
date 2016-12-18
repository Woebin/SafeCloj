(defmacro safe
  ([to-safe]
   "Does a thing while checking for exceptions."
   `(try ~to-safe
         (catch Exception e#)))
  ([vector exp]
   (binding [vector exp]
   `(try ~exp
         (catch Exception e# )))))
		 
		 
