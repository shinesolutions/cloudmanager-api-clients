ifndef SWAGGER_CODEGEN_CLI_JAR
	SWAGGER_CODEGEN = swagger-codegen
else
	SWAGGER_CODEGEN = java -jar $(SWAGGER_CODEGEN_CLI_JAR)
endif

all: deps clean build install test-unit test-integration doc

deps:
	npm install -g mocha

clean:
	rm -rf generated/

build:
	$(SWAGGER_CODEGEN) generate \
	  --input-spec ../conf/api.yml \
		--lang javascript \
		--output generated/ \
		--config conf/client.json

install:
	cd generated/ && \
	  npm install node-aem-cloudmanager-api-client --save

test-unit:
	cd generated/ && \
	  npm test

test-integration:
	cd generated/ && \
	  mocha --recursive ../test-integration

doc:
	cd generated/ && \
	  echo "TODO"

.PHONY: all deps clean build install test-unit test-integration doc
