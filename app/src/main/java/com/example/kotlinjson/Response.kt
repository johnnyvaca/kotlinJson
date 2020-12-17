package com.example.kotlinjson
// https://geekytheory.com/trabajando-con-json-en-android
class Response {

    var json = CADENA_JSON;
    val lista_frutas: List<User> = ArrayList(); //inicializamos la lista donde almacenaremos los objetos Fruta

    JSONObject
    object = new JSONObject(json); //Creamos un objeto JSON a partir de la cadena
    JSONArray json_array =
    object.optJSONArray("frutas"); //cogemos cada uno de los elementos dentro de la etiqueta "frutas"

    for (int i = 0; i < json_array.length(); i++)
    {
        lista_frutas.add(new Fruta (json_array.getJSONObject(i)));


    }