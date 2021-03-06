# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate

context("Test EmbeddedProgram")

model.instance <- EmbeddedProgram$new()

test_that("id", {
  # tests for the property `id` (character)
  # Identifier of the program. Unique within the space.

  # uncomment below to test the property 
  #expect_equal(model.instance$`id`, "EXPECTED_RESULT")
})

test_that("name", {
  # tests for the property `name` (character)
  # Name of the program

  # uncomment below to test the property 
  #expect_equal(model.instance$`name`, "EXPECTED_RESULT")
})

test_that("enabled", {
  # tests for the property `enabled` (character)
  # Whether this Program has been enabled for Cloud Manager usage

  # uncomment below to test the property 
  #expect_equal(model.instance$`enabled`, "EXPECTED_RESULT")
})

test_that("tenantId", {
  # tests for the property `tenantId` (character)
  # Tenant Id

  # uncomment below to test the property 
  #expect_equal(model.instance$`tenantId`, "EXPECTED_RESULT")
})

