(ns readme.usage
  (:require [strojure.ansi-escape.core :as ansi]))

(println (str ansi/bg-red ansi/fg-yellow-b "[ERROR]" ansi/reset)
         "Test error message")
