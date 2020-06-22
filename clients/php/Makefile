ifndef SWAGGER_CODEGEN_CLI_JAR
	SWAGGER_CODEGEN = swagger-codegen
else
	SWAGGER_CODEGEN = java -jar $(SWAGGER_CODEGEN_CLI_JAR)
endif

all: clean build install test-unit doc

clean:
	rm -rf generated/

build:
	$(SWAGGER_CODEGEN) generate \
	  --input-spec ../conf/api.yml \
		--lang php \
		--output generated/ \
		--config conf/client.json && \
	  cd generated/ && \
		mvn package

install:
	cd generated/ && \
	  composer install

test-unit: install
	cd test-integration/ && \
		./vendor/bin/phpunit

doc:

publish:
	composer require vitalis/hello-composer

.PHONY: all clean build install test-unit test-integration doc publish
