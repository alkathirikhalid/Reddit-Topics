# Reddit-Topics
Reddit topics with up vote and down votes

Functionality that must be present:

● Req 1: Maintain a list of topics and its upvotes/downvotes
- Done Completed: Create, Read and Update operations without option of deletion not required on Class Topic and Class TopicData

● Req 2: Allow the user to submit topics. For this challenge, a “topic” is simply a string that does not exceed 255 characters
- Done Completed: Validation on dialog_fragment_create_topic.xml and Class Topic Validator (Redundant require to facilitate unit testing)

● Req 3: Allow the user to upvote or downvote a topic. For this challenge, the user may upvote or downvote the same topic multiple times.
- Done Completed: Class Topic, TopicData and HomeTopicsRecycleViewAdaptor handle clicks

● Req 4: Tapping a topic should expand that topic into a separate view (page)
- Done Completed: Class MainActivity and ViewTopicActivity

● Req 5: Always return a list of top 20 topics (sorted by upvotes, descending) on the homepage
- Done Completed: Class TopicData, MainActivity and HomeTopicsRecycleViewAdaptor

● Req 6: In-memory: Design an in-memory data structure (shared by the same process as your application) that will allow you to keep the topics in memory without using data persistence. It is okay for the topics to disappear after the application restarts. You may use data structures provided by your language’s standard library to build your data structure.
- Done Completed: Class TopicData using ArrayList

● Req 7: Tests are an essential part of our software engineering practices here and we’ll like you
to include them as part of your submission.
- Done Completed: Class TopicUnitTest, Automated Expresso TopicsCreationTest and TopicVoteAndViewTest

● Req 8: Code comments and documentation: For the key functionalities mentioned above, you
should provide code comments and text-based documentation (eg. README) on the
hows and whys of your implementation and the assumptions you are making.
- Done Completed: in App Code and here in

● Req 9: If you are using a boilerplate or code scaffolding tools to generate the project, please clearly indicate it on your README and indicate via comments / README on the parts of the code that were written by you.
- Done Completed: None other than default Android Basic Activity Template with floating icon and Material Design

● Req 10: Provide a link to an online accessible Git repository such as Github, Bitbucket etc. (preferred)
- Done Completed: Here in, enjoy
