(defmacro safe
  "Does a thing while checking for exceptions."
  ([to-safe]
   `(try ~to-safe
         (prn ~to-safe)
         (catch Exception ex# (prn ex#))))
  ([variable expression]
   (let [s (first variable) fr (second variable)]
     `(try ~expression
           (prn ~expression)
           (catch Exception ex# (prn ex#)))))
  )

(import java.io.FileReader java.io.File)


(safe (/ 15 5))
(def v (safe [s (FileReader. (File. "C:\\Users\\woebi\\Downloads\\test.txt"))] (.read s)))
v