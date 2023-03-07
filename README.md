# ansi-escape

ANSI color escape sequences.

[![Clojars Project](https://img.shields.io/clojars/v/com.github.strojure/ansi-escape.svg)](https://clojars.org/com.github.strojure/ansi-escape)

## Design goals

* Give names for ANSI color escape sequences.
* Simple, no fancy DSL for color output.

## Usage

```clojure
(ns readme.usage
  (:require [strojure.ansi-escape.core :as ansi]))

;; Print `[ERROR]` as yellow on red
(println (str ansi/bg-red ansi/fg-yellow-b "[ERROR]" ansi/reset)
         "Test error message")
```
