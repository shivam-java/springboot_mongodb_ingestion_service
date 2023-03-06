# springboot_mongodb_ingestion_service
To Insert the bulk data into mongodb from java springboot app 
## Run Steps of APP 
1. Import the code and run as SpringBootApp
2. set up mongodb locally 
3. call the endpoint "http://localhost:8080/call/ingest/service" with post method 
pass below queries in body>raw using postman 
4. Now data will get inserted to local collection of mongodb
we can insert the data from graphql post API with below queries 
* Example

```
{
    "profile":
    {
   "name":"Virat Kohli",
    "country": "india",
    "birthPlace": "delhi",
    "age": 34,
    "role": "Batsman",
    "teams": [
        "india",
        "RCB"
    ]
    },
    "stats":
    {
        "battingStats":{
              "odiMatches":
              {
                  "matches":200,
                  "innings":190,
                  "runs":10000,
                  "hundreds":40,
                  "fifties":60,
                  "avg":50
              },
                "testMatches":
              {
                  "matches":100,
                  "innings":180,
                  "runs":8000,
                  "hundreds":27,
                  "fifties":60,
                  "avg":50
              },
                "t20IMatches":
              {
                  "matches":100,
                  "innings":90,
                  "runs":3000,
                  "hundreds":1,
                  "fifties":30,
                  "avg":50
              }
        },
        "bowlingStats":
        {

        }
       
    },
    "carrerSummary":
    {
"carrerSummary":"The One word for him is KING ,,Kohli goes down the ground ..kohli goes over the ground never gets old"
    }
}
```

```
{
    "profile":
    {
   "name":"James Anderson",
    "country": "England",
    "birthPlace": "Lancashire",
    "age": 40,
    "role": "Bowler",
    "teams": [
        "England",
        "England A"
    ]
    },
    "stats":
    {
        "battingStats":
        {
              
        },
        "bowlingStats":
        {
            "testMatches":
            {
                  "matches":179,
                  "innings":333,
                  "wickets":685,
                  "economy":2.79,
                  "fiveWicketsHauls":32,
                  "tenWicketsHauls":3,
                  "avg":25.99
            },
             "odiMatches":{
                  "matches":194,
                  "innings":191,
                  "wickets":269,
                  "economy":4.92,
                  "fiveWicketsHauls":2,
                  "avg":29.22
                
            },
             "t20IMatches":{
                     "matches":19,
                  "innings":19,
                  "wickets":18,
                  "economy":7.85,
                  "fiveWicketsHauls":0,
                  "avg":23.44
                
            }
        }
       
    },
    "carrerSummary":
    {
"carrerSummary":"James Anderson is perhaps the best swing bowler in the world at the present moment"
    }
}
```
# For Any Query 
Contact 8318195007 Shivam Dwivedi
