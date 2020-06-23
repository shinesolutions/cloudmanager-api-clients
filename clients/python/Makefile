ifndef SWAGGER_CODEGEN_CLI_JAR
	SWAGGER_CODEGEN = swagger-codegen
else
	SWAGGER_CODEGEN = java -jar $(SWAGGER_CODEGEN_CLI_JAR)
endif

all: deps clean build install test-unit test-integration doc

deps:
	cd generated/ && \
		pip install -r requirements.txt && \
		pip3 install -r requirements.txt

clean:
	rm -rf generated/

build:
	$(SWAGGER_CODEGEN) generate \
	  --input-spec ../conf/api.yml \
		--lang python \
		--output generated/ \
		--config conf/client.json

install:
	cd generated/ && \
	  python3 setup.py install

test:
	cd generated/ && \
		python3 -m unittest discover

doc:
	cd generated/ && \
	  sphinx-apidoc -o ../../doc/python/master/stage/ --full -H "Python AEM CloudManager API Client" -A "Shine Solutions" pyaemcloudmanagerapi && \
		cd ../../doc/python/master/stage/ && \
		make html && \
		cd .. && \
		cp -R stage/_build/html/* ./ && \
		rm -rf stage/

publish:
	cd generated/ && \
	python3 setup.py sdist

publish-test:
	cd generated/ && \
	  python3 setup.py register -r pypitest && \
		python3 setup.py sdist upload -r pypitest

.PHONY: all deps clean build install test-unit test-integration doc publish publish-test
