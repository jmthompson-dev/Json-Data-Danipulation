# Json Data Manipulation
This is project to display my competencies in work with large amounts of data in Json format. First Deserializing the data from a Json file to a Java object then 
sending the object to DynamoDb using Amazons Java Coretto 11, while handling exceptions. This project implements dependence inject with singleton mapper objects and 
is thoroughly tested in the projects root test module with some dependencies being mocked.

## Motivation
The motivation behind this project was to showcase how complex tasks can be developed with a simplistic design to maintain scalability and readability.


## Tech/framework used
<b>Built with</b>
- [Java 11](https://docs.aws.amazon.com/corretto/latest/corretto-11-ug/what-is-corretto-11.html)
- [AWS DynamoDB](https://aws.amazon.com/dynamodb/?trk=ea446940-00bb-4bee-9f27-d7a9a8080e4d&sc_channel=ps&sc_campaign=acquisition&sc_medium=ACQ-P|PS-GO|Brand|Desktop|SU|Database|DynamoDB|US|EN|Text&s_kwcid=AL!4422!3!536393513269!e!!g!!aws%20dynamodb&ef_id=Cj0KCQjwg_iTBhDrARIsAD3Ib5h7FB6KodTgfcpW7MSjAJ9RdufxinT_dRECQoDqdikWAzJhChOCpMIaAqmPEALw_wcB:G:s&s_kwcid=AL!4422!3!536393513269!e!!g!!aws%20dynamodb)
- [Dagger](https://dagger.dev/)
- [JUnit](https://junit.org/junit5/)
- [Mockito](https://site.mockito.org/)

## Features
- Post request to DynamoDB
- RESTful API design
- Dependence Inject
- Unit Testing
- Dependence Mocking

## Installation
**If these steps are not follow the project will not build or execute**
Helpful keyboard shortcut to comment & uncomment, mac press the buttons `command` & `/` together, windows `control` & `/`. You can perform this command on multiple lines by highlighting then executing the shortcut.
To execute Unit tests:
1. Build the project. This is necessary to automatically generate and use the dagger components for dependence injection.
2. Open the main runner class `TransferApplication.java`.
3. Follow the steps in `TransferApplication.java` on line 15, 16, & 17 the steps include commenting and uncommenting those lines.
4. Now open the test module and follow the defined steps in `LoadDataActivityTest.java` on line 21, & 22 the steps include commenting and uncommenting those lines.
5. Then open the test module and follow the defined steps in `TransferDataActivityTest.java`
6. You can now run the application and execute the Unit test in the root test module called `test`  

## API Reference
API file `Data.java`
Table name the API connects to `daily_sales`
DynamoDB Hash Key `order_id0`
DynamoDB Range Key `date_time`

## Tests
The JUnit test can be executed by clicking the green arrows in `LoadDataActivityTest.java` & `TransferDataActivityTest.java` or by right-clicking on the file directly the project file tree.
