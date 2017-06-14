# InventoryManagement
Inventory management provides api to look for product availability in stock

# api sample urls

urls to to add new product

POST http://localhost:8080/inventoryManagement/product
headers :
 application/json; charset=UTF-8
 
body :  
{
	"name" : "cricketBat",
	"price" : "200",
	"quantity" : "6"
}

urls to find availability of product in stock

GET http://localhost:8080/inventoryManagement/findAvailability/59407897b4983d25843d5cc9

swagger api 
http://localhost:8080/swagger-ui.html

