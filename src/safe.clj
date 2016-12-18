(defmacro safe
  ([to-safe]
   "Does a thing while checking for exceptions."
   `(try ~to-safe
         (prn ~to-safe)
         (catch Exception e# (prn e#))))
  ([vector exp]
   (binding [vector exp]
   `(try ~exp
         (prn ~exp)
         (catch Exception e# (prn e#))))))
		 
		 
