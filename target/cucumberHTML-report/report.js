$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("AmazonPage.feature");
formatter.feature({
  "line": 2,
  "name": "Automate Amazon Page",
  "description": "",
  "id": "automate-amazon-page",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@amazon"
    }
  ]
});
formatter.scenario({
  "line": 4,
  "name": "Validate that user is able to add item to cart",
  "description": "",
  "id": "automate-amazon-page;validate-that-user-is-able-to-add-item-to-cart",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User navigates to \"https://www.amazon.com/\"",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Searches for the \"Alexa\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Scroll down to the second page",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Select the third item",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Add item to cart",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Item is in a cart",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "Item details displayed",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.amazon.com/",
      "offset": 19
    }
  ],
  "location": "AmazonAlexa.user_navigates_to(String)"
});
formatter.result({
  "duration": 16437907600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Alexa",
      "offset": 18
    }
  ],
  "location": "AmazonAlexa.searches_for_the(String)"
});
formatter.result({
  "duration": 7708160200,
  "status": "passed"
});
formatter.match({
  "location": "AmazonAlexa.scroll_down_to_the_second_page()"
});
formatter.result({
  "duration": 2617363200,
  "status": "passed"
});
formatter.match({
  "location": "AmazonAlexa.select_the_third_item()"
});
formatter.result({
  "duration": 10568750700,
  "status": "passed"
});
formatter.match({
  "location": "AmazonAlexa.add_item_to_cart()"
});
formatter.result({
  "duration": 3523188000,
  "status": "passed"
});
formatter.match({
  "location": "AmazonAlexa.item_is_in_a_cart()"
});
formatter.result({
  "duration": 3621562900,
  "status": "passed"
});
formatter.match({
  "location": "AmazonAlexa.item_details_displayed()"
});
formatter.result({
  "duration": 1270560400,
  "status": "passed"
});
});