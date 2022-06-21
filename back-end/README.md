# Web-GIS displays about PENS area kos information

## About

This is the API for PENS area kos information. It is a RESTful API that provides access to the users.

## Source Data

* [Mamikos](https://mamikos.com/)

## Build with

* [Laravel](http://expressjs.com/)

## Installation

_Below is an example of how you can instruct your audience on installing and setting up your app._

1. Clone the repo

   ```sh
   git clone https://github.com/zulfauzi92/Web-GIS.git
   ```

2. Install composer packages

   ```sh
   composer install
   ```

3. publish JWT package

   ```sh
   php artisan vendor:publish --provider="Tymon\JWTAuth\Providers\LaravelServiceProvider"
   ```

4. Create JWT-auth secret keys

   ```sh
   php artisan jwt:secret
   ```

5. Copy `.env.example` to `.env` and fill in the missing values.

6. Create database namely "office_system"

7. Run laravel migration

   ```sh
   php artisan migrate
   ```

8. Run the server
    ```sh
    php artisan serve
    ```

## API endpoints
Base URL : http://localhost:8000/api

### Kos
| Endpoint | Description | Parameter | Method|
| ------ | ------ | ------ | ------ |
| [/kos](http://localhost:8000/kos) | Get All Kos | - | GET |
| [/kos/:id](http://localhost:8000/kos/1) | Get Kos by Id | id | GET |

Usage
```sh
 GET http://localhost:8000/api/kos
```
Response
```json
{
  "data": [
    {
      "id": 1,
      "name": "Kost Deles Sukolilo Surabaya 796534DS",
      "description": "lokasi kos: masuk gang sebelah santana seafood. lanjut cari gang mawar dan masuk ke timur. kemudian tanya kos milik H. Rouf almarhum. atau tanya                       tempas kos Pak Turi/darmini. Listrik: biaya perbulan sudah termasuk listrik standard. yaitu: untuk cas hp/laptop, kipas angin, lampu. alat masak                       listrik dikenakan biaya tambahan 40rb/bln Fasilitas: kamar mandi luar parkiran motor kasur lemari pakaian meja belajar",
      "address": "Kost Deles Sukolilo Surabaya beralamat di: jln Deles 3 gang mawar",
      "latitude": 7.290544,
      "longitude": 112.782115,
      "kos_type": "Kos Putra",
      "filename": "https://drive.google.com/file/d/1urnDhw8wEPzgh3BSrIJySpoVv65E30K0/view",
      "distance": 123.0
    }, 
    {
      "id": 1,
      "name": "Kost Deles Sukolilo Surabaya 796534DS",
      "description": "lokasi kos: masuk gang sebelah santana seafood. lanjut cari gang mawar dan masuk ke timur. kemudian tanya kos milik H. Rouf almarhum. atau tanya                       tempas kos Pak Turi/darmini. Listrik: biaya perbulan sudah termasuk listrik standard. yaitu: untuk cas hp/laptop, kipas angin, lampu. alat masak                       listrik dikenakan biaya tambahan 40rb/bln Fasilitas: kamar mandi luar parkiran motor kasur lemari pakaian meja belajar",
      "address": "Kost Deles Sukolilo Surabaya beralamat di: jln Deles 3 gang mawar",
      "latitude": 7.290544,
      "longitude": 112.782115,
      "kos_type": "Kos Putra",
      "filename": "https://drive.google.com/file/d/1urnDhw8wEPzgh3BSrIJySpoVv65E30K0/view",
      "distance": 123.0
    },
  ]
}
```

Usage
```sh
 GET http://localhost:8000/api/kos/1
```
Response
```json
{
  "detail_kos": {
    "id": 1,
    "name": "Kost Deles Sukolilo Surabaya 796534DS",
    "address": "Kost Deles Sukolilo Surabaya beralamat di: jln Deles 3 gang mawar",
    "description": "lokasi kos: masuk gang sebelah santana seafood. lanjut cari gang mawar dan masuk ke timur. kemudian tanya kos milik H. Rouf almarhum. atau tanya tempas kos Pak Turi/darmini. Listrik: biaya perbulan sudah termasuk listrik standard. yaitu: untuk cas hp/laptop, kipas angin, lampu. alat masak listrik dikenakan biaya tambahan 40rb/bln Fasilitas: kamar mandi luar parkiran motor kasur lemari pakaian meja belajar",
    "latitude": 7.290544,
    "longitude": 112.782115,
    "kos_type": "Kos Putra",
    "distance": 123.0,
    "gallery": [
      {
        "filename": "https://drive.google.com/file/d/1urnDhw8wEPzgh3BSrIJySpoVv65E30K0/view"
      },
      {
        "filename": "https://drive.google.com/file/d/16datI3gQkxKsX8SzjntB6oaeMH4rC7Bu/view"
      },
      {
        "filename": "https://drive.google.com/file/d/1spcodqVqGAxuREVjxpluFwXTmTuzuVeN/view"
      },
      {
        "filename": "https://drive.google.com/file/d/1T1FT63QlRX1b2nwBLKEPYH96ocbuLmsD/view"
      }
    ],
    "facility": [
      {
        "name": "3 x 4 meter"
      },
      {
        "name": "Kamar mandi luar"
      },
      {
        "name": "Parkir"
      },
      {
        "name": "Lemari dan Meja"
      }
    ],
    "category_price": [
      {
        "name": "Per bulan",
        "price": 400000
      }
    ],
    "owner_name": "Pak Turi/darmini"
  }
}
```



