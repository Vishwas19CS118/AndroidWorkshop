String json;
try {
    InputStream is=getAssets().open("City.json");
    int size=is.available();
    byte[] buffer=new byte[size];
    is.read(buffer);
    is.close();
    json=new String(buffer,"UTF-8");
    JSONArray jsonarray=new JSONArray(json);
    resjson.setText("JSON Data");
    for(int i=0;i<jsonarray.length();i++)
    {
        JSONObject obj=jsonarray.getJSONObject(i);
        resjson.setText(resjson.getText()+"\n\n City Name:"+obj.getString("name")+"\n");
        resjson.setText(resjson.getText()+"\n Lat:"+obj.getString("lat")+"\n");
        resjson.setText(resjson.getText()+"\n Long:"+obj.getString("long")+"\n");
        resjson.setText(resjson.getText()+"\n Temperature:"+obj.getString("temp")+"\n");
        resjson.setText(resjson.getText()+"\n Humidity:"+obj.getString("humidity")+"\n");
        resjson.setText(resjson.getText()+"\n -------------------------");
    } 
}

catch (IOException | JSONException e) {
    e.printStackTrace();
}
