all: clean deps build install test-unit test-integration doc
ci: clean deps build install test-unit doc

clean:
	rm -rf generated/ Gemfile.lock
	mkdir -p generated/

deps:
	gem install bundler --version=1.17.3
	bundle install --binstubs

build:
	docker \
	  run \
	  -v `pwd`/../../:/local/ \
	  openapitools/openapi-generator-cli \
	  generate \
	  --input-spec /local/conf/api.yml \
	  --config /local/clients/ruby/conf/client.json \
	  --output /local/clients/ruby/generated/ \
	  --generator-name ruby

install:
	cd generated/ && \
	  rm -f ruy_aem_cloudmanager_api_client-*.gem Gemfile.lock && \
		bundle install && \
	  gem build ruy_aem_cloudmanager_api_client.gemspec && \
	  gem install `ls ruy_aem_cloudmanager_api_client-*.gem`

test-unit: install
	cd generated/ && \
	  rm -f ruy_aem_cloudmanager_api_client-*.gem && \
	  bundle exec rspec spec/

doc:
	cd generated/ && \
	  rm -f ruy_aem_cloudmanager_api_client-*.gem && \
	  yard doc \
            --output-dir ../../doc/ruby/master/

publish: install
	cd generated/ && \
	  gem push `ls ruy_aem_cloudmanager_api_client-*.gem`

release:
	rtk release

.PHONY: all ci deps clean build install test-unit test-integration fixtures doc publish release
