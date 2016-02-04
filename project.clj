(let [s3_username (System/getenv "AWS_ACCESS_KEY_ID")
      s3_password (System/getenv "AWS_SECRET_KEY")]

  (defproject sossity "0.1.0-SNAPSHOT"
    :description "FIXME: write description"
    :url "http://example.com/FIXME"
    :license {:name "Eclipse Public License"
              :url "http://www.eclipse.org/legal/epl-v10.html"}
    :dependencies [[org.clojure/clojure "1.7.0"]
                   [aysylu/loom "0.5.4"]
                   [cheshire/cheshire "5.5.0"]
                   [traversy "0.4.0"]
                   [org.clojure/tools.cli "0.3.3"]
                   [org.clojure/tools.namespace "0.2.11"]
                   [org.slf4j/slf4j-nop "1.7.5"]
                   [commons-io/commons-io "2.4"]
                   [org.flatland/useful "0.11.3"]
                   [com.cemerick/pomegranate "0.3.0"]
                   [org.clojure/core.async "0.2.374"]
                   [com.acacia/angleddream "0.1-ALPHA" :exclusions [org.clojure/clojure]]
                   [danlentz/clj-uuid "0.1.6"]
                   [pandect "0.5.4"]

                   [digest "1.4.4"]
                   [clj-time "0.11.0"]]

    :plugins [[lein-cljfmt "0.3.0"]]
     
    :main sossity.core
    :aot [sossity.core]))

