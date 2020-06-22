ifndef SWAGGER_CODEGEN_CLI_JAR
	SWAGGER_CODEGEN = swagger-codegen
else
	SWAGGER_CODEGEN = java -jar $(SWAGGER_CODEGEN_CLI_JAR)
endif

all: clean build install test-unit doc

clean:
	rm -rf generated/
	cd test-integration/ && \
	  mvn clean

build:
	$(SWAGGER_CODEGEN) generate \
	  --input-spec ../conf/api.yml \
		--lang typescript-node \
		--output generated/ \
		--config conf/client.json

install:

test-unit:

test-integration: install

doc:
	cd generated/ && \

publish:

.PHONY: all clean build install test-unit test-integration doc publish
