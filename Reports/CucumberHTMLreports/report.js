$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("ZoomInfo.feature");
formatter.feature({
  "line": 1,
  "name": "Chatbot validation",
  "description": "",
  "id": "chatbot-validation",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 2,
  "name": "chatbot validation process",
  "description": "",
  "id": "chatbot-validation;chatbot-validation-process",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 3,
  "name": "User Launch The chatbot Application",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "Once you launch the site and verify if the chat bot is displayed on the screen",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "Click on the bot and verify the welcome message and other text validation",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "Enter invalid data \"\u003cwrongEmail\u003e\" and verify error message",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "then enter valid data \"\u003ccorrectEmail\u003e\" and continue the conversation",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Restart the conversation",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Close and open the chat",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Open a new tab with google stay there for 10 seconds",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "come back to chat page and enter the data \"\u003cnewData\u003e\" in the bot",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "close the page",
  "keyword": "Then "
});
formatter.examples({
  "line": 14,
  "name": "",
  "description": "",
  "id": "chatbot-validation;chatbot-validation-process;",
  "rows": [
    {
      "cells": [
        "wrongEmail",
        "correctEmail",
        "newData"
      ],
      "line": 15,
      "id": "chatbot-validation;chatbot-validation-process;;1"
    },
    {
      "cells": [
        "kavi@gmail.com",
        "kavi@telekom.com",
        "kaviyarasu@telekom.com"
      ],
      "line": 16,
      "id": "chatbot-validation;chatbot-validation-process;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 16,
  "name": "chatbot validation process",
  "description": "",
  "id": "chatbot-validation;chatbot-validation-process;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 3,
  "name": "User Launch The chatbot Application",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "Once you launch the site and verify if the chat bot is displayed on the screen",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "Click on the bot and verify the welcome message and other text validation",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "Enter invalid data \"kavi@gmail.com\" and verify error message",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "then enter valid data \"kavi@telekom.com\" and continue the conversation",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Restart the conversation",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Close and open the chat",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Open a new tab with google stay there for 10 seconds",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "come back to chat page and enter the data \"kaviyarasu@telekom.com\" in the bot",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "close the page",
  "keyword": "Then "
});
formatter.match({
  "location": "ZoomInfoStepDefinition.user_Launch_The_chatbot_Application()"
});
formatter.result({
  "duration": 3416708400,
  "status": "passed"
});
formatter.match({
  "location": "ZoomInfoStepDefinition.once_you_launch_the_site_and_verify_if_the_chat_bot_is_displayed_on_the_screen()"
});
formatter.result({
  "duration": 2153384000,
  "status": "passed"
});
formatter.match({
  "location": "ZoomInfoStepDefinition.click_on_the_bot_and_verify_the_welcome_message_and_other_text_validation()"
});
formatter.result({
  "duration": 2309007900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "kavi@gmail.com",
      "offset": 20
    }
  ],
  "location": "ZoomInfoStepDefinition.enter_invalid_data_and_verify_error_message(String)"
});
formatter.result({
  "duration": 2572200900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "kavi@telekom.com",
      "offset": 23
    }
  ],
  "location": "ZoomInfoStepDefinition.then_enter_valid_data_and_continue_the_conversation(String)"
});
formatter.result({
  "duration": 6363222400,
  "status": "passed"
});
formatter.match({
  "location": "ZoomInfoStepDefinition.restart_the_conversation()"
});
formatter.result({
  "duration": 141330100,
  "status": "passed"
});
formatter.match({
  "location": "ZoomInfoStepDefinition.close_and_open_the_chat()"
});
formatter.result({
  "duration": 254243200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "10",
      "offset": 42
    }
  ],
  "location": "ZoomInfoStepDefinition.open_a_new_tab_with_google_stay_there_for_seconds(int)"
});
formatter.result({
  "duration": 3841751500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "kaviyarasu@telekom.com",
      "offset": 43
    }
  ],
  "location": "ZoomInfoStepDefinition.come_back_to_chat_page_and_enter_the_data_in_the_bot(String)"
});
formatter.result({
  "duration": 33830600,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});