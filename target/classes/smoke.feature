Feature: Smoke
  As a user
  I want to check the main functionality of websites Lorem Ipsum and bbc
  So that I can be sure they are functioning correctly


Scenario Outline: User verifies that the word "рыба" correctly appears in the first paragraph
    Given User opens '<homePage>' page
    And User selects russian language
    And User checks that the text of the first paragraph contains word '<expectedText>'

    Examples:
      | homePage            | expectedText |

      | https://lipsum.com/ |рыба|


  Scenario Outline: User verifies that the first paragraph starts with "Lorem ipsum dolor sit amet, consectetur adipiscing elit"
    Given User opens '<homePage>' page
    And User clicks on the button Generate Lorem Ipsum
    And User checks if the first paragraph starts with '<expectedText>'


    Examples:
      | homePage            | expectedText |

      | https://lipsum.com/ |Lorem ipsum dolor sit amet, consectetur adipiscing elit|



  Scenario Outline: User verifies that Lorem Ipsum is generated with correct size words:
    Given User opens '<homePage>' page
    And User clicks on words
    And User enters number of words '<numberOfWords>'
    And User clicks on the button Generate Lorem Ipsum
    And User checks if actual number of characters generated is the same as it was specified '<expectedText>'

    Examples:
      | homePage            | numberOfWords |  expectedText|

      |https://lipsum.com/  |10              |  10 words   |
      |https://lipsum.com/  |-1              |  -1 words    |
      |https://lipsum.com/  |0               |  0 words     |
      |https://lipsum.com/  |20              |  20 words    |


  Scenario Outline: User verifies that Lorem Ipsum is generated with correct size bytes:
    Given User opens '<homePage>' page
    And User clicks on bytes
    And User enters number of words '<numberOfWords>'
    And User clicks on the button Generate Lorem Ipsum
    And User checks if actual number of characters generated is the same as it was specified '<expectedText>'

    Examples:
      | homePage            | numberOfWords |  expectedText|

      |https://lipsum.com/  |5               |  5 bytes    |
      |https://lipsum.com/  |15              |  15 bytes   |
      |https://lipsum.com/  |20              |  20 bytes   |
      |https://lipsum.com/  |0               |   0 bytes   |


  Scenario Outline: User verifies that result no longer starts with Lorem ipsum
    Given User opens '<homePage>' page
    And User unchecks start with Lorem Ipsum checkbox
    And User clicks on the button Generate Lorem Ipsum
    And User checks if the first paragraph does not start with '<expectedText>'


    Examples:
      | homePage            | expectedText |

      | https://lipsum.com/ |Lorem ipsum |




  Scenario Outline: User check that randomly generated text paragraphs contain the word lorem with probability of more than 40

    Given User opens '<homePage>' page
    And User clicks on the button Generate Lorem Ipsum
    And User checks if the first paragraph does not start with '<expectedText>'


    Examples:
      | homePage            | expectedText |

      | https://lipsum.com/ |Lorem ipsum |


  Scenario Outline: User verifies the name of the headline article
    Given User opens '<homePage>' page
    And User clicks on News Button
    And User checks if the name of the main article contains '<expectedText>'
    #Checks the name of the headline article against a value specified in your test (hard-coded)


    Examples:
      | homePage            | expectedText |

      | https://www.bbc.com/ |Russia forced to merge depleted units |


  Scenario Outline: User checks secondary article titles
    Given User opens '<homePage>' page
    And User clicks on News Button
    And User checks first article title '<articleFirst>'
    And User checks third article title '<articleThird>'
    And User checks fourth article title '<articleFourth>'

    Examples:
      | homePage            | articleFirst                                |     articleThird               |  articleFourth                                                  |

      | https://www.bbc.com/ |US accuses Russia of depravity and brutality |to almost touch in night sky   |test needed to enter Beijing spaces            |


  Scenario Outline: User checks World article title
    Given User opens '<homePage>' page
    And User clicks on News Button
    And User clicks on Search Icon
    And User enters  data '<textToEnter>'
    And User submits search request
    And User checks if the name of the first article contains stored data '<expectedText>'

    Examples:
      | homePage            | textToEnter | expectedText |

      | https://www.bbc.com/ |World        |       World   |



  Scenario Outline: User verifies that error appears when mandatory field Subject was skipped
    Given User opens '<homePage>' page
    And User clicks on News Button
    And User clicks on CoronaVirus section
    And User selects Your Coronavirus Stories
    And User clicks on Contact BBC News
    And User clicks  on Report Technical Issue
    And User enters Comments '<comments>'
    And User enters name '<name>'
    And User enters email '<email>'
    And User clicks on Send
    And User checks if error message about missing information is displayed


    Examples:
      | homePage            | comments         | name      |    email                     |

      | https://www.bbc.com/ |Lorem Ipsum     |  Peter   |  test1234@test.com              |

  Scenario Outline: User verifies that error appears when mandatory field Name was skipped
    Given User opens '<homePage>' page
    And User clicks on News Button
    And User clicks on CoronaVirus section
    And User selects Your Coronavirus Stories
    And User clicks on Contact BBC News
    And User clicks  on Report Technical Issue
    And User enters Subject '<subject>'
    And User enters Comments '<comments>'
    And User enters email '<email>'
    And User clicks on Send
    And User checks if error message about missing information name is displayed

    Examples:
      | homePage            | comments         | subject      |    email       |

      | https://www.bbc.com/ |Lorem Ipsum     |  Test   |  test1234@test.com   |


  Scenario Outline: User verifies that error appears when invalid format email was entered
    Given User opens '<homePage>' page
    And User clicks on News Button
    And User clicks on CoronaVirus section
    And User selects Your Coronavirus Stories
    And User clicks on Contact BBC News
    And User clicks  on Report Technical Issue
    And User enters Subject '<subject>'
    And User enters name '<name>'
    And User enters Comments '<comments>'
    And User enters email '<email>'
    And User clicks on Send
    And User checks if error message about invalid format email appears

    Examples:
      | homePage            | comments         | subject      |    email       |    name   |

      | https://www.bbc.com/ |Lorem Ipsum     |  Test   |         qwertyuio   |    Peter  |




