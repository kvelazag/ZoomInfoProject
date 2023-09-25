Feature: Chatbot validation
Scenario Outline: chatbot validation process
Given User Launch The chatbot Application
When Once you launch the site and verify if the chat bot is displayed on the screen
And Click on the bot and verify the welcome message and other text validation
And Enter invalid data "<wrongEmail>" and verify error message 
And then enter valid data "<correctEmail>" and continue the conversation
And Restart the conversation
And Close and open the chat
And Open a new tab with google stay there for 10 seconds 
And come back to chat page and enter the data "<newData>" in the bot
Then close the page

Examples:
|wrongEmail|correctEmail|newData|
|kavi@gmail.com|kavi@telekom.com|kaviyarasu@telekom.com|