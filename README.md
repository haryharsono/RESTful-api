##API SPEC

##create Mahasiswa

Request :
- Method :POST
- Endpoint : `/api/mahasiswa`
- Header :
    - Content-Type: application/json
    - Accept: application/json
- Body     
```json
    {
      "id" : "String, unique",
      "stambuk" : "String",
      "name" : "String",
      "umur " : "int",
      "jurusan " : "String",
      "agama " : "String",
      "jenisKelamin " : "String"    
    }
```

Response :

```json
    {
      "code" : "String",
      "status" : "String",
      "data ": {
                  "id" : "String, unique",
                  "stambuk" : "String",
                  "name" : "String",
                  "umur " : "int",
                  "jurusan " : "String",
                  "agama " : "String",
                  "jenisKelamin " : "String",
                  "createdAt ": "date",
                  "updatedAt" : "date" 
               }          
    }
```
    

##get mahasiswa

Request :
- Method : GET
- Endpoint : `/api/mahasiswa/{id_mahasiswa}`
- Header :
    - Accept: application/json

Response :

```json
    {
      "code" : "String",
      "status" : "String",
      "data ": {
                  "id" : "String, unique",
                  "stambuk" : "String",
                  "name" : "String",
                  "umur " : "int",
                  "jurusan " : "String",
                  "agama " : "String",
                  "jenisKelamin " : "String",
                  "createdAt ": "date",
                  "updatedAt" : "date" 
               }          
    }
```

##update mahasiswa

Request :
- Method :PUT
- Endpoint : `/api/mahasiswa/{id_mahasiswa}`
- Header :
    - Content-Type: application/json
    - Accept: application/json
- Body     
```json
    {
      "stambuk" : "String",
      "name" : "String",
      "umur " : "int",
      "jurusan " : "String",
      "agama " : "String",
      "jenisKelamin " : "String"    
    }
```

Response :

```json
    {
      "code" : "String",
      "status" : "String",
      "data ": {
                  "id" : "String, unique",
                  "stambuk" : "String",
                  "name" : "String",
                  "umur " : "int",
                  "jurusan " : "String",
                  "agama " : "String",
                  "jenisKelamin " : "String",
                  "createdAt ": "date",
                  "updatedAt" : "date" 
               }          
    }
```
##list mahasiswa

Request :
- Method : GET
- Endpoint : `/api/mahasiswa`
- Header :
    - Accept: application/json
- Query param :
    - size : number,
    - page : number

Response :

```json
    {
      "code" : "String",
      "status" : "String",
      "data " : [
              {
              "id" : "String, unique",
              "stambuk" : "String",
              "name" : "String",
              "umur " : "int",
              "jurusan " : "String",
              "agama " : "String",
              "jenisKelamin " : "String",
              "createdAt ": "date",
              "updatedAt" : "date" 
              },
              {
              "id" : "String, unique",
              "stambuk" : "String",
              "name" : "String",
              "umur " : "int",
              "jurusan " : "String",
              "agama " : "String",
              "jenisKelamin " : "String",
              "createdAt ": "date",
              "updatedAt" : "date" 
              }  
      
      
]
    }
```


##delete mahasiswa
Request :
- Method :DELETE
- Endpoint : `/api/mahasiswa/{id_mahasiswa}`
- Header :
       - Accept: application/json

Response :

```json
    {
      "code" : "String",
      "status" : "String"
    }
```

