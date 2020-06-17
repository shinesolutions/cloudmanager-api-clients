LANGS = ada ada-server android apache2 apex aspnetcore bash clojure cwiki cpp-qt5 cpp-qt5-qhttpengine-server cpp-pistache-server cpp-restbed-server cpp-restsdk cpp-tizen csharp csharp-dotnet2 csharp-nancyfx dart eiffel elixir elm erlang-client erlang-server flash scala-finch go go-server groovy kotlin kotlin-server haskell-http-client haskell java jaxrs-cxf-client java-inflector java-msf4j java-pkmst java-play-framework java-undertow-server java-vertx jaxrs-cxf jaxrs-cxf-cdi jaxrs-jersey jaxrs-resteasy jaxrs-resteasy-eap jaxrs-spec javascript javascript-flowtyped javascript-closure-angular jmeter lua nodejs-server objc openapi openapi-yaml perl php php-laravel php-lumen php-slim php-silex php-symfony php-ze-ph powershell python python-flask r ruby ruby-on-rails ruby-sinatra rust rust-server scalatra scala-akka scala-httpclient scala-gatling scala-lagom-server scalaz spring dynamic-html html html2 swift2-deprecated swift3 swift4 typescript-angular typescript-angularjs typescript-aurelia typescript-fetch typescript-inversify typescript-jquery typescript-node
LANGS = ada
ci: clean deps lint generate doc

clean:
	rm -rf spec

deps:
	npm install -g jsonlint@1.6.3 swagger-cli@2.2.1
	# docker pull openapitools/openapi-generator-cli:v4.2.3
	mkdir -p spec/
	# curl https://raw.githubusercontent.com/AdobeDocs/cloudmanager-api-docs/master/swagger-specs/api.yaml --output spec/api.yaml
	# curl https://raw.githubusercontent.com/AdobeDocs/cloudmanager-api-docs/master/swagger-specs/events.yaml --output spec/events.yaml
	curl https://raw.githubusercontent.com/ahmed-musallam/cloudmanager-api-docs/patch-1/swagger-specs/api.yaml --output spec/api.yaml
	curl https://raw.githubusercontent.com/ahmed-musallam/cloudmanager-api-docs/patch-1/swagger-specs/events.yaml --output spec/events.yaml

lint:
	swagger-cli validate spec/api.yaml
	# jsonlint clients/java/conf/client.json
	# jsonlint clients/javascript/conf/client.json
	# jsonlint clients/python/conf/client.json
	# jsonlint clients/ruby/conf/client.json

release:
	rtk release

################################################################################
# Targets for generating API client for the supported languages.
################################################################################

generate:
	for lang in ${LANGS} ; do \
	  docker \
		  run \
		  --rm \
		  -v ${PWD}:/local \
		  openapitools/openapi-generator-cli \
		  generate \
		  --input-spec https://raw.githubusercontent.com/AdobeDocs/cloudmanager-api-docs/master/swagger-specs/api.yaml \
		  --generator-name $$lang \
		  --skip-validate-spec \
		  --output /local/clients/$$lang/generated/; \
	done

.PHONY: ci clean deps lint doc doc-publish java release generate $(LANGS)
