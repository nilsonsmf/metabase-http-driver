(defproject metabase/http-driver "1.0.0"
  :min-lein-version "2.5.0"

  :dependencies
  [[com.jayway.jsonpath/json-path "2.3.0"]
   [jakarta.xml.bind/jakarta.xml.bind-api "2.3.2"]
   [org.glassfish.jaxb/jaxb-runtime "2.3.2"]
   ]

  :jvm-opts
  ["-XX:+IgnoreUnrecognizedVMOptions"
   ]

  :profiles
  {:provided
   {:dependencies
    [[org.clojure/clojure "1.9.0"]
     [metabase-core "1.0.0-SNAPSHOT"]]}

   :uberjar
   {:auto-clean    true
    :aot :all
    :omit-source true
    :javac-options ["-target" "1.8", "-source" "1.8"]
    :target-path   "target/%s"
    :uberjar-name  "http.metabase-driver.jar"}})
