# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate

context("Test Repository")

model.instance <- Repository$new()

test_that("repo", {
  # tests for the property `repo` (character)
  # Repository name

  # uncomment below to test the property 
  #expect_equal(model.instance$`repo`, "EXPECTED_RESULT")
})

test_that("description", {
  # tests for the property `description` (character)
  # description

  # uncomment below to test the property 
  #expect_equal(model.instance$`description`, "EXPECTED_RESULT")
})

test_that("_links", {
  # tests for the property `_links` (RepositoryLinks)

  # uncomment below to test the property 
  #expect_equal(model.instance$`_links`, "EXPECTED_RESULT")
})

